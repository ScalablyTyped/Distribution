package typings
package sammyLib.SammyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var cookie: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[java.lang.String] = js.undefined
  var local: js.UndefOr[js.Any] = js.undefined
  var memory: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var session: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(
    cookie: js.Any = null,
    data: js.Any = null,
    element: java.lang.String = null,
    local: js.Any = null,
    memory: js.Any = null,
    name: java.lang.String = null,
    session: js.Any = null,
    `type`: java.lang.String = null
  ): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (data != null) __obj.updateDynamic("data")(data)
    if (element != null) __obj.updateDynamic("element")(element)
    if (local != null) __obj.updateDynamic("local")(local)
    if (memory != null) __obj.updateDynamic("memory")(memory)
    if (name != null) __obj.updateDynamic("name")(name)
    if (session != null) __obj.updateDynamic("session")(session)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StoreOptions]
  }
}

