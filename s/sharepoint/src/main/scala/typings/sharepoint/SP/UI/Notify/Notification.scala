package typings.sharepoint.SP.UI.Notify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  def Hide(bNoAnimate: Boolean): Unit
  def Show(bNoAnimate: Boolean): Unit
  def get_id(): String
}

object Notification {
  @scala.inline
  def apply(Hide: Boolean => Unit, Show: Boolean => Unit, get_id: () => String): Notification = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction1(Hide), Show = js.Any.fromFunction1(Show), get_id = js.Any.fromFunction0(get_id))
    __obj.asInstanceOf[Notification]
  }
}

