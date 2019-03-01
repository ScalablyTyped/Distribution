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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[LoadOperation]
  }
}

