package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyPath extends js.Object {
  var items: js.Array[PropertyPath | Term]
  var pathType: sparqljsLib.sparqljsLibStrings.`|` | sparqljsLib.sparqljsLibStrings.`/` | sparqljsLib.sparqljsLibStrings.`^` | sparqljsLib.sparqljsLibStrings.`+` | sparqljsLib.sparqljsLibStrings.`*` | sparqljsLib.sparqljsLibStrings.`!`
  var `type`: sparqljsLib.sparqljsLibStrings.path
}

