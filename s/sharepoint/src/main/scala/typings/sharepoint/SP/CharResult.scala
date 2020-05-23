package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharResult extends js.Object {
  def get_value(): js.Any
}

object CharResult {
  @scala.inline
  def apply(get_value: () => js.Any): CharResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[CharResult]
  }
}

