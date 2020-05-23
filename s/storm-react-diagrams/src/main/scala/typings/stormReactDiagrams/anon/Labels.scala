package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Labels extends js.Object {
  var id: String
  var labels: js.Array[OffsetX]
  var points: js.Array[Selected]
  var selected: Boolean
  var source: String
  var sourcePort: String
  var target: String
  var targetPort: String
  var `type`: String
}

object Labels {
  @scala.inline
  def apply(
    id: String,
    labels: js.Array[OffsetX],
    points: js.Array[Selected],
    selected: Boolean,
    source: String,
    sourcePort: String,
    target: String,
    targetPort: String,
    `type`: String
  ): Labels = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourcePort = sourcePort.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetPort = targetPort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
}

