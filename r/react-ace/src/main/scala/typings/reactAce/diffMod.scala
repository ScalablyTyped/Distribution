package typings.reactAce

import typings.react.mod.Component
import typings.reactAce.anon.Left
import typings.reactAce.anon.PartialIDiffEditorProps
import typings.reactAce.anon.ValidationMapIDiffEditorP
import typings.reactAce.typesMod.IEditorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("react-ace/lib/diff", JSImport.Default)
  @js.native
  class default protected () extends DiffComponent {
    def this(props: IDiffEditorProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-ace/lib/diff", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-ace/lib/diff", "default.defaultProps")
    @js.native
    def defaultProps: PartialIDiffEditorProps = js.native
    inline def defaultProps_=(x: PartialIDiffEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace/lib/diff", "default.propTypes")
    @js.native
    def propTypes: ValidationMapIDiffEditorP = js.native
    inline def propTypes_=(x: ValidationMapIDiffEditorP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DiffComponent
    extends Component[IDiffEditorProps, IDiffEditorState, js.Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDiffComponent(): Unit = js.native
    
    def diff(): js.Array[js.Array[js.Any]] = js.native
    
    def generateDiffedLines(diff: js.Any): Left = js.native
    
    def onChange(value: js.Any): Unit = js.native
    
    def setCodeMarkers(): js.Array[js.Array[js.Any]] = js.native
    def setCodeMarkers(diffedLines: js.Any): js.Array[js.Array[js.Any]] = js.native
  }
  
  trait IDiffEditorProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cursorStart: js.UndefOr[Double] = js.undefined
    
    var editorProps: js.UndefOr[js.Object] = js.undefined
    
    var enableBasicAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var enableLiveAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var highlightActiveLine: js.UndefOr[Boolean] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var minLines: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.undefined
    
    var onPaste: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onScroll: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.undefined
    
    var orientation: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var scrollMargin: js.UndefOr[js.Array[Double]] = js.undefined
    
    var setOptions: js.UndefOr[js.Object] = js.undefined
    
    var showGutter: js.UndefOr[Boolean] = js.undefined
    
    var showPrintMargin: js.UndefOr[Boolean] = js.undefined
    
    var splits: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Array[String]] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    var wrapEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object IDiffEditorProps {
    
    inline def apply(): IDiffEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDiffEditorProps]
    }
    
    extension [Self <: IDiffEditorProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCursorStart(value: Double): Self = StObject.set(x, "cursorStart", value.asInstanceOf[js.Any])
      
      inline def setCursorStartUndefined: Self = StObject.set(x, "cursorStart", js.undefined)
      
      inline def setEditorProps(value: js.Object): Self = StObject.set(x, "editorProps", value.asInstanceOf[js.Any])
      
      inline def setEditorPropsUndefined: Self = StObject.set(x, "editorProps", js.undefined)
      
      inline def setEnableBasicAutocompletion(value: Boolean | js.Array[String]): Self = StObject.set(x, "enableBasicAutocompletion", value.asInstanceOf[js.Any])
      
      inline def setEnableBasicAutocompletionUndefined: Self = StObject.set(x, "enableBasicAutocompletion", js.undefined)
      
      inline def setEnableBasicAutocompletionVarargs(value: String*): Self = StObject.set(x, "enableBasicAutocompletion", js.Array(value :_*))
      
      inline def setEnableLiveAutocompletion(value: Boolean | js.Array[String]): Self = StObject.set(x, "enableLiveAutocompletion", value.asInstanceOf[js.Any])
      
      inline def setEnableLiveAutocompletionUndefined: Self = StObject.set(x, "enableLiveAutocompletion", js.undefined)
      
      inline def setEnableLiveAutocompletionVarargs(value: String*): Self = StObject.set(x, "enableLiveAutocompletion", js.Array(value :_*))
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHighlightActiveLine(value: Boolean): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
      
      inline def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      inline def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnLoad(value: /* editor */ IEditorProps => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnPaste(value: /* value */ String => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnScroll(value: /* editor */ IEditorProps => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setScrollMargin(value: js.Array[Double]): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      inline def setScrollMarginVarargs(value: Double*): Self = StObject.set(x, "scrollMargin", js.Array(value :_*))
      
      inline def setSetOptions(value: js.Object): Self = StObject.set(x, "setOptions", value.asInstanceOf[js.Any])
      
      inline def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
      
      inline def setShowGutter(value: Boolean): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
      
      inline def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
      
      inline def setShowPrintMargin(value: Boolean): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
      
      inline def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
      
      inline def setSplits(value: Double): Self = StObject.set(x, "splits", value.asInstanceOf[js.Any])
      
      inline def setSplitsUndefined: Self = StObject.set(x, "splits", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapEnabled(value: Boolean): Self = StObject.set(x, "wrapEnabled", value.asInstanceOf[js.Any])
      
      inline def setWrapEnabledUndefined: Self = StObject.set(x, "wrapEnabled", js.undefined)
    }
  }
  
  trait IDiffEditorState extends StObject {
    
    var value: js.Array[String]
  }
  object IDiffEditorState {
    
    inline def apply(value: js.Array[String]): IDiffEditorState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDiffEditorState]
    }
    
    extension [Self <: IDiffEditorState](x: Self) {
      
      inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
