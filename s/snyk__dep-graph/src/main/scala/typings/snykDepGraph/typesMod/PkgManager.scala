package typings.snykDepGraph.typesMod

import typings.snykDepGraph.anon.Alias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PkgManager extends js.Object {
  var name: String
  var repositories: js.UndefOr[js.Array[Alias]] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object PkgManager {
  @scala.inline
  def apply(name: String, repositories: js.Array[Alias] = null, version: String = null): PkgManager = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (repositories != null) __obj.updateDynamic("repositories")(repositories.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkgManager]
  }
}

