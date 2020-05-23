package typings.snykDepGraph.legacyMod

import org.scalablytyped.runtime.StringDictionary
import typings.snykDepGraph.anon.Dictkey
import typings.snykDepGraph.anon.Version
import typings.snykDepGraph.typesMod.VersionProvenance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTree extends DepTreeDep {
  var packageFormatVersion: js.UndefOr[String] = js.undefined
  var targetOS: js.UndefOr[Version] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DepTree {
  @scala.inline
  def apply(
    dependencies: StringDictionary[DepTreeDep] = null,
    labels: Dictkey = null,
    name: String = null,
    packageFormatVersion: String = null,
    targetOS: Version = null,
    `type`: String = null,
    version: String = null,
    versionProvenance: VersionProvenance = null
  ): DepTree = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (packageFormatVersion != null) __obj.updateDynamic("packageFormatVersion")(packageFormatVersion.asInstanceOf[js.Any])
    if (targetOS != null) __obj.updateDynamic("targetOS")(targetOS.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionProvenance != null) __obj.updateDynamic("versionProvenance")(versionProvenance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTree]
  }
}

