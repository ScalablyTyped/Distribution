package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeFrame
  extends StObject
     with Frame {
  
  var clientPosition: Double
  
  var flags: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var majorVersion: Double
  
  var minorVersion: Double
  
  var resumeToken: Encodable
  
  var serverPosition: Double
  
  var streamId: `0`
  
  var `type`: `0x0d`
}
object ResumeFrame {
  
  inline def apply(
    clientPosition: Double,
    flags: Double,
    majorVersion: Double,
    minorVersion: Double,
    resumeToken: Encodable,
    serverPosition: Double
  ): ResumeFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], serverPosition = serverPosition.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x0d)
    __obj.asInstanceOf[ResumeFrame]
  }
  
  extension [Self <: ResumeFrame](x: Self) {
    
    inline def setClientPosition(value: Double): Self = StObject.set(x, "clientPosition", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMajorVersion(value: Double): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: Double): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setResumeToken(value: Encodable): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setServerPosition(value: Double): Self = StObject.set(x, "serverPosition", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: `0`): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x0d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
