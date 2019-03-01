package typings
package sanctuaryLib.sanctuaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maybe[A] extends js.Object {
  var constructor: sanctuaryLib.Anon_SanctuaryMaybe
}

object Maybe {
  @scala.inline
  def apply[A](constructor: sanctuaryLib.Anon_SanctuaryMaybe): Maybe[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.asInstanceOf[Maybe[A]]
  }
}

