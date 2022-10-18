package typings.stormReactDiagrams

import typings.stormReactDiagrams.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel
import typings.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidget
import typings.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDefaultsWidgetsDefaultPortLabelWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultPortLabelWidget", "DefaultPortLabel")
  @js.native
  open class DefaultPortLabel protected () extends BaseWidget[DefaultPortLabelProps, DefaultPortLabelState] {
    def this(props: Any) = this()
  }
  
  trait DefaultPortLabelProps
    extends StObject
       with BaseWidgetProps {
    
    var model: DefaultPortModel
  }
  object DefaultPortLabelProps {
    
    inline def apply(model: DefaultPortModel): DefaultPortLabelProps = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultPortLabelProps]
    }
    
    extension [Self <: DefaultPortLabelProps](x: Self) {
      
      inline def setModel(value: DefaultPortModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultPortLabelState extends StObject
}
