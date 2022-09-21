package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureInPictureWindowEventMap extends StObject {
  
  /* standard dom */
  var resize: Event
}
object PictureInPictureWindowEventMap {
  
  inline def apply(resize: Event): PictureInPictureWindowEventMap = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureInPictureWindowEventMap]
  }
  
  extension [Self <: PictureInPictureWindowEventMap](x: Self) {
    
    inline def setResize(value: Event): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
  }
}
