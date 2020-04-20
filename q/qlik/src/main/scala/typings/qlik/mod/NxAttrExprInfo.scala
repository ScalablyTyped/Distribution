package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttrExprInfo extends js.Object {
  var qContinuousAxes: Boolean
  var qFallbackTitle: String
  var qIsCyclic: Boolean
  var qMax: Double
  var qMin: Double
}

object NxAttrExprInfo {
  @scala.inline
  def apply(qContinuousAxes: Boolean, qFallbackTitle: String, qIsCyclic: Boolean, qMax: Double, qMin: Double): NxAttrExprInfo = {
    val __obj = js.Dynamic.literal(qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrExprInfo]
  }
}

