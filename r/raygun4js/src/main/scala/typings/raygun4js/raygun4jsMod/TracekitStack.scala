package typings.raygun4js.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracekitStack extends js.Object {
  var column: Double
  var context: js.Any
  var func: String
  var line: Double
  var url: String
}

object TracekitStack {
  @scala.inline
  def apply(column: Double, context: js.Any, func: String, line: Double, url: String): TracekitStack = {
    val __obj = js.Dynamic.literal(column = column, context = context, func = func, line = line, url = url)
  
    __obj.asInstanceOf[TracekitStack]
  }
}

