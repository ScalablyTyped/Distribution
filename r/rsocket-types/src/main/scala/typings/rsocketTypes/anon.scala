package typings.rsocketTypes

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CLOSED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTING
import typings.rsocketTypes.rsocketTypesStrings.ERROR
import typings.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends ConnectionStatus {
    
    var kind: CONNECTING = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(kind: CONNECTING): `0` = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: CONNECTING): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1` extends ConnectionStatus {
    
    var kind: CONNECTED = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(kind: CONNECTED): `1` = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: CONNECTED): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `2` extends ConnectionStatus {
    
    var kind: CLOSED = js.native
  }
  object `2` {
    
    @scala.inline
    def apply(kind: CLOSED): `2` = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: CLOSED): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends ConnectionStatus {
    
    var error: typings.std.Error = js.native
    
    var kind: ERROR = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: typings.std.Error, kind: ERROR): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: ERROR): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Kind extends ConnectionStatus {
    
    var kind: NOT_CONNECTED = js.native
  }
  object Kind {
    
    @scala.inline
    def apply(kind: NOT_CONNECTED): Kind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    @scala.inline
    implicit class KindMutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: NOT_CONNECTED): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
}
