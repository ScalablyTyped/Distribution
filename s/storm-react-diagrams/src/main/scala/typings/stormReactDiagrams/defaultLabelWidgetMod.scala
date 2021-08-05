package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultLabelModelMod.DefaultLabelModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultLabelWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLabelWidget", "DefaultLabelWidget")
  @js.native
  class DefaultLabelWidget protected ()
    extends BaseWidget[DefaultLabelWidgetProps, js.Any] {
    def this(props: js.Any) = this()
  }
  
  trait DefaultLabelWidgetProps
    extends StObject
       with BaseWidgetProps {
    
    var model: DefaultLabelModel
  }
  object DefaultLabelWidgetProps {
    
    inline def apply(model: DefaultLabelModel): DefaultLabelWidgetProps = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultLabelWidgetProps]
    }
    
    extension [Self <: DefaultLabelWidgetProps](x: Self) {
      
      inline def setModel(value: DefaultLabelModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
}
