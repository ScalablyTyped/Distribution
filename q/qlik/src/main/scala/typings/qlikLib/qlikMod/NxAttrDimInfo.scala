package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttrDimInfo extends js.Object {
  var qCardinal: scala.Double
  var qError: NxValidationError
  var qFallbackTitle: java.lang.String
  var qLocked: scala.Boolean
  var qSize: Size
}

object NxAttrDimInfo {
  @scala.inline
  def apply(
    qCardinal: scala.Double,
    qError: NxValidationError,
    qFallbackTitle: java.lang.String,
    qLocked: scala.Boolean,
    qSize: Size
  ): NxAttrDimInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qCardinal")(qCardinal)
    __obj.updateDynamic("qError")(qError)
    __obj.updateDynamic("qFallbackTitle")(qFallbackTitle)
    __obj.updateDynamic("qLocked")(qLocked)
    __obj.updateDynamic("qSize")(qSize)
    __obj.asInstanceOf[NxAttrDimInfo]
  }
}

