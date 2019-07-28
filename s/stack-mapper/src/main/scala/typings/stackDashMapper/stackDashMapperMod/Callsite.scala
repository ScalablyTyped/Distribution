package typings.stackDashMapper.stackDashMapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callsite extends js.Object {
  var column: Double
  var filename: String
  var line: Double
}

object Callsite {
  @scala.inline
  def apply(column: Double, filename: String, line: Double): Callsite = {
    val __obj = js.Dynamic.literal(column = column, filename = filename, line = line)
  
    __obj.asInstanceOf[Callsite]
  }
}

