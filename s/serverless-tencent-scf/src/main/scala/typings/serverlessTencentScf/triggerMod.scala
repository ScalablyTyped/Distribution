package typings.serverlessTencentScf

import org.scalablytyped.runtime.StringDictionary
import typings.serverlessTencentScf.anon.CosBucket
import typings.serverlessTencentScf.anon.EventName
import typings.serverlessTencentScf.anon.MsgBody
import typings.serverlessTencentScf.anon.MsgKey
import typings.serverlessTencentScf.anon.SecretId
import typings.serverlessTencentScf.anon.Stage
import typings.serverlessTencentScf.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerMod {
  
  trait APIGatewayEvent extends StObject {
    
    var body: js.UndefOr[String | Null] = js.undefined
    
    var headerParameters: StringDictionary[String] | Null
    
    var headers: StringDictionary[String]
    
    var httpMethod: String
    
    var path: String
    
    var pathParameters: StringDictionary[String] | Null
    
    var queryString: StringDictionary[String] | Null
    
    var queryStringParameters: StringDictionary[String] | Null
    
    var requestContext: APIGatewayRequestContext
    
    var stageVariables: Stage
  }
  object APIGatewayEvent {
    
    inline def apply(
      headers: StringDictionary[String],
      httpMethod: String,
      path: String,
      requestContext: APIGatewayRequestContext,
      stageVariables: Stage
    ): APIGatewayEvent = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], stageVariables = stageVariables.asInstanceOf[js.Any], headerParameters = null, pathParameters = null, queryString = null, queryStringParameters = null)
      __obj.asInstanceOf[APIGatewayEvent]
    }
    
    extension [Self <: APIGatewayEvent](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaderParameters(value: StringDictionary[String]): Self = StObject.set(x, "headerParameters", value.asInstanceOf[js.Any])
      
      inline def setHeaderParametersNull: Self = StObject.set(x, "headerParameters", null)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      inline def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      inline def setQueryString(value: StringDictionary[String]): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setQueryStringNull: Self = StObject.set(x, "queryString", null)
      
      inline def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      inline def setRequestContext(value: APIGatewayRequestContext): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      inline def setStageVariables(value: Stage): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayHandler[T] = Handler[APIGatewayEvent, T]
  
  trait APIGatewayRequestContext extends StObject {
    
    var httpMethod: String
    
    var identity: SecretId
    
    var path: String
    
    var requestId: js.UndefOr[String] = js.undefined
    
    var serviceId: String
    
    var sourceIp: String
    
    var stage: String
  }
  object APIGatewayRequestContext {
    
    inline def apply(
      httpMethod: String,
      identity: SecretId,
      path: String,
      serviceId: String,
      sourceIp: String,
      stage: String
    ): APIGatewayRequestContext = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayRequestContext]
    }
    
    extension [Self <: APIGatewayRequestContext](x: Self) {
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: SecretId): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  trait CKafkaEvent extends StObject {
    
    var Records: js.Array[CKafkaEventRecord]
  }
  object CKafkaEvent {
    
    inline def apply(Records: js.Array[CKafkaEventRecord]): CKafkaEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CKafkaEvent]
    }
    
    extension [Self <: CKafkaEvent](x: Self) {
      
      inline def setRecords(value: js.Array[CKafkaEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: CKafkaEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  trait CKafkaEventRecord extends StObject {
    
    var Ckafka: MsgKey
  }
  object CKafkaEventRecord {
    
    inline def apply(Ckafka: MsgKey): CKafkaEventRecord = {
      val __obj = js.Dynamic.literal(Ckafka = Ckafka.asInstanceOf[js.Any])
      __obj.asInstanceOf[CKafkaEventRecord]
    }
    
    extension [Self <: CKafkaEventRecord](x: Self) {
      
      inline def setCkafka(value: MsgKey): Self = StObject.set(x, "Ckafka", value.asInstanceOf[js.Any])
    }
  }
  
  type CKafkaHandler[T] = Handler[CKafkaEvent, T]
  
  trait CMQTopicEvent extends StObject {
    
    var Records: js.Array[CMQTopicEventRecord]
  }
  object CMQTopicEvent {
    
    inline def apply(Records: js.Array[CMQTopicEventRecord]): CMQTopicEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMQTopicEvent]
    }
    
    extension [Self <: CMQTopicEvent](x: Self) {
      
      inline def setRecords(value: js.Array[CMQTopicEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: CMQTopicEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  trait CMQTopicEventRecord extends StObject {
    
    var CMQ: MsgBody
  }
  object CMQTopicEventRecord {
    
    inline def apply(CMQ: MsgBody): CMQTopicEventRecord = {
      val __obj = js.Dynamic.literal(CMQ = CMQ.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMQTopicEventRecord]
    }
    
    extension [Self <: CMQTopicEventRecord](x: Self) {
      
      inline def setCMQ(value: MsgBody): Self = StObject.set(x, "CMQ", value.asInstanceOf[js.Any])
    }
  }
  
  type CMQTopicHandler[T] = Handler[CMQTopicEvent, T]
  
  trait COSEvent extends StObject {
    
    var Records: js.Array[COSEventRecord]
  }
  object COSEvent {
    
    inline def apply(Records: js.Array[COSEventRecord]): COSEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[COSEvent]
    }
    
    extension [Self <: COSEvent](x: Self) {
      
      inline def setRecords(value: js.Array[COSEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: COSEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  trait COSEventRecord extends StObject {
    
    var cos: CosBucket
    
    var event: EventName
  }
  object COSEventRecord {
    
    inline def apply(cos: CosBucket, event: EventName): COSEventRecord = {
      val __obj = js.Dynamic.literal(cos = cos.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[COSEventRecord]
    }
    
    extension [Self <: COSEventRecord](x: Self) {
      
      inline def setCos(value: CosBucket): Self = StObject.set(x, "cos", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: EventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  type COSHandler[T] = Handler[COSEvent, T]
  
  trait TimerEvent extends StObject {
    
    var Message: String
    
    var Time: String
    
    var TriggerName: String
    
    var Type: String
  }
  object TimerEvent {
    
    inline def apply(Message: String, Time: String, TriggerName: String, Type: String): TimerEvent = {
      val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], TriggerName = TriggerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimerEvent]
    }
    
    extension [Self <: TimerEvent](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
      
      inline def setTriggerName(value: String): Self = StObject.set(x, "TriggerName", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  type TimerHandler[T] = Handler[TimerEvent, T]
}
