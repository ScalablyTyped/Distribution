package typings
package stdDashMocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StderrStdout extends js.Object {
  var stderr: js.Array[java.lang.String]
  var stdout: js.Array[java.lang.String]
}

object Anon_StderrStdout {
  @scala.inline
  def apply(stderr: js.Array[java.lang.String], stdout: js.Array[java.lang.String]): Anon_StderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[Anon_StderrStdout]
  }
}

