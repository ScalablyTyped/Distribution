package typings.stripeDashV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[String] = js.undefined
  var focus: js.UndefOr[String] = js.undefined
  var invalid: js.UndefOr[String] = js.undefined
  var webkitAutofill: js.UndefOr[String] = js.undefined
}

object Anon_Base {
  @scala.inline
  def apply(
    base: String = null,
    complete: String = null,
    empty: String = null,
    focus: String = null,
    invalid: String = null,
    webkitAutofill: String = null
  ): Anon_Base = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (webkitAutofill != null) __obj.updateDynamic("webkitAutofill")(webkitAutofill)
    __obj.asInstanceOf[Anon_Base]
  }
}

