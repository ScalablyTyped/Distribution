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
  var onFocus: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onInput: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* event */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* editor */ EditorProps, scala.Unit]] = js.undefined
  var onPaste: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* editor */ EditorProps, scala.Unit]] = js.undefined
  var onSelection: js.UndefOr[
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

