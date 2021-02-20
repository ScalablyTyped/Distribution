package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultPortLabelWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultPortLabelWidget", "DefaultPortLabel")
  @js.native
  class DefaultPortLabel protected () extends BaseWidget[DefaultPortLabelProps, DefaultPortLabelState] {
    def this(props: js.Any) = this()
  }
  
  @js.native
  trait DefaultPortLabelProps extends BaseWidgetProps {
    
    var model: DefaultPortModel = js.native
  }
  object DefaultPortLabelProps {
    
    @scala.inline
    def apply(model: DefaultPortModel): DefaultPortLabelProps = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultPortLabelProps]
    }
    
    @scala.inline
    implicit class DefaultPortLabelPropsMutableBuilder[Self <: DefaultPortLabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: DefaultPortModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultPortLabelState extends StObject
}
