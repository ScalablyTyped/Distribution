package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptDesc extends js.Object {
  var columnOffset: js.UndefOr[scala.Double] = js.undefined
  var handle: js.UndefOr[scala.Double] = js.undefined
  var id: scala.Double
  var isNative: js.UndefOr[scala.Boolean] = js.undefined
  var lineCount: js.UndefOr[scala.Double] = js.undefined
  var lineOffset: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var `type`: java.lang.String
}

object ScriptDesc {
  @scala.inline
  def apply(
    id: scala.Double,
    name: java.lang.String,
    `type`: java.lang.String,
    columnOffset: scala.Int | scala.Double = null,
    handle: scala.Int | scala.Double = null,
    isNative: js.UndefOr[scala.Boolean] = js.undefined,
    lineCount: scala.Int | scala.Double = null,
    lineOffset: scala.Int | scala.Double = null
  ): ScriptDesc = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    if (columnOffset != null) __obj.updateDynamic("columnOffset")(columnOffset.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(isNative)) __obj.updateDynamic("isNative")(isNative)
    if (lineCount != null) __obj.updateDynamic("lineCount")(lineCount.asInstanceOf[js.Any])
    if (lineOffset != null) __obj.updateDynamic("lineOffset")(lineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptDesc]
  }
}

