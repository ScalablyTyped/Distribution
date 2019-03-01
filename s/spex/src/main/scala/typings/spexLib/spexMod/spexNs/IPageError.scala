package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API: http://vitaly-t.github.io/spex/errors.PageError.html
trait IPageError
  extends stdLib.Error {
  var dest: js.Any
  var duration: scala.Double
  // extended properties:
  var error: js.Any
  var index: scala.Double
  var reason: java.lang.String
  var source: js.Any
  @JSName("stack")
  var stack_IPageError: java.lang.String
}

object IPageError {
  @scala.inline
  def apply(
    dest: js.Any,
    duration: scala.Double,
    error: js.Any,
    index: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    reason: java.lang.String,
    source: js.Any,
    stack: java.lang.String,
    toString: js.Function0[java.lang.String]
  ): IPageError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dest")(dest)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("stack")(stack)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[IPageError]
  }
}

