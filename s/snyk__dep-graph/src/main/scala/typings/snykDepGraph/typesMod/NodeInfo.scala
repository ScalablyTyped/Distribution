package typings.snykDepGraph.typesMod

import typings.snykDepGraph.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfo extends js.Object {
  var labels: js.UndefOr[Dictkey] = js.undefined
  var versionProvenance: js.UndefOr[VersionProvenance] = js.undefined
}

object NodeInfo {
  @scala.inline
  def apply(labels: Dictkey = null, versionProvenance: VersionProvenance = null): NodeInfo = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (versionProvenance != null) __obj.updateDynamic("versionProvenance")(versionProvenance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
}

