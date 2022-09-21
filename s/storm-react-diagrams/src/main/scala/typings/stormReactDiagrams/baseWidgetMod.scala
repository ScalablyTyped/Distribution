package typings.stormReactDiagrams

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/BaseWidget", "BaseWidget")
  @js.native
  open class BaseWidget[P /* <: BaseWidgetProps */, S] protected () extends Component[P, S, Any] {
    def this(name: String, props: P) = this()
    
    def bem(selector: String): String = js.native
    
    var className: String = js.native
    
    def getClassName(): String = js.native
    
    def getProps(): Any = js.native
  }
  
  trait BaseWidgetProps extends StObject {
    
    /**
      * Override the base class name
      */
    var baseClass: js.UndefOr[String] = js.undefined
    
    /**
      * append additional classes
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Additional props to add
      */
    var extraProps: js.UndefOr[Any] = js.undefined
  }
  object BaseWidgetProps {
    
    inline def apply(): BaseWidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseWidgetProps]
    }
    
    extension [Self <: BaseWidgetProps](x: Self) {
      
      inline def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtraProps(value: Any): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
      
      inline def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
    }
  }
}
