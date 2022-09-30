package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.anon.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLoadEventData extends StObject {
  
  var source: Uri
}
object ImageLoadEventData {
  
  inline def apply(source: Uri): ImageLoadEventData = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoadEventData]
  }
  
  extension [Self <: ImageLoadEventData](x: Self) {
    
    inline def setSource(value: Uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
