package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var adjust: js.UndefOr[PositionAdjust] = js.undefined
  var at: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var container: js.UndefOr[qtip2Lib.JQuery | scala.Boolean] = js.undefined
  var effect: js.UndefOr[
    scala.Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, scala.Unit])
  ] = js.undefined
  var my: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var target: js.UndefOr[Target | scala.Boolean] = js.undefined
  var viewport: js.UndefOr[qtip2Lib.JQuery | scala.Boolean] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    adjust: PositionAdjust = null,
    at: java.lang.String | scala.Boolean = null,
    container: qtip2Lib.JQuery | scala.Boolean = null,
    effect: scala.Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, scala.Unit]) = null,
    my: java.lang.String | scala.Boolean = null,
    target: Target | scala.Boolean = null,
    viewport: qtip2Lib.JQuery | scala.Boolean = null
  ): Position = {
    val __obj = js.Dynamic.literal()
    if (adjust != null) __obj.updateDynamic("adjust")(adjust)
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

