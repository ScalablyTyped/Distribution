package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  def getItem(key: java.lang.String, args: js.Any*): js.Any
  def removeItem(key: java.lang.String, args: js.Any*): js.Any
  def setItem(key: java.lang.String, value: js.Any, args: js.Any*): js.Any
}

object Storage {
  @scala.inline
  def apply(
    getItem: js.Function2[java.lang.String, /* repeated */ js.Any, js.Any],
    removeItem: js.Function2[java.lang.String, /* repeated */ js.Any, js.Any],
    setItem: js.Function3[java.lang.String, js.Any, /* repeated */ js.Any, js.Any]
  ): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("removeItem")(removeItem)
    __obj.updateDynamic("setItem")(setItem)
    __obj.asInstanceOf[Storage]
  }
}

