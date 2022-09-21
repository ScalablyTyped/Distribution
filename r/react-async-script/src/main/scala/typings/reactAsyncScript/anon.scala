package typings.reactAsyncScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsyncScriptOnLoad extends StObject {
    
    var asyncScriptOnLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object AsyncScriptOnLoad {
    
    inline def apply(): AsyncScriptOnLoad = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncScriptOnLoad]
    }
    
    extension [Self <: AsyncScriptOnLoad](x: Self) {
      
      inline def setAsyncScriptOnLoad(value: () => Unit): Self = StObject.set(x, "asyncScriptOnLoad", js.Any.fromFunction0(value))
      
      inline def setAsyncScriptOnLoadUndefined: Self = StObject.set(x, "asyncScriptOnLoad", js.undefined)
    }
  }
}
