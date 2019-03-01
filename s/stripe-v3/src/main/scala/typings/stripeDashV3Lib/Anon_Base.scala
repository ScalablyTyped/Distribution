package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var complete: js.UndefOr[java.lang.String] = js.undefined
  var empty: js.UndefOr[java.lang.String] = js.undefined
  var focus: js.UndefOr[java.lang.String] = js.undefined
  var invalid: js.UndefOr[java.lang.String] = js.undefined
  var webkitAutofill: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Base {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    complete: java.lang.String = null,
    empty: java.lang.String = null,
    focus: java.lang.String = null,
    invalid: java.lang.String = null,
    webkitAutofill: java.lang.String = null
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

