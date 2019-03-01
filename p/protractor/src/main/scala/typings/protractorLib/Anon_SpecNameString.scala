package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SpecNameString extends js.Object {
  var specName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_SpecNameString {
  @scala.inline
  def apply(specName: java.lang.String = null): Anon_SpecNameString = {
    val __obj = js.Dynamic.literal()
    if (specName != null) __obj.updateDynamic("specName")(specName)
    __obj.asInstanceOf[Anon_SpecNameString]
  }
}

