package typings
package sanctuaryLib.sanctuaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Either[A, B] extends js.Object {
  var constructor: sanctuaryLib.Anon_SanctuaryEither
}

object Either {
  @scala.inline
  def apply[A, B](constructor: sanctuaryLib.Anon_SanctuaryEither): Either[A, B] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.asInstanceOf[Either[A, B]]
  }
}

