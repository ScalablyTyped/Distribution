package typings.scBrokerCluster

import typings.node.eventsMod.EventEmitter
import typings.scBrokerCluster.mod.mapperFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster/clientcluster", JSImport.Namespace)
@js.native
object clientclusterMod extends js.Object {
  @js.native
  class ClientCluster protected () extends EventEmitter {
    def this(clients: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCBrokerClient */ _
          ]) = this()
    def getMapper(): mapperFunction = js.native
    def setMapper(mapper: mapperFunction): Unit = js.native
  }
  
}

