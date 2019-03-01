package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthNumber extends js.Object {
  var length: js.UndefOr[scala.Double] = js.undefined
}

object Anon_LengthNumber {
  @scala.inline
  def apply(length: scala.Int | scala.Double = null): Anon_LengthNumber = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LengthNumber]
  }
}

