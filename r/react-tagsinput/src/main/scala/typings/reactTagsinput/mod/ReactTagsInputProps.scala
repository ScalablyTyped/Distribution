package typings.reactTagsinput.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTagsInputProps[Tag] extends Props[TagsInput[Tag]] {
  var addKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
  var addOnBlur: js.UndefOr[Boolean] = js.undefined
  var addOnPaste: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var currentValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var focusedClassName: js.UndefOr[String] = js.undefined
  var inputProps: js.UndefOr[InputProps] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var maxTags: js.UndefOr[Double] = js.undefined
  var onChangeInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onValidationReject: js.UndefOr[js.Function1[/* tags */ js.Array[String], Unit]] = js.undefined
  var onlyUnique: js.UndefOr[Boolean] = js.undefined
  var pasteSplit: js.UndefOr[js.Function1[/* data */ String, js.Array[String]]] = js.undefined
  var preventSubmit: js.UndefOr[Boolean] = js.undefined
  var removeKeys: js.UndefOr[js.Array[Double]] = js.undefined
  var renderInput: js.UndefOr[js.Function1[/* props */ RenderInputProps[Tag], ReactNode]] = js.undefined
  var renderLayout: js.UndefOr[RenderLayout] = js.undefined
  var renderTag: js.UndefOr[js.Function1[/* props */ RenderTagProps[Tag], ReactNode]] = js.undefined
  var tagDisplayProp: js.UndefOr[String | Null] = js.undefined
  var tagProps: js.UndefOr[TagProps] = js.undefined
  var validationRegex: js.UndefOr[RegExp] = js.undefined
  var value: js.Array[Tag]
  def onChange(tags: js.Array[Tag], changed: js.Array[Tag], changedIndexes: js.Array[Double]): Unit
}

object ReactTagsInputProps {
  @scala.inline
  def apply[Tag](
    onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Unit,
    value: js.Array[Tag],
    addKeys: js.Array[Double | String] = null,
    addOnBlur: js.UndefOr[Boolean] = js.undefined,
    addOnPaste: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    currentValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusedClassName: String = null,
    inputProps: InputProps = null,
    inputValue: String = null,
    key: Key = null,
    maxTags: Int | Double = null,
    onChangeInput: /* value */ String => Unit = null,
    onValidationReject: /* tags */ js.Array[String] => Unit = null,
    onlyUnique: js.UndefOr[Boolean] = js.undefined,
    pasteSplit: /* data */ String => js.Array[String] = null,
    preventSubmit: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[TagsInput[Tag]] = null,
    removeKeys: js.Array[Double] = null,
    renderInput: /* props */ RenderInputProps[Tag] => ReactNode = null,
    renderLayout: (/* tagElements */ js.Array[ReactElement], /* inputElement */ ReactElement) => ReactChild = null,
    renderTag: /* props */ RenderTagProps[Tag] => ReactNode = null,
    tagDisplayProp: String = null,
    tagProps: TagProps = null,
    validationRegex: RegExp = null
  ): ReactTagsInputProps[Tag] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction3(onChange), value = value.asInstanceOf[js.Any])
    if (addKeys != null) __obj.updateDynamic("addKeys")(addKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currentValue != null) __obj.updateDynamic("currentValue")(currentValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focusedClassName != null) __obj.updateDynamic("focusedClassName")(focusedClassName.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxTags != null) __obj.updateDynamic("maxTags")(maxTags.asInstanceOf[js.Any])
    if (onChangeInput != null) __obj.updateDynamic("onChangeInput")(js.Any.fromFunction1(onChangeInput))
    if (onValidationReject != null) __obj.updateDynamic("onValidationReject")(js.Any.fromFunction1(onValidationReject))
    if (!js.isUndefined(onlyUnique)) __obj.updateDynamic("onlyUnique")(onlyUnique.asInstanceOf[js.Any])
    if (pasteSplit != null) __obj.updateDynamic("pasteSplit")(js.Any.fromFunction1(pasteSplit))
    if (!js.isUndefined(preventSubmit)) __obj.updateDynamic("preventSubmit")(preventSubmit.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (removeKeys != null) __obj.updateDynamic("removeKeys")(removeKeys.asInstanceOf[js.Any])
    if (renderInput != null) __obj.updateDynamic("renderInput")(js.Any.fromFunction1(renderInput))
    if (renderLayout != null) __obj.updateDynamic("renderLayout")(js.Any.fromFunction2(renderLayout))
    if (renderTag != null) __obj.updateDynamic("renderTag")(js.Any.fromFunction1(renderTag))
    if (tagDisplayProp != null) __obj.updateDynamic("tagDisplayProp")(tagDisplayProp.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    if (validationRegex != null) __obj.updateDynamic("validationRegex")(validationRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTagsInputProps[Tag]]
  }
}

