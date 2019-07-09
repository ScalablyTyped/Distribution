package typings
package reactDashTagsinputLib.reactDashTagsinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTagsInputProps
  extends reactLib.reactMod.Props[TagsInput] {
  var addKeys: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  var addOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  var addOnPaste: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var currentValue: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var focusedClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputProps: js.UndefOr[InputProps] = js.undefined
  var inputValue: js.UndefOr[java.lang.String] = js.undefined
  var maxTags: js.UndefOr[scala.Double] = js.undefined
  var onChangeInput: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onValidationReject: js.UndefOr[js.Function1[/* tags */ js.Array[java.lang.String], scala.Unit]] = js.undefined
  var onlyUnique: js.UndefOr[scala.Boolean] = js.undefined
  var pasteSplit: js.UndefOr[js.Function1[/* data */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  var preventSubmit: js.UndefOr[scala.Boolean] = js.undefined
  var removeKeys: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var renderInput: js.UndefOr[js.Function1[/* props */ RenderInputProps, reactLib.reactMod.ReactNode]] = js.undefined
  var renderLayout: js.UndefOr[RenderLayout] = js.undefined
  var renderTag: js.UndefOr[js.Function1[/* props */ RenderTagProps, reactLib.reactMod.ReactNode]] = js.undefined
  var tagDisplayProp: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var tagProps: js.UndefOr[TagProps] = js.undefined
  var validationRegex: js.UndefOr[stdLib.RegExp] = js.undefined
  var value: js.Array[reactDashTagsinputLib.Tag]
  def onChange(
    tags: js.Array[reactDashTagsinputLib.Tag],
    changed: js.Array[reactDashTagsinputLib.Tag],
    changedIndexes: js.Array[scala.Double]
  ): scala.Unit
}

object ReactTagsInputProps {
  @scala.inline
  def apply(
    onChange: (js.Array[reactDashTagsinputLib.Tag], js.Array[reactDashTagsinputLib.Tag], js.Array[scala.Double]) => scala.Unit,
    value: js.Array[reactDashTagsinputLib.Tag],
    addKeys: js.Array[scala.Double | java.lang.String] = null,
    addOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    addOnPaste: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    currentValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    focusedClassName: java.lang.String = null,
    inputProps: InputProps = null,
    inputValue: java.lang.String = null,
    key: reactLib.reactMod.Key = null,
    maxTags: scala.Int | scala.Double = null,
    onChangeInput: /* value */ java.lang.String => scala.Unit = null,
    onValidationReject: /* tags */ js.Array[java.lang.String] => scala.Unit = null,
    onlyUnique: js.UndefOr[scala.Boolean] = js.undefined,
    pasteSplit: /* data */ java.lang.String => js.Array[java.lang.String] = null,
    preventSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    ref: reactLib.reactMod.LegacyRef[TagsInput] = null,
    removeKeys: js.Array[scala.Double] = null,
    renderInput: /* props */ RenderInputProps => reactLib.reactMod.ReactNode = null,
    renderLayout: RenderLayout = null,
    renderTag: /* props */ RenderTagProps => reactLib.reactMod.ReactNode = null,
    tagDisplayProp: java.lang.String = null,
    tagProps: TagProps = null,
    validationRegex: stdLib.RegExp = null
  ): ReactTagsInputProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction3(onChange), value = value)
    if (addKeys != null) __obj.updateDynamic("addKeys")(addKeys)
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur)
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (currentValue != null) __obj.updateDynamic("currentValue")(currentValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focusedClassName != null) __obj.updateDynamic("focusedClassName")(focusedClassName)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxTags != null) __obj.updateDynamic("maxTags")(maxTags.asInstanceOf[js.Any])
    if (onChangeInput != null) __obj.updateDynamic("onChangeInput")(js.Any.fromFunction1(onChangeInput))
    if (onValidationReject != null) __obj.updateDynamic("onValidationReject")(js.Any.fromFunction1(onValidationReject))
    if (!js.isUndefined(onlyUnique)) __obj.updateDynamic("onlyUnique")(onlyUnique)
    if (pasteSplit != null) __obj.updateDynamic("pasteSplit")(js.Any.fromFunction1(pasteSplit))
    if (!js.isUndefined(preventSubmit)) __obj.updateDynamic("preventSubmit")(preventSubmit)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (removeKeys != null) __obj.updateDynamic("removeKeys")(removeKeys)
    if (renderInput != null) __obj.updateDynamic("renderInput")(js.Any.fromFunction1(renderInput))
    if (renderLayout != null) __obj.updateDynamic("renderLayout")(renderLayout)
    if (renderTag != null) __obj.updateDynamic("renderTag")(js.Any.fromFunction1(renderTag))
    if (tagDisplayProp != null) __obj.updateDynamic("tagDisplayProp")(tagDisplayProp)
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps)
    if (validationRegex != null) __obj.updateDynamic("validationRegex")(validationRegex)
    __obj.asInstanceOf[ReactTagsInputProps]
  }
}

