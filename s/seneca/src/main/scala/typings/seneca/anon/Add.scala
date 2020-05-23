package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Add extends js.Object {
  // Adding a pattern overrides existing pattern only if matches exactly.
  var add: js.UndefOr[Boolean] = js.undefined
  // Delegate fixedargs override action args.
  var fixedargs: js.UndefOr[Boolean] = js.undefined
  // Action result must be a plain object.
  var result: js.UndefOr[Boolean] = js.undefined
}

object Add {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    fixedargs: js.UndefOr[Boolean] = js.undefined,
    result: js.UndefOr[Boolean] = js.undefined
  ): Add = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedargs)) __obj.updateDynamic("fixedargs")(fixedargs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(result)) __obj.updateDynamic("result")(result.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
}

