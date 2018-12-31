package typings
package scDashBrokerDashClusterLib.clientclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster/clientcluster", "ClientCluster")
@js.native
class ClientCluster protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(clients: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify SCBrokerClient */ _
    ]) = this()
  def getMapper(): scDashBrokerDashClusterLib.scDashBrokerDashClusterMod.mapperFunction = js.native
  def setMapper(mapper: scDashBrokerDashClusterLib.scDashBrokerDashClusterMod.mapperFunction): scala.Unit = js.native
}

