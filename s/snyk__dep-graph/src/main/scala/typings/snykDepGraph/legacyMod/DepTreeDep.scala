package typings.snykDepGraph.legacyMod

import org.scalablytyped.runtime.StringDictionary
import typings.snykDepGraph.anon.Dictkey
import typings.snykDepGraph.typesMod.VersionProvenance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTreeDep extends js.Object {
  var dependencies: js.UndefOr[StringDictionary[DepTreeDep]] = js.undefined
  var labels: js.UndefOr[Dictkey] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var versionProvenance: js.UndefOr[VersionProvenance] = js.undefined
}

object DepTreeDep {
  @scala.inline
  def apply(
    dependencies: StringDictionary[DepTreeDep] = null,
    labels: Dictkey = null,
    name: String = null,
    version: String = null,
    versionProvenance: VersionProvenance = null
  ): DepTreeDep = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionProvenance != null) __obj.updateDynamic("versionProvenance")(versionProvenance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTreeDep]
  }
}

