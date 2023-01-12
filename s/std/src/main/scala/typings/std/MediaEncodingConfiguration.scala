package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaEncodingConfiguration
  extends StObject
     with MediaConfiguration {
  
  /* standard dom */
  var `type`: MediaEncodingType
}
object MediaEncodingConfiguration {
  
  inline def apply(`type`: MediaEncodingType): MediaEncodingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEncodingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaEncodingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setType(value: MediaEncodingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
