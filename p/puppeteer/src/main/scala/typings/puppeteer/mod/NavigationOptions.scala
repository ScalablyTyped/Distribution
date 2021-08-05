package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions
  extends StObject
     with Timeoutable {
  
  /**
    * When to consider navigation succeeded.
    * @default load Navigation is consider when the `load` event is fired.
    */
  var waitUntil: js.UndefOr[LoadEvent | js.Array[LoadEvent]] = js.undefined
}
object NavigationOptions {
  
  inline def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  
  extension [Self <: NavigationOptions](x: Self) {
    
    inline def setWaitUntil(value: LoadEvent | js.Array[LoadEvent]): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
    
    inline def setWaitUntilVarargs(value: LoadEvent*): Self = StObject.set(x, "waitUntil", js.Array(value :_*))
  }
}
