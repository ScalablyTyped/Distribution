package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertDeleteOperation extends js.Object {
  var delete: js.UndefOr[js.Array[Quads]] = js.undefined
  var graph: js.UndefOr[java.lang.String] = js.undefined
  var insert: js.UndefOr[js.Array[Quads]] = js.undefined
  var updateType: sparqljsLib.sparqljsLibStrings.insert | sparqljsLib.sparqljsLibStrings.delete | sparqljsLib.sparqljsLibStrings.deletewhere | sparqljsLib.sparqljsLibStrings.insertdelete
  var where: js.UndefOr[js.Array[Pattern]] = js.undefined
}

