package typings.reactNative.mod

import typings.reactNative.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLoadEventData
  extends StObject
     with ImageLoadEventDataAndroid {
  
  var source: Url
}
object ImageLoadEventData {
  
  inline def apply(source: Url): ImageLoadEventData = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoadEventData]
  }
  
  extension [Self <: ImageLoadEventData](x: Self) {
    
    inline def setSource(value: Url): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
