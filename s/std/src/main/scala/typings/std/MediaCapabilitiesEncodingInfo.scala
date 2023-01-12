package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaCapabilitiesEncodingInfo
  extends StObject
     with MediaCapabilitiesInfo {
  
  /* standard dom */
  var configuration: js.UndefOr[MediaEncodingConfiguration] = js.undefined
}
object MediaCapabilitiesEncodingInfo {
  
  inline def apply(powerEfficient: scala.Boolean, smooth: scala.Boolean, supported: scala.Boolean): MediaCapabilitiesEncodingInfo = {
    val __obj = js.Dynamic.literal(powerEfficient = powerEfficient.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCapabilitiesEncodingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaCapabilitiesEncodingInfo] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: MediaEncodingConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
