package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesInts.`0x00`
import typings.rsocketTypes.rsocketTypesInts.`0x0c`
import typings.rsocketTypes.rsocketTypesInts.`0x3f`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rsocketTypes.reactiveSocketTypesMod.CancelFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.ErrorFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.LeaseFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.PayloadFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.RequestNFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.ResumeFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.SetupFrame
  - typings.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame
*/
trait Frame extends StObject
object Frame {
  
  inline def CancelFrame(flags: Double, streamId: Double): typings.rsocketTypes.reactiveSocketTypesMod.CancelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x09)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.CancelFrame]
  }
  
  inline def ErrorFrame(code: Double, flags: Double, message: String, streamId: Double): typings.rsocketTypes.reactiveSocketTypesMod.ErrorFrame = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x0b)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.ErrorFrame]
  }
  
  inline def KeepAliveFrame(flags: Double, lastReceivedPosition: Double): typings.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], lastReceivedPosition = lastReceivedPosition.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x03)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame]
  }
  
  inline def LeaseFrame(flags: Double, requestCount: Double, ttl: Double): typings.rsocketTypes.reactiveSocketTypesMod.LeaseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], streamId = 0, ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x02)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.LeaseFrame]
  }
  
  inline def PayloadFrame(flags: Double, streamId: Double): typings.rsocketTypes.reactiveSocketTypesMod.PayloadFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x0a)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.PayloadFrame]
  }
  
  inline def RequestChannelFrame(flags: Double, requestN: Double, streamId: Double): typings.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x07)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame]
  }
  
  inline def RequestFnfFrame(flags: Double, streamId: Double): typings.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x05)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame]
  }
  
  inline def RequestNFrame(flags: Double, requestN: Double, streamId: Double): typings.rsocketTypes.reactiveSocketTypesMod.RequestNFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x08)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestNFrame]
  }
  
  inline def RequestResponseFrame(flags: Double, streamId: Double): typings.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x04)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame]
  }
  
  inline def RequestStreamFrame(data: Encodable, flags: Double, metadata: Encodable, requestN: Double, streamId: Double): typings.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x06)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame]
  }
  
  inline def ResumeFrame(
    clientPosition: Double,
    flags: Double,
    majorVersion: Double,
    minorVersion: Double,
    resumeToken: Encodable,
    serverPosition: Double
  ): typings.rsocketTypes.reactiveSocketTypesMod.ResumeFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], serverPosition = serverPosition.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x0d)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.ResumeFrame]
  }
  
  inline def ResumeOkFrame(clientPosition: Double, flags: Double): typings.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x0e)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame]
  }
  
  inline def SetupFrame(
    dataMimeType: String,
    flags: Double,
    keepAlive: Double,
    lifetime: Double,
    majorVersion: Double,
    metadataMimeType: String,
    minorVersion: Double
  ): typings.rsocketTypes.reactiveSocketTypesMod.SetupFrame = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x01)
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.SetupFrame]
  }
  
  inline def UnsupportedFrame(flags: Double, `type`: `0x3f` | `0x0c` | `0x00`): typings.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame]
  }
}
