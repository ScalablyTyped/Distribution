package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  def getItem(key: String, args: js.Any*): js.Any
  def removeItem(key: String, args: js.Any*): js.Any
  def setItem(key: String, value: js.Any, args: js.Any*): js.Any
}

object Storage {
  @scala.inline
  def apply(
    getItem: (String, /* repeated */ js.Any) => js.Any,
    removeItem: (String, /* repeated */ js.Any) => js.Any,
    setItem: (String, js.Any, /* repeated */ js.Any) => js.Any
  ): Storage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction2(getItem), removeItem = js.Any.fromFunction2(removeItem), setItem = js.Any.fromFunction3(setItem))
    __obj.asInstanceOf[Storage]
  }
}

