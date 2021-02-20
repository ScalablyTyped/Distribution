package typings.reactPlotlyJs.anon

import typings.plotlyJs.anon.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.FrameAnimationEvent> */
@js.native
trait ReadonlyFrameAnimationEve extends StObject {
  
  val animation: Frame = js.native
  
  val frame: typings.plotlyJs.mod.Frame = js.native
  
  val name: String = js.native
}
object ReadonlyFrameAnimationEve {
  
  @scala.inline
  def apply(animation: Frame, frame: typings.plotlyJs.mod.Frame, name: String): ReadonlyFrameAnimationEve = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFrameAnimationEve]
  }
  
  @scala.inline
  implicit class ReadonlyFrameAnimationEveMutableBuilder[Self <: ReadonlyFrameAnimationEve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Frame): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: typings.plotlyJs.mod.Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
