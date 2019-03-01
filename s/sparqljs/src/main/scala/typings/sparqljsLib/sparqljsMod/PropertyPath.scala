package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyPath extends js.Object {
  var items: js.Array[PropertyPath | Term]
  var pathType: sparqljsLib.sparqljsLibStrings.`|` | sparqljsLib.sparqljsLibStrings.`/` | sparqljsLib.sparqljsLibStrings.`_backtick^_backtick` | sparqljsLib.sparqljsLibStrings.`+` | sparqljsLib.sparqljsLibStrings.`*` | sparqljsLib.sparqljsLibStrings.`!`
  var `type`: sparqljsLib.sparqljsLibStrings.path
}

object PropertyPath {
  @scala.inline
  def apply(
    items: js.Array[PropertyPath | Term],
    pathType: sparqljsLib.sparqljsLibStrings.`|` | sparqljsLib.sparqljsLibStrings.`/` | sparqljsLib.sparqljsLibStrings.`_backtick^_backtick` | sparqljsLib.sparqljsLibStrings.`+` | sparqljsLib.sparqljsLibStrings.`*` | sparqljsLib.sparqljsLibStrings.`!`,
    `type`: sparqljsLib.sparqljsLibStrings.path
  ): PropertyPath = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("pathType")(pathType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPath]
  }
}

