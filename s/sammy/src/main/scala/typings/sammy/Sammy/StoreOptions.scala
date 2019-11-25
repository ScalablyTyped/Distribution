package typings.sammy.Sammy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var cookie: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var local: js.UndefOr[js.Any] = js.undefined
  var memory: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(
    cookie: js.Any = null,
    data: js.Any = null,
    element: String = null,
    local: js.Any = null,
    memory: js.Any = null,
    name: String = null,
    session: js.Any = null,
    `type`: String = null
  ): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
}

