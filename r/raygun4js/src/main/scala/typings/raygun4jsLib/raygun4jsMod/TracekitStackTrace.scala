package typings
package raygun4jsLib.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracekitStackTrace extends js.Object {
  var message: java.lang.String
  var mode: java.lang.String
  var name: java.lang.String
  var stack: js.Array[TracekitStack]
  var url: java.lang.String
  var useragent: java.lang.String
}

object TracekitStackTrace {
  @scala.inline
  def apply(
    message: java.lang.String,
    mode: java.lang.String,
    name: java.lang.String,
    stack: js.Array[TracekitStack],
    url: java.lang.String,
    useragent: java.lang.String
  ): TracekitStackTrace = {
    val __obj = js.Dynamic.literal(message = message, mode = mode, name = name, stack = stack, url = url, useragent = useragent)
  
    __obj.asInstanceOf[TracekitStackTrace]
  }
}

