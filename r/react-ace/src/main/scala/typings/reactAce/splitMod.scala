package typings.reactAce

import org.scalablytyped.runtime.StringDictionary
import typings.aceBuilds.mod.Ace.Editor
import typings.react.mod.Component
import typings.reactAce.anon.PartialISplitEditorProps
import typings.reactAce.anon.ValidationMapISplitEditor
import typings.reactAce.typesMod.IAceOptions
import typings.reactAce.typesMod.IAnnotation
import typings.reactAce.typesMod.ICommand
import typings.reactAce.typesMod.IEditorProps
import typings.reactAce.typesMod.IMarker
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMod {
  
  @JSImport("react-ace/lib/split", JSImport.Default)
  @js.native
  class default protected () extends SplitComponent {
    def this(props: ISplitEditorProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-ace/lib/split", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-ace/lib/split", "default.defaultProps")
    @js.native
    def defaultProps: PartialISplitEditorProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialISplitEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace/lib/split", "default.propTypes")
    @js.native
    def propTypes: ValidationMapISplitEditor = js.native
    @scala.inline
    def propTypes_=(x: ValidationMapISplitEditor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IAceEditorClass
    extends Editor
       with /* index */ StringDictionary[js.Any] {
    
    @JSName("$options")
    var $options: js.UndefOr[js.Any] = js.native
  }
  
  @js.native
  trait ISplitEditorProps
    extends /* index */ StringDictionary[js.Any] {
    
    var annotations: js.UndefOr[js.Array[js.Array[IAnnotation]]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var commands: js.UndefOr[js.Array[ICommand]] = js.native
    
    var cursorStart: js.UndefOr[Double] = js.native
    
    var debounceChangePeriod: js.UndefOr[Double] = js.native
    
    var defaultValue: js.UndefOr[js.Array[String]] = js.native
    
    var editorProps: js.UndefOr[IEditorProps] = js.native
    
    var enableBasicAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    var enableLiveAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    var focus: js.UndefOr[Boolean] = js.native
    
    var fontSize: js.UndefOr[Double | String] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    var highlightActiveLine: js.UndefOr[Boolean] = js.native
    
    var keyboardHandler: js.UndefOr[String] = js.native
    
    var markers: js.UndefOr[js.Array[js.Array[IMarker]]] = js.native
    
    var maxLines: js.UndefOr[Double] = js.native
    
    var minLines: js.UndefOr[Double] = js.native
    
    /** For available modes see https://github.com/thlorenz/brace/tree/master/mode */
    var mode: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBeforeLoad: js.UndefOr[js.Function1[/* ace */ js.Any, Unit]] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* value */ Event, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onCopy: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onCursorChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* value */ Event, Unit]] = js.native
    
    var onInput: js.UndefOr[js.Function1[/* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.native
    
    var onPaste: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onScroll: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.native
    
    var onSelection: js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onSelectionChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var orientation: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var scrollMargin: js.UndefOr[js.Array[Double]] = js.native
    
    var setOptions: js.UndefOr[IAceOptions] = js.native
    
    var showGutter: js.UndefOr[Boolean] = js.native
    
    var showPrintMargin: js.UndefOr[Boolean] = js.native
    
    var splits: Double = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var tabSize: js.UndefOr[Double] = js.native
    
    /** For available themes see https://github.com/thlorenz/brace/tree/master/theme */
    var theme: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Array[String]] = js.native
    
    var width: js.UndefOr[String] = js.native
    
    var wrapEnabled: js.UndefOr[Boolean] = js.native
  }
  object ISplitEditorProps {
    
    @scala.inline
    def apply(splits: Double): ISplitEditorProps = {
      val __obj = js.Dynamic.literal(splits = splits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISplitEditorProps]
    }
    
    @scala.inline
    implicit class ISplitEditorPropsMutableBuilder[Self <: ISplitEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: js.Array[js.Array[IAnnotation]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      @scala.inline
      def setAnnotationsVarargs(value: js.Array[IAnnotation]*): Self = StObject.set(x, "annotations", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCommands(value: js.Array[ICommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      @scala.inline
      def setCommandsVarargs(value: ICommand*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setCursorStart(value: Double): Self = StObject.set(x, "cursorStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStartUndefined: Self = StObject.set(x, "cursorStart", js.undefined)
      
      @scala.inline
      def setDebounceChangePeriod(value: Double): Self = StObject.set(x, "debounceChangePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceChangePeriodUndefined: Self = StObject.set(x, "debounceChangePeriod", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setEditorProps(value: IEditorProps): Self = StObject.set(x, "editorProps", value.asInstanceOf[js.Any])
      
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
      def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
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
      def setKeyboardHandler(value: String): Self = StObject.set(x, "keyboardHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardHandlerUndefined: Self = StObject.set(x, "keyboardHandler", js.undefined)
      
      @scala.inline
      def setMarkers(value: js.Array[js.Array[IMarker]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      @scala.inline
      def setMarkersVarargs(value: js.Array[IMarker]*): Self = StObject.set(x, "markers", js.Array(value :_*))
      
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
      def setOnBeforeLoad(value: /* ace */ js.Any => Unit): Self = StObject.set(x, "onBeforeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeLoadUndefined: Self = StObject.set(x, "onBeforeLoad", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* value */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnCopy(value: /* value */ String => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCursorChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onCursorChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCursorChangeUndefined: Self = StObject.set(x, "onCursorChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* value */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: /* event */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
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
      def setOnSelection(value: (/* selectedText */ String, /* event */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectionChange(value: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
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
      def setSetOptions(value: IAceOptions): Self = StObject.set(x, "setOptions", value.asInstanceOf[js.Any])
      
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
  trait SplitComponent
    extends Component[ISplitEditorProps, js.UndefOr[scala.Nothing], js.Any]
       with /* index */ StringDictionary[js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MSplitComponent(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSplitComponent(prevProps: ISplitEditorProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSplitComponent(): Unit = js.native
    
    def debounce(fn: js.Any, delay: Double): js.Function1[/* args */ js.Any, Unit] = js.native
    
    var editor: IAceEditorClass = js.native
    
    def handleMarkers(markers: js.Array[IMarker], editor: IAceEditorClass): Unit = js.native
    
    def handleOptions(props: ISplitEditorProps, editor: IAceEditorClass): Unit = js.native
    
    def isInShadow(node: HTMLElement): Boolean = js.native
    
    def onBlur(event: js.Any): Unit = js.native
    
    def onChange(event: js.Any): Unit = js.native
    
    def onCopy(text: String): Unit = js.native
    
    def onCursorChange(event: js.Any): Unit = js.native
    
    def onFocus(event: js.Any): Unit = js.native
    
    def onInput(event: js.Any): Unit = js.native
    
    def onPaste(text: String): Unit = js.native
    
    def onScroll(): Unit = js.native
    
    def onSelectionChange(event: js.Any): Unit = js.native
    
    var refEditor: HTMLElement = js.native
    
    var silent: Boolean = js.native
    
    var split: IAceEditorClass = js.native
    
    var splitEditor: IAceEditorClass = js.native
    
    def updateRef(item: HTMLElement): Unit = js.native
  }
}
