package typings.stdDashMocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StderrStdout extends js.Object {
  var stderr: js.Array[String]
  var stdout: js.Array[String]
}

object Anon_StderrStdout {
  @scala.inline
  def apply(stderr: js.Array[String], stdout: js.Array[String]): Anon_StderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[Anon_StderrStdout]
  }
}

