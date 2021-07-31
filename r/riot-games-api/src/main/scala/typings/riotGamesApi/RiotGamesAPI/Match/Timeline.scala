package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeline extends StObject {
  
  var frameInverval: Double
  
  var frames: js.Array[Frame]
}
object Timeline {
  
  @scala.inline
  def apply(frameInverval: Double, frames: js.Array[Frame]): Timeline = {
    val __obj = js.Dynamic.literal(frameInverval = frameInverval.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeline]
  }
  
  @scala.inline
  implicit class TimelineMutableBuilder[Self <: Timeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameInverval(value: Double): Self = StObject.set(x, "frameInverval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value :_*))
  }
}
