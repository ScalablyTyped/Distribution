package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("primereact/components/message/Message", "Message")
  @js.native
  class Message protected ()
    extends Component[MessageProps, js.Any, js.Any] {
    def this(props: MessageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MessageProps, context: js.Any) = this()
  }
  
  trait MessageProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[js.Function1[/* props */ js.Object, js.Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var severity: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object MessageProps {
    
    inline def apply(): MessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageProps]
    }
    
    extension [Self <: MessageProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: /* props */ js.Object => js.Any): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
