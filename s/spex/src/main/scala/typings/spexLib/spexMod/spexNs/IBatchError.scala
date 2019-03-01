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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("getErrors")(getErrors)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("stack")(stack)
    __obj.updateDynamic("stat")(stat)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[IBatchError]
  }
}

