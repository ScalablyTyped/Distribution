package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphOrDefault extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: graph
}

object GraphOrDefault {
  @scala.inline
  def apply(`type`: graph, default: js.UndefOr[Boolean] = js.undefined, name: String = null): GraphOrDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphOrDefault]
  }
}

