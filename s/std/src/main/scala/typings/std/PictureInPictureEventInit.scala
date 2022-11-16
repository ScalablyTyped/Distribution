package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureInPictureEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var pictureInPictureWindow: PictureInPictureWindow
}
object PictureInPictureEventInit {
  
  inline def apply(pictureInPictureWindow: PictureInPictureWindow): PictureInPictureEventInit = {
    val __obj = js.Dynamic.literal(pictureInPictureWindow = pictureInPictureWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureInPictureEventInit]
  }
  
  extension [Self <: PictureInPictureEventInit](x: Self) {
    
    inline def setPictureInPictureWindow(value: PictureInPictureWindow): Self = StObject.set(x, "pictureInPictureWindow", value.asInstanceOf[js.Any])
  }
}
