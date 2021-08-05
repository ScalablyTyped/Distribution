package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultPortLabelWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultPortLabelWidget", "DefaultPortLabel")
  @js.native
  class DefaultPortLabel protected () extends BaseWidget[DefaultPortLabelProps, DefaultPortLabelState] {
    def this(props: js.Any) = this()
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
