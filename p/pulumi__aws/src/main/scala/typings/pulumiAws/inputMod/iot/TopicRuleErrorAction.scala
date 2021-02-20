package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorAction extends StObject {
  
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
  implicit class TopicRuleErrorActionMutableBuilder[Self <: TopicRuleErrorAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchAlarm(value: Input[TopicRuleErrorActionCloudwatchAlarm]): Self = StObject.set(x, "cloudwatchAlarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchAlarmUndefined: Self = StObject.set(x, "cloudwatchAlarm", js.undefined)
    
    @scala.inline
    def setCloudwatchMetric(value: Input[TopicRuleErrorActionCloudwatchMetric]): Self = StObject.set(x, "cloudwatchMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchMetricUndefined: Self = StObject.set(x, "cloudwatchMetric", js.undefined)
    
    @scala.inline
    def setDynamodb(value: Input[TopicRuleErrorActionDynamodb]): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    @scala.inline
    def setDynamodbv2(value: Input[TopicRuleErrorActionDynamodbv2]): Self = StObject.set(x, "dynamodbv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbv2Undefined: Self = StObject.set(x, "dynamodbv2", js.undefined)
    
    @scala.inline
    def setElasticsearch(value: Input[TopicRuleErrorActionElasticsearch]): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
    
    @scala.inline
    def setFirehose(value: Input[TopicRuleErrorActionFirehose]): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    @scala.inline
    def setIotAnalytics(value: Input[TopicRuleErrorActionIotAnalytics]): Self = StObject.set(x, "iotAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotAnalyticsUndefined: Self = StObject.set(x, "iotAnalytics", js.undefined)
    
    @scala.inline
    def setIotEvents(value: Input[TopicRuleErrorActionIotEvents]): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
    
    @scala.inline
    def setKinesis(value: Input[TopicRuleErrorActionKinesis]): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    @scala.inline
    def setLambda(value: Input[TopicRuleErrorActionLambda]): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    @scala.inline
    def setRepublish(value: Input[TopicRuleErrorActionRepublish]): Self = StObject.set(x, "republish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepublishUndefined: Self = StObject.set(x, "republish", js.undefined)
    
    @scala.inline
    def setS3(value: Input[TopicRuleErrorActionS3]): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    @scala.inline
    def setSns(value: Input[TopicRuleErrorActionSns]): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    @scala.inline
    def setSqs(value: Input[TopicRuleErrorActionSqs]): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    @scala.inline
    def setStepFunctions(value: Input[TopicRuleErrorActionStepFunctions]): Self = StObject.set(x, "stepFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepFunctionsUndefined: Self = StObject.set(x, "stepFunctions", js.undefined)
  }
}
