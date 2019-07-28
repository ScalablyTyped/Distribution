package typings.reactDashFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clearfix extends js.Object {
  var clearfix: js.UndefOr[Boolean] = js.undefined
  var `float-center`: Boolean
  var `float-left`: Boolean
  var `float-right`: Boolean
  var hide: js.UndefOr[Boolean] = js.undefined
  var `hide-for-large`: Boolean
  var `hide-for-large-only`: Boolean
  var `hide-for-medium`: Boolean
  var `hide-for-medium-only`: Boolean
  var `hide-for-small-only`: Boolean
  var invisible: js.UndefOr[Boolean] = js.undefined
  var `show-for-landscape`: js.UndefOr[Boolean] = js.undefined
  var `show-for-large`: Boolean
  var `show-for-large-only`: Boolean
  var `show-for-medium`: Boolean
  var `show-for-medium-only`: Boolean
  var `show-for-portrait`: js.UndefOr[Boolean] = js.undefined
  var `show-for-small-only`: Boolean
  var `show-for-sr`: js.UndefOr[Boolean] = js.undefined
  var `show-on-focus`: js.UndefOr[Boolean] = js.undefined
}

object Anon_Clearfix {
  @scala.inline
  def apply(
    `float-center`: Boolean,
    `float-left`: Boolean,
    `float-right`: Boolean,
    `hide-for-large`: Boolean,
    `hide-for-large-only`: Boolean,
    `hide-for-medium`: Boolean,
    `hide-for-medium-only`: Boolean,
    `hide-for-small-only`: Boolean,
    `show-for-large`: Boolean,
    `show-for-large-only`: Boolean,
    `show-for-medium`: Boolean,
    `show-for-medium-only`: Boolean,
    `show-for-small-only`: Boolean,
    clearfix: js.UndefOr[Boolean] = js.undefined,
    hide: js.UndefOr[Boolean] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    `show-for-landscape`: js.UndefOr[Boolean] = js.undefined,
    `show-for-portrait`: js.UndefOr[Boolean] = js.undefined,
    `show-for-sr`: js.UndefOr[Boolean] = js.undefined,
    `show-on-focus`: js.UndefOr[Boolean] = js.undefined
  ): Anon_Clearfix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("float-center")(`float-center`)
    __obj.updateDynamic("float-left")(`float-left`)
    __obj.updateDynamic("float-right")(`float-right`)
    __obj.updateDynamic("hide-for-large")(`hide-for-large`)
    __obj.updateDynamic("hide-for-large-only")(`hide-for-large-only`)
    __obj.updateDynamic("hide-for-medium")(`hide-for-medium`)
    __obj.updateDynamic("hide-for-medium-only")(`hide-for-medium-only`)
    __obj.updateDynamic("hide-for-small-only")(`hide-for-small-only`)
    __obj.updateDynamic("show-for-large")(`show-for-large`)
    __obj.updateDynamic("show-for-large-only")(`show-for-large-only`)
    __obj.updateDynamic("show-for-medium")(`show-for-medium`)
    __obj.updateDynamic("show-for-medium-only")(`show-for-medium-only`)
    __obj.updateDynamic("show-for-small-only")(`show-for-small-only`)
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix)
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible)
    if (!js.isUndefined(`show-for-landscape`)) __obj.updateDynamic("show-for-landscape")(`show-for-landscape`)
    if (!js.isUndefined(`show-for-portrait`)) __obj.updateDynamic("show-for-portrait")(`show-for-portrait`)
    if (!js.isUndefined(`show-for-sr`)) __obj.updateDynamic("show-for-sr")(`show-for-sr`)
    if (!js.isUndefined(`show-on-focus`)) __obj.updateDynamic("show-on-focus")(`show-on-focus`)
    __obj.asInstanceOf[Anon_Clearfix]
  }
}

