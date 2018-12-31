package typings
package reactDashTagsinputLib.reactDashTagsinputMod.TagsInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTagsInputProps
  extends reactLib.reactMod.ReactNs.Props[reactDashTagsinputLib.reactDashTagsinputMod.TagsInput] {
  var addKeys: js.UndefOr[js.Array[scala.Double]] = js.undefined
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
  var renderInput: js.UndefOr[js.Function1[/* props */ RenderInputProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var renderLayout: js.UndefOr[
    js.Function2[
      /* tagComponents */ js.Array[reactLib.reactMod.Component[js.Object, js.Object, _]], 
      /* inputComponent */ reactLib.reactMod.Component[js.Object, js.Object, _], 
      reactLib.reactMod.ReactNs.ReactChild
    ]
  ] = js.undefined
  var renderTag: js.UndefOr[js.Function1[/* props */ RenderTagProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
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

