package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphReference extends GraphOrDefault {
  var all: js.UndefOr[scala.Boolean] = js.undefined
  var named: js.UndefOr[scala.Boolean] = js.undefined
}

object GraphReference {
  @scala.inline
  def apply(
    `type`: sparqljsLib.sparqljsLibStrings.graph,
    all: js.UndefOr[scala.Boolean] = js.undefined,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    named: js.UndefOr[scala.Boolean] = js.undefined
  ): GraphReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(named)) __obj.updateDynamic("named")(named)
    __obj.asInstanceOf[GraphReference]
  }
}

