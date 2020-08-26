package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleErrorAction extends js.Object {
  var cloudwatchAlarm: js.UndefOr[Input[TopicRuleErrorActionCloudwatchAlarm]] = js.native
  var cloudwatchMetric: js.UndefOr[Input[TopicRuleErrorActionCloudwatchMetric]] = js.native
  var dynamodb: js.UndefOr[Input[TopicRuleErrorActionDynamodb]] = js.native
  var dynamodbv2: js.UndefOr[Input[TopicRuleErrorActionDynamodbv2]] = js.native
  var elasticsearch: js.UndefOr[Input[TopicRuleErrorActionElasticsearch]] = js.native
  var firehose: js.UndefOr[Input[TopicRuleErrorActionFirehose]] = js.native
  var iotAnalytics: js.UndefOr[Input[TopicRuleErrorActionIotAnalytics]] = js.native
  var iotEvents: js.UndefOr[Input[TopicRuleErrorActionIotEvents]] = js.native
  var kinesis: js.UndefOr[Input[TopicRuleErrorActionKinesis]] = js.native
  var lambda: js.UndefOr[Input[TopicRuleErrorActionLambda]] = js.native
  var republish: js.UndefOr[Input[TopicRuleErrorActionRepublish]] = js.native
  var s3: js.UndefOr[Input[TopicRuleErrorActionS3]] = js.native
  var sns: js.UndefOr[Input[TopicRuleErrorActionSns]] = js.native
  var sqs: js.UndefOr[Input[TopicRuleErrorActionSqs]] = js.native
  var stepFunctions: js.UndefOr[Input[TopicRuleErrorActionStepFunctions]] = js.native
}

object TopicRuleErrorAction {
  @scala.inline
  def apply(): TopicRuleErrorAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleErrorAction]
  }
  @scala.inline
  implicit class TopicRuleErrorActionOps[Self <: TopicRuleErrorAction] (val x: Self) extends AnyVal {
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
    def setCloudwatchAlarm(value: Input[TopicRuleErrorActionCloudwatchAlarm]): Self = this.set("cloudwatchAlarm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchAlarm: Self = this.set("cloudwatchAlarm", js.undefined)
    @scala.inline
    def setCloudwatchMetric(value: Input[TopicRuleErrorActionCloudwatchMetric]): Self = this.set("cloudwatchMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchMetric: Self = this.set("cloudwatchMetric", js.undefined)
    @scala.inline
    def setDynamodb(value: Input[TopicRuleErrorActionDynamodb]): Self = this.set("dynamodb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamodb: Self = this.set("dynamodb", js.undefined)
    @scala.inline
    def setDynamodbv2(value: Input[TopicRuleErrorActionDynamodbv2]): Self = this.set("dynamodbv2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamodbv2: Self = this.set("dynamodbv2", js.undefined)
    @scala.inline
    def setElasticsearch(value: Input[TopicRuleErrorActionElasticsearch]): Self = this.set("elasticsearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearch: Self = this.set("elasticsearch", js.undefined)
    @scala.inline
    def setFirehose(value: Input[TopicRuleErrorActionFirehose]): Self = this.set("firehose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirehose: Self = this.set("firehose", js.undefined)
    @scala.inline
    def setIotAnalytics(value: Input[TopicRuleErrorActionIotAnalytics]): Self = this.set("iotAnalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotAnalytics: Self = this.set("iotAnalytics", js.undefined)
    @scala.inline
    def setIotEvents(value: Input[TopicRuleErrorActionIotEvents]): Self = this.set("iotEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotEvents: Self = this.set("iotEvents", js.undefined)
    @scala.inline
    def setKinesis(value: Input[TopicRuleErrorActionKinesis]): Self = this.set("kinesis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesis: Self = this.set("kinesis", js.undefined)
    @scala.inline
    def setLambda(value: Input[TopicRuleErrorActionLambda]): Self = this.set("lambda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
    @scala.inline
    def setRepublish(value: Input[TopicRuleErrorActionRepublish]): Self = this.set("republish", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepublish: Self = this.set("republish", js.undefined)
    @scala.inline
    def setS3(value: Input[TopicRuleErrorActionS3]): Self = this.set("s3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
    @scala.inline
    def setSns(value: Input[TopicRuleErrorActionSns]): Self = this.set("sns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSns: Self = this.set("sns", js.undefined)
    @scala.inline
    def setSqs(value: Input[TopicRuleErrorActionSqs]): Self = this.set("sqs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqs: Self = this.set("sqs", js.undefined)
    @scala.inline
    def setStepFunctions(value: Input[TopicRuleErrorActionStepFunctions]): Self = this.set("stepFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepFunctions: Self = this.set("stepFunctions", js.undefined)
  }
  
}

