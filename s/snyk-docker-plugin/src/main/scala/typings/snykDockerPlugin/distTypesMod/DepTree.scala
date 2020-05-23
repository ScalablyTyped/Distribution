package typings.snykDockerPlugin.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.snykDockerPlugin.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTree extends DepTreeDep {
  var docker: StringDictionary[js.Any]
  var files: js.UndefOr[js.Any] = js.undefined
  var packageFormatVersion: String
  var policy: js.UndefOr[String] = js.undefined
  var targetFile: js.UndefOr[String] = js.undefined
  var targetOS: Name
  var `type`: js.UndefOr[String] = js.undefined
}

object DepTree {
  @scala.inline
  def apply(
    dependencies: StringDictionary[DepTreeDep],
    docker: StringDictionary[js.Any],
    name: String,
    packageFormatVersion: String,
    targetOS: Name,
    version: String,
    files: js.Any = null,
    labels: StringDictionary[String] = null,
    policy: String = null,
    targetFile: String = null,
    `type`: String = null
  ): DepTree = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], docker = docker.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packageFormatVersion = packageFormatVersion.asInstanceOf[js.Any], targetOS = targetOS.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (targetFile != null) __obj.updateDynamic("targetFile")(targetFile.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTree]
  }
}

