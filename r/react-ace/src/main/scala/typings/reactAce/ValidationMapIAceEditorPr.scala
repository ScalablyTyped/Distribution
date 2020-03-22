package typings.reactAce

import typings.propTypes.mod.Validator
import typings.react.mod.CSSProperties
import typings.reactAce.aceEditorClassMod.AceEditorClass
import typings.reactAce.typesMod.IAceOptions
import typings.reactAce.typesMod.IAnnotation
import typings.reactAce.typesMod.ICommand
import typings.reactAce.typesMod.IEditorProps
import typings.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined prop-types.prop-types.ValidationMap<react-ace.react-ace/lib/ace.IAceEditorProps> */
trait ValidationMapIAceEditorPr extends js.Object {
  var annotations: js.UndefOr[Validator[js.UndefOr[js.Array[IAnnotation]]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var commands: js.UndefOr[Validator[js.UndefOr[js.Array[ICommand]]]] = js.undefined
  var cursorStart: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var debounceChangePeriod: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var defaultValue: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var editorProps: js.UndefOr[Validator[js.UndefOr[IEditorProps]]] = js.undefined
  var enableBasicAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.undefined
  var enableLiveAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.undefined
  var enableSnippets: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var focus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var fontSize: js.UndefOr[Validator[js.UndefOr[Double | String]]] = js.undefined
  var height: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var highlightActiveLine: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var keyboardHandler: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var markers: js.UndefOr[Validator[js.UndefOr[js.Array[IMarker]]]] = js.undefined
  var maxLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var minLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var mode: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var name: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var navigateToFileEnd: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var onBeforeLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* ace */ _, Unit]]]] = js.undefined
  var onBlur: js.UndefOr[
    Validator[
      js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[AceEditorClass], Unit]]
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[_], Unit]]]
  ] = js.undefined
  var onCopy: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.undefined
  var onCursorChange: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]
  ] = js.undefined
  var onFocus: js.UndefOr[
    Validator[
      js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[AceEditorClass], Unit]]
    ]
  ] = js.undefined
  var onInput: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]]] = js.undefined
  var onLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]] = js.undefined
  var onPaste: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.undefined
  var onScroll: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]] = js.undefined
  var onSelection: js.UndefOr[
    Validator[
      js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[_], Unit]]
    ]
  ] = js.undefined
  var onSelectionChange: js.UndefOr[
    Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]
  ] = js.undefined
  var onValidate: js.UndefOr[
    Validator[js.UndefOr[js.Function1[/* annotations */ js.Array[IAnnotation], Unit]]]
  ] = js.undefined
  var placeholder: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var scrollMargin: js.UndefOr[Validator[js.UndefOr[js.Array[Double]]]] = js.undefined
  var setOptions: js.UndefOr[Validator[js.UndefOr[IAceOptions]]] = js.undefined
  var showGutter: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var showPrintMargin: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties]]] = js.undefined
  var tabSize: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var theme: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var value: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var width: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var wrapEnabled: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
}

object ValidationMapIAceEditorPr {
  @scala.inline
  def apply(
    annotations: Validator[js.UndefOr[js.Array[IAnnotation]]] = null,
    className: Validator[js.UndefOr[String]] = null,
    commands: Validator[js.UndefOr[js.Array[ICommand]]] = null,
    cursorStart: Validator[js.UndefOr[Double]] = null,
    debounceChangePeriod: Validator[js.UndefOr[Double]] = null,
    defaultValue: Validator[js.UndefOr[String]] = null,
    editorProps: Validator[js.UndefOr[IEditorProps]] = null,
    enableBasicAutocompletion: Validator[js.UndefOr[Boolean | js.Array[String]]] = null,
    enableLiveAutocompletion: Validator[js.UndefOr[Boolean | js.Array[String]]] = null,
    enableSnippets: Validator[js.UndefOr[Boolean]] = null,
    focus: Validator[js.UndefOr[Boolean]] = null,
    fontSize: Validator[js.UndefOr[Double | String]] = null,
    height: Validator[js.UndefOr[String]] = null,
    highlightActiveLine: Validator[js.UndefOr[Boolean]] = null,
    keyboardHandler: Validator[js.UndefOr[String]] = null,
    markers: Validator[js.UndefOr[js.Array[IMarker]]] = null,
    maxLines: Validator[js.UndefOr[Double]] = null,
    minLines: Validator[js.UndefOr[Double]] = null,
    mode: Validator[js.UndefOr[String]] = null,
    name: Validator[js.UndefOr[String]] = null,
    navigateToFileEnd: Validator[js.UndefOr[Boolean]] = null,
    onBeforeLoad: Validator[js.UndefOr[js.Function1[/* ace */ _, Unit]]] = null,
    onBlur: Validator[
      js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[AceEditorClass], Unit]]
    ] = null,
    onChange: Validator[js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[_], Unit]]] = null,
    onCopy: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]] = null,
    onCursorChange: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]] = null,
    onFocus: Validator[
      js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[AceEditorClass], Unit]]
    ] = null,
    onInput: Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]] = null,
    onLoad: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]] = null,
    onPaste: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]] = null,
    onScroll: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]] = null,
    onSelection: Validator[
      js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[_], Unit]]
    ] = null,
    onSelectionChange: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]] = null,
    onValidate: Validator[js.UndefOr[js.Function1[/* annotations */ js.Array[IAnnotation], Unit]]] = null,
    placeholder: Validator[js.UndefOr[String]] = null,
    readOnly: Validator[js.UndefOr[Boolean]] = null,
    scrollMargin: Validator[js.UndefOr[js.Array[Double]]] = null,
    setOptions: Validator[js.UndefOr[IAceOptions]] = null,
    showGutter: Validator[js.UndefOr[Boolean]] = null,
    showPrintMargin: Validator[js.UndefOr[Boolean]] = null,
    style: Validator[js.UndefOr[CSSProperties]] = null,
    tabSize: Validator[js.UndefOr[Double]] = null,
    theme: Validator[js.UndefOr[String]] = null,
    value: Validator[js.UndefOr[String]] = null,
    width: Validator[js.UndefOr[String]] = null,
    wrapEnabled: Validator[js.UndefOr[Boolean]] = null
  ): ValidationMapIAceEditorPr = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (cursorStart != null) __obj.updateDynamic("cursorStart")(cursorStart.asInstanceOf[js.Any])
    if (debounceChangePeriod != null) __obj.updateDynamic("debounceChangePeriod")(debounceChangePeriod.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (editorProps != null) __obj.updateDynamic("editorProps")(editorProps.asInstanceOf[js.Any])
    if (enableBasicAutocompletion != null) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion.asInstanceOf[js.Any])
    if (enableLiveAutocompletion != null) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion.asInstanceOf[js.Any])
    if (enableSnippets != null) __obj.updateDynamic("enableSnippets")(enableSnippets.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlightActiveLine != null) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine.asInstanceOf[js.Any])
    if (keyboardHandler != null) __obj.updateDynamic("keyboardHandler")(keyboardHandler.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigateToFileEnd != null) __obj.updateDynamic("navigateToFileEnd")(navigateToFileEnd.asInstanceOf[js.Any])
    if (onBeforeLoad != null) __obj.updateDynamic("onBeforeLoad")(onBeforeLoad.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy.asInstanceOf[js.Any])
    if (onCursorChange != null) __obj.updateDynamic("onCursorChange")(onCursorChange.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(onInput.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    if (onSelection != null) __obj.updateDynamic("onSelection")(onSelection.asInstanceOf[js.Any])
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(onSelectionChange.asInstanceOf[js.Any])
    if (onValidate != null) __obj.updateDynamic("onValidate")(onValidate.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions.asInstanceOf[js.Any])
    if (showGutter != null) __obj.updateDynamic("showGutter")(showGutter.asInstanceOf[js.Any])
    if (showPrintMargin != null) __obj.updateDynamic("showPrintMargin")(showPrintMargin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapEnabled != null) __obj.updateDynamic("wrapEnabled")(wrapEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMapIAceEditorPr]
  }
}

