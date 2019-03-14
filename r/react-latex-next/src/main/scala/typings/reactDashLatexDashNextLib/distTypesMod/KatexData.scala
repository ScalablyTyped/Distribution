package typings
package reactDashLatexDashNextLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KatexData extends js.Object {
  var data: java.lang.String
  var display: js.UndefOr[scala.Boolean] = js.undefined
  var rawData: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object KatexData {
  @scala.inline
  def apply(
    data: java.lang.String,
    `type`: java.lang.String,
    display: js.UndefOr[scala.Boolean] = js.undefined,
    rawData: java.lang.String = null
  ): KatexData = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (rawData != null) __obj.updateDynamic("rawData")(rawData)
    __obj.asInstanceOf[KatexData]
  }
}

