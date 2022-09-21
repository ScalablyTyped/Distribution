package typings.primereact

import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorMod {
  
  @JSImport("primereact/editor/editor", "Editor")
  @js.native
  open class Editor protected () extends Component[EditorProps, Any, Any] {
    def this(props: EditorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditorProps, context: Any) = this()
    
    def getContent(): HTMLDivElement = js.native
    
    def getElement(): HTMLDivElement = js.native
    
    def getQuill(): Any = js.native
    
    def getToolbar(): HTMLDivElement = js.native
  }
  
  trait EditorProps
    extends StObject
       with ClassAttributes[HTMLDivElement]
       with InputHTMLAttributes[HTMLDivElement] {
    
    var formats: js.UndefOr[js.Array[String]] = js.undefined
    
    var headerTemplate: js.UndefOr[ReactNode] = js.undefined
    
    var modules: js.UndefOr[Any] = js.undefined
    
    @JSName("onLoad")
    var onLoad_EditorProps: js.UndefOr[js.Function1[/* quill */ Any, Unit]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.Function1[/* e */ EditorSelectionChangeParams, Unit]] = js.undefined
    
    var onTextChange: js.UndefOr[js.Function1[/* e */ EditorTextChangeParams, Unit]] = js.undefined
    
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    @JSName("style")
    var style_EditorProps: js.UndefOr[js.Object] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    @JSName("value")
    var value_EditorProps: js.UndefOr[String] = js.undefined
  }
  object EditorProps {
    
    inline def apply(): EditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorProps]
    }
    
    extension [Self <: EditorProps](x: Self) {
      
      inline def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setHeaderTemplate(value: ReactNode): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setModules(value: Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setOnLoad(value: /* quill */ Any => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnSelectionChange(value: /* e */ EditorSelectionChangeParams => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnTextChange(value: /* e */ EditorTextChangeParams => Unit): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      inline def setOnTextChangeUndefined: Self = StObject.set(x, "onTextChange", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait EditorSelectionChangeParams extends StObject {
    
    var oldRange: Any
    
    var range: Any
    
    var source: String
  }
  object EditorSelectionChangeParams {
    
    inline def apply(oldRange: Any, range: Any, source: String): EditorSelectionChangeParams = {
      val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorSelectionChangeParams]
    }
    
    extension [Self <: EditorSelectionChangeParams](x: Self) {
      
      inline def setOldRange(value: Any): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditorTextChangeParams extends StObject {
    
    var delta: Any
    
    var htmlValue: String | Null
    
    var source: String
    
    var textValue: String
  }
  object EditorTextChangeParams {
    
    inline def apply(delta: Any, source: String, textValue: String): EditorTextChangeParams = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], textValue = textValue.asInstanceOf[js.Any], htmlValue = null)
      __obj.asInstanceOf[EditorTextChangeParams]
    }
    
    extension [Self <: EditorTextChangeParams](x: Self) {
      
      inline def setDelta(value: Any): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setHtmlValue(value: String): Self = StObject.set(x, "htmlValue", value.asInstanceOf[js.Any])
      
      inline def setHtmlValueNull: Self = StObject.set(x, "htmlValue", null)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTextValue(value: String): Self = StObject.set(x, "textValue", value.asInstanceOf[js.Any])
    }
  }
}
