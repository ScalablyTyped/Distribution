package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlatform extends js.Object {
  var LINUX: String = js.native
  var MAC: String = js.native
  var WINDOWS: String = js.native
}

object IPlatform {
  @scala.inline
  def apply(LINUX: String, MAC: String, WINDOWS: String): IPlatform = {
    val __obj = js.Dynamic.literal(LINUX = LINUX.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlatform]
  }
  @scala.inline
  implicit class IPlatformOps[Self <: IPlatform] (val x: Self) extends AnyVal {
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
    def setLINUX(value: String): Self = this.set("LINUX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMAC(value: String): Self = this.set("MAC", value.asInstanceOf[js.Any])
    @scala.inline
    def setWINDOWS(value: String): Self = this.set("WINDOWS", value.asInstanceOf[js.Any])
  }
  
}

