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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMod {
  
  @JSImport("react-ace/lib/split", JSImport.Default)
  @js.native
  open class default protected () extends SplitComponent {
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
    inline def defaultProps_=(x: PartialISplitEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace/lib/split", "default.propTypes")
    @js.native
    def propTypes: ValidationMapISplitEditor = js.native
    inline def propTypes_=(x: ValidationMapISplitEditor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IAceEditorClass
    extends StObject
       with Editor
       with /* index */ StringDictionary[Any] {
    
    @JSName("$options")
    var $options: js.UndefOr[Any] = js.native
  }
  
  trait ISplitEditorProps
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    var annotations: js.UndefOr[js.Array[js.Array[IAnnotation]]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var commands: js.UndefOr[js.Array[ICommand]] = js.undefined
    
    var cursorStart: js.UndefOr[Double] = js.undefined
    
    var debounceChangePeriod: js.UndefOr[Double] = js.undefined
    
    var defaultValue: js.UndefOr[js.Array[String]] = js.undefined
    
    var editorProps: js.UndefOr[IEditorProps] = js.undefined
    
    var enableBasicAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var enableLiveAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var highlightActiveLine: js.UndefOr[Boolean] = js.undefined
    
    var keyboardHandler: js.UndefOr[String] = js.undefined
    
    var markers: js.UndefOr[js.Array[js.Array[IMarker]]] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var minLines: js.UndefOr[Double] = js.undefined
    
    /** For available modes see https://github.com/thlorenz/brace/tree/master/mode */
    var mode: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBeforeLoad: js.UndefOr[js.Function1[/* ace */ Any, Unit]] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* value */ Event, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[Any], Unit]] = js.undefined
    
    var onCopy: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onCursorChange: js.UndefOr[js.Function2[/* value */ Any, /* event */ js.UndefOr[Any], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* value */ Event, Unit]] = js.undefined
    
    var onInput: js.UndefOr[js.Function1[/* event */ js.UndefOr[Any], Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.undefined
    
    var onPaste: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onScroll: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.undefined
    
    var onSelection: js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[Any], Unit]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.Function2[/* value */ Any, /* event */ js.UndefOr[Any], Unit]] = js.undefined
    
    var orientation: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var scrollMargin: js.UndefOr[js.Array[Double]] = js.undefined
    
    var setOptions: js.UndefOr[IAceOptions] = js.undefined
    
    var showGutter: js.UndefOr[Boolean] = js.undefined
    
    var showPrintMargin: js.UndefOr[Boolean] = js.undefined
    
    var splits: Double
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    /** For available themes see https://github.com/thlorenz/brace/tree/master/theme */
    var theme: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Array[String]] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    var wrapEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object ISplitEditorProps {
    
    inline def apply(splits: Double): ISplitEditorProps = {
      val __obj = js.Dynamic.literal(splits = splits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISplitEditorProps]
    }
    
    extension [Self <: ISplitEditorProps](x: Self) {
      
      inline def setAnnotations(value: js.Array[js.Array[IAnnotation]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: js.Array[IAnnotation]*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCommands(value: js.Array[ICommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setCommandsVarargs(value: ICommand*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setCursorStart(value: Double): Self = StObject.set(x, "cursorStart", value.asInstanceOf[js.Any])
      
      inline def setCursorStartUndefined: Self = StObject.set(x, "cursorStart", js.undefined)
      
      inline def setDebounceChangePeriod(value: Double): Self = StObject.set(x, "debounceChangePeriod", value.asInstanceOf[js.Any])
      
      inline def setDebounceChangePeriodUndefined: Self = StObject.set(x, "debounceChangePeriod", js.undefined)
      
      inline def setDefaultValue(value: js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setEditorProps(value: IEditorProps): Self = StObject.set(x, "editorProps", value.asInstanceOf[js.Any])
      
      inline def setEditorPropsUndefined: Self = StObject.set(x, "editorProps", js.undefined)
      
      inline def setEnableBasicAutocompletion(value: Boolean | js.Array[String]): Self = StObject.set(x, "enableBasicAutocompletion", value.asInstanceOf[js.Any])
      
      inline def setEnableBasicAutocompletionUndefined: Self = StObject.set(x, "enableBasicAutocompletion", js.undefined)
      
      inline def setEnableBasicAutocompletionVarargs(value: String*): Self = StObject.set(x, "enableBasicAutocompletion", js.Array(value*))
      
      inline def setEnableLiveAutocompletion(value: Boolean | js.Array[String]): Self = StObject.set(x, "enableLiveAutocompletion", value.asInstanceOf[js.Any])
      
      inline def setEnableLiveAutocompletionUndefined: Self = StObject.set(x, "enableLiveAutocompletion", js.undefined)
      
      inline def setEnableLiveAutocompletionVarargs(value: String*): Self = StObject.set(x, "enableLiveAutocompletion", js.Array(value*))
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHighlightActiveLine(value: Boolean): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
      
      inline def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
      
      inline def setKeyboardHandler(value: String): Self = StObject.set(x, "keyboardHandler", value.asInstanceOf[js.Any])
      
      inline def setKeyboardHandlerUndefined: Self = StObject.set(x, "keyboardHandler", js.undefined)
      
      inline def setMarkers(value: js.Array[js.Array[IMarker]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: js.Array[IMarker]*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      inline def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBeforeLoad(value: /* ace */ Any => Unit): Self = StObject.set(x, "onBeforeLoad", js.Any.fromFunction1(value))
      
      inline def setOnBeforeLoadUndefined: Self = StObject.set(x, "onBeforeLoad", js.undefined)
      
      inline def setOnBlur(value: /* value */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (/* value */ js.Array[String], /* event */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCopy(value: /* value */ String => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCursorChange(value: (/* value */ Any, /* event */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "onCursorChange", js.Any.fromFunction2(value))
      
      inline def setOnCursorChangeUndefined: Self = StObject.set(x, "onCursorChange", js.undefined)
      
      inline def setOnFocus(value: /* value */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: /* event */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnLoad(value: /* editor */ IEditorProps => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnPaste(value: /* value */ String => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnScroll(value: /* editor */ IEditorProps => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSelection(value: (/* selectedText */ String, /* event */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction2(value))
      
      inline def setOnSelectionChange(value: (/* value */ Any, /* event */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setScrollMargin(value: js.Array[Double]): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      inline def setScrollMarginVarargs(value: Double*): Self = StObject.set(x, "scrollMargin", js.Array(value*))
      
      inline def setSetOptions(value: IAceOptions): Self = StObject.set(x, "setOptions", value.asInstanceOf[js.Any])
      
      inline def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
      
      inline def setShowGutter(value: Boolean): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
      
      inline def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
      
      inline def setShowPrintMargin(value: Boolean): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
      
      inline def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
      
      inline def setSplits(value: Double): Self = StObject.set(x, "splits", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapEnabled(value: Boolean): Self = StObject.set(x, "wrapEnabled", value.asInstanceOf[js.Any])
      
      inline def setWrapEnabledUndefined: Self = StObject.set(x, "wrapEnabled", js.undefined)
    }
  }
  
  @js.native
  trait SplitComponent
    extends Component[ISplitEditorProps, Unit, Any]
       with /* index */ StringDictionary[Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MSplitComponent(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSplitComponent(prevProps: ISplitEditorProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSplitComponent(): Unit = js.native
    
    def debounce(fn: Any, delay: Double): js.Function1[/* args */ Any, Unit] = js.native
    
    var editor: IAceEditorClass = js.native
    
    def handleMarkers(markers: js.Array[IMarker], editor: IAceEditorClass): Unit = js.native
    
    def handleOptions(props: ISplitEditorProps, editor: IAceEditorClass): Unit = js.native
    
    def isInShadow(node: HTMLElement): Boolean = js.native
    
    def onBlur(event: Any): Unit = js.native
    
    def onChange(event: Any): Unit = js.native
    
    def onCopy(text: String): Unit = js.native
    
    def onCursorChange(event: Any): Unit = js.native
    
    def onFocus(event: Any): Unit = js.native
    
    def onInput(event: Any): Unit = js.native
    
    def onPaste(text: String): Unit = js.native
    
    def onScroll(): Unit = js.native
    
    def onSelectionChange(event: Any): Unit = js.native
    
    var refEditor: HTMLElement = js.native
    
    var silent: Boolean = js.native
    
    var split: IAceEditorClass = js.native
    
    var splitEditor: IAceEditorClass = js.native
    
    def updateRef(item: HTMLElement): Unit = js.native
  }
}
