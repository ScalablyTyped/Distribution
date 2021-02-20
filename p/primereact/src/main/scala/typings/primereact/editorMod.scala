package typings.primereact

import typings.primereact.anon.HtmlValue
import typings.primereact.anon.OldRange
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait EditorProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var formats: js.UndefOr[js.Array[_]] = js.native
    
    var headerTemplate: js.UndefOr[Element] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var modules: js.UndefOr[js.Any] = js.native
    
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ OldRange, Unit]] = js.native
    
    var onTextChange: js.UndefOr[js.Function1[/* e */ HtmlValue, Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var theme: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object EditorProps {
    
    @scala.inline
    def apply(): EditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorProps]
    }
    
    @scala.inline
    implicit class EditorPropsMutableBuilder[Self <: EditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFormats(value: js.Array[_]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setFormatsVarargs(value: js.Any*): Self = StObject.set(x, "formats", js.Array(value :_*))
      
      @scala.inline
      def setHeaderTemplate(value: Element): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModules(value: js.Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(value: /* e */ OldRange => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnTextChange(value: /* e */ HtmlValue => Unit): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTextChangeUndefined: Self = StObject.set(x, "onTextChange", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
