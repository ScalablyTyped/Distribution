package typings
package reactDashAceLib.libAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAceEditorProps
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var annotations: js.UndefOr[js.Array[braceLib.braceMod.Annotation]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var commands: js.UndefOr[js.Array[reactDashAceLib.libTypesMod.ICommand]] = js.undefined
  var cursorStart: js.UndefOr[scala.Double] = js.undefined
  var debounceChangePeriod: js.UndefOr[scala.Double] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var editorProps: js.UndefOr[reactDashAceLib.libTypesMod.IEditorProps] = js.undefined
  var enableBasicAutocompletion: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var enableLiveAutocompletion: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var fontSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var highlightActiveLine: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardHandler: js.UndefOr[java.lang.String] = js.undefined
  var markers: js.UndefOr[js.Array[reactDashAceLib.libTypesMod.IMarker]] = js.undefined
  var maxLines: js.UndefOr[scala.Double] = js.undefined
  var minLines: js.UndefOr[scala.Double] = js.undefined
  /** For available modes see https://github.com/thlorenz/brace/tree/master/mode */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigateToFileEnd: js.UndefOr[scala.Boolean] = js.undefined
  var onBeforeLoad: js.UndefOr[js.Function1[/* ace */ js.Any, scala.Unit]] = js.undefined
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ js.Any, 
      /* editor */ js.UndefOr[reactDashAceLib.libAceEditorClassMod.AceEditorClass], 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* event */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var onCopy: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onCursorChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[
    js.Function2[
      /* event */ js.Any, 
      /* editor */ js.UndefOr[reactDashAceLib.libAceEditorClassMod.AceEditorClass], 
      scala.Unit
    ]
  ] = js.undefined
  var onInput: js.UndefOr[js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* editor */ reactDashAceLib.libTypesMod.IEditorProps, scala.Unit]] = js.undefined
  var onPaste: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* editor */ reactDashAceLib.libTypesMod.IEditorProps, scala.Unit]] = js.undefined
  var onSelection: js.UndefOr[
    js.Function2[/* selectedText */ java.lang.String, /* event */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onValidate: js.UndefOr[
    js.Function1[/* annotations */ js.Array[braceLib.braceMod.Annotation], scala.Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var scrollMargin: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var setOptions: js.UndefOr[reactDashAceLib.libTypesMod.IAceOptions] = js.undefined
  var showGutter: js.UndefOr[scala.Boolean] = js.undefined
  var showPrintMargin: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.Any
  var tabSize: js.UndefOr[scala.Double] = js.undefined
  /** For available themes see https://github.com/thlorenz/brace/tree/master/theme */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
  var wrapEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object IAceEditorProps {
  @scala.inline
  def apply(
    style: js.Any,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    annotations: js.Array[braceLib.braceMod.Annotation] = null,
    className: java.lang.String = null,
    commands: js.Array[reactDashAceLib.libTypesMod.ICommand] = null,
    cursorStart: scala.Int | scala.Double = null,
    debounceChangePeriod: scala.Int | scala.Double = null,
    defaultValue: java.lang.String = null,
    editorProps: reactDashAceLib.libTypesMod.IEditorProps = null,
    enableBasicAutocompletion: scala.Boolean | js.Array[java.lang.String] = null,
    enableLiveAutocompletion: scala.Boolean | js.Array[java.lang.String] = null,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    fontSize: scala.Double | java.lang.String = null,
    height: java.lang.String = null,
    highlightActiveLine: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardHandler: java.lang.String = null,
    markers: js.Array[reactDashAceLib.libTypesMod.IMarker] = null,
    maxLines: scala.Int | scala.Double = null,
    minLines: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    name: java.lang.String = null,
    navigateToFileEnd: js.UndefOr[scala.Boolean] = js.undefined,
    onBeforeLoad: /* ace */ js.Any => scala.Unit = null,
    onBlur: (/* event */ js.Any, /* editor */ js.UndefOr[reactDashAceLib.libAceEditorClassMod.AceEditorClass]) => scala.Unit = null,
    onChange: (/* value */ java.lang.String, /* event */ js.UndefOr[js.Any]) => scala.Unit = null,
    onCopy: /* value */ java.lang.String => scala.Unit = null,
    onCursorChange: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => scala.Unit = null,
    onFocus: (/* event */ js.Any, /* editor */ js.UndefOr[reactDashAceLib.libAceEditorClassMod.AceEditorClass]) => scala.Unit = null,
    onInput: /* event */ js.UndefOr[js.Any] => scala.Unit = null,
    onLoad: /* editor */ reactDashAceLib.libTypesMod.IEditorProps => scala.Unit = null,
    onPaste: /* value */ java.lang.String => scala.Unit = null,
    onScroll: /* editor */ reactDashAceLib.libTypesMod.IEditorProps => scala.Unit = null,
    onSelection: (/* selectedText */ java.lang.String, /* event */ js.UndefOr[js.Any]) => scala.Unit = null,
    onSelectionChange: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => scala.Unit = null,
    onValidate: /* annotations */ js.Array[braceLib.braceMod.Annotation] => scala.Unit = null,
    placeholder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    scrollMargin: js.Array[scala.Double] = null,
    setOptions: reactDashAceLib.libTypesMod.IAceOptions = null,
    showGutter: js.UndefOr[scala.Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[scala.Boolean] = js.undefined,
    tabSize: scala.Int | scala.Double = null,
    theme: java.lang.String = null,
    value: java.lang.String = null,
    width: java.lang.String = null,
    wrapEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): IAceEditorProps = {
    val __obj = js.Dynamic.literal(style = style)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (className != null) __obj.updateDynamic("className")(className)
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (cursorStart != null) __obj.updateDynamic("cursorStart")(cursorStart.asInstanceOf[js.Any])
    if (debounceChangePeriod != null) __obj.updateDynamic("debounceChangePeriod")(debounceChangePeriod.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (editorProps != null) __obj.updateDynamic("editorProps")(editorProps)
    if (enableBasicAutocompletion != null) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion.asInstanceOf[js.Any])
    if (enableLiveAutocompletion != null) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion.asInstanceOf[js.Any])
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
    if (!js.isUndefined(navigateToFileEnd)) __obj.updateDynamic("navigateToFileEnd")(navigateToFileEnd)
    if (onBeforeLoad != null) __obj.updateDynamic("onBeforeLoad")(js.Any.fromFunction1(onBeforeLoad))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCursorChange != null) __obj.updateDynamic("onCursorChange")(js.Any.fromFunction2(onCursorChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction2(onSelection))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2(onSelectionChange))
    if (onValidate != null) __obj.updateDynamic("onValidate")(js.Any.fromFunction1(onValidate))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin)
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions)
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter)
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width)
    if (!js.isUndefined(wrapEnabled)) __obj.updateDynamic("wrapEnabled")(wrapEnabled)
    __obj.asInstanceOf[IAceEditorProps]
  }
}

