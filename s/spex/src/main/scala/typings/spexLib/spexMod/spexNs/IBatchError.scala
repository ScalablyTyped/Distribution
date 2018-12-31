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

