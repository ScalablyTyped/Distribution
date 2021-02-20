package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasCompositing extends StObject {
  
  var globalAlpha: Double = js.native
  
  var globalCompositeOperation: java.lang.String = js.native
}
object CanvasCompositing {
  
  @scala.inline
  def apply(globalAlpha: Double, globalCompositeOperation: java.lang.String): CanvasCompositing = {
    val __obj = js.Dynamic.literal(globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCompositing]
  }
  
  @scala.inline
  implicit class CanvasCompositingMutableBuilder[Self <: CanvasCompositing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalAlpha(value: Double): Self = StObject.set(x, "globalAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalCompositeOperation(value: java.lang.String): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
  }
}
