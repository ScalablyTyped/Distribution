package typings.pulsarClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProducerMessage extends StObject {
  
  var data: Buffer
  
  var deliverAfter: js.UndefOr[Double] = js.undefined
  
  var deliverAt: js.UndefOr[Double] = js.undefined
  
  var disableReplication: js.UndefOr[Boolean] = js.undefined
  
  var eventTimestamp: js.UndefOr[Double] = js.undefined
  
  var orderingKey: js.UndefOr[String] = js.undefined
  
  var partitionKey: js.UndefOr[String] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var replicationClusters: js.UndefOr[js.Array[String]] = js.undefined
  
  var sequenceId: js.UndefOr[Double] = js.undefined
}
object ProducerMessage {
  
  inline def apply(data: Buffer): ProducerMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessage]
  }
  
  extension [Self <: ProducerMessage](x: Self) {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeliverAfter(value: Double): Self = StObject.set(x, "deliverAfter", value.asInstanceOf[js.Any])
    
    inline def setDeliverAfterUndefined: Self = StObject.set(x, "deliverAfter", js.undefined)
    
    inline def setDeliverAt(value: Double): Self = StObject.set(x, "deliverAt", value.asInstanceOf[js.Any])
    
    inline def setDeliverAtUndefined: Self = StObject.set(x, "deliverAt", js.undefined)
    
    inline def setDisableReplication(value: Boolean): Self = StObject.set(x, "disableReplication", value.asInstanceOf[js.Any])
    
    inline def setDisableReplicationUndefined: Self = StObject.set(x, "disableReplication", js.undefined)
    
    inline def setEventTimestamp(value: Double): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEventTimestampUndefined: Self = StObject.set(x, "eventTimestamp", js.undefined)
    
    inline def setOrderingKey(value: String): Self = StObject.set(x, "orderingKey", value.asInstanceOf[js.Any])
    
    inline def setOrderingKeyUndefined: Self = StObject.set(x, "orderingKey", js.undefined)
    
    inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReplicationClusters(value: js.Array[String]): Self = StObject.set(x, "replicationClusters", value.asInstanceOf[js.Any])
    
    inline def setReplicationClustersUndefined: Self = StObject.set(x, "replicationClusters", js.undefined)
    
    inline def setReplicationClustersVarargs(value: String*): Self = StObject.set(x, "replicationClusters", js.Array(value*))
    
    inline def setSequenceId(value: Double): Self = StObject.set(x, "sequenceId", value.asInstanceOf[js.Any])
    
    inline def setSequenceIdUndefined: Self = StObject.set(x, "sequenceId", js.undefined)
  }
}
