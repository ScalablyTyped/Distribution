package typings.sanctuary.mod

import typings.sanctuary.AnonSanctuaryEither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Either[A, B] extends js.Object {
  var constructor: AnonSanctuaryEither
}

object Either {
  @scala.inline
  def apply[A, B](constructor: AnonSanctuaryEither): Either[A, B] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Either[A, B]]
  }
}

