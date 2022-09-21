package typings.reactLive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsyncAwait extends StObject {
    
    var asyncAwait: js.UndefOr[Boolean] = js.undefined
  }
  object AsyncAwait {
    
    inline def apply(): AsyncAwait = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncAwait]
    }
    
    extension [Self <: AsyncAwait](x: Self) {
      
      inline def setAsyncAwait(value: Boolean): Self = StObject.set(x, "asyncAwait", value.asInstanceOf[js.Any])
      
      inline def setAsyncAwaitUndefined: Self = StObject.set(x, "asyncAwait", js.undefined)
    }
  }
}
