package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  var alb: js.UndefOr[AlbEvent] = js.native
  
  var alexaSkill: js.UndefOr[AlexaSkill] = js.native
  
  var alexaSmartHome: js.UndefOr[AlexaSmartHome] = js.native
  
  var cloudFront: js.UndefOr[CloudFront] = js.native
  
  var cloudwatchEvent: js.UndefOr[CloudwatchEvent] = js.native
  
  var cloudwatchLog: js.UndefOr[CloudwatchLog] = js.native
  
  var cognitoUserPool: js.UndefOr[CognitoUserPool] = js.native
  
  var eventBridge: js.UndefOr[EventBridge] = js.native
  
  var http: js.UndefOr[Http] = js.native
  
  var httpApi: js.UndefOr[HttpApiEvent] = js.native
  
  var iot: js.UndefOr[Iot] = js.native
  
  var s3: js.UndefOr[S3] = js.native
  
  var schedule: js.UndefOr[String | Schedule] = js.native
  
  var sns: js.UndefOr[Sns] = js.native
  
  var sqs: js.UndefOr[Sqs] = js.native
  
  var stream: js.UndefOr[Stream] = js.native
  
  var websocket: js.UndefOr[Websocket] = js.native
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlb(value: AlbEvent): Self = this.set("alb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlb: Self = this.set("alb", js.undefined)
    
    @scala.inline
    def setAlexaSkill(value: AlexaSkill): Self = this.set("alexaSkill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlexaSkill: Self = this.set("alexaSkill", js.undefined)
    
    @scala.inline
    def setAlexaSmartHome(value: AlexaSmartHome): Self = this.set("alexaSmartHome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlexaSmartHome: Self = this.set("alexaSmartHome", js.undefined)
    
    @scala.inline
    def setCloudFront(value: CloudFront): Self = this.set("cloudFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudFront: Self = this.set("cloudFront", js.undefined)
    
    @scala.inline
    def setCloudwatchEvent(value: CloudwatchEvent): Self = this.set("cloudwatchEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchEvent: Self = this.set("cloudwatchEvent", js.undefined)
    
    @scala.inline
    def setCloudwatchLog(value: CloudwatchLog): Self = this.set("cloudwatchLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLog: Self = this.set("cloudwatchLog", js.undefined)
    
    @scala.inline
    def setCognitoUserPool(value: CognitoUserPool): Self = this.set("cognitoUserPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCognitoUserPool: Self = this.set("cognitoUserPool", js.undefined)
    
    @scala.inline
    def setEventBridge(value: EventBridge): Self = this.set("eventBridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBridge: Self = this.set("eventBridge", js.undefined)
    
    @scala.inline
    def setHttp(value: Http): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setHttpApi(value: HttpApiEvent): Self = this.set("httpApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpApi: Self = this.set("httpApi", js.undefined)
    
    @scala.inline
    def setIot(value: Iot): Self = this.set("iot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIot: Self = this.set("iot", js.undefined)
    
    @scala.inline
    def setS3(value: S3): Self = this.set("s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
    
    @scala.inline
    def setSchedule(value: String | Schedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setSns(value: Sns): Self = this.set("sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSns: Self = this.set("sns", js.undefined)
    
    @scala.inline
    def setSqs(value: Sqs): Self = this.set("sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqs: Self = this.set("sqs", js.undefined)
    
    @scala.inline
    def setStream(value: Stream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setWebsocket(value: Websocket): Self = this.set("websocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsocket: Self = this.set("websocket", js.undefined)
  }
}
