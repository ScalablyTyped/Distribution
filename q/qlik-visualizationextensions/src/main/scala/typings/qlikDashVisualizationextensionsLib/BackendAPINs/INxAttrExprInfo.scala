package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxAttrExprInfo extends js.Object {
  /**
    * Is continuous axis used.
    */
  var qContinuousAxes: scala.Boolean
  /**
    * Corresponds to the label of the dimension that is selected.
    */
  var qFallbackTitle: java.lang.String
  /**
    * Is a cyclic dimension used.
    */
  var qIsCyclic: scala.Boolean
  /**
    * Maximum value.
    */
  var qMax: scala.Double
  /**
    * Minimum value.
    */
  var qMin: scala.Double
}

object INxAttrExprInfo {
  @scala.inline
  def apply(
    qContinuousAxes: scala.Boolean,
    qFallbackTitle: java.lang.String,
    qIsCyclic: scala.Boolean,
    qMax: scala.Double,
    qMin: scala.Double
  ): INxAttrExprInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qContinuousAxes")(qContinuousAxes)
    __obj.updateDynamic("qFallbackTitle")(qFallbackTitle)
    __obj.updateDynamic("qIsCyclic")(qIsCyclic)
    __obj.updateDynamic("qMax")(qMax)
    __obj.updateDynamic("qMin")(qMin)
    __obj.asInstanceOf[INxAttrExprInfo]
  }
}

