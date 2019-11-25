package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphReference extends GraphOrDefault {
  var all: js.UndefOr[Boolean] = js.undefined
  var named: js.UndefOr[Boolean] = js.undefined
}

object GraphReference {
  @scala.inline
  def apply(
    `type`: graph,
    all: js.UndefOr[Boolean] = js.undefined,
    default: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    named: js.UndefOr[Boolean] = js.undefined
  ): GraphReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(named)) __obj.updateDynamic("named")(named.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphReference]
  }
}

