package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOperation extends ManagementOperation {
  var destination: java.lang.String | sparqljsLib.sparqljsLibNumbers.`false`
  var silent: scala.Boolean
  var source: java.lang.String
  var `type`: sparqljsLib.sparqljsLibStrings.load
}

object LoadOperation {
  @scala.inline
  def apply(
    destination: java.lang.String | sparqljsLib.sparqljsLibNumbers.`false`,
    silent: scala.Boolean,
    source: java.lang.String,
    `type`: sparqljsLib.sparqljsLibStrings.load
  ): LoadOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LoadOperation]
  }
}

