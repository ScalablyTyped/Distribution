package typings.qlik.mod

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
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrDimInfo]
  }
}

