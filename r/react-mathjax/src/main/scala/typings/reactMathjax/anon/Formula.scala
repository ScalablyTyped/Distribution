package typings.reactMathjax.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formula extends js.Object {
  var formula: String
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var onRender: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Formula {
  @scala.inline
  def apply(formula: String, `inline`: js.UndefOr[Boolean] = js.undefined, onRender: () => Unit = null): Formula = {
    val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    __obj.asInstanceOf[Formula]
  }
}

