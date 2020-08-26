package typings.reactAce.anon

import typings.propTypes.mod.Validator
import typings.reactAce.typesMod.IEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined prop-types.prop-types.ValidationMap<react-ace.react-ace/lib/diff.IDiffEditorProps> */
@js.native
trait ValidationMapIDiffEditorP extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var cursorStart: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var editorProps: js.UndefOr[Validator[js.UndefOr[js.Object]]] = js.native
  var enableBasicAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.native
  var enableLiveAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.native
  var focus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var fontSize: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var height: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var highlightActiveLine: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var maxLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var minLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var mode: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var name: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[_], Unit]]
    ]
  ] = js.native
  var onLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]] = js.native
  var onPaste: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.native
  var onScroll: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]] = js.native
  var orientation: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var scrollMargin: js.UndefOr[Validator[js.UndefOr[js.Array[Double]]]] = js.native
  var setOptions: js.UndefOr[Validator[js.UndefOr[js.Object]]] = js.native
  var showGutter: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var showPrintMargin: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var splits: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[js.Object]]] = js.native
  var tabSize: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var theme: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var value: js.UndefOr[Validator[js.UndefOr[js.Array[String]]]] = js.native
  var width: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var wrapEnabled: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
}

object ValidationMapIDiffEditorP {
  @scala.inline
  def apply(): ValidationMapIDiffEditorP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapIDiffEditorP]
  }
  @scala.inline
  implicit class ValidationMapIDiffEditorPOps[Self <: ValidationMapIDiffEditorP] (val x: Self) extends AnyVal {
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
    def setClassName(value: Validator[js.UndefOr[String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCursorStart(value: Validator[js.UndefOr[Double]]): Self = this.set("cursorStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorStart: Self = this.set("cursorStart", js.undefined)
    @scala.inline
    def setEditorProps(value: Validator[js.UndefOr[js.Object]]): Self = this.set("editorProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorProps: Self = this.set("editorProps", js.undefined)
    @scala.inline
    def setEnableBasicAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = this.set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBasicAutocompletion: Self = this.set("enableBasicAutocompletion", js.undefined)
    @scala.inline
    def setEnableLiveAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = this.set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLiveAutocompletion: Self = this.set("enableLiveAutocompletion", js.undefined)
    @scala.inline
    def setFocus(value: Validator[js.UndefOr[Boolean]]): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setFontSize(value: Validator[js.UndefOr[Double]]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setHeight(value: Validator[js.UndefOr[String]]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHighlightActiveLine(value: Validator[js.UndefOr[Boolean]]): Self = this.set("highlightActiveLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightActiveLine: Self = this.set("highlightActiveLine", js.undefined)
    @scala.inline
    def setMaxLines(value: Validator[js.UndefOr[Double]]): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    @scala.inline
    def setMinLines(value: Validator[js.UndefOr[Double]]): Self = this.set("minLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLines: Self = this.set("minLines", js.undefined)
    @scala.inline
    def setMode(value: Validator[js.UndefOr[String]]): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: Validator[js.UndefOr[String]]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(
      value: Validator[
          js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[_], Unit]]
        ]
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnLoad(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnPaste(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = this.set("onPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnScroll(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOrientation(value: Validator[js.UndefOr[String]]): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setReadOnly(value: Validator[js.UndefOr[Boolean]]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setScrollMargin(value: Validator[js.UndefOr[js.Array[Double]]]): Self = this.set("scrollMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollMargin: Self = this.set("scrollMargin", js.undefined)
    @scala.inline
    def setSetOptions(value: Validator[js.UndefOr[js.Object]]): Self = this.set("setOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetOptions: Self = this.set("setOptions", js.undefined)
    @scala.inline
    def setShowGutter(value: Validator[js.UndefOr[Boolean]]): Self = this.set("showGutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGutter: Self = this.set("showGutter", js.undefined)
    @scala.inline
    def setShowPrintMargin(value: Validator[js.UndefOr[Boolean]]): Self = this.set("showPrintMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPrintMargin: Self = this.set("showPrintMargin", js.undefined)
    @scala.inline
    def setSplits(value: Validator[js.UndefOr[Double]]): Self = this.set("splits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplits: Self = this.set("splits", js.undefined)
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[js.Object]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabSize(value: Validator[js.UndefOr[Double]]): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    @scala.inline
    def setTheme(value: Validator[js.UndefOr[String]]): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValue(value: Validator[js.UndefOr[js.Array[String]]]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: Validator[js.UndefOr[String]]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapEnabled(value: Validator[js.UndefOr[Boolean]]): Self = this.set("wrapEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapEnabled: Self = this.set("wrapEnabled", js.undefined)
  }
  
}

