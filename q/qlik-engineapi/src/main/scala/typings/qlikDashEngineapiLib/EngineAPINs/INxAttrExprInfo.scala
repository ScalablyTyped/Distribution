package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAttrExprInfo...
  */
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
    val __obj = js.Dynamic.literal(qContinuousAxes = qContinuousAxes, qFallbackTitle = qFallbackTitle, qIsCyclic = qIsCyclic, qMax = qMax, qMin = qMin)
  
    __obj.asInstanceOf[INxAttrExprInfo]
  }
}

