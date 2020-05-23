package typings.snykCliInterface.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.snykCliInterface.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTree extends DepTreeDep {
  var docker: js.UndefOr[js.Any] = js.undefined
  var files: js.UndefOr[js.Any] = js.undefined
  var packageFormatVersion: js.UndefOr[String] = js.undefined
  var policy: js.UndefOr[String] = js.undefined
  var targetFile: js.UndefOr[String] = js.undefined
  var targetOS: js.UndefOr[Name] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DepTree {
  @scala.inline
  def apply(
    dependencies: StringDictionary[DepTreeDep] = null,
    docker: js.Any = null,
    files: js.Any = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    packageFormatVersion: String = null,
    policy: String = null,
    targetFile: String = null,
    targetOS: Name = null,
    `type`: String = null,
    version: String = null
  ): DepTree = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (docker != null) __obj.updateDynamic("docker")(docker.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (packageFormatVersion != null) __obj.updateDynamic("packageFormatVersion")(packageFormatVersion.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (targetFile != null) __obj.updateDynamic("targetFile")(targetFile.asInstanceOf[js.Any])
    if (targetOS != null) __obj.updateDynamic("targetOS")(targetOS.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTree]
  }
}

