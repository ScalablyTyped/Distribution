package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainDOMStringParameters extends js.Object {
  var exact: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var ideal: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ConstrainDOMStringParameters {
  @scala.inline
  def apply(
    exact: java.lang.String | js.Array[java.lang.String] = null,
    ideal: java.lang.String | js.Array[java.lang.String] = null
  ): ConstrainDOMStringParameters = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainDOMStringParameters]
  }
}

