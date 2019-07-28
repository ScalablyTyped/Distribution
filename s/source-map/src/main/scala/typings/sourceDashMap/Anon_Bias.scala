package typings.sourceDashMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bias extends js.Object {
  var bias: js.UndefOr[Double] = js.undefined
}

object Anon_Bias {
  @scala.inline
  def apply(bias: Int | Double = null): Anon_Bias = {
    val __obj = js.Dynamic.literal()
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bias]
  }
}

