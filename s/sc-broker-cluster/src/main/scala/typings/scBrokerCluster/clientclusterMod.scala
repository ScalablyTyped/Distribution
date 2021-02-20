package typings.scBrokerCluster

import typings.node.eventsMod.EventEmitter
import typings.scBroker.mod.SCBrokerClient
import typings.scBrokerCluster.mod.mapperFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientclusterMod {
  
  @JSImport("sc-broker-cluster/clientcluster", "ClientCluster")
  @js.native
  class ClientCluster protected () extends EventEmitter {
    def this(clients: js.Array[SCBrokerClient]) = this()
    
    def getMapper(): mapperFunction = js.native
    
    def setMapper(mapper: mapperFunction): Unit = js.native
  }
}
