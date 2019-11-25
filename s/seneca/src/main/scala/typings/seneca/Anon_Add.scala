package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  // Adding a pattern overrides existing pattern only if matches exactly.
  var add: js.UndefOr[Boolean] = js.undefined
  // Delegate fixedargs override action args.
  var fixedargs: js.UndefOr[Boolean] = js.undefined
  // Action result must be a plain object.
  var result: js.UndefOr[Boolean] = js.undefined
}

object Anon_Add {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    fixedargs: js.UndefOr[Boolean] = js.undefined,
    result: js.UndefOr[Boolean] = js.undefined
  ): Anon_Add = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedargs)) __obj.updateDynamic("fixedargs")(fixedargs.asInstanceOf[js.Any])
    if (!js.isUndefined(result)) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Add]
  }
}

