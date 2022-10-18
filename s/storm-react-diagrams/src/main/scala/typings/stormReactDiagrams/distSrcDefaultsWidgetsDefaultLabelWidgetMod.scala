package typings.stormReactDiagrams

import typings.stormReactDiagrams.distSrcDefaultsModelsDefaultLabelModelMod.DefaultLabelModel
import typings.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidget
import typings.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDefaultsWidgetsDefaultLabelWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLabelWidget", "DefaultLabelWidget")
  @js.native
  open class DefaultLabelWidget protected () extends BaseWidget[DefaultLabelWidgetProps, Any] {
    def this(props: Any) = this()
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
