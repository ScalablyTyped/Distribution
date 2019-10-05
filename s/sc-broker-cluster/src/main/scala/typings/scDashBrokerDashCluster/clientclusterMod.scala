package typings.scDashBrokerDashCluster

import typings.node.eventsMod.EventEmitter
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterMod.mapperFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster/clientcluster", JSImport.Namespace)
@js.native
object clientclusterMod extends js.Object {
  @js.native
  class ClientCluster protected () extends EventEmitter {
    def this(clients: js.Array[
            /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCBrokerClient */ _
          ]) = this()
    def getMapper(): mapperFunction = js.native
    def setMapper(mapper: mapperFunction): Unit = js.native
  }
  
}

