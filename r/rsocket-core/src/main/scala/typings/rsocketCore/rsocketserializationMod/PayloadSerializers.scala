package typings.rsocketCore.rsocketserializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayloadSerializers[D, M] extends js.Object {
  
  var data: Serializer[D] = js.native
  
  var metadata: Serializer[M] = js.native
}
object PayloadSerializers {
  
  @scala.inline
  def apply[D, M](data: Serializer[D], metadata: Serializer[M]): PayloadSerializers[D, M] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadSerializers[D, M]]
  }
  
  @scala.inline
  implicit class PayloadSerializersOps[Self <: PayloadSerializers[_, _], D, M] (val x: Self with (PayloadSerializers[D, M])) extends AnyVal {
    
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
    def setData(value: Serializer[D]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Serializer[M]): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
}
