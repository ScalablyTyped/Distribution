package typings.ssri.anon

import typings.ssri.ssriBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictBoolean extends js.Object {
  var single: `true`
  var strict: js.UndefOr[Boolean] = js.undefined
}

object StrictBoolean {
  @scala.inline
  def apply(single: `true`, strict: js.UndefOr[Boolean] = js.undefined): StrictBoolean = {
    val __obj = js.Dynamic.literal(single = single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictBoolean]
  }
}

