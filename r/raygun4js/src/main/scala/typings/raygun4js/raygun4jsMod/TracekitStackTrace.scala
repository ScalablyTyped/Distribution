package typings.raygun4js.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracekitStackTrace extends js.Object {
  var message: String
  var mode: String
  var name: String
  var stack: js.Array[TracekitStack]
  var url: String
  var useragent: String
}

object TracekitStackTrace {
  @scala.inline
  def apply(
    message: String,
    mode: String,
    name: String,
    stack: js.Array[TracekitStack],
    url: String,
    useragent: String
  ): TracekitStackTrace = {
    val __obj = js.Dynamic.literal(message = message, mode = mode, name = name, stack = stack, url = url, useragent = useragent)
  
    __obj.asInstanceOf[TracekitStackTrace]
  }
}

