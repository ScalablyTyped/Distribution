package typings.rsocketTypes

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CLOSED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTING
import typings.rsocketTypes.rsocketTypesStrings.ERROR
import typings.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with ConnectionStatus {
    
    var kind: CONNECTING
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal(kind = "CONNECTING")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: CONNECTING): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`
    extends StObject
       with ConnectionStatus {
    
    var kind: CONNECTED
  }
  object `1` {
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal(kind = "CONNECTED")
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: CONNECTED): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2`
    extends StObject
       with ConnectionStatus {
    
    var kind: CLOSED
  }
  object `2` {
    
    @scala.inline
    def apply(): `2` = {
      val __obj = js.Dynamic.literal(kind = "CLOSED")
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: CLOSED): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error
    extends StObject
       with ConnectionStatus {
    
    var error: typings.std.Error
    
    var kind: ERROR
  }
  object Error {
    
    @scala.inline
    def apply(error: typings.std.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "ERROR")
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
  
  trait Kind
    extends StObject
       with ConnectionStatus {
    
    var kind: NOT_CONNECTED
  }
  object Kind {
    
    @scala.inline
    def apply(): Kind = {
      val __obj = js.Dynamic.literal(kind = "NOT_CONNECTED")
      __obj.asInstanceOf[Kind]
    }
    
    @scala.inline
    implicit class KindMutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: NOT_CONNECTED): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
}
