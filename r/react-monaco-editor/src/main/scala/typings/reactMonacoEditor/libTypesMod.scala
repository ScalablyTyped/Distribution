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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type ChangeHandler = js.Function2[/* value */ String, /* event */ IModelContentChangedEvent, Unit]
  
  type DiffChangeHandler = ChangeHandler
  
  type DiffEditorDidMount = js.Function2[/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor, Unit]
  
  type DiffEditorWillMount = js.Function1[/* monaco */ TypeofmonacoEditor, Unit | IStandaloneEditorConstructionOptions]
  
  type DiffEditorWillUnmount = js.Function2[/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor, Unit]
  
  type EditorConstructionOptions = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-monaco-editor.anon.FnCall>[1] */ js.Any
  ]
  
  type EditorDidMount = js.Function2[/* editor */ IStandaloneCodeEditor, /* monaco */ TypeofmonacoEditor, Unit]
  
  type EditorWillMount = js.Function1[/* monaco */ TypeofmonacoEditor, Unit | EditorConstructionOptions]
  
  type EditorWillUnmount = js.Function2[
    /* editor */ IStandaloneCodeEditor, 
    /* monaco */ TypeofmonacoEditor, 
    Unit | EditorConstructionOptions
  ]
  
  trait MonacoDiffEditorProps
    extends StObject
       with MonacoEditorBaseProps {
    
    /**
      * An event emitted when the editor has been mounted (similar to componentDidMount of React).
      */
    var editorDidMount: js.UndefOr[DiffEditorDidMount] = js.undefined
    
    /**
      * An event emitted before the editor mounted (similar to componentWillMount of React).
      */
    var editorWillMount: js.UndefOr[DiffEditorWillMount] = js.undefined
    
    /**
      * An event emitted before the editor unmount (similar to componentWillUnmount of React).
      */
    var editorWillUnmount: js.UndefOr[DiffEditorWillUnmount] = js.undefined
    
    /**
      * An event emitted when the content of the current model has changed.
      */
    var onChange: js.UndefOr[DiffChangeHandler] = js.undefined
    
    /**
      * Refer to Monaco interface {monaco.editor.IDiffEditorConstructionOptions}.
      */
    var options: js.UndefOr[IDiffEditorConstructionOptions] = js.undefined
    
    /**
      * The original value to compare against.
      */
    var original: js.UndefOr[String] = js.undefined
    
    /**
      * Refer to Monaco interface {monaco.editor.IEditorOverrideServices}.
      */
    var overrideServices: js.UndefOr[IEditorOverrideServices] = js.undefined
    
    /**
      * Value of the auto created model in the editor.
      * If you specify value property, the component behaves in controlled mode. Otherwise, it behaves in uncontrolled mode.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object MonacoDiffEditorProps {
    
    inline def apply(): MonacoDiffEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonacoDiffEditorProps]
    }
    
    extension [Self <: MonacoDiffEditorProps](x: Self) {
      
      inline def setEditorDidMount(value: (/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor) => Unit): Self = StObject.set(x, "editorDidMount", js.Any.fromFunction2(value))
      
      inline def setEditorDidMountUndefined: Self = StObject.set(x, "editorDidMount", js.undefined)
      
      inline def setEditorWillMount(value: /* monaco */ TypeofmonacoEditor => Unit | IStandaloneEditorConstructionOptions): Self = StObject.set(x, "editorWillMount", js.Any.fromFunction1(value))
      
      inline def setEditorWillMountUndefined: Self = StObject.set(x, "editorWillMount", js.undefined)
      
      inline def setEditorWillUnmount(value: (/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor) => Unit): Self = StObject.set(x, "editorWillUnmount", js.Any.fromFunction2(value))
      
      inline def setEditorWillUnmountUndefined: Self = StObject.set(x, "editorWillUnmount", js.undefined)
      
      inline def setOnChange(value: (/* value */ String, /* event */ IModelContentChangedEvent) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: IDiffEditorConstructionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      inline def setOverrideServices(value: IEditorOverrideServices): Self = StObject.set(x, "overrideServices", value.asInstanceOf[js.Any])
      
      inline def setOverrideServicesUndefined: Self = StObject.set(x, "overrideServices", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MonacoEditorBaseProps extends StObject {
    
    /**
      * Optional string classname to append to the editor.
      */
    var className: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The initial value of the auto created model in the editor.
      */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * Height of editor. Defaults to 100%.
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The initial language of the auto created model in the editor. Defaults to 'javascript'.
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Theme to be used for rendering.
      * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
      * You can create custom themes via `monaco.editor.defineTheme`.
      */
    var theme: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Width of editor. Defaults to 100%.
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object MonacoEditorBaseProps {
    
    inline def apply(): MonacoEditorBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonacoEditorBaseProps]
    }
    
    extension [Self <: MonacoEditorBaseProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeNull: Self = StObject.set(x, "theme", null)
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MonacoEditorProps
    extends StObject
       with MonacoEditorBaseProps {
    
    /**
      * An event emitted when the editor has been mounted (similar to componentDidMount of React).
      */
    var editorDidMount: js.UndefOr[EditorDidMount] = js.undefined
    
    /**
      * An event emitted before the editor mounted (similar to componentWillMount of React).
      */
    var editorWillMount: js.UndefOr[EditorWillMount] = js.undefined
    
    /**
      * An event emitted before the editor unmount (similar to componentWillUnmount of React).
      */
    var editorWillUnmount: js.UndefOr[EditorWillUnmount] = js.undefined
    
    /**
      * An event emitted when the content of the current model has changed.
      */
    var onChange: js.UndefOr[ChangeHandler] = js.undefined
    
    /**
      * Refer to Monaco interface {monaco.editor.IStandaloneEditorConstructionOptions}.
      */
    var options: js.UndefOr[IStandaloneEditorConstructionOptions] = js.undefined
    
    /**
      * Refer to Monaco interface {monaco.editor.IEditorOverrideServices}.
      */
    var overrideServices: js.UndefOr[IEditorOverrideServices] = js.undefined
    
    /**
      * Value of the auto created model in the editor.
      * If you specify `null` or `undefined` for this property, the component behaves in uncontrolled mode.
      * Otherwise, it behaves in controlled mode.
      */
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object MonacoEditorProps {
    
    inline def apply(): MonacoEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonacoEditorProps]
    }
    
    extension [Self <: MonacoEditorProps](x: Self) {
      
      inline def setEditorDidMount(value: (/* editor */ IStandaloneCodeEditor, /* monaco */ TypeofmonacoEditor) => Unit): Self = StObject.set(x, "editorDidMount", js.Any.fromFunction2(value))
      
      inline def setEditorDidMountUndefined: Self = StObject.set(x, "editorDidMount", js.undefined)
      
      inline def setEditorWillMount(value: /* monaco */ TypeofmonacoEditor => Unit | EditorConstructionOptions): Self = StObject.set(x, "editorWillMount", js.Any.fromFunction1(value))
      
      inline def setEditorWillMountUndefined: Self = StObject.set(x, "editorWillMount", js.undefined)
      
      inline def setEditorWillUnmount(
        value: (/* editor */ IStandaloneCodeEditor, /* monaco */ TypeofmonacoEditor) => Unit | EditorConstructionOptions
      ): Self = StObject.set(x, "editorWillUnmount", js.Any.fromFunction2(value))
      
      inline def setEditorWillUnmountUndefined: Self = StObject.set(x, "editorWillUnmount", js.undefined)
      
      inline def setOnChange(value: (/* value */ String, /* event */ IModelContentChangedEvent) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: IStandaloneEditorConstructionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOverrideServices(value: IEditorOverrideServices): Self = StObject.set(x, "overrideServices", value.asInstanceOf[js.Any])
      
      inline def setOverrideServicesUndefined: Self = StObject.set(x, "overrideServices", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
