package typings
package raygun4jsLib.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracekitStack extends js.Object {
  var column: scala.Double
  var context: js.Any
  var func: java.lang.String
  var line: scala.Double
  var url: java.lang.String
}

object TracekitStack {
  @scala.inline
  def apply(
    column: scala.Double,
    context: js.Any,
    func: java.lang.String,
    line: scala.Double,
    url: java.lang.String
  ): TracekitStack = {
    val __obj = js.Dynamic.literal(column = column, context = context, func = func, line = line, url = url)
  
    __obj.asInstanceOf[TracekitStack]
  }
}

