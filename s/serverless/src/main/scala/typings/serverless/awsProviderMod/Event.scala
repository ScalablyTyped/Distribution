package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
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
  
  var s3: js.UndefOr[S3] = js.undefined
  
  var schedule: js.UndefOr[String | Schedule] = js.undefined
  
  var sns: js.UndefOr[Sns] = js.undefined
  
  var sqs: js.UndefOr[Sqs] = js.undefined
  
  var stream: js.UndefOr[Stream] = js.undefined
  
  var websocket: js.UndefOr[Websocket] = js.undefined
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlb(value: AlbEvent): Self = StObject.set(x, "alb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbUndefined: Self = StObject.set(x, "alb", js.undefined)
    
    @scala.inline
    def setAlexaSkill(value: AlexaSkill): Self = StObject.set(x, "alexaSkill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlexaSkillUndefined: Self = StObject.set(x, "alexaSkill", js.undefined)
    
    @scala.inline
    def setAlexaSmartHome(value: AlexaSmartHome): Self = StObject.set(x, "alexaSmartHome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlexaSmartHomeUndefined: Self = StObject.set(x, "alexaSmartHome", js.undefined)
    
    @scala.inline
    def setCloudFront(value: CloudFront): Self = StObject.set(x, "cloudFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFrontUndefined: Self = StObject.set(x, "cloudFront", js.undefined)
    
    @scala.inline
    def setCloudwatchEvent(value: CloudwatchEvent): Self = StObject.set(x, "cloudwatchEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchEventUndefined: Self = StObject.set(x, "cloudwatchEvent", js.undefined)
    
    @scala.inline
    def setCloudwatchLog(value: CloudwatchLog): Self = StObject.set(x, "cloudwatchLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLogUndefined: Self = StObject.set(x, "cloudwatchLog", js.undefined)
    
    @scala.inline
    def setCognitoUserPool(value: CognitoUserPool): Self = StObject.set(x, "cognitoUserPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoUserPoolUndefined: Self = StObject.set(x, "cognitoUserPool", js.undefined)
    
    @scala.inline
    def setEventBridge(value: EventBridge): Self = StObject.set(x, "eventBridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBridgeUndefined: Self = StObject.set(x, "eventBridge", js.undefined)
    
    @scala.inline
    def setHttp(value: Http): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpApi(value: HttpApiEvent): Self = StObject.set(x, "httpApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpApiUndefined: Self = StObject.set(x, "httpApi", js.undefined)
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setIot(value: Iot): Self = StObject.set(x, "iot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotUndefined: Self = StObject.set(x, "iot", js.undefined)
    
    @scala.inline
    def setS3(value: S3): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    @scala.inline
    def setSchedule(value: String | Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setSns(value: Sns): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    @scala.inline
    def setSqs(value: Sqs): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    @scala.inline
    def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    @scala.inline
    def setWebsocket(value: Websocket): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
  }
}
