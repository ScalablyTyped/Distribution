package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x01`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetupFrame extends Frame {
  
  var data: js.UndefOr[Encodable] = js.native
  
  var dataMimeType: String = js.native
  
  var flags: Double = js.native
  
  var keepAlive: Double = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var lifetime: Double = js.native
  
  var majorVersion: Double = js.native
  
  var metadata: js.UndefOr[Encodable] = js.native
  
  var metadataMimeType: String = js.native
  
  var minorVersion: Double = js.native
  
  var resumeToken: js.UndefOr[Encodable] = js.native
  
  var streamId: `0` = js.native
  
  var `type`: `0x01` = js.native
}
object SetupFrame {
  
  @scala.inline
  def apply(
    dataMimeType: String,
    flags: Double,
    keepAlive: Double,
    lifetime: Double,
    majorVersion: Double,
    metadataMimeType: String,
    minorVersion: Double,
    streamId: `0`,
    `type`: `0x01`
  ): SetupFrame = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupFrame]
  }
  
  @scala.inline
  implicit class SetupFrameOps[Self <: SetupFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataMimeType(value: String): Self = this.set("dataMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAlive(value: Double): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifetime(value: Double): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersion(value: Double): Self = this.set("majorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataMimeType(value: String): Self = this.set("metadataMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersion(value: Double): Self = this.set("minorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: `0`): Self = this.set("streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x01`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Encodable): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMetadata(value: Encodable): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setResumeToken(value: Encodable): Self = this.set("resumeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResumeToken: Self = this.set("resumeToken", js.undefined)
  }
}
