package typings.snykPaketParser.lockParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var dependencies: js.Array[Dependency]
  var name: String
  var options: Option
  var repositories: StringDictionary[js.Array[String]]
  var specs: Boolean
}

object Group {
  @scala.inline
  def apply(
    dependencies: js.Array[Dependency],
    name: String,
    options: Option,
    repositories: StringDictionary[js.Array[String]],
    specs: Boolean
  ): Group = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

