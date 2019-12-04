package typings.rcDashMentions.libKeywordTriggerMod

import typings.rcDashMentions.libMentionsMod.Placement
import typings.rcDashMentions.libOptionMod.OptionProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeywordTriggerProps extends js.Object {
  var getPopupContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var options: js.Array[OptionProps]
  var placement: js.UndefOr[Placement] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object KeywordTriggerProps {
  @scala.inline
  def apply(
    options: js.Array[OptionProps],
    getPopupContainer: () => HTMLElement = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    placement: Placement = null,
    prefixCls: String = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): KeywordTriggerProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction0(getPopupContainer))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordTriggerProps]
  }
}

