package typings.storybookAddonInfo

import typings.storybookAddonInfo.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfo extends js.Object {
  var info: Options
}

object AnonInfo {
  @scala.inline
  def apply(info: Options): AnonInfo = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInfo]
  }
}

