package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Excluded from this release type: FrameManager */
trait FrameManager2 extends StObject {
  
  def frame(frameId: String): Frame | Null
}
object FrameManager2 {
  
  inline def apply(frame: String => Frame | Null): FrameManager2 = {
    val __obj = js.Dynamic.literal(frame = js.Any.fromFunction1(frame))
    __obj.asInstanceOf[FrameManager2]
  }
  
  extension [Self <: FrameManager2](x: Self) {
    
    inline def setFrame(value: String => Frame | Null): Self = StObject.set(x, "frame", js.Any.fromFunction1(value))
  }
}
