package typings.sccBrokerClient.clusterBrokerClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBrokersData extends js.Object {
  var brokerURIs: js.Array[String]
}

object UpdateBrokersData {
  @scala.inline
  def apply(brokerURIs: js.Array[String]): UpdateBrokersData = {
    val __obj = js.Dynamic.literal(brokerURIs = brokerURIs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateBrokersData]
  }
}

