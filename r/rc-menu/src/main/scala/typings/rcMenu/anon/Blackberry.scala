package typings.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blackberry extends js.Object {
  var blackberry: js.Any = js.native
  var blackberry10: js.Any = js.native
  var chrome: js.Any = js.native
  var device: js.Any = js.native
  var firefox: js.Any = js.native
  var opera: js.Any = js.native
}

object Blackberry {
  @scala.inline
  def apply(
    blackberry: js.Any,
    blackberry10: js.Any,
    chrome: js.Any,
    device: js.Any,
    firefox: js.Any,
    opera: js.Any
  ): Blackberry = {
    val __obj = js.Dynamic.literal(blackberry = blackberry.asInstanceOf[js.Any], blackberry10 = blackberry10.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blackberry]
  }
  @scala.inline
  implicit class BlackberryOps[Self <: Blackberry] (val x: Self) extends AnyVal {
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
    def setBlackberry(value: js.Any): Self = this.set("blackberry", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlackberry10(value: js.Any): Self = this.set("blackberry10", value.asInstanceOf[js.Any])
    @scala.inline
    def setChrome(value: js.Any): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice(value: js.Any): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirefox(value: js.Any): Self = this.set("firefox", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpera(value: js.Any): Self = this.set("opera", value.asInstanceOf[js.Any])
  }
  
}

