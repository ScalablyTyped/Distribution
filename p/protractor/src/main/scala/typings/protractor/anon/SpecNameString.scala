package typings.protractor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecNameString extends js.Object {
  var specName: js.UndefOr[String] = js.undefined
}

object SpecNameString {
  @scala.inline
  def apply(specName: String = null): SpecNameString = {
    val __obj = js.Dynamic.literal()
    if (specName != null) __obj.updateDynamic("specName")(specName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecNameString]
  }
}

