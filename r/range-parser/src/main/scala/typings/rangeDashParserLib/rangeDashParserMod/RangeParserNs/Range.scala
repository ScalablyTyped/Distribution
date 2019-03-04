package typings
package rangeDashParserLib.rangeDashParserMod.RangeParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var end: scala.Double
  var start: scala.Double
}

object Range {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double): Range = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[Range]
  }
}

