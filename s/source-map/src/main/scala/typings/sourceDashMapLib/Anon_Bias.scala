package typings
package sourceDashMapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bias extends js.Object {
  var bias: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Bias {
  @scala.inline
  def apply(bias: scala.Int | scala.Double = null): Anon_Bias = {
    val __obj = js.Dynamic.literal()
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bias]
  }
}

