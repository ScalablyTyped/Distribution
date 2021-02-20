package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x00`
import typings.rsocketTypes.rsocketTypesNumbers.`0x01`
import typings.rsocketTypes.rsocketTypesNumbers.`0x02`
import typings.rsocketTypes.rsocketTypesNumbers.`0x03`
import typings.rsocketTypes.rsocketTypesNumbers.`0x04`
import typings.rsocketTypes.rsocketTypesNumbers.`0x05`
import typings.rsocketTypes.rsocketTypesNumbers.`0x06`
import typings.rsocketTypes.rsocketTypesNumbers.`0x07`
import typings.rsocketTypes.rsocketTypesNumbers.`0x08`
import typings.rsocketTypes.rsocketTypesNumbers.`0x09`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0a`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0b`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0c`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0d`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0e`
import typings.rsocketTypes.rsocketTypesNumbers.`0x3f`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def CancelFrame(flags: Double, streamId: Double, `type`: `0x09`): typings.rsocketTypes.reactiveSocketTypesMod.CancelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.CancelFrame]
  }
  
  @scala.inline
  def ErrorFrame(code: Double, flags: Double, message: String, streamId: Double, `type`: `0x0b`): typings.rsocketTypes.reactiveSocketTypesMod.ErrorFrame = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.ErrorFrame]
  }
  
  @scala.inline
  def KeepAliveFrame(flags: Double, lastReceivedPosition: Double, streamId: `0`, `type`: `0x03`): typings.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], lastReceivedPosition = lastReceivedPosition.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame]
  }
  
  @scala.inline
  def LeaseFrame(flags: Double, requestCount: Double, streamId: `0`, ttl: Double, `type`: `0x02`): typings.rsocketTypes.reactiveSocketTypesMod.LeaseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.LeaseFrame]
  }
  
  @scala.inline
  def PayloadFrame(flags: Double, streamId: Double, `type`: `0x0a`): typings.rsocketTypes.reactiveSocketTypesMod.PayloadFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.PayloadFrame]
  }
  
  @scala.inline
  def RequestChannelFrame(flags: Double, requestN: Double, streamId: Double, `type`: `0x07`): typings.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame]
  }
  
  @scala.inline
  def RequestFnfFrame(flags: Double, streamId: Double, `type`: `0x05`): typings.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame]
  }
  
  @scala.inline
  def RequestNFrame(flags: Double, requestN: Double, streamId: Double, `type`: `0x08`): typings.rsocketTypes.reactiveSocketTypesMod.RequestNFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestNFrame]
  }
  
  @scala.inline
  def RequestResponseFrame(flags: Double, streamId: Double, `type`: `0x04`): typings.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame]
  }
  
  @scala.inline
  def RequestStreamFrame(
    data: Encodable,
    flags: Double,
    metadata: Encodable,
    requestN: Double,
    streamId: Double,
    `type`: `0x06`
  ): typings.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame]
  }
  
  @scala.inline
  def ResumeFrame(
    clientPosition: Double,
    flags: Double,
    majorVersion: Double,
    minorVersion: Double,
    resumeToken: Encodable,
    serverPosition: Double,
    streamId: `0`,
    `type`: `0x0d`
  ): typings.rsocketTypes.reactiveSocketTypesMod.ResumeFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], serverPosition = serverPosition.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.ResumeFrame]
  }
  
  @scala.inline
  def ResumeOkFrame(clientPosition: Double, flags: Double, streamId: `0`, `type`: `0x0e`): typings.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame]
  }
  
  @scala.inline
  def SetupFrame(
    dataMimeType: String,
    flags: Double,
    keepAlive: Double,
    lifetime: Double,
    majorVersion: Double,
    metadataMimeType: String,
    minorVersion: Double,
    streamId: `0`,
    `type`: `0x01`
  ): typings.rsocketTypes.reactiveSocketTypesMod.SetupFrame = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.SetupFrame]
  }
  
  @scala.inline
  def UnsupportedFrame(flags: Double, streamId: `0`, `type`: `0x3f` | `0x0c` | `0x00`): typings.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame]
  }
}
