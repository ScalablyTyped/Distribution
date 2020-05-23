package typings.snykNodejsLockfileParser.parsersMod

import org.scalablytyped.runtime.StringDictionary
import typings.snykNodejsLockfileParser.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestFile extends js.Object {
  var dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  var devDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  var engines: js.UndefOr[Node] = js.undefined
  var name: String
  var `private`: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var workspaces: js.UndefOr[js.Array[String]] = js.undefined
}

object ManifestFile {
  @scala.inline
  def apply(
    name: String,
    dependencies: StringDictionary[String] = null,
    devDependencies: StringDictionary[String] = null,
    engines: Node = null,
    `private`: String = null,
    version: String = null,
    workspaces: js.Array[String] = null
  ): ManifestFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (engines != null) __obj.updateDynamic("engines")(engines.asInstanceOf[js.Any])
    if (`private` != null) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (workspaces != null) __obj.updateDynamic("workspaces")(workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestFile]
  }
}

