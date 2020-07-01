package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.validateFinish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateFinishInfo extends NotifyInfo {
  var `type`: validateFinish
}

object ValidateFinishInfo {
  @scala.inline
  def apply(`type`: validateFinish): ValidateFinishInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateFinishInfo]
  }
}

