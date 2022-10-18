package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceKafka extends StObject {
  
  /**
    * The Kafka topic to be tailed
    * @type {string}
    * @memberof SourceKafka
    */
  var kafka_topic_name: String
  
  /**
    * Kafka source status
    * @type {StatusKafka}
    * @memberof SourceKafka
    */
  var status: js.UndefOr[StatusKafka] = js.undefined
}
object SourceKafka {
  
  inline def apply(kafka_topic_name: String): SourceKafka = {
    val __obj = js.Dynamic.literal(kafka_topic_name = kafka_topic_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceKafka]
  }
  
  extension [Self <: SourceKafka](x: Self) {
    
    inline def setKafka_topic_name(value: String): Self = StObject.set(x, "kafka_topic_name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StatusKafka): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
