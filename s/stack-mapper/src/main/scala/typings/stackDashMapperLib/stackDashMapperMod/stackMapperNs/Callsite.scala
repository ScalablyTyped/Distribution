package typings
package stackDashMapperLib.stackDashMapperMod.stackMapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callsite extends js.Object {
  var column: scala.Double
  var filename: java.lang.String
  var line: scala.Double
}

object Callsite {
  @scala.inline
  def apply(column: scala.Double, filename: java.lang.String, line: scala.Double): Callsite = {
    val __obj = js.Dynamic.literal(column = column, filename = filename, line = line)
  
    __obj.asInstanceOf[Callsite]
  }
}

