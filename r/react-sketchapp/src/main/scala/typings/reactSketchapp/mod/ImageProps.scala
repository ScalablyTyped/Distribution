package typings.reactSketchapp.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageProps extends StObject {
  
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
  
  var resizeMode: ResizeMode = js.native
  
  var source: js.UndefOr[ImageSource] = js.native
  
  var style: js.UndefOr[Style | StyleReference] = js.native
}
object ImageProps {
  
  @scala.inline
  def apply(resizeMode: ResizeMode): ImageProps = {
    val __obj = js.Dynamic.literal(resizeMode = resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  
  @scala.inline
  implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setResizeMode(value: ResizeMode): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: ImageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStyle(value: Style | StyleReference): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
