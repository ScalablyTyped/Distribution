package typings.reactSketchapp.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageProps extends StObject {
  
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  
  var resizeMode: ResizeMode
  
  var source: js.UndefOr[ImageSource] = js.undefined
  
  var style: js.UndefOr[Style | StyleReference] = js.undefined
}
object ImageProps {
  
  inline def apply(resizeMode: ResizeMode): ImageProps = {
    val __obj = js.Dynamic.literal(resizeMode = resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  
  extension [Self <: ImageProps](x: Self) {
    
    inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setResizeMode(value: ResizeMode): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ImageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStyle(value: Style | StyleReference): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
