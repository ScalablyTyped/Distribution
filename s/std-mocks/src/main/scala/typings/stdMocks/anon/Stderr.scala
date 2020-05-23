package typings.stdMocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stderr extends js.Object {
  var stderr: js.Array[String]
}

object Stderr {
  @scala.inline
  def apply(stderr: js.Array[String]): Stderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stderr]
  }
}

