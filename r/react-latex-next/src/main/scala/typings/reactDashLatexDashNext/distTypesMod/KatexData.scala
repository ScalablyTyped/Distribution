package typings.reactDashLatexDashNext.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KatexData extends js.Object {
  var data: String
  var display: js.UndefOr[Boolean] = js.undefined
  var rawData: js.UndefOr[String] = js.undefined
  var `type`: String
}

object KatexData {
  @scala.inline
  def apply(data: String, `type`: String, display: js.UndefOr[Boolean] = js.undefined, rawData: String = null): KatexData = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (rawData != null) __obj.updateDynamic("rawData")(rawData)
    __obj.asInstanceOf[KatexData]
  }
}

