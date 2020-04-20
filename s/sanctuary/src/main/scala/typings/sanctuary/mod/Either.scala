package typings.sanctuary.mod

import typings.sanctuary.Anon0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Either[A, B] extends js.Object {
  var constructor: Anon0
}

object Either {
  @scala.inline
  def apply[A, B](constructor: Anon0): Either[A, B] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Either[A, B]]
  }
}

