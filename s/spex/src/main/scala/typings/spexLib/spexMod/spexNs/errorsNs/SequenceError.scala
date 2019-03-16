package typings
package spexLib.spexMod.spexNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API: http://vitaly-t.github.io/spex/errors.SequenceError.html
trait SequenceError
  extends stdLib.Error {
  var dest: js.Any
  var duration: scala.Double
  // extended properties:
  var error: js.Any
  var index: scala.Double
  var reason: java.lang.String
  var source: js.Any
  @JSName("stack")
  var stack_SequenceError: java.lang.String
}

object SequenceError {
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
    toString: () => java.lang.String
  ): SequenceError = {
    val __obj = js.Dynamic.literal(dest = dest, duration = duration, error = error, index = index, message = message, name = name, reason = reason, source = source, stack = stack, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[SequenceError]
  }
}

