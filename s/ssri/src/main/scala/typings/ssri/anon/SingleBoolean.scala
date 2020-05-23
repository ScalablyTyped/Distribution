package typings.ssri.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleBoolean extends js.Object {
  var single: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object SingleBoolean {
  @scala.inline
  def apply(single: js.UndefOr[Boolean] = js.undefined, strict: js.UndefOr[Boolean] = js.undefined): SingleBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleBoolean]
  }
}

