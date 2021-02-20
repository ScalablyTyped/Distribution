package typings.reactAce

import typings.react.mod.Component
import typings.reactAce.anon.Left
import typings.reactAce.anon.PartialIDiffEditorProps
import typings.reactAce.anon.ValidationMapIDiffEditorP
import typings.reactAce.typesMod.IEditorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @scala.inline
    def defaultProps_=(x: PartialIDiffEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace/lib/diff", "default.propTypes")
    @js.native
    def propTypes: ValidationMapIDiffEditorP = js.native
    @scala.inline
    def propTypes_=(x: ValidationMapIDiffEditorP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DiffComponent
    extends Component[IDiffEditorProps, IDiffEditorState, js.Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDiffComponent(): Unit = js.native
    
    def diff(): js.Array[js.Array[_]] = js.native
    
    def generateDiffedLines(diff: js.Any): Left = js.native
    
    def onChange(value: js.Any): Unit = js.native
    
    def setCodeMarkers(): js.Array[js.Array[_]] = js.native
    def setCodeMarkers(diffedLines: js.Any): js.Array[js.Array[_]] = js.native
  }
  
  @js.native
  trait IDiffEditorProps extends StObject {
    
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
  object IDiffEditorProps {
    
    @scala.inline
    def apply(): IDiffEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDiffEditorProps]
    }
    
    @scala.inline
    implicit class IDiffEditorPropsMutableBuilder[Self <: IDiffEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCursorStart(value: Double): Self = StObject.set(x, "cursorStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStartUndefined: Self = StObject.set(x, "cursorStart", js.undefined)
      
      @scala.inline
      def setEditorProps(value: js.Object): Self = StObject.set(x, "editorProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorPropsUndefined: Self = StObject.set(x, "editorProps", js.undefined)
      
      @scala.inline
      def setEnableBasicAutocompletion(value: Boolean | js.Array[String]): Self = StObject.set(x, "enableBasicAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBasicAutocompletionUndefined: Self = StObject.set(x, "enableBasicAutocompletion", js.undefined)
      
      @scala.inline
      def setEnableBasicAutocompletionVarargs(value: String*): Self = StObject.set(x, "enableBasicAutocompletion", js.Array(value :_*))
      
      @scala.inline
      def setEnableLiveAutocompletion(value: Boolean | js.Array[String]): Self = StObject.set(x, "enableLiveAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLiveAutocompletionUndefined: Self = StObject.set(x, "enableLiveAutocompletion", js.undefined)
      
      @scala.inline
      def setEnableLiveAutocompletionVarargs(value: String*): Self = StObject.set(x, "enableLiveAutocompletion", js.Array(value :_*))
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHighlightActiveLine(value: Boolean): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* editor */ IEditorProps => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnPaste(value: /* value */ String => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* editor */ IEditorProps => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setScrollMargin(value: js.Array[Double]): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      @scala.inline
      def setScrollMarginVarargs(value: Double*): Self = StObject.set(x, "scrollMargin", js.Array(value :_*))
      
      @scala.inline
      def setSetOptions(value: js.Object): Self = StObject.set(x, "setOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
      
      @scala.inline
      def setShowGutter(value: Boolean): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
      
      @scala.inline
      def setShowPrintMargin(value: Boolean): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
      
      @scala.inline
      def setSplits(value: Double): Self = StObject.set(x, "splits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitsUndefined: Self = StObject.set(x, "splits", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapEnabled(value: Boolean): Self = StObject.set(x, "wrapEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapEnabledUndefined: Self = StObject.set(x, "wrapEnabled", js.undefined)
    }
  }
  
  @js.native
  trait IDiffEditorState extends StObject {
    
    var value: js.Array[String] = js.native
  }
  object IDiffEditorState {
    
    @scala.inline
    def apply(value: js.Array[String]): IDiffEditorState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDiffEditorState]
    }
    
    @scala.inline
    implicit class IDiffEditorStateMutableBuilder[Self <: IDiffEditorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
