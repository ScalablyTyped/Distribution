package typings.puppeteer.mod

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
  implicit class NavigationOptionsOps[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWaitUntilVarargs(value: LoadEvent*): Self = this.set("waitUntil", js.Array(value :_*))
    
    @scala.inline
    def setWaitUntil(value: LoadEvent | js.Array[LoadEvent]): Self = this.set("waitUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitUntil: Self = this.set("waitUntil", js.undefined)
  }
}
