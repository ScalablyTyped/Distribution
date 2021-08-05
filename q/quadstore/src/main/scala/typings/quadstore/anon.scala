package typings.quadstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[CK /* <: String */] extends StObject {
    
    var contextKey: js.UndefOr[CK] = js.undefined
  }
  object `0` {
    
    inline def apply[CK /* <: String */](): `0`[CK] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[CK]]
    }
    
    extension [Self <: `0`[?], CK /* <: String */](x: Self & `0`[CK]) {
      
      inline def setContextKey(value: CK): Self = StObject.set(x, "contextKey", value.asInstanceOf[js.Any])
      
      inline def setContextKeyUndefined: Self = StObject.set(x, "contextKey", js.undefined)
    }
  }
  
  trait ContextKey extends StObject {
    
    var contextKey: js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam CK */ js.Any] = js.undefined
  }
  object ContextKey {
    
    inline def apply(): ContextKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextKey]
    }
    
    extension [Self <: ContextKey](x: Self) {
      
      inline def setContextKey(value: /* import warning: RewrittenClass.unapply cls was tparam CK */ js.Any): Self = StObject.set(x, "contextKey", value.asInstanceOf[js.Any])
      
      inline def setContextKeyUndefined: Self = StObject.set(x, "contextKey", js.undefined)
    }
  }
}
