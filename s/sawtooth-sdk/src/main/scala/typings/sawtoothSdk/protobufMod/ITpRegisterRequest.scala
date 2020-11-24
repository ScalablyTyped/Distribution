package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpRegisterRequest extends js.Object {
  
  /** TpRegisterRequest family */
  var family: js.UndefOr[String | Null] = js.native
  
  /** TpRegisterRequest maxOccupancy */
  var maxOccupancy: js.UndefOr[Double | Null] = js.native
  
  /** TpRegisterRequest namespaces */
  var namespaces: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** TpRegisterRequest version */
  var version: js.UndefOr[String | Null] = js.native
}
object ITpRegisterRequest {
  
  @scala.inline
  def apply(): ITpRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpRegisterRequest]
  }
  
  @scala.inline
  implicit class ITpRegisterRequestOps[Self <: ITpRegisterRequest] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setFamilyNull: Self = this.set("family", null)
    
    @scala.inline
    def setMaxOccupancy(value: Double): Self = this.set("maxOccupancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxOccupancy: Self = this.set("maxOccupancy", js.undefined)
    
    @scala.inline
    def setMaxOccupancyNull: Self = this.set("maxOccupancy", null)
    
    @scala.inline
    def setNamespacesVarargs(value: String*): Self = this.set("namespaces", js.Array(value :_*))
    
    @scala.inline
    def setNamespaces(value: js.Array[String]): Self = this.set("namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaces: Self = this.set("namespaces", js.undefined)
    
    @scala.inline
    def setNamespacesNull: Self = this.set("namespaces", null)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
}
