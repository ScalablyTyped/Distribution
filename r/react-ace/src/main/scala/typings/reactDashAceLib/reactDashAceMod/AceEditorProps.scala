package typings
package reactDashAceLib.reactDashAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceEditorProps extends js.Object {
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var commands: js.UndefOr[js.Array[Command]] = js.undefined
  var cursorStart: js.UndefOr[scala.Double] = js.undefined
  var debounceChangePeriod: js.UndefOr[scala.Double] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var editorProps: js.UndefOr[EditorProps] = js.undefined
  var enableBasicAutocompletion: js.UndefOr[scala.Boolean] = js.undefined
  var enableLiveAutocompletion: js.UndefOr[scala.Boolean] = js.undefined
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var highlightActiveLine: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardHandler: js.UndefOr[java.lang.String] = js.undefined
  var markers: js.UndefOr[js.Array[Marker]] = js.undefined
  var maxLines: js.UndefOr[scala.Double] = js.undefined
  var minLines: js.UndefOr[scala.Double] = js.undefined
  /** For available modes see https://github.com/thlorenz/brace/tree/master/mode */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBeforeLoad: js.UndefOr[js.Function1[/* ace */ js.Any, scala.Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* event */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var onCopy: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onCursorChange: js.UndefOr[js.Function1[/* selection */ Selection, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onInput: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* event */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* editor */ EditorProps, scala.Unit]] = js.undefined
  var onPaste: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* editor */ EditorProps, scala.Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[
    js.Function2[/* selectedText */ java.lang.String, /* event */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var onValidate: js.UndefOr[js.Function1[/* annotations */ js.Array[Annotation], scala.Unit]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var scrollMargin: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var setOptions: js.UndefOr[AceOptions] = js.undefined
  var showGutter: js.UndefOr[scala.Boolean] = js.undefined
  var showPrintMargin: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabSize: js.UndefOr[scala.Double] = js.undefined
  /** For available themes see https://github.com/thlorenz/brace/tree/master/theme */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
  var wrapEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object AceEditorProps {
  @scala.inline
  def apply(
    annotations: js.Array[Annotation] = null,
    className: java.lang.String = null,
    commands: js.Array[Command] = null,
    cursorStart: scala.Int | scala.Double = null,
    debounceChangePeriod: scala.Int | scala.Double = null,
    defaultValue: java.lang.String = null,
    editorProps: EditorProps = null,
    enableBasicAutocompletion: js.UndefOr[scala.Boolean] = js.undefined,
    enableLiveAutocompletion: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    fontSize: scala.Int | scala.Double = null,
    height: java.lang.String = null,
    highlightActiveLine: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardHandler: java.lang.String = null,
    markers: js.Array[Marker] = null,
    maxLines: scala.Int | scala.Double = null,
    minLines: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    name: java.lang.String = null,
    onBeforeLoad: js.Function1[/* ace */ js.Any, scala.Unit] = null,
    onBlur: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onChange: js.Function2[/* value */ java.lang.String, /* event */ js.UndefOr[js.Any], scala.Unit] = null,
    onCopy: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    onCursorChange: js.Function1[/* selection */ Selection, scala.Unit] = null,
    onFocus: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onInput: js.Function2[/* value */ java.lang.String, /* event */ js.UndefOr[js.Any], scala.Unit] = null,
    onLoad: js.Function1[/* editor */ EditorProps, scala.Unit] = null,
    onPaste: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    onScroll: js.Function1[/* editor */ EditorProps, scala.Unit] = null,
    onSelectionChange: js.Function2[/* selectedText */ java.lang.String, /* event */ js.UndefOr[js.Any], scala.Unit] = null,
    onValidate: js.Function1[/* annotations */ js.Array[Annotation], scala.Unit] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    scrollMargin: js.Array[scala.Double] = null,
    setOptions: AceOptions = null,
    showGutter: js.UndefOr[scala.Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabSize: scala.Int | scala.Double = null,
    theme: java.lang.String = null,
    value: java.lang.String = null,
    width: java.lang.String = null,
    wrapEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): AceEditorProps = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (cursorStart != null) __obj.updateDynamic("cursorStart")(cursorStart.asInstanceOf[js.Any])
    if (debounceChangePeriod != null) __obj.updateDynamic("debounceChangePeriod")(debounceChangePeriod.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (editorProps != null) __obj.updateDynamic("editorProps")(editorProps)
    if (!js.isUndefined(enableBasicAutocompletion)) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion)
    if (!js.isUndefined(enableLiveAutocompletion)) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(highlightActiveLine)) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine)
    if (keyboardHandler != null) __obj.updateDynamic("keyboardHandler")(keyboardHandler)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBeforeLoad != null) __obj.updateDynamic("onBeforeLoad")(onBeforeLoad)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCursorChange != null) __obj.updateDynamic("onCursorChange")(onCursorChange)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(onSelectionChange)
    if (onValidate != null) __obj.updateDynamic("onValidate")(onValidate)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin)
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions)
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter)
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width)
    if (!js.isUndefined(wrapEnabled)) __obj.updateDynamic("wrapEnabled")(wrapEnabled)
    __obj.asInstanceOf[AceEditorProps]
  }
}

