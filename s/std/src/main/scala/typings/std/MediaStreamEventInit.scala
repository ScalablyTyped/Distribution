package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamEventInit
  extends StObject
     with EventInit {
  
  var stream: js.UndefOr[MediaStream] = js.undefined
}
object MediaStreamEventInit {
  
  @scala.inline
  def apply(): MediaStreamEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamEventInit]
  }
  
  @scala.inline
  implicit class MediaStreamEventInitMutableBuilder[Self <: MediaStreamEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
