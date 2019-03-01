package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowLocalStorage extends js.Object {
  val localStorage: Storage
}

object WindowLocalStorage {
  @scala.inline
  def apply(localStorage: Storage): WindowLocalStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localStorage")(localStorage)
    __obj.asInstanceOf[WindowLocalStorage]
  }
}

