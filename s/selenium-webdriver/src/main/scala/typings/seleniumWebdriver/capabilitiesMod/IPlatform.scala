package typings.seleniumWebdriver.capabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlatform extends js.Object {
  var LINUX: String
  var MAC: String
  var WINDOWS: String
}

object IPlatform {
  @scala.inline
  def apply(LINUX: String, MAC: String, WINDOWS: String): IPlatform = {
    val __obj = js.Dynamic.literal(LINUX = LINUX.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlatform]
  }
}

