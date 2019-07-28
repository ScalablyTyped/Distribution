package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttrDimInfo extends js.Object {
  var qCardinal: Double
  var qError: NxValidationError
  var qFallbackTitle: String
  var qLocked: Boolean
  var qSize: Size
}

object NxAttrDimInfo {
  @scala.inline
  def apply(
    qCardinal: Double,
    qError: NxValidationError,
    qFallbackTitle: String,
    qLocked: Boolean,
    qSize: Size
  ): NxAttrDimInfo = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal, qError = qError, qFallbackTitle = qFallbackTitle, qLocked = qLocked, qSize = qSize)
  
    __obj.asInstanceOf[NxAttrDimInfo]
  }
}

