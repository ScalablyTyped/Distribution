package typings.qlikDashVisualizationextensions.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxAttrDimInfo extends js.Object {
  /**
    * Cardinality of the attribute expression.
    *     Integer
    */
  var qCardinal: Double
  /**
    * Validation error.
    * REF(NxValidationError)
    */
  // ?Type = REF(NxValidationError)?
  var qError: INxValidationError
  /**
    * The title for the attribute dimension.
    * String
    */
  var qFallbackTitle: String
  /**
    * The Locked value of the dimension.
    * Boolean
    */
  var qLocked: Boolean
  /**
    * Number of rows.
    *     Size
    */
  var qSize: Double
}

object INxAttrDimInfo {
  @scala.inline
  def apply(
    qCardinal: Double,
    qError: INxValidationError,
    qFallbackTitle: String,
    qLocked: Boolean,
    qSize: Double
  ): INxAttrDimInfo = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal, qError = qError, qFallbackTitle = qFallbackTitle, qLocked = qLocked, qSize = qSize)
  
    __obj.asInstanceOf[INxAttrDimInfo]
  }
}

