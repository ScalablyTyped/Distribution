package typings.reactSketchapp

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactSketchapp.propsMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Image", JSImport.Default)
  @js.native
  class default ()
    extends Component[ImageProps, js.Object, js.Any]
  
  type Image = Component[ImageProps, js.Object, js.Any]
  
  trait ImageProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    var height: NumberProp
    
    var href: String
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var width: NumberProp
    
    var x: js.UndefOr[NumberProp] = js.undefined
    
    var y: js.UndefOr[NumberProp] = js.undefined
  }
  object ImageProps {
    
    inline def apply(height: NumberProp, href: String, width: NumberProp): ImageProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
