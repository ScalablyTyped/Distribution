package typings.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SpecNameString extends js.Object {
  var specName: js.UndefOr[String] = js.undefined
}

object Anon_SpecNameString {
  @scala.inline
  def apply(specName: String = null): Anon_SpecNameString = {
    val __obj = js.Dynamic.literal()
    if (specName != null) __obj.updateDynamic("specName")(specName)
    __obj.asInstanceOf[Anon_SpecNameString]
  }
}

