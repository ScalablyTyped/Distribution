package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x01`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetupFrame
  extends StObject
     with Frame {
  
  var data: js.UndefOr[Encodable] = js.undefined
  
  var dataMimeType: String
  
  var flags: Double
  
  var keepAlive: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var lifetime: Double
  
  var majorVersion: Double
  
  var metadata: js.UndefOr[Encodable] = js.undefined
  
  var metadataMimeType: String
  
  var minorVersion: Double
  
  var resumeToken: js.UndefOr[Encodable] = js.undefined
  
  var streamId: `0`
  
  var `type`: `0x01`
}
object SetupFrame {
  
  inline def apply(
    dataMimeType: String,
    flags: Double,
    keepAlive: Double,
    lifetime: Double,
    majorVersion: Double,
    metadataMimeType: String,
    minorVersion: Double
  ): SetupFrame = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x01)
    __obj.asInstanceOf[SetupFrame]
  }
  
  extension [Self <: SetupFrame](x: Self) {
    
    inline def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataMimeType(value: String): Self = StObject.set(x, "dataMimeType", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: Double): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Encodable): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataMimeType(value: String): Self = StObject.set(x, "metadataMimeType", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinorVersion(value: Double): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setResumeToken(value: Encodable): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setStreamId(value: `0`): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x01`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
