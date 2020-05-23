package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMemberAddOptions extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var upsert: js.UndefOr[String] = js.undefined
  var vars: js.UndefOr[String] = js.undefined
}

object ListMemberAddOptions {
  @scala.inline
  def apply(description: String = null, name: String = null, upsert: String = null, vars: String = null): ListMemberAddOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (upsert != null) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    if (vars != null) __obj.updateDynamic("vars")(vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberAddOptions]
  }
}

