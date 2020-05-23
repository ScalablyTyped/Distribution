package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMemberUpdateOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var vars: js.UndefOr[String] = js.undefined
}

object ListMemberUpdateOptions {
  @scala.inline
  def apply(name: String = null, vars: String = null): ListMemberUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (vars != null) __obj.updateDynamic("vars")(vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberUpdateOptions]
  }
}

