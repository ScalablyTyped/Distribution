package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDecodingConfiguration
  extends StObject
     with MediaConfiguration {
  
  /* standard dom */
  var `type`: MediaDecodingType
}
object MediaDecodingConfiguration {
  
  inline def apply(`type`: MediaDecodingType): MediaDecodingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDecodingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaDecodingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setType(value: MediaDecodingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
