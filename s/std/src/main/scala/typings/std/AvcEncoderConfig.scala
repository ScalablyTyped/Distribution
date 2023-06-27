package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvcEncoderConfig extends StObject {
  
  /* standard dom */
  var format: js.UndefOr[AvcBitstreamFormat] = js.undefined
}
object AvcEncoderConfig {
  
  inline def apply(): AvcEncoderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvcEncoderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvcEncoderConfig] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: AvcBitstreamFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
