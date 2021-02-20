package typings.reactAce

import typings.aceBuilds.anon.PartialEditorOptions
import typings.aceBuilds.mod.Ace.Annotation
import typings.aceBuilds.mod.Ace.Config
import typings.aceBuilds.mod.Ace.Document
import typings.aceBuilds.mod.Ace.Editor
import typings.aceBuilds.mod.Ace.Point
import typings.aceBuilds.mod.Ace.Range
import typings.aceBuilds.mod.Ace.SyntaxMode
import typings.propTypes.mod.Validator
import typings.react.mod.CSSProperties
import typings.reactAce.typesMod.IAceOptions
import typings.reactAce.typesMod.IAnnotation
import typings.reactAce.typesMod.ICommand
import typings.reactAce.typesMod.IEditorProps
import typings.reactAce.typesMod.IMarker
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Left extends StObject {
    
    var left: js.Array[_] = js.native
    
    var right: js.Array[_] = js.native
  }
  object Left {
    
    @scala.inline
    def apply(left: js.Array[_], right: js.Array[_]): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: js.Array[_]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftVarargs(value: js.Any*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      @scala.inline
      def setRight(value: js.Array[_]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightVarargs(value: js.Any*): Self = StObject.set(x, "right", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<react-ace.react-ace/lib/ace.IAceEditorProps> */
  @js.native
  trait PartialIAceEditorProps extends StObject {
    
    var annotations: js.UndefOr[js.Array[Annotation]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var commands: js.UndefOr[js.Array[ICommand]] = js.native
    
    var cursorStart: js.UndefOr[Double] = js.native
    
    var debounceChangePeriod: js.UndefOr[Double] = js.native
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var editorProps: js.UndefOr[IEditorProps] = js.native
    
    var enableBasicAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    var enableLiveAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    var enableSnippets: js.UndefOr[Boolean] = js.native
    
    var focus: js.UndefOr[Boolean] = js.native
    
    var fontSize: js.UndefOr[Double | String] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    var highlightActiveLine: js.UndefOr[Boolean] = js.native
    
    var keyboardHandler: js.UndefOr[String] = js.native
    
    var markers: js.UndefOr[js.Array[IMarker]] = js.native
    
    var maxLines: js.UndefOr[Double] = js.native
    
    var minLines: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[String | js.Object] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var navigateToFileEnd: js.UndefOr[Boolean] = js.native
    
    var onBeforeLoad: js.UndefOr[js.Function1[/* ace */ TypeofAceBuilds, Unit]] = js.native
    
    var onBlur: js.UndefOr[js.Function2[/* event */ js.Any, /* editor */ js.UndefOr[Editor], Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onCopy: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onCursorChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function2[/* event */ js.Any, /* editor */ js.UndefOr[Editor], Unit]] = js.native
    
    var onInput: js.UndefOr[js.Function1[/* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function1[/* editor */ Editor, Unit]] = js.native
    
    var onPaste: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onScroll: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.native
    
    var onSelection: js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onSelectionChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onValidate: js.UndefOr[js.Function1[/* annotations */ js.Array[Annotation], Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var scrollMargin: js.UndefOr[js.Array[Double]] = js.native
    
    var setOptions: js.UndefOr[IAceOptions] = js.native
    
    var showGutter: js.UndefOr[Boolean] = js.native
    
    var showPrintMargin: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabSize: js.UndefOr[Double] = js.native
    
    var theme: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[String] = js.native
    
    var wrapEnabled: js.UndefOr[Boolean] = js.native
  }
  object PartialIAceEditorProps {
    
    @scala.inline
    def apply(): PartialIAceEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIAceEditorProps]
    }
    
    @scala.inline
    implicit class PartialIAceEditorPropsMutableBuilder[Self <: PartialIAceEditorProps] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Partial<react-ace.react-ace/lib/diff.IDiffEditorProps> */
  @js.native
  trait PartialIDiffEditorProps extends StObject {
    
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
    implicit class PartialIDiffEditorPropsMutableBuilder[Self <: PartialIDiffEditorProps] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Partial<react-ace.react-ace/lib/split.ISplitEditorProps> */
  @js.native
  trait PartialISplitEditorProps extends StObject {
    
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
    
    var splits: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var tabSize: js.UndefOr[Double] = js.native
    
    var theme: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Array[String]] = js.native
    
    var width: js.UndefOr[String] = js.native
    
    var wrapEnabled: js.UndefOr[Boolean] = js.native
  }
  object PartialISplitEditorProps {
    
    @scala.inline
    def apply(): PartialISplitEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialISplitEditorProps]
    }
    
    @scala.inline
    implicit class PartialISplitEditorPropsMutableBuilder[Self <: PartialISplitEditorProps] (val x: Self) extends AnyVal {
      
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
  trait Text extends StObject {
    
    var text: String = js.native
  }
  object Text {
    
    @scala.inline
    def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofAce extends StObject {
    
    val Selection: js.Any = js.native
  }
  object TypeofAce {
    
    @scala.inline
    def apply(Selection: js.Any): TypeofAce = {
      val __obj = js.Dynamic.literal(Selection = Selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofAce]
    }
    
    @scala.inline
    implicit class TypeofAceMutableBuilder[Self <: TypeofAce] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelection(value: js.Any): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofAceBuilds extends StObject {
    
    val Ace: TypeofAce = js.native
    
    val EditSession: js.Any = js.native
    
    val Range: TypeofRange = js.native
    
    val UndoManager: js.Any = js.native
    
    val VirtualRenderer: js.Any = js.native
    
    val config: Config = js.native
    
    def createEditSession(text: String, mode: SyntaxMode): typings.aceBuilds.mod.Ace.EditSession = js.native
    def createEditSession(text: Document, mode: SyntaxMode): typings.aceBuilds.mod.Ace.EditSession = js.native
    
    def edit(el: String): Editor = js.native
    def edit(el: String, options: PartialEditorOptions): Editor = js.native
    def edit(el: Element): Editor = js.native
    def edit(el: Element, options: PartialEditorOptions): Editor = js.native
    
    def require(name: String): js.Any = js.native
    
    val version: String = js.native
  }
  
  @js.native
  trait TypeofRange extends StObject {
    
    def comparePoints(p1: Point, p2: Point): Double = js.native
    
    def fromPoints(start: Point, end: Point): Range = js.native
  }
  object TypeofRange {
    
    @scala.inline
    def apply(comparePoints: (Point, Point) => Double, fromPoints: (Point, Point) => Range): TypeofRange = {
      val __obj = js.Dynamic.literal(comparePoints = js.Any.fromFunction2(comparePoints), fromPoints = js.Any.fromFunction2(fromPoints))
      __obj.asInstanceOf[TypeofRange]
    }
    
    @scala.inline
    implicit class TypeofRangeMutableBuilder[Self <: TypeofRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComparePoints(value: (Point, Point) => Double): Self = StObject.set(x, "comparePoints", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFromPoints(value: (Point, Point) => Range): Self = StObject.set(x, "fromPoints", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined prop-types.prop-types.ValidationMap<react-ace.react-ace/lib/ace.IAceEditorProps> */
  @js.native
  trait ValidationMapIAceEditorPr extends StObject {
    
    var annotations: js.UndefOr[Validator[js.UndefOr[js.Array[Annotation]]]] = js.native
    
    var className: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var commands: js.UndefOr[Validator[js.UndefOr[js.Array[ICommand]]]] = js.native
    
    var cursorStart: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var debounceChangePeriod: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var defaultValue: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var editorProps: js.UndefOr[Validator[js.UndefOr[IEditorProps]]] = js.native
    
    var enableBasicAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.native
    
    var enableLiveAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.native
    
    var enableSnippets: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var focus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var fontSize: js.UndefOr[Validator[js.UndefOr[Double | String]]] = js.native
    
    var height: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var highlightActiveLine: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var keyboardHandler: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var markers: js.UndefOr[Validator[js.UndefOr[js.Array[IMarker]]]] = js.native
    
    var maxLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var minLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var mode: js.UndefOr[Validator[js.UndefOr[String | js.Object]]] = js.native
    
    var name: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var navigateToFileEnd: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var onBeforeLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* ace */ TypeofAceBuilds, Unit]]]] = js.native
    
    var onBlur: js.UndefOr[
        Validator[js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[Editor], Unit]]]
      ] = js.native
    
    var onChange: js.UndefOr[
        Validator[js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[_], Unit]]]
      ] = js.native
    
    var onCopy: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.native
    
    var onCursorChange: js.UndefOr[
        Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]
      ] = js.native
    
    var onFocus: js.UndefOr[
        Validator[js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[Editor], Unit]]]
      ] = js.native
    
    var onInput: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]]] = js.native
    
    var onLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ Editor, Unit]]]] = js.native
    
    var onPaste: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.native
    
    var onScroll: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]] = js.native
    
    var onSelection: js.UndefOr[
        Validator[
          js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[_], Unit]]
        ]
      ] = js.native
    
    var onSelectionChange: js.UndefOr[
        Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]
      ] = js.native
    
    var onValidate: js.UndefOr[
        Validator[js.UndefOr[js.Function1[/* annotations */ js.Array[Annotation], Unit]]]
      ] = js.native
    
    var placeholder: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var scrollMargin: js.UndefOr[Validator[js.UndefOr[js.Array[Double]]]] = js.native
    
    var setOptions: js.UndefOr[Validator[js.UndefOr[IAceOptions]]] = js.native
    
    var showGutter: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var showPrintMargin: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var style: js.UndefOr[Validator[js.UndefOr[CSSProperties]]] = js.native
    
    var tabSize: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var theme: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var value: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var width: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var wrapEnabled: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  }
  object ValidationMapIAceEditorPr {
    
    @scala.inline
    def apply(): ValidationMapIAceEditorPr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationMapIAceEditorPr]
    }
    
    @scala.inline
    implicit class ValidationMapIAceEditorPrMutableBuilder[Self <: ValidationMapIAceEditorPr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: Validator[js.UndefOr[js.Array[Annotation]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      @scala.inline
      def setClassName(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCommands(value: Validator[js.UndefOr[js.Array[ICommand]]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      @scala.inline
      def setCursorStart(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "cursorStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStartUndefined: Self = StObject.set(x, "cursorStart", js.undefined)
      
      @scala.inline
      def setDebounceChangePeriod(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "debounceChangePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceChangePeriodUndefined: Self = StObject.set(x, "debounceChangePeriod", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setEditorProps(value: Validator[js.UndefOr[IEditorProps]]): Self = StObject.set(x, "editorProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorPropsUndefined: Self = StObject.set(x, "editorProps", js.undefined)
      
      @scala.inline
      def setEnableBasicAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = StObject.set(x, "enableBasicAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBasicAutocompletionUndefined: Self = StObject.set(x, "enableBasicAutocompletion", js.undefined)
      
      @scala.inline
      def setEnableLiveAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = StObject.set(x, "enableLiveAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLiveAutocompletionUndefined: Self = StObject.set(x, "enableLiveAutocompletion", js.undefined)
      
      @scala.inline
      def setEnableSnippets(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "enableSnippets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSnippetsUndefined: Self = StObject.set(x, "enableSnippets", js.undefined)
      
      @scala.inline
      def setFocus(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setFontSize(value: Validator[js.UndefOr[Double | String]]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHeight(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHighlightActiveLine(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
      
      @scala.inline
      def setKeyboardHandler(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "keyboardHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardHandlerUndefined: Self = StObject.set(x, "keyboardHandler", js.undefined)
      
      @scala.inline
      def setMarkers(value: Validator[js.UndefOr[js.Array[IMarker]]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMinLines(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      @scala.inline
      def setMode(value: Validator[js.UndefOr[String | js.Object]]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNavigateToFileEnd(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "navigateToFileEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateToFileEndUndefined: Self = StObject.set(x, "navigateToFileEnd", js.undefined)
      
      @scala.inline
      def setOnBeforeLoad(value: Validator[js.UndefOr[js.Function1[/* ace */ TypeofAceBuilds, Unit]]]): Self = StObject.set(x, "onBeforeLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforeLoadUndefined: Self = StObject.set(x, "onBeforeLoad", js.undefined)
      
      @scala.inline
      def setOnBlur(value: Validator[js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[Editor], Unit]]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: Validator[js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[_], Unit]]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnCopy(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCursorChange(value: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]): Self = StObject.set(x, "onCursorChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCursorChangeUndefined: Self = StObject.set(x, "onCursorChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: Validator[js.UndefOr[js.Function2[/* event */ _, /* editor */ js.UndefOr[Editor], Unit]]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnLoad(value: Validator[js.UndefOr[js.Function1[/* editor */ Editor, Unit]]]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnPaste(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnScroll(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSelection(
        value: Validator[
              js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[_], Unit]]
            ]
      ): Self = StObject.set(x, "onSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectionChange(value: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]): Self = StObject.set(x, "onSelectionChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
      @scala.inline
      def setOnValidate(value: Validator[js.UndefOr[js.Function1[/* annotations */ js.Array[Annotation], Unit]]]): Self = StObject.set(x, "onValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setScrollMargin(value: Validator[js.UndefOr[js.Array[Double]]]): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      @scala.inline
      def setSetOptions(value: Validator[js.UndefOr[IAceOptions]]): Self = StObject.set(x, "setOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
      
      @scala.inline
      def setShowGutter(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
      
      @scala.inline
      def setShowPrintMargin(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
      
      @scala.inline
      def setStyle(value: Validator[js.UndefOr[CSSProperties]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabSize(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def setTheme(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapEnabled(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "wrapEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapEnabledUndefined: Self = StObject.set(x, "wrapEnabled", js.undefined)
    }
  }
  
  /* Inlined prop-types.prop-types.ValidationMap<react-ace.react-ace/lib/diff.IDiffEditorProps> */
  @js.native
  trait ValidationMapIDiffEditorP extends StObject {
    
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
    implicit class ValidationMapIDiffEditorPMutableBuilder[Self <: ValidationMapIDiffEditorP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCursorStart(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "cursorStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStartUndefined: Self = StObject.set(x, "cursorStart", js.undefined)
      
      @scala.inline
      def setEditorProps(value: Validator[js.UndefOr[js.Object]]): Self = StObject.set(x, "editorProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorPropsUndefined: Self = StObject.set(x, "editorProps", js.undefined)
      
      @scala.inline
      def setEnableBasicAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = StObject.set(x, "enableBasicAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBasicAutocompletionUndefined: Self = StObject.set(x, "enableBasicAutocompletion", js.undefined)
      
      @scala.inline
      def setEnableLiveAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = StObject.set(x, "enableLiveAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLiveAutocompletionUndefined: Self = StObject.set(x, "enableLiveAutocompletion", js.undefined)
      
      @scala.inline
      def setFocus(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setFontSize(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHeight(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHighlightActiveLine(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMinLines(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      @scala.inline
      def setMode(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: Validator[
              js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[_], Unit]]
            ]
      ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnLoad(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnPaste(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnScroll(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOrientation(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setScrollMargin(value: Validator[js.UndefOr[js.Array[Double]]]): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      @scala.inline
      def setSetOptions(value: Validator[js.UndefOr[js.Object]]): Self = StObject.set(x, "setOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
      
      @scala.inline
      def setShowGutter(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
      
      @scala.inline
      def setShowPrintMargin(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
      
      @scala.inline
      def setSplits(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "splits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitsUndefined: Self = StObject.set(x, "splits", js.undefined)
      
      @scala.inline
      def setStyle(value: Validator[js.UndefOr[js.Object]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabSize(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def setTheme(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: Validator[js.UndefOr[js.Array[String]]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapEnabled(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "wrapEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapEnabledUndefined: Self = StObject.set(x, "wrapEnabled", js.undefined)
    }
  }
  
  /* Inlined prop-types.prop-types.ValidationMap<react-ace.react-ace/lib/split.ISplitEditorProps> */
  @js.native
  trait ValidationMapISplitEditor extends StObject {
    
    var annotations: js.UndefOr[Validator[js.UndefOr[js.Array[js.Array[IAnnotation]]]]] = js.native
    
    var className: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var commands: js.UndefOr[Validator[js.UndefOr[js.Array[ICommand]]]] = js.native
    
    var cursorStart: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var debounceChangePeriod: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String]]]] = js.native
    
    var editorProps: js.UndefOr[Validator[js.UndefOr[IEditorProps]]] = js.native
    
    var enableBasicAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.native
    
    var enableLiveAutocompletion: js.UndefOr[Validator[js.UndefOr[Boolean | js.Array[String]]]] = js.native
    
    var focus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var fontSize: js.UndefOr[Validator[js.UndefOr[Double | String]]] = js.native
    
    var height: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var highlightActiveLine: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var keyboardHandler: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var markers: js.UndefOr[Validator[js.UndefOr[js.Array[js.Array[IMarker]]]]] = js.native
    
    var maxLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var minLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var mode: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var name: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var onBeforeLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* ace */ _, Unit]]]] = js.native
    
    var onBlur: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ Event, Unit]]]] = js.native
    
    var onChange: js.UndefOr[
        Validator[
          js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[_], Unit]]
        ]
      ] = js.native
    
    var onCopy: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.native
    
    var onCursorChange: js.UndefOr[
        Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]
      ] = js.native
    
    var onFocus: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ Event, Unit]]]] = js.native
    
    var onInput: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]]] = js.native
    
    var onLoad: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]] = js.native
    
    var onPaste: js.UndefOr[Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]] = js.native
    
    var onScroll: js.UndefOr[Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]] = js.native
    
    var onSelection: js.UndefOr[
        Validator[
          js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[_], Unit]]
        ]
      ] = js.native
    
    var onSelectionChange: js.UndefOr[
        Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]
      ] = js.native
    
    var orientation: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var scrollMargin: js.UndefOr[Validator[js.UndefOr[js.Array[Double]]]] = js.native
    
    var setOptions: js.UndefOr[Validator[js.UndefOr[IAceOptions]]] = js.native
    
    var showGutter: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var showPrintMargin: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
    
    var splits: js.UndefOr[Validator[Double]] = js.native
    
    var style: js.UndefOr[Validator[js.UndefOr[js.Object]]] = js.native
    
    var tabSize: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
    
    var theme: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var value: js.UndefOr[Validator[js.UndefOr[js.Array[String]]]] = js.native
    
    var width: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
    
    var wrapEnabled: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  }
  object ValidationMapISplitEditor {
    
    @scala.inline
    def apply(): ValidationMapISplitEditor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationMapISplitEditor]
    }
    
    @scala.inline
    implicit class ValidationMapISplitEditorMutableBuilder[Self <: ValidationMapISplitEditor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: Validator[js.UndefOr[js.Array[js.Array[IAnnotation]]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      @scala.inline
      def setClassName(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCommands(value: Validator[js.UndefOr[js.Array[ICommand]]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      @scala.inline
      def setCursorStart(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "cursorStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStartUndefined: Self = StObject.set(x, "cursorStart", js.undefined)
      
      @scala.inline
      def setDebounceChangePeriod(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "debounceChangePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceChangePeriodUndefined: Self = StObject.set(x, "debounceChangePeriod", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Validator[js.UndefOr[js.Array[String]]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setEditorProps(value: Validator[js.UndefOr[IEditorProps]]): Self = StObject.set(x, "editorProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorPropsUndefined: Self = StObject.set(x, "editorProps", js.undefined)
      
      @scala.inline
      def setEnableBasicAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = StObject.set(x, "enableBasicAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBasicAutocompletionUndefined: Self = StObject.set(x, "enableBasicAutocompletion", js.undefined)
      
      @scala.inline
      def setEnableLiveAutocompletion(value: Validator[js.UndefOr[Boolean | js.Array[String]]]): Self = StObject.set(x, "enableLiveAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLiveAutocompletionUndefined: Self = StObject.set(x, "enableLiveAutocompletion", js.undefined)
      
      @scala.inline
      def setFocus(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setFontSize(value: Validator[js.UndefOr[Double | String]]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHeight(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHighlightActiveLine(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
      
      @scala.inline
      def setKeyboardHandler(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "keyboardHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardHandlerUndefined: Self = StObject.set(x, "keyboardHandler", js.undefined)
      
      @scala.inline
      def setMarkers(value: Validator[js.UndefOr[js.Array[js.Array[IMarker]]]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMinLines(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      @scala.inline
      def setMode(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBeforeLoad(value: Validator[js.UndefOr[js.Function1[/* ace */ _, Unit]]]): Self = StObject.set(x, "onBeforeLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforeLoadUndefined: Self = StObject.set(x, "onBeforeLoad", js.undefined)
      
      @scala.inline
      def setOnBlur(value: Validator[js.UndefOr[js.Function1[/* value */ Event, Unit]]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: Validator[
              js.UndefOr[js.Function2[/* value */ js.Array[String], /* event */ js.UndefOr[_], Unit]]
            ]
      ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnCopy(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCursorChange(value: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]): Self = StObject.set(x, "onCursorChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCursorChangeUndefined: Self = StObject.set(x, "onCursorChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: Validator[js.UndefOr[js.Function1[/* value */ Event, Unit]]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: Validator[js.UndefOr[js.Function1[/* event */ js.UndefOr[_], Unit]]]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnLoad(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnPaste(value: Validator[js.UndefOr[js.Function1[/* value */ String, Unit]]]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnScroll(value: Validator[js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]]]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSelection(
        value: Validator[
              js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[_], Unit]]
            ]
      ): Self = StObject.set(x, "onSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectionChange(value: Validator[js.UndefOr[js.Function2[/* value */ _, /* event */ js.UndefOr[_], Unit]]]): Self = StObject.set(x, "onSelectionChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
      @scala.inline
      def setOrientation(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setScrollMargin(value: Validator[js.UndefOr[js.Array[Double]]]): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      @scala.inline
      def setSetOptions(value: Validator[js.UndefOr[IAceOptions]]): Self = StObject.set(x, "setOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
      
      @scala.inline
      def setShowGutter(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
      
      @scala.inline
      def setShowPrintMargin(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
      
      @scala.inline
      def setSplits(value: Validator[Double]): Self = StObject.set(x, "splits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitsUndefined: Self = StObject.set(x, "splits", js.undefined)
      
      @scala.inline
      def setStyle(value: Validator[js.UndefOr[js.Object]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabSize(value: Validator[js.UndefOr[Double]]): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def setTheme(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: Validator[js.UndefOr[js.Array[String]]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Validator[js.UndefOr[String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapEnabled(value: Validator[js.UndefOr[Boolean]]): Self = StObject.set(x, "wrapEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapEnabledUndefined: Self = StObject.set(x, "wrapEnabled", js.undefined)
    }
  }
}
