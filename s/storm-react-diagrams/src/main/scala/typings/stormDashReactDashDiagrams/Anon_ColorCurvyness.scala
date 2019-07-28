package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorCurvyness extends js.Object {
  var color: String
  var curvyness: Double
  var id: String
  var labels: js.Array[Anon_IdOffsetX]
  var points: js.Array[Anon_IdSelected]
  var selected: Boolean
  var source: String
  var sourcePort: String
  var target: String
  var targetPort: String
  var `type`: String
  var width: Double
}

object Anon_ColorCurvyness {
  @scala.inline
  def apply(
    color: String,
    curvyness: Double,
    id: String,
    labels: js.Array[Anon_IdOffsetX],
    points: js.Array[Anon_IdSelected],
    selected: Boolean,
    source: String,
    sourcePort: String,
    target: String,
    targetPort: String,
    `type`: String,
    width: Double
  ): Anon_ColorCurvyness = {
    val __obj = js.Dynamic.literal(color = color, curvyness = curvyness, id = id, labels = labels, points = points, selected = selected, source = source, sourcePort = sourcePort, target = target, targetPort = targetPort, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ColorCurvyness]
  }
}

