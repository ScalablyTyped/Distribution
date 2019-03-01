package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxValue extends js.Object {
  var maxValue: js.UndefOr[java.lang.String] = js.undefined
  var minValue: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MaxValue {
  @scala.inline
  def apply(maxValue: java.lang.String = null, minValue: java.lang.String = null): Anon_MaxValue = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    __obj.asInstanceOf[Anon_MaxValue]
  }
}

