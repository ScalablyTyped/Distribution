package typings.reactNative.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBackgroundProps
  extends StObject
     with ImagePropsBase {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var imageRef: js.UndefOr[js.Function1[/* image */ Image, Unit]] = js.undefined
  
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object ImageBackgroundProps {
  
  inline def apply(): ImageBackgroundProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBackgroundProps]
  }
  
  extension [Self <: ImageBackgroundProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setImageRef(value: /* image */ Image => Unit): Self = StObject.set(x, "imageRef", js.Any.fromFunction1(value))
    
    inline def setImageRefUndefined: Self = StObject.set(x, "imageRef", js.undefined)
    
    inline def setImageStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
