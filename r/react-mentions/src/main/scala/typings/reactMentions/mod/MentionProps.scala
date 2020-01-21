package typings.reactMentions.mod

import typings.react.mod.ReactNode
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionProps extends js.Object {
  var appendSpaceOnAdd: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.Array[SuggestionDataItem] | DataFunc
  var displayTransform: js.UndefOr[DisplayTransformFunc] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
  var markup: js.UndefOr[String] = js.undefined
  var onAdd: js.UndefOr[js.Function2[/* id */ String | Double, /* display */ String, Unit]] = js.undefined
  var regex: js.UndefOr[RegExp] = js.undefined
  var renderSuggestion: js.UndefOr[
    js.Function5[
      /* suggestion */ SuggestionDataItem, 
      /* search */ String, 
      /* highlightedDisplay */ ReactNode, 
      /* index */ Double, 
      /* focused */ Boolean, 
      ReactNode
    ]
  ] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var trigger: String | RegExp
}

object MentionProps {
  @scala.inline
  def apply(
    data: js.Array[SuggestionDataItem] | DataFunc,
    trigger: String | RegExp,
    appendSpaceOnAdd: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    displayTransform: (/* id */ String, /* display */ String) => String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    markup: String = null,
    onAdd: (/* id */ String | Double, /* display */ String) => Unit = null,
    regex: RegExp = null,
    renderSuggestion: (/* suggestion */ SuggestionDataItem, /* search */ String, /* highlightedDisplay */ ReactNode, /* index */ Double, /* focused */ Boolean) => ReactNode = null,
    style: js.Any = null
  ): MentionProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(appendSpaceOnAdd)) __obj.updateDynamic("appendSpaceOnAdd")(appendSpaceOnAdd.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (displayTransform != null) __obj.updateDynamic("displayTransform")(js.Any.fromFunction2(displayTransform))
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (markup != null) __obj.updateDynamic("markup")(markup.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2(onAdd))
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (renderSuggestion != null) __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction5(renderSuggestion))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionProps]
  }
}

