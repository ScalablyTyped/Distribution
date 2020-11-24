package typings.rsocketCore.anon

import typings.rsocketTypes.reactiveSocketTypesMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataMimeType[D, M] extends js.Object {
  
  var dataMimeType: String = js.native
  
  var keepAlive: Double = js.native
  
  var lifetime: Double = js.native
  
  var metadataMimeType: String = js.native
  
  var payload: js.UndefOr[Payload[D, M]] = js.native
}
object DataMimeType {
  
  @scala.inline
  def apply[D, M](dataMimeType: String, keepAlive: Double, lifetime: Double, metadataMimeType: String): DataMimeType[D, M] = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMimeType[D, M]]
  }
  
  @scala.inline
  implicit class DataMimeTypeOps[Self <: DataMimeType[_, _], D, M] (val x: Self with (DataMimeType[D, M])) extends AnyVal {
    
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
    def setKeepAlive(value: Double): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifetime(value: Double): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataMimeType(value: String): Self = this.set("metadataMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload[D, M]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
