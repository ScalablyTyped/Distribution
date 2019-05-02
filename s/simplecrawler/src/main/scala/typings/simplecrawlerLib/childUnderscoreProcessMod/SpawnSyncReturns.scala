package typings
package simplecrawlerLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnSyncReturns[T] extends js.Object {
  var error: simplecrawlerLib.Error
  var output: js.Array[java.lang.String]
  var pid: scala.Double
  var signal: java.lang.String
  var status: scala.Double
  var stderr: T
  var stdout: T
}

object SpawnSyncReturns {
  @scala.inline
  def apply[T](
    error: simplecrawlerLib.Error,
    output: js.Array[java.lang.String],
    pid: scala.Double,
    signal: java.lang.String,
    status: scala.Double,
    stderr: T,
    stdout: T
  ): SpawnSyncReturns[T] = {
    val __obj = js.Dynamic.literal(error = error, output = output, pid = pid, signal = signal, status = status, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpawnSyncReturns[T]]
  }
}

