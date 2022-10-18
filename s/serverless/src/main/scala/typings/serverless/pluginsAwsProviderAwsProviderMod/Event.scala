package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var activemq: js.UndefOr[ActiveMq] = js.undefined
  
  var alb: js.UndefOr[AlbEvent] = js.undefined
  
  var alexaSkill: js.UndefOr[AlexaSkill] = js.undefined
  
  var alexaSmartHome: js.UndefOr[AlexaSmartHome] = js.undefined
  
  var cloudFront: js.UndefOr[CloudFront] = js.undefined
  
  var cloudwatchEvent: js.UndefOr[CloudwatchEvent] = js.undefined
  
  var cloudwatchLog: js.UndefOr[CloudwatchLog] = js.undefined
  
  var cognitoUserPool: js.UndefOr[CognitoUserPool] = js.undefined
  
  var eventBridge: js.UndefOr[EventBridge] = js.undefined
  
  var http: js.UndefOr[Http] = js.undefined
  
  var httpApi: js.UndefOr[HttpApiEvent] = js.undefined
  
  var iot: js.UndefOr[Iot] = js.undefined
  
  var msk: js.UndefOr[Msk] = js.undefined
  
  var rabbitmq: js.UndefOr[RabbitMq] = js.undefined
  
  var s3: js.UndefOr[S3] = js.undefined
  
  var schedule: js.UndefOr[String | Schedule] = js.undefined
  
  var sns: js.UndefOr[Sns] = js.undefined
  
  var sqs: js.UndefOr[Sqs] = js.undefined
  
  var stream: js.UndefOr[Stream] = js.undefined
  
  var websocket: js.UndefOr[Websocket] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setActivemq(value: ActiveMq): Self = StObject.set(x, "activemq", value.asInstanceOf[js.Any])
    
    inline def setActivemqUndefined: Self = StObject.set(x, "activemq", js.undefined)
    
    inline def setAlb(value: AlbEvent): Self = StObject.set(x, "alb", value.asInstanceOf[js.Any])
    
    inline def setAlbUndefined: Self = StObject.set(x, "alb", js.undefined)
    
    inline def setAlexaSkill(value: AlexaSkill): Self = StObject.set(x, "alexaSkill", value.asInstanceOf[js.Any])
    
    inline def setAlexaSkillUndefined: Self = StObject.set(x, "alexaSkill", js.undefined)
    
    inline def setAlexaSmartHome(value: AlexaSmartHome): Self = StObject.set(x, "alexaSmartHome", value.asInstanceOf[js.Any])
    
    inline def setAlexaSmartHomeUndefined: Self = StObject.set(x, "alexaSmartHome", js.undefined)
    
    inline def setCloudFront(value: CloudFront): Self = StObject.set(x, "cloudFront", value.asInstanceOf[js.Any])
    
    inline def setCloudFrontUndefined: Self = StObject.set(x, "cloudFront", js.undefined)
    
    inline def setCloudwatchEvent(value: CloudwatchEvent): Self = StObject.set(x, "cloudwatchEvent", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchEventUndefined: Self = StObject.set(x, "cloudwatchEvent", js.undefined)
    
    inline def setCloudwatchLog(value: CloudwatchLog): Self = StObject.set(x, "cloudwatchLog", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogUndefined: Self = StObject.set(x, "cloudwatchLog", js.undefined)
    
    inline def setCognitoUserPool(value: CognitoUserPool): Self = StObject.set(x, "cognitoUserPool", value.asInstanceOf[js.Any])
    
    inline def setCognitoUserPoolUndefined: Self = StObject.set(x, "cognitoUserPool", js.undefined)
    
    inline def setEventBridge(value: EventBridge): Self = StObject.set(x, "eventBridge", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeUndefined: Self = StObject.set(x, "eventBridge", js.undefined)
    
    inline def setHttp(value: Http): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpApi(value: HttpApiEvent): Self = StObject.set(x, "httpApi", value.asInstanceOf[js.Any])
    
    inline def setHttpApiUndefined: Self = StObject.set(x, "httpApi", js.undefined)
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setIot(value: Iot): Self = StObject.set(x, "iot", value.asInstanceOf[js.Any])
    
    inline def setIotUndefined: Self = StObject.set(x, "iot", js.undefined)
    
    inline def setMsk(value: Msk): Self = StObject.set(x, "msk", value.asInstanceOf[js.Any])
    
    inline def setMskUndefined: Self = StObject.set(x, "msk", js.undefined)
    
    inline def setRabbitmq(value: RabbitMq): Self = StObject.set(x, "rabbitmq", value.asInstanceOf[js.Any])
    
    inline def setRabbitmqUndefined: Self = StObject.set(x, "rabbitmq", js.undefined)
    
    inline def setS3(value: S3): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    inline def setSchedule(value: String | Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setSns(value: Sns): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    inline def setSqs(value: Sqs): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setWebsocket(value: Websocket): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
    
    inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
  }
}
