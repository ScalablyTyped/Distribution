package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API: http://vitaly-t.github.io/spex/errors.BatchError.html
trait IBatchError
  extends stdLib.Error {
  // extended properties:
  var data: js.Array[TBatchData]
  var first: js.Any
  @JSName("stack")
  var stack_IBatchError: java.lang.String
  var stat: IBatchStat
  // API: http://vitaly-t.github.io/spex/errors.BatchError.html#.getErrors
  def getErrors(): js.Array[_]
}

object IBatchError {
  @scala.inline
  def apply(
    data: js.Array[TBatchData],
    first: js.Any,
    getErrors: js.Function0[js.Array[_]],
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String,
    stat: IBatchStat,
    toString: js.Function0[java.lang.String]
  ): IBatchError = {
    val __obj = js.Dynamic.literal(data = data, first = first, getErrors = getErrors, message = message, name = name, stack = stack, stat = stat, toString = toString)
  
    __obj.asInstanceOf[IBatchError]
  }
}

