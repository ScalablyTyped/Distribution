package typings.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxAttrExprInfo extends js.Object {
  /**
    * Is continuous axis used.
    */
  var qContinuousAxes: Boolean
  /**
    * Corresponds to the label of the dimension that is selected.
    */
  var qFallbackTitle: String
  /**
    * Is a cyclic dimension used.
    */
  var qIsCyclic: Boolean
  /**
    * Maximum value.
    */
  var qMax: Double
  /**
    * Minimum value.
    */
  var qMin: Double
}

object INxAttrExprInfo {
  @scala.inline
  def apply(qContinuousAxes: Boolean, qFallbackTitle: String, qIsCyclic: Boolean, qMax: Double, qMin: Double): INxAttrExprInfo = {
    val __obj = js.Dynamic.literal(qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrExprInfo]
  }
}

