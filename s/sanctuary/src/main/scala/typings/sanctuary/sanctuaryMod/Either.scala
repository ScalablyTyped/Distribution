package typings.sanctuary.sanctuaryMod

import typings.sanctuary.Anon_SanctuaryEither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Either[A, B] extends js.Object {
  var constructor: Anon_SanctuaryEither
}

object Either {
  @scala.inline
  def apply[A, B](constructor: Anon_SanctuaryEither): Either[A, B] = {
    val __obj = js.Dynamic.literal(constructor = constructor)
  
    __obj.asInstanceOf[Either[A, B]]
  }
}

