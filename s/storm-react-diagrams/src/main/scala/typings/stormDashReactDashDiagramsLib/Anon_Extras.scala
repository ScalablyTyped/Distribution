package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extras extends js.Object {
  var id: java.lang.String
  var labels: js.Array[Anon_IdOffsetX]
  var points: js.Array[Anon_IdSelected]
  var selected: scala.Boolean
  var source: java.lang.String
  var sourcePort: java.lang.String
  var target: java.lang.String
  var targetPort: java.lang.String
  var `type`: java.lang.String
}

object Anon_Extras {
  @scala.inline
  def apply(
    id: java.lang.String,
    labels: js.Array[Anon_IdOffsetX],
    points: js.Array[Anon_IdSelected],
    selected: scala.Boolean,
    source: java.lang.String,
    sourcePort: java.lang.String,
    target: java.lang.String,
    targetPort: java.lang.String,
    `type`: java.lang.String
  ): Anon_Extras = {
    val __obj = js.Dynamic.literal(id = id, labels = labels, points = points, selected = selected, source = source, sourcePort = sourcePort, target = target, targetPort = targetPort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Extras]
  }
}

