package typings.reactNativeEasyUpgrade.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VERSIONCODE extends js.Object {
  var VERSION_CODE: String
  var VERSION_NAME: String
}

object VERSIONCODE {
  @scala.inline
  def apply(VERSION_CODE: String, VERSION_NAME: String): VERSIONCODE = {
    val __obj = js.Dynamic.literal(VERSION_CODE = VERSION_CODE.asInstanceOf[js.Any], VERSION_NAME = VERSION_NAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[VERSIONCODE]
  }
}

