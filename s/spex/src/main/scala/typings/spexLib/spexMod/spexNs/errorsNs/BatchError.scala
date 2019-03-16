package typings
package spexLib.spexMod.spexNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API: http://vitaly-t.github.io/spex/errors.BatchError.html
trait BatchError
  extends stdLib.Error {
  // extended properties:
  var data: js.Array[spexLib.spexMod.spexNs.TBatchData]
  var first: js.Any
  @JSName("stack")
  var stack_BatchError: java.lang.String
  var stat: spexLib.spexMod.spexNs.IBatchStat
  // API: http://vitaly-t.github.io/spex/errors.BatchError.html#.getErrors
  def getErrors(): js.Array[_]
}

object BatchError {
  @scala.inline
  def apply(
    data: js.Array[spexLib.spexMod.spexNs.TBatchData],
    first: js.Any,
    getErrors: () => js.Array[_],
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String,
    stat: spexLib.spexMod.spexNs.IBatchStat,
    toString: () => java.lang.String
  ): BatchError = {
    val __obj = js.Dynamic.literal(data = data, first = first, getErrors = js.Any.fromFunction0(getErrors), message = message, name = name, stack = stack, stat = stat, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[BatchError]
  }
}

