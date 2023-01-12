package typings.reactNative.mod

import typings.reactNative.anon.Uri
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageLoadEventData] (val x: Self) extends AnyVal {
    
    inline def setSource(value: Uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
