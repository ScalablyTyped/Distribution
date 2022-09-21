package typings.reactMdForm

import typings.react.mod.ReactElement
import typings.reactMdForm.typesMod.ThumbIndex
import typings.reactMdTooltip.tooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderValueMod {
  
  @JSImport("@react-md/form/types/slider/SliderValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SliderValue(hasIndexAnimateDiscreteVerticalChildrenClassNamePortalProps: SliderValueProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("SliderValue")(hasIndexAnimateDiscreteVerticalChildrenClassNamePortalProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait SliderValueProps
    extends StObject
       with TooltipProps {
    
    var animate: Boolean
    
    var discrete: Boolean
    
    var index: ThumbIndex
    
    var vertical: Boolean
  }
  object SliderValueProps {
    
    inline def apply(
      animate: Boolean,
      discrete: Boolean,
      id: String,
      index: ThumbIndex,
      vertical: Boolean,
      visible: Boolean
    ): SliderValueProps = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], discrete = discrete.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderValueProps]
    }
    
    extension [Self <: SliderValueProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setDiscrete(value: Boolean): Self = StObject.set(x, "discrete", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: ThumbIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
