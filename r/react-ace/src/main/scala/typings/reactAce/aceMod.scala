package typings.reactAce

import typings.aceBuilds.mod.Ace.Annotation
import typings.aceBuilds.mod.Ace.Editor
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactAce.anon.PartialIAceEditorProps
import typings.reactAce.anon.Text
import typings.reactAce.anon.TypeofAceBuilds
import typings.reactAce.anon.ValidationMapIAceEditorPr
import typings.reactAce.typesMod.IAceEditor
import typings.reactAce.typesMod.IAceOptions
import typings.reactAce.typesMod.ICommand
import typings.reactAce.typesMod.IEditorProps
import typings.reactAce.typesMod.IMarker
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aceMod {
  
  @JSImport("react-ace/lib/ace", JSImport.Default)
  @js.native
  class default protected () extends ReactAce {
    def this(props: IAceEditorProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-ace/lib/ace", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-ace/lib/ace", "default.defaultProps")
    @js.native
    def defaultProps: PartialIAceEditorProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIAceEditorProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-ace/lib/ace", "default.propTypes")
    @js.native
    def propTypes: ValidationMapIAceEditorPr = js.native
    @scala.inline
    def propTypes_=(x: ValidationMapIAceEditorPr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait IAceEditorProps extends StObject {
    
    var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var commands: js.UndefOr[js.Array[ICommand]] = js.undefined
    
    var cursorStart: js.UndefOr[Double] = js.undefined
    
    var debounceChangePeriod: js.UndefOr[Double] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var editorProps: js.UndefOr[IEditorProps] = js.undefined
    
    var enableBasicAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var enableLiveAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var enableSnippets: js.UndefOr[Boolean] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var highlightActiveLine: js.UndefOr[Boolean] = js.undefined
    
    var keyboardHandler: js.UndefOr[String] = js.undefined
    
    var markers: js.UndefOr[js.Array[IMarker]] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var minLines: js.UndefOr[Double] = js.undefined
    
    /** For available modes see https://github.com/thlorenz/brace/tree/master/mode */
    var mode: js.UndefOr[String | js.Object] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var navigateToFileEnd: js.UndefOr[Boolean] = js.undefined
    
    var onBeforeLoad: js.UndefOr[js.Function1[/* ace */ TypeofAceBuilds, Unit]] = js.undefined
    
    var onBlur: js.UndefOr[js.Function2[/* event */ js.Any, /* editor */ js.UndefOr[Editor], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var onCopy: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onCursorChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function2[/* event */ js.Any, /* editor */ js.UndefOr[Editor], Unit]] = js.undefined
    
    var onInput: js.UndefOr[js.Function1[/* event */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* editor */ Editor, Unit]] = js.undefined
    
    var onPaste: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onScroll: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.undefined
    
    var onSelection: js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var onValidate: js.UndefOr[js.Function1[/* annotations */ js.Array[Annotation], Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var scrollMargin: js.UndefOr[js.Array[Double]] = js.undefined
    
    var setOptions: js.UndefOr[IAceOptions] = js.undefined
    
    var showGutter: js.UndefOr[Boolean] = js.undefined
    
    var showPrintMargin: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    /** For available themes see https://github.com/thlorenz/brace/tree/master/theme */
    var theme: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    var wrapEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object IAceEditorProps {
    
    @scala.inline
    def apply(): IAceEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAceEditorProps]
    }
    
    @scala.inline
    implicit class IAceEditorPropsMutableBuilder[Self <: IAceEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      @scala.inline
      def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
      
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
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
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
      def setEnableSnippets(value: Boolean): Self = StObject.set(x, "enableSnippets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSnippetsUndefined: Self = StObject.set(x, "enableSnippets", js.undefined)
      
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
      def setMarkers(value: js.Array[IMarker]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      @scala.inline
      def setMarkersVarargs(value: IMarker*): Self = StObject.set(x, "markers", js.Array(value :_*))
      
      @scala.inline
      def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      @scala.inline
      def setMode(value: String | js.Object): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNavigateToFileEnd(value: Boolean): Self = StObject.set(x, "navigateToFileEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateToFileEndUndefined: Self = StObject.set(x, "navigateToFileEnd", js.undefined)
      
      @scala.inline
      def setOnBeforeLoad(value: /* ace */ TypeofAceBuilds => Unit): Self = StObject.set(x, "onBeforeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeLoadUndefined: Self = StObject.set(x, "onBeforeLoad", js.undefined)
      
      @scala.inline
      def setOnBlur(value: (/* event */ js.Any, /* editor */ js.UndefOr[Editor]) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ String, /* event */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
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
      def setOnFocus(value: (/* event */ js.Any, /* editor */ js.UndefOr[Editor]) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: /* event */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* editor */ Editor => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
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
      def setOnValidate(value: /* annotations */ js.Array[Annotation] => Unit): Self = StObject.set(x, "onValidate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
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
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
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
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
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
  trait ReactAce
    extends Component[IAceEditorProps, js.Object, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MReactAce(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactAce(prevProps: IAceEditorProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReactAce(): Unit = js.native
    
    def debounce(fn: js.Any, delay: Double): js.Function1[/* args */ js.Any, Unit] = js.native
    
    var editor: IAceEditor = js.native
    
    def handleMarkers(markers: js.Array[IMarker]): Unit = js.native
    
    def handleOptions(props: IAceEditorProps): Unit = js.native
    
    def handleScrollMargins(): Unit = js.native
    def handleScrollMargins(margins: js.Array[Double]): Unit = js.native
    
    def isInShadow(node: HTMLElement): Boolean = js.native
    
    def onBlur(event: js.Any): Unit = js.native
    
    def onChange(event: js.Any): Unit = js.native
    
    def onCopy(hasText: Text): Unit = js.native
    
    def onCursorChange(event: js.Any): Unit = js.native
    
    def onFocus(event: js.Any): Unit = js.native
    
    def onInput(): Unit = js.native
    def onInput(event: js.Any): Unit = js.native
    
    def onPaste(hasText: Text): Unit = js.native
    
    def onScroll(): Unit = js.native
    
    def onSelectionChange(event: js.Any): Unit = js.native
    
    var refEditor: HTMLElement = js.native
    
    var silent: Boolean = js.native
    
    def updatePlaceholder(): Unit = js.native
    
    def updateRef(item: HTMLElement): Unit = js.native
  }
}
