package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extras extends js.Object {
  var id: String
  var labels: js.Array[Anon_IdOffsetX]
  var points: js.Array[Anon_IdSelected]
  var selected: Boolean
  var source: String
  var sourcePort: String
  var target: String
  var targetPort: String
  var `type`: String
}

object Anon_Extras {
  @scala.inline
  def apply(
    id: String,
    labels: js.Array[Anon_IdOffsetX],
    points: js.Array[Anon_IdSelected],
    selected: Boolean,
    source: String,
    sourcePort: String,
    target: String,
    targetPort: String,
    `type`: String
  ): Anon_Extras = {
    val __obj = js.Dynamic.literal(id = id, labels = labels, points = points, selected = selected, source = source, sourcePort = sourcePort, target = target, targetPort = targetPort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Extras]
  }
}

