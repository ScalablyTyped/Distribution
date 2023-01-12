package typings.reactPlotlyJs.anon

import typings.plotlyJs.anon.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.FrameAnimationEvent> */
trait ReadonlyFrameAnimationEve extends StObject {
  
  val animation: Frame
  
  val frame: typings.plotlyJs.mod.Frame
  
  val name: String
}
object ReadonlyFrameAnimationEve {
  
  inline def apply(animation: Frame, frame: typings.plotlyJs.mod.Frame, name: String): ReadonlyFrameAnimationEve = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFrameAnimationEve]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyFrameAnimationEve] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Frame): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: typings.plotlyJs.mod.Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
