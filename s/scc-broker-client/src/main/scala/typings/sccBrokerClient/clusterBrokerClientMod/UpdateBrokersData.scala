package typings.sccBrokerClient.clusterBrokerClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBrokersData extends js.Object {
  
  var brokerURIs: js.Array[String] = js.native
}
object UpdateBrokersData {
  
  @scala.inline
  def apply(brokerURIs: js.Array[String]): UpdateBrokersData = {
    val __obj = js.Dynamic.literal(brokerURIs = brokerURIs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokersData]
  }
  
  @scala.inline
  implicit class UpdateBrokersDataOps[Self <: UpdateBrokersData] (val x: Self) extends AnyVal {
    
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
    def setBrokerURIsVarargs(value: String*): Self = this.set("brokerURIs", js.Array(value :_*))
    
    @scala.inline
    def setBrokerURIs(value: js.Array[String]): Self = this.set("brokerURIs", value.asInstanceOf[js.Any])
  }
}
