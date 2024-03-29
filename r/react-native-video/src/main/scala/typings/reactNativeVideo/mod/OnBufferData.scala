package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBufferData extends StObject {
  
  var isBuffering: Boolean
}
object OnBufferData {
  
  inline def apply(isBuffering: Boolean): OnBufferData = {
    val __obj = js.Dynamic.literal(isBuffering = isBuffering.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBufferData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBufferData] (val x: Self) extends AnyVal {
    
    inline def setIsBuffering(value: Boolean): Self = StObject.set(x, "isBuffering", value.asInstanceOf[js.Any])
  }
}
