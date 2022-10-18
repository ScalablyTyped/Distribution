package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.rockset.distCodegenApiMod.KafkaIntegration.KafkaDataFormatEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaIntegration extends StObject {
  
  /**
    * segment connection string
    * @type {string}
    * @memberof KafkaIntegration
    */
  var connection_string: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the Kafka topics being tailed
    * @type {string}
    * @memberof KafkaIntegration
    */
  var kafka_data_format: KafkaDataFormatEnum
  
  /**
    * Kafka topics to tail
    * @type {Array<string>}
    * @memberof KafkaIntegration
    */
  var kafka_topic_names: js.Array[String]
  
  /**
    * The status of the Kafka source by topic
    * @type {{ [key: string]: StatusKafka; }}
    * @memberof KafkaIntegration
    */
  var source_status_by_topic: js.UndefOr[StringDictionary[StatusKafka]] = js.undefined
}
object KafkaIntegration {
  
  inline def apply(kafka_data_format: KafkaDataFormatEnum, kafka_topic_names: js.Array[String]): KafkaIntegration = {
    val __obj = js.Dynamic.literal(kafka_data_format = kafka_data_format.asInstanceOf[js.Any], kafka_topic_names = kafka_topic_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaIntegration]
  }
  
  @js.native
  sealed trait KafkaDataFormatEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "KafkaIntegration.KafkaDataFormatEnum")
  @js.native
  object KafkaDataFormatEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KafkaDataFormatEnum & Double] = js.native
    
    @js.native
    sealed trait AVRO
      extends StObject
         with KafkaDataFormatEnum
    /* 1 */ val AVRO: typings.rockset.distCodegenApiMod.KafkaIntegration.KafkaDataFormatEnum.AVRO & Double = js.native
    
    @js.native
    sealed trait JSON
      extends StObject
         with KafkaDataFormatEnum
    /* 0 */ val JSON: typings.rockset.distCodegenApiMod.KafkaIntegration.KafkaDataFormatEnum.JSON & Double = js.native
  }
  
  extension [Self <: KafkaIntegration](x: Self) {
    
    inline def setConnection_string(value: String): Self = StObject.set(x, "connection_string", value.asInstanceOf[js.Any])
    
    inline def setConnection_stringUndefined: Self = StObject.set(x, "connection_string", js.undefined)
    
    inline def setKafka_data_format(value: KafkaDataFormatEnum): Self = StObject.set(x, "kafka_data_format", value.asInstanceOf[js.Any])
    
    inline def setKafka_topic_names(value: js.Array[String]): Self = StObject.set(x, "kafka_topic_names", value.asInstanceOf[js.Any])
    
    inline def setKafka_topic_namesVarargs(value: String*): Self = StObject.set(x, "kafka_topic_names", js.Array(value*))
    
    inline def setSource_status_by_topic(value: StringDictionary[StatusKafka]): Self = StObject.set(x, "source_status_by_topic", value.asInstanceOf[js.Any])
    
    inline def setSource_status_by_topicUndefined: Self = StObject.set(x, "source_status_by_topic", js.undefined)
  }
}
