package typings.primereact

import typings.primereact.anon.HtmlValue
import typings.primereact.anon.OldRange
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorMod {
  
  @JSImport("primereact/components/editor/Editor", "Editor")
  @js.native
  class Editor protected ()
    extends Component[EditorProps, js.Any, js.Any] {
    def this(props: EditorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditorProps, context: js.Any) = this()
  }
  
  trait EditorProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var formats: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var headerTemplate: js.UndefOr[Element] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var modules: js.UndefOr[js.Any] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ OldRange, Unit]] = js.undefined
    
    var onTextChange: js.UndefOr[js.Function1[/* e */ HtmlValue, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object EditorProps {
    
    inline def apply(): EditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorProps]
    }
    
    extension [Self <: EditorProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFormats(value: js.Array[js.Any]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: js.Any*): Self = StObject.set(x, "formats", js.Array(value :_*))
      
      inline def setHeaderTemplate(value: Element): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModules(value: js.Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setOnSelectionChange(value: /* e */ OldRange => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnTextChange(value: /* e */ HtmlValue => Unit): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      inline def setOnTextChangeUndefined: Self = StObject.set(x, "onTextChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
