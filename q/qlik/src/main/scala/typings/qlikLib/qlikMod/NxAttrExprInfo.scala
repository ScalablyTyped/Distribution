package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttrExprInfo extends js.Object {
  var qContinuousAxes: scala.Boolean
  var qFallbackTitle: java.lang.String
  var qIsCyclic: scala.Boolean
  var qMax: scala.Double
  var qMin: scala.Double
}

object NxAttrExprInfo {
  @scala.inline
  def apply(
    qContinuousAxes: scala.Boolean,
    qFallbackTitle: java.lang.String,
    qIsCyclic: scala.Boolean,
    qMax: scala.Double,
    qMin: scala.Double
  ): NxAttrExprInfo = {
    val __obj = js.Dynamic.literal(qContinuousAxes = qContinuousAxes, qFallbackTitle = qFallbackTitle, qIsCyclic = qIsCyclic, qMax = qMax, qMin = qMin)
  
    __obj.asInstanceOf[NxAttrExprInfo]
  }
}

