package typings.storybookComponents.mod

import typings.react.mod.MutableRefObject
import typings.react.mod.ReactElement
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IZoomIFrameProps extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var children: ReactElement
  
  var iFrameRef: MutableRefObject[HTMLIFrameElement]
  
  var scale: Double
}
object IZoomIFrameProps {
  
  inline def apply(children: ReactElement, iFrameRef: MutableRefObject[HTMLIFrameElement], scale: Double): IZoomIFrameProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], iFrameRef = iFrameRef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IZoomIFrameProps]
  }
  
  extension [Self <: IZoomIFrameProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setIFrameRef(value: MutableRefObject[HTMLIFrameElement]): Self = StObject.set(x, "iFrameRef", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
