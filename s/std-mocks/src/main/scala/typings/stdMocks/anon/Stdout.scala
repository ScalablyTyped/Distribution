package typings.stdMocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stdout extends js.Object {
  var stdout: js.Array[String]
}

object Stdout {
  @scala.inline
  def apply(stdout: js.Array[String]): Stdout = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdout]
  }
}

