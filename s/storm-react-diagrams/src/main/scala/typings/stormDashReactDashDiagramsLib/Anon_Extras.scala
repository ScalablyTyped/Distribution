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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("points")(points)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("sourcePort")(sourcePort)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("targetPort")(targetPort)
    __obj.asInstanceOf[Anon_Extras]
  }
}

