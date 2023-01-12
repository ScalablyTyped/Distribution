package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerType extends StObject {
  
  var offsetLeft: Null | Double
  
  var offsetTop: Null | Double
  
  var vnode: Any
}
object ContainerType {
  
  inline def apply(vnode: Any): ContainerType = {
    val __obj = js.Dynamic.literal(vnode = vnode.asInstanceOf[js.Any], offsetLeft = null, offsetTop = null)
    __obj.asInstanceOf[ContainerType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerType] (val x: Self) extends AnyVal {
    
    inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeftNull: Self = StObject.set(x, "offsetLeft", null)
    
    inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setOffsetTopNull: Self = StObject.set(x, "offsetTop", null)
    
    inline def setVnode(value: Any): Self = StObject.set(x, "vnode", value.asInstanceOf[js.Any])
  }
}
