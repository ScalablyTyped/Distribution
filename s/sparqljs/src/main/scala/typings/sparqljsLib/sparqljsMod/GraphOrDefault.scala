package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphOrDefault extends js.Object {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: sparqljsLib.sparqljsLibStrings.graph
}

object GraphOrDefault {
  @scala.inline
  def apply(
    `type`: sparqljsLib.sparqljsLibStrings.graph,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): GraphOrDefault = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GraphOrDefault]
  }
}

