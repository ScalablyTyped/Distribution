package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MousePressOptions extends js.Object {
  
  /**
    * left, right, or middle.
    * @default left
    */
  var button: js.UndefOr[MouseButtons] = js.native
  
  /**
    * The number of clicks.
    * @default 1
    */
  var clickCount: js.UndefOr[Double] = js.native
}
object MousePressOptions {
  
  @scala.inline
  def apply(): MousePressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousePressOptions]
  }
  
  @scala.inline
  implicit class MousePressOptionsOps[Self <: MousePressOptions] (val x: Self) extends AnyVal {
    
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
    def setButton(value: MouseButtons): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setClickCount(value: Double): Self = this.set("clickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickCount: Self = this.set("clickCount", js.undefined)
  }
}
