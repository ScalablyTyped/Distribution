package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.NotifyInfo
import typings.rcFieldForm.rcFieldFormStrings.reset
import typings.rcFieldForm.rcFieldFormStrings.validateFinish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends NotifyInfo {
  var `type`: validateFinish | reset
}

object AnonType {
  @scala.inline
  def apply(`type`: validateFinish | reset): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

