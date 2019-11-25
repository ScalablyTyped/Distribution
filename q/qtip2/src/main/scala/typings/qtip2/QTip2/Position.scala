package typings.qtip2.QTip2

import typings.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var adjust: js.UndefOr[PositionAdjust] = js.undefined
  var at: js.UndefOr[String | Boolean] = js.undefined
  var container: js.UndefOr[JQuery | Boolean] = js.undefined
  var effect: js.UndefOr[
    Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit])
  ] = js.undefined
  var my: js.UndefOr[String | Boolean] = js.undefined
  var target: js.UndefOr[Target | Boolean] = js.undefined
  var viewport: js.UndefOr[JQuery | Boolean] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    adjust: PositionAdjust = null,
    at: String | Boolean = null,
    container: JQuery | Boolean = null,
    effect: Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit]) = null,
    my: String | Boolean = null,
    target: Target | Boolean = null,
    viewport: JQuery | Boolean = null
  ): Position = {
    val __obj = js.Dynamic.literal()
    if (adjust != null) __obj.updateDynamic("adjust")(adjust.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

