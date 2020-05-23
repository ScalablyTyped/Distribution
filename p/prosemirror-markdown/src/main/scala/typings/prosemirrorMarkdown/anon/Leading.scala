package typings.prosemirrorMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leading extends js.Object {
  var leading: js.UndefOr[String | Null] = js.undefined
  var trailing: js.UndefOr[String | Null] = js.undefined
}

object Leading {
  @scala.inline
  def apply(
    leading: js.UndefOr[Null | String] = js.undefined,
    trailing: js.UndefOr[Null | String] = js.undefined
  ): Leading = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leading]
  }
}

