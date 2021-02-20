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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerMod {
  
  @js.native
  trait APIGatewayEvent extends StObject {
    
    var body: js.UndefOr[String | Null] = js.native
    
    var headerParameters: StringDictionary[String] | Null = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var httpMethod: String = js.native
    
    var path: String = js.native
    
    var pathParameters: StringDictionary[String] | Null = js.native
    
    var queryString: StringDictionary[String] | Null = js.native
    
    var queryStringParameters: StringDictionary[String] | Null = js.native
    
    var requestContext: APIGatewayRequestContext = js.native
    
    var stageVariables: Stage = js.native
  }
  object APIGatewayEvent {
    
    @scala.inline
    def apply(
      headers: StringDictionary[String],
      httpMethod: String,
      path: String,
      requestContext: APIGatewayRequestContext,
      stageVariables: Stage
    ): APIGatewayEvent = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], stageVariables = stageVariables.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGatewayEvent]
    }
    
    @scala.inline
    implicit class APIGatewayEventMutableBuilder[Self <: APIGatewayEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaderParameters(value: StringDictionary[String]): Self = StObject.set(x, "headerParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderParametersNull: Self = StObject.set(x, "headerParameters", null)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParameters(value: StringDictionary[String]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathParametersNull: Self = StObject.set(x, "pathParameters", null)
      
      @scala.inline
      def setQueryString(value: StringDictionary[String]): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringNull: Self = StObject.set(x, "queryString", null)
      
      @scala.inline
      def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringParametersNull: Self = StObject.set(x, "queryStringParameters", null)
      
      @scala.inline
      def setRequestContext(value: APIGatewayRequestContext): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariables(value: Stage): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    }
  }
  
  type APIGatewayHandler[T] = Handler[APIGatewayEvent, T]
  
  @js.native
  trait APIGatewayRequestContext extends StObject {
    
    var httpMethod: String = js.native
    
    var identity: SecretId = js.native
    
    var path: String = js.native
    
    var requestId: js.UndefOr[String] = js.native
    
    var serviceId: String = js.native
    
    var sourceIp: String = js.native
    
    var stage: String = js.native
  }
  object APIGatewayRequestContext {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class APIGatewayRequestContextMutableBuilder[Self <: APIGatewayRequestContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: SecretId): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      
      @scala.inline
      def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CKafkaEvent extends StObject {
    
    var Records: js.Array[CKafkaEventRecord] = js.native
  }
  object CKafkaEvent {
    
    @scala.inline
    def apply(Records: js.Array[CKafkaEventRecord]): CKafkaEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CKafkaEvent]
    }
    
    @scala.inline
    implicit class CKafkaEventMutableBuilder[Self <: CKafkaEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[CKafkaEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: CKafkaEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CKafkaEventRecord extends StObject {
    
    var Ckafka: MsgKey = js.native
  }
  object CKafkaEventRecord {
    
    @scala.inline
    def apply(Ckafka: MsgKey): CKafkaEventRecord = {
      val __obj = js.Dynamic.literal(Ckafka = Ckafka.asInstanceOf[js.Any])
      __obj.asInstanceOf[CKafkaEventRecord]
    }
    
    @scala.inline
    implicit class CKafkaEventRecordMutableBuilder[Self <: CKafkaEventRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCkafka(value: MsgKey): Self = StObject.set(x, "Ckafka", value.asInstanceOf[js.Any])
    }
  }
  
  type CKafkaHandler[T] = Handler[CKafkaEvent, T]
  
  @js.native
  trait CMQTopicEvent extends StObject {
    
    var Records: js.Array[CMQTopicEventRecord] = js.native
  }
  object CMQTopicEvent {
    
    @scala.inline
    def apply(Records: js.Array[CMQTopicEventRecord]): CMQTopicEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMQTopicEvent]
    }
    
    @scala.inline
    implicit class CMQTopicEventMutableBuilder[Self <: CMQTopicEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[CMQTopicEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: CMQTopicEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CMQTopicEventRecord extends StObject {
    
    var CMQ: MsgBody = js.native
  }
  object CMQTopicEventRecord {
    
    @scala.inline
    def apply(CMQ: MsgBody): CMQTopicEventRecord = {
      val __obj = js.Dynamic.literal(CMQ = CMQ.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMQTopicEventRecord]
    }
    
    @scala.inline
    implicit class CMQTopicEventRecordMutableBuilder[Self <: CMQTopicEventRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCMQ(value: MsgBody): Self = StObject.set(x, "CMQ", value.asInstanceOf[js.Any])
    }
  }
  
  type CMQTopicHandler[T] = Handler[CMQTopicEvent, T]
  
  @js.native
  trait COSEvent extends StObject {
    
    var Records: js.Array[COSEventRecord] = js.native
  }
  object COSEvent {
    
    @scala.inline
    def apply(Records: js.Array[COSEventRecord]): COSEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[COSEvent]
    }
    
    @scala.inline
    implicit class COSEventMutableBuilder[Self <: COSEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[COSEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: COSEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait COSEventRecord extends StObject {
    
    var cos: CosBucket = js.native
    
    var event: EventName = js.native
  }
  object COSEventRecord {
    
    @scala.inline
    def apply(cos: CosBucket, event: EventName): COSEventRecord = {
      val __obj = js.Dynamic.literal(cos = cos.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[COSEventRecord]
    }
    
    @scala.inline
    implicit class COSEventRecordMutableBuilder[Self <: COSEventRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCos(value: CosBucket): Self = StObject.set(x, "cos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: EventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  type COSHandler[T] = Handler[COSEvent, T]
  
  @js.native
  trait TimerEvent extends StObject {
    
    var Message: String = js.native
    
    var Time: String = js.native
    
    var TriggerName: String = js.native
    
    var Type: String = js.native
  }
  object TimerEvent {
    
    @scala.inline
    def apply(Message: String, Time: String, TriggerName: String, Type: String): TimerEvent = {
      val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], TriggerName = TriggerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimerEvent]
    }
    
    @scala.inline
    implicit class TimerEventMutableBuilder[Self <: TimerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerName(value: String): Self = StObject.set(x, "TriggerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  type TimerHandler[T] = Handler[TimerEvent, T]
}
