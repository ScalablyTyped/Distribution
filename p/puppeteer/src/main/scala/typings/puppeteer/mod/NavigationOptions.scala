package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptions extends Timeoutable {
  
  /**
    * When to consider navigation succeeded.
    * @default load Navigation is consider when the `load` event is fired.
    */
  var waitUntil: js.UndefOr[LoadEvent | js.Array[LoadEvent]] = js.native
}
object NavigationOptions {
  
  @scala.inline
  def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  
  @scala.inline
  implicit class NavigationOptionsMutableBuilder[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWaitUntil(value: LoadEvent | js.Array[LoadEvent]): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
    
    @scala.inline
    def setWaitUntilVarargs(value: LoadEvent*): Self = StObject.set(x, "waitUntil", js.Array(value :_*))
  }
}
