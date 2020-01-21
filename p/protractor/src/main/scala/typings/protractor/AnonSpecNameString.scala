package typings.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpecNameString extends js.Object {
  var specName: js.UndefOr[String] = js.undefined
}

object AnonSpecNameString {
  @scala.inline
  def apply(specName: String = null): AnonSpecNameString = {
    val __obj = js.Dynamic.literal()
    if (specName != null) __obj.updateDynamic("specName")(specName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpecNameString]
  }
}

