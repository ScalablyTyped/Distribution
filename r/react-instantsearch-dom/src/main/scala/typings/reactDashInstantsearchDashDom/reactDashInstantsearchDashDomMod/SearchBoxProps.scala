package typings.reactDashInstantsearchDashDom.reactDashInstantsearchDashDomMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLFormElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxProps extends CommonWidgetProps {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var defaultRefinement: js.UndefOr[String] = js.undefined
  var focusShortcuts: js.UndefOr[js.Array[String]] = js.undefined
  var loadingIndicator: js.UndefOr[Element] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLInputElement, Event], _]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLFormElement, Event], _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLFormElement, Event], _]] = js.undefined
  var reset: js.UndefOr[Element] = js.undefined
  var searchAsYouType: js.UndefOr[Boolean] = js.undefined
  var showLoadingIndicator: js.UndefOr[Boolean] = js.undefined
  var submit: js.UndefOr[Element] = js.undefined
}

object SearchBoxProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    defaultRefinement: String = null,
    focusShortcuts: js.Array[String] = null,
    loadingIndicator: Element = null,
    onChange: /* event */ SyntheticEvent[HTMLInputElement, Event] => _ = null,
    onReset: /* event */ SyntheticEvent[HTMLFormElement, Event] => _ = null,
    onSubmit: /* event */ SyntheticEvent[HTMLFormElement, Event] => _ = null,
    reset: Element = null,
    searchAsYouType: js.UndefOr[Boolean] = js.undefined,
    showLoadingIndicator: js.UndefOr[Boolean] = js.undefined,
    submit: Element = null,
    translations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, _])] = null
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

