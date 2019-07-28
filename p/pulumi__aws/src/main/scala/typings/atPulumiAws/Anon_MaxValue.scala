package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxValue extends js.Object {
  var maxValue: js.UndefOr[String] = js.undefined
  var minValue: js.UndefOr[String] = js.undefined
}

object Anon_MaxValue {
  @scala.inline
  def apply(maxValue: String = null, minValue: String = null): Anon_MaxValue = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    __obj.asInstanceOf[Anon_MaxValue]
  }
}

