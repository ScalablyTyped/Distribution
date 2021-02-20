package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBackgroundProps extends ImagePropsBase {
  
  var imageRef: js.UndefOr[js.Function1[/* image */ Image, Unit]] = js.native
  
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object ImageBackgroundProps {
  
  @scala.inline
  def apply(source: ImageSourcePropType): ImageBackgroundProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBackgroundProps]
  }
  
  @scala.inline
  implicit class ImageBackgroundPropsMutableBuilder[Self <: ImageBackgroundProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageRef(value: /* image */ Image => Unit): Self = StObject.set(x, "imageRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImageRefUndefined: Self = StObject.set(x, "imageRef", js.undefined)
    
    @scala.inline
    def setImageStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    @scala.inline
    def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
