package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
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
  def apply(
    alb: AlbEvent = null,
    alexaSkill: AlexaSkill = null,
    alexaSmartHome: AlexaSmartHome = null,
    cloudFront: CloudFront = null,
    cloudwatchEvent: CloudwatchEvent = null,
    cloudwatchLog: CloudwatchLog = null,
    cognitoUserPool: CognitoUserPool = null,
    eventBridge: EventBridge = null,
    http: Http = null,
    httpApi: HttpApiEvent = null,
    iot: Iot = null,
    s3: S3 = null,
    schedule: String | Schedule = null,
    sns: Sns = null,
    sqs: Sqs = null,
    stream: Stream = null,
    websocket: Websocket = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (alb != null) __obj.updateDynamic("alb")(alb.asInstanceOf[js.Any])
    if (alexaSkill != null) __obj.updateDynamic("alexaSkill")(alexaSkill.asInstanceOf[js.Any])
    if (alexaSmartHome != null) __obj.updateDynamic("alexaSmartHome")(alexaSmartHome.asInstanceOf[js.Any])
    if (cloudFront != null) __obj.updateDynamic("cloudFront")(cloudFront.asInstanceOf[js.Any])
    if (cloudwatchEvent != null) __obj.updateDynamic("cloudwatchEvent")(cloudwatchEvent.asInstanceOf[js.Any])
    if (cloudwatchLog != null) __obj.updateDynamic("cloudwatchLog")(cloudwatchLog.asInstanceOf[js.Any])
    if (cognitoUserPool != null) __obj.updateDynamic("cognitoUserPool")(cognitoUserPool.asInstanceOf[js.Any])
    if (eventBridge != null) __obj.updateDynamic("eventBridge")(eventBridge.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (httpApi != null) __obj.updateDynamic("httpApi")(httpApi.asInstanceOf[js.Any])
    if (iot != null) __obj.updateDynamic("iot")(iot.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (websocket != null) __obj.updateDynamic("websocket")(websocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

