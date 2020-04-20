package typings.sccBrokerClient.clusterBrokerClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkersData extends js.Object {
  var sourceWorkerURI: String
  var workerURIs: String
}

object UpdateWorkersData {
  @scala.inline
  def apply(sourceWorkerURI: String, workerURIs: String): UpdateWorkersData = {
    val __obj = js.Dynamic.literal(sourceWorkerURI = sourceWorkerURI.asInstanceOf[js.Any], workerURIs = workerURIs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkersData]
  }
}

