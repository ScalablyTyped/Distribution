package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distTypeMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderThreeCirclesMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/loader/ThreeCircles", JSImport.Default)
  @js.native
  val default: FunctionComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var innerCircleColor: js.UndefOr[String] = js.undefined
    
    var middleCircleColor: js.UndefOr[String] = js.undefined
    
    var outerCircleColor: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var wrapperClass: js.UndefOr[String] = js.undefined
    
    var wrapperStyle: js.UndefOr[Style] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInnerCircleColor(value: String): Self = StObject.set(x, "innerCircleColor", value.asInstanceOf[js.Any])
      
      inline def setInnerCircleColorUndefined: Self = StObject.set(x, "innerCircleColor", js.undefined)
      
      inline def setMiddleCircleColor(value: String): Self = StObject.set(x, "middleCircleColor", value.asInstanceOf[js.Any])
      
      inline def setMiddleCircleColorUndefined: Self = StObject.set(x, "middleCircleColor", js.undefined)
      
      inline def setOuterCircleColor(value: String): Self = StObject.set(x, "outerCircleColor", value.asInstanceOf[js.Any])
      
      inline def setOuterCircleColorUndefined: Self = StObject.set(x, "outerCircleColor", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
      
      inline def setWrapperStyle(value: Style): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  type _To = FunctionComponent[Props]
  
  /* This means you don't have to write `default`, but can instead just say `distLoaderThreeCirclesMod.foo` */
  override def _to: FunctionComponent[Props] = default
}
