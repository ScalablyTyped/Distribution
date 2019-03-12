package typings
package reactDashInstantsearchDashDomLib.reactDashInstantsearchDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxProps extends CommonWidgetProps {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var defaultRefinement: js.UndefOr[java.lang.String] = js.undefined
  var focusShortcuts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var loadingIndicator: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onReset: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLFormElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onSubmit: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLFormElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var reset: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var searchAsYouType: js.UndefOr[scala.Boolean] = js.undefined
  var showLoadingIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var submit: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
}

object SearchBoxProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    defaultRefinement: java.lang.String = null,
    focusShortcuts: js.Array[java.lang.String] = null,
    loadingIndicator: reactLib.reactMod.Global.JSXNs.Element = null,
    onChange: /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    onReset: /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLFormElement, reactLib.Event] => _ = null,
    onSubmit: /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLFormElement, reactLib.Event] => _ = null,
    reset: reactLib.reactMod.Global.JSXNs.Element = null,
    searchAsYouType: js.UndefOr[scala.Boolean] = js.undefined,
    showLoadingIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    submit: reactLib.reactMod.Global.JSXNs.Element = null,
    translations: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* repeated */ js.Any, _])] = null
  ): SearchBoxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (defaultRefinement != null) __obj.updateDynamic("defaultRefinement")(defaultRefinement)
    if (focusShortcuts != null) __obj.updateDynamic("focusShortcuts")(focusShortcuts)
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (!js.isUndefined(searchAsYouType)) __obj.updateDynamic("searchAsYouType")(searchAsYouType)
    if (!js.isUndefined(showLoadingIndicator)) __obj.updateDynamic("showLoadingIndicator")(showLoadingIndicator)
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[SearchBoxProps]
  }
}

