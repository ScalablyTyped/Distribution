package typings.snykPaketParser.lockParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependency extends js.Object {
  var dependencies: js.UndefOr[js.Array[Dependency]] = js.undefined
  var name: String
  var options: Option
  var remote: js.UndefOr[String] = js.undefined
  var repository: js.UndefOr[String] = js.undefined
  var version: String
}

object Dependency {
  @scala.inline
  def apply(
    name: String,
    options: Option,
    version: String,
    dependencies: js.Array[Dependency] = null,
    remote: String = null,
    repository: String = null
  ): Dependency = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
}

