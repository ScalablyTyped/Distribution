package typings.quadstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[CK /* <: String */] extends StObject {
    
    var contextKey: js.UndefOr[CK] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[CK /* <: String */](): `0`[CK] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[CK]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_], CK /* <: String */] (val x: Self with `0`[CK]) extends AnyVal {
      
      @scala.inline
      def setContextKey(value: CK): Self = StObject.set(x, "contextKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextKeyUndefined: Self = StObject.set(x, "contextKey", js.undefined)
    }
  }
  
  @js.native
  trait ContextKey extends StObject {
    
    var contextKey: js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam CK */ js.Any] = js.native
  }
  object ContextKey {
    
    @scala.inline
    def apply(): ContextKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextKey]
    }
    
    @scala.inline
    implicit class ContextKeyMutableBuilder[Self <: ContextKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextKey(value: /* import warning: RewrittenClass.unapply cls was tparam CK */ js.Any): Self = StObject.set(x, "contextKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextKeyUndefined: Self = StObject.set(x, "contextKey", js.undefined)
    }
  }
}
