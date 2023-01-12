package typings.reactWheelpicker

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-wheelpicker", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    var animation: String
    
    var data: js.Array[String]
    
    var defaultSelection: Double
    
    var fontSize: Double
    
    var height: Double
    
    var parentHeight: Double
    
    var scrollerId: String
    
    def updateSelection(index: Double): Unit
  }
  object Props {
    
    inline def apply(
      animation: String,
      data: js.Array[String],
      defaultSelection: Double,
      fontSize: Double,
      height: Double,
      parentHeight: Double,
      scrollerId: String,
      updateSelection: Double => Unit
    ): Props = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultSelection = defaultSelection.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], parentHeight = parentHeight.asInstanceOf[js.Any], scrollerId = scrollerId.asInstanceOf[js.Any], updateSelection = js.Any.fromFunction1(updateSelection))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultSelection(value: Double): Self = StObject.set(x, "defaultSelection", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setParentHeight(value: Double): Self = StObject.set(x, "parentHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollerId(value: String): Self = StObject.set(x, "scrollerId", value.asInstanceOf[js.Any])
      
      inline def setUpdateSelection(value: Double => Unit): Self = StObject.set(x, "updateSelection", js.Any.fromFunction1(value))
    }
  }
  
  type WheelPicker = Component[Props, js.Object, Any]
}
