package typings.reactMonacoEditor

import typings.monacoEditor.mod.editor.IDiffEditorConstructionOptions
import typings.monacoEditor.mod.editor.IEditorOverrideServices
import typings.monacoEditor.mod.editor.IModelContentChangedEvent
import typings.monacoEditor.mod.editor.IStandaloneCodeEditor
import typings.monacoEditor.mod.editor.IStandaloneDiffEditor
import typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typings.reactMonacoEditor.anon.TypeofmonacoEditor
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ChangeHandler = js.Function2[/* value */ String, /* event */ IModelContentChangedEvent, Unit]
  
  type DiffChangeHandler = ChangeHandler
  
  type DiffEditorDidMount = js.Function2[/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor, Unit]
  
  type DiffEditorWillMount = js.Function1[/* monaco */ TypeofmonacoEditor, Unit | IStandaloneEditorConstructionOptions]
  
  type EditorConstructionOptions = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-monaco-editor.anon.FnCall>[1] */ js.Any
  ]
  
  type EditorDidMount = js.Function2[/* editor */ IStandaloneCodeEditor, /* monaco */ TypeofmonacoEditor, Unit]
  
  type EditorWillMount = js.Function1[/* monaco */ TypeofmonacoEditor, Unit | EditorConstructionOptions]
  
  @js.native
  trait MonacoDiffEditorProps extends MonacoEditorBaseProps {
    
    /**
      * An event emitted when the editor has been mounted (similar to componentDidMount of React).
      */
    var editorDidMount: js.UndefOr[DiffEditorDidMount] = js.native
    
    /**
      * An event emitted before the editor mounted (similar to componentWillMount of React).
      */
    var editorWillMount: js.UndefOr[DiffEditorWillMount] = js.native
    
    /**
      * An event emitted when the content of the current model has changed.
      */
    var onChange: js.UndefOr[DiffChangeHandler] = js.native
    
    /**
      * Refer to Monaco interface {monaco.editor.IDiffEditorConstructionOptions}.
      */
    var options: js.UndefOr[IDiffEditorConstructionOptions] = js.native
    
    /**
      * The original value to compare against.
      */
    var original: js.UndefOr[String] = js.native
    
    /**
      * Refer to Monaco interface {monaco.editor.IEditorOverrideServices}.
      */
    var overrideServices: js.UndefOr[IEditorOverrideServices] = js.native
    
    /**
      * Value of the auto created model in the editor.
      * If you specify value property, the component behaves in controlled mode. Otherwise, it behaves in uncontrolled mode.
      */
    var value: js.UndefOr[String] = js.native
  }
  object MonacoDiffEditorProps {
    
    @scala.inline
    def apply(): MonacoDiffEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonacoDiffEditorProps]
    }
    
    @scala.inline
    implicit class MonacoDiffEditorPropsMutableBuilder[Self <: MonacoDiffEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditorDidMount(value: (/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor) => Unit): Self = StObject.set(x, "editorDidMount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEditorDidMountUndefined: Self = StObject.set(x, "editorDidMount", js.undefined)
      
      @scala.inline
      def setEditorWillMount(value: /* monaco */ TypeofmonacoEditor => Unit | IStandaloneEditorConstructionOptions): Self = StObject.set(x, "editorWillMount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditorWillMountUndefined: Self = StObject.set(x, "editorWillMount", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ String, /* event */ IModelContentChangedEvent) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOptions(value: IDiffEditorConstructionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      @scala.inline
      def setOverrideServices(value: IEditorOverrideServices): Self = StObject.set(x, "overrideServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideServicesUndefined: Self = StObject.set(x, "overrideServices", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait MonacoEditorBaseProps extends StObject {
    
    /**
      * The initial value of the auto created model in the editor.
      */
    var defaultValue: js.UndefOr[String] = js.native
    
    /**
      * Height of editor. Defaults to 500.
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /**
      * The initial language of the auto created model in the editor. Defaults to 'javascript'.
      */
    var language: js.UndefOr[String] = js.native
    
    /**
      * Theme to be used for rendering.
      * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
      * You can create custom themes via `monaco.editor.defineTheme`.
      */
    var theme: js.UndefOr[String | Null] = js.native
    
    /**
      * Width of editor. Defaults to 100%.
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object MonacoEditorBaseProps {
    
    @scala.inline
    def apply(): MonacoEditorBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonacoEditorBaseProps]
    }
    
    @scala.inline
    implicit class MonacoEditorBasePropsMutableBuilder[Self <: MonacoEditorBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeNull: Self = StObject.set(x, "theme", null)
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait MonacoEditorProps extends MonacoEditorBaseProps {
    
    /**
      * An event emitted when the editor has been mounted (similar to componentDidMount of React).
      */
    var editorDidMount: js.UndefOr[EditorDidMount] = js.native
    
    /**
      * An event emitted before the editor mounted (similar to componentWillMount of React).
      */
    var editorWillMount: js.UndefOr[EditorWillMount] = js.native
    
    /**
      * An event emitted when the content of the current model has changed.
      */
    var onChange: js.UndefOr[ChangeHandler] = js.native
    
    /**
      * Refer to Monaco interface {monaco.editor.IStandaloneEditorConstructionOptions}.
      */
    var options: js.UndefOr[IStandaloneEditorConstructionOptions] = js.native
    
    /**
      * Refer to Monaco interface {monaco.editor.IEditorOverrideServices}.
      */
    var overrideServices: js.UndefOr[IEditorOverrideServices] = js.native
    
    /**
      * Value of the auto created model in the editor.
      * If you specify `null` or `undefined` for this property, the component behaves in uncontrolled mode.
      * Otherwise, it behaves in controlled mode.
      */
    var value: js.UndefOr[String | Null] = js.native
  }
  object MonacoEditorProps {
    
    @scala.inline
    def apply(): MonacoEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonacoEditorProps]
    }
    
    @scala.inline
    implicit class MonacoEditorPropsMutableBuilder[Self <: MonacoEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditorDidMount(value: (/* editor */ IStandaloneCodeEditor, /* monaco */ TypeofmonacoEditor) => Unit): Self = StObject.set(x, "editorDidMount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEditorDidMountUndefined: Self = StObject.set(x, "editorDidMount", js.undefined)
      
      @scala.inline
      def setEditorWillMount(value: /* monaco */ TypeofmonacoEditor => Unit | EditorConstructionOptions): Self = StObject.set(x, "editorWillMount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditorWillMountUndefined: Self = StObject.set(x, "editorWillMount", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ String, /* event */ IModelContentChangedEvent) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOptions(value: IStandaloneEditorConstructionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOverrideServices(value: IEditorOverrideServices): Self = StObject.set(x, "overrideServices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideServicesUndefined: Self = StObject.set(x, "overrideServices", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
