package typings.snykNodejsLockfileParser.parsersMod

import org.scalablytyped.runtime.StringDictionary
import typings.snykNodejsLockfileParser.anon.Dictkey
import typings.snykNodejsLockfileParser.anon.NodeVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PkgTree extends DepTreeDep {
  var cyclic: js.UndefOr[Boolean] = js.undefined
  @JSName("dependencies")
  var dependencies_PkgTree: StringDictionary[DepTreeDep]
  var hasDevDependencies: js.UndefOr[Boolean] = js.undefined
  var meta: js.UndefOr[NodeVersion] = js.undefined
  var packageFormatVersion: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PkgTree {
  @scala.inline
  def apply(
    dependencies: StringDictionary[DepTreeDep],
    cyclic: js.UndefOr[Boolean] = js.undefined,
    hasDevDependencies: js.UndefOr[Boolean] = js.undefined,
    labels: Dictkey = null,
    meta: NodeVersion = null,
    name: String = null,
    packageFormatVersion: String = null,
    size: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    version: String = null
  ): PkgTree = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(cyclic)) __obj.updateDynamic("cyclic")(cyclic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDevDependencies)) __obj.updateDynamic("hasDevDependencies")(hasDevDependencies.get.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (packageFormatVersion != null) __obj.updateDynamic("packageFormatVersion")(packageFormatVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkgTree]
  }
}

