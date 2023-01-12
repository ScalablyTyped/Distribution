package typings.storybookComponents.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomProps extends StObject {
  
  var children: ReactElement | js.Array[ReactElement]
  
  var scale: Double
}
object ZoomProps {
  
  inline def apply(children: ReactElement | js.Array[ReactElement], scale: Double): ZoomProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoomProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
