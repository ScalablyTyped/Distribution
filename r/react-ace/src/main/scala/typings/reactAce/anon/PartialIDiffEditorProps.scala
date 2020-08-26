package typings.reactAce.anon

import typings.reactAce.typesMod.IEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-ace.react-ace/lib/diff.IDiffEditorProps> */
@js.native
trait PartialIDiffEditorProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var cursorStart: js.UndefOr[Double] = js.native
  var editorProps: js.UndefOr[js.Object] = js.native
  var enableBasicAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.native
  var enableLiveAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.native
  var focus: js.UndefOr[Boolean] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var height: js.UndefOr[String] = js.native
  var highlightActiveLine: js.UndefOr[Boolean] = js.native
  var maxLines: js.UndefOr[Double] = js.native
  var minLines: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[js.Any], Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.native
  var onPaste: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onScroll: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.native
  var orientation: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var scrollMargin: js.UndefOr[js.Array[Double]] = js.native
  var setOptions: js.UndefOr[js.Object] = js.native
  var showGutter: js.UndefOr[Boolean] = js.native
  var showPrintMargin: js.UndefOr[Boolean] = js.native
  var splits: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Array[String]] = js.native
  var width: js.UndefOr[String] = js.native
  var wrapEnabled: js.UndefOr[Boolean] = js.native
}

object PartialIDiffEditorProps {
  @scala.inline
  def apply(): PartialIDiffEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDiffEditorProps]
  }
  @scala.inline
  implicit class PartialIDiffEditorPropsOps[Self <: PartialIDiffEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCursorStart(value: Double): Self = this.set("cursorStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorStart: Self = this.set("cursorStart", js.undefined)
    @scala.inline
    def setEditorProps(value: js.Object): Self = this.set("editorProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorProps: Self = this.set("editorProps", js.undefined)
    @scala.inline
    def setEnableBasicAutocompletionVarargs(value: String*): Self = this.set("enableBasicAutocompletion", js.Array(value :_*))
    @scala.inline
    def setEnableBasicAutocompletion(value: Boolean | js.Array[String]): Self = this.set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBasicAutocompletion: Self = this.set("enableBasicAutocompletion", js.undefined)
    @scala.inline
    def setEnableLiveAutocompletionVarargs(value: String*): Self = this.set("enableLiveAutocompletion", js.Array(value :_*))
    @scala.inline
    def setEnableLiveAutocompletion(value: Boolean | js.Array[String]): Self = this.set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLiveAutocompletion: Self = this.set("enableLiveAutocompletion", js.undefined)
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHighlightActiveLine(value: Boolean): Self = this.set("highlightActiveLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightActiveLine: Self = this.set("highlightActiveLine", js.undefined)
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    @scala.inline
    def setMinLines(value: Double): Self = this.set("minLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLines: Self = this.set("minLines", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnLoad(value: /* editor */ IEditorProps => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnPaste(value: /* value */ String => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnScroll(value: /* editor */ IEditorProps => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setScrollMarginVarargs(value: Double*): Self = this.set("scrollMargin", js.Array(value :_*))
    @scala.inline
    def setScrollMargin(value: js.Array[Double]): Self = this.set("scrollMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollMargin: Self = this.set("scrollMargin", js.undefined)
    @scala.inline
    def setSetOptions(value: js.Object): Self = this.set("setOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetOptions: Self = this.set("setOptions", js.undefined)
    @scala.inline
    def setShowGutter(value: Boolean): Self = this.set("showGutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGutter: Self = this.set("showGutter", js.undefined)
    @scala.inline
    def setShowPrintMargin(value: Boolean): Self = this.set("showPrintMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPrintMargin: Self = this.set("showPrintMargin", js.undefined)
    @scala.inline
    def setSplits(value: Double): Self = this.set("splits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplits: Self = this.set("splits", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapEnabled(value: Boolean): Self = this.set("wrapEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapEnabled: Self = this.set("wrapEnabled", js.undefined)
  }
  
}

