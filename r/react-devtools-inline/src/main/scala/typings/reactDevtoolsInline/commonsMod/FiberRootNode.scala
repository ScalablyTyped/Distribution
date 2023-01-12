package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiberRootNode extends StObject {
  
  var current: FiberNode
}
object FiberRootNode {
  
  inline def apply(current: FiberNode): FiberRootNode = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiberRootNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FiberRootNode] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: FiberNode): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
