package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientAction extends js.Object {
  def get_id(): Double
  def get_name(): String
  def get_path(): ObjectPath
}

object ClientAction {
  @scala.inline
  def apply(get_id: () => Double, get_name: () => String, get_path: () => ObjectPath): ClientAction = {
    val __obj = js.Dynamic.literal(get_id = js.Any.fromFunction0(get_id), get_name = js.Any.fromFunction0(get_name), get_path = js.Any.fromFunction0(get_path))
    __obj.asInstanceOf[ClientAction]
  }
}

