package typings.snykDockerPlugin.distTypesMod

import typings.snykNodejsLockfileParser.parsersMod.PkgTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScannedProjectCustom extends js.Object {
  /**
    * Using "| PkgTree" here to be truthful to the type system.
    * For application dependencies scans we use a parser which has more optional fields than the DepTree.
    * We have different required and optional fields for OS scans and application dependencies scans, so
    * a future change should be mindful but find a way to unify them if possible.
    */
  var depTree: DepTree | PkgTree
  var meta: js.UndefOr[js.Any] = js.undefined
  var packageManager: String
  var targetFile: js.UndefOr[String] = js.undefined
}

object ScannedProjectCustom {
  @scala.inline
  def apply(depTree: DepTree | PkgTree, packageManager: String, meta: js.Any = null, targetFile: String = null): ScannedProjectCustom = {
    val __obj = js.Dynamic.literal(depTree = depTree.asInstanceOf[js.Any], packageManager = packageManager.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (targetFile != null) __obj.updateDynamic("targetFile")(targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannedProjectCustom]
  }
}

