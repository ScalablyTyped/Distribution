package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorAction extends StObject {
  
  var cloudwatchAlarm: js.UndefOr[TopicRuleErrorActionCloudwatchAlarm] = js.undefined
  
  var cloudwatchMetric: js.UndefOr[TopicRuleErrorActionCloudwatchMetric] = js.undefined
  
  var dynamodb: js.UndefOr[TopicRuleErrorActionDynamodb] = js.undefined
  
  var dynamodbv2: js.UndefOr[TopicRuleErrorActionDynamodbv2] = js.undefined
  
  var elasticsearch: js.UndefOr[TopicRuleErrorActionElasticsearch] = js.undefined
  
  var firehose: js.UndefOr[TopicRuleErrorActionFirehose] = js.undefined
  
  var iotAnalytics: js.UndefOr[TopicRuleErrorActionIotAnalytics] = js.undefined
  
  var iotEvents: js.UndefOr[TopicRuleErrorActionIotEvents] = js.undefined
  
  var kinesis: js.UndefOr[TopicRuleErrorActionKinesis] = js.undefined
  
  var lambda: js.UndefOr[TopicRuleErrorActionLambda] = js.undefined
  
  var republish: js.UndefOr[TopicRuleErrorActionRepublish] = js.undefined
  
  var s3: js.UndefOr[TopicRuleErrorActionS3] = js.undefined
  
  var sns: js.UndefOr[TopicRuleErrorActionSns] = js.undefined
  
  var sqs: js.UndefOr[TopicRuleErrorActionSqs] = js.undefined
  
  var stepFunctions: js.UndefOr[TopicRuleErrorActionStepFunctions] = js.undefined
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
    def setCloudwatchAlarm(value: TopicRuleErrorActionCloudwatchAlarm): Self = StObject.set(x, "cloudwatchAlarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchAlarmUndefined: Self = StObject.set(x, "cloudwatchAlarm", js.undefined)
    
    @scala.inline
    def setCloudwatchMetric(value: TopicRuleErrorActionCloudwatchMetric): Self = StObject.set(x, "cloudwatchMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchMetricUndefined: Self = StObject.set(x, "cloudwatchMetric", js.undefined)
    
    @scala.inline
    def setDynamodb(value: TopicRuleErrorActionDynamodb): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    @scala.inline
    def setDynamodbv2(value: TopicRuleErrorActionDynamodbv2): Self = StObject.set(x, "dynamodbv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbv2Undefined: Self = StObject.set(x, "dynamodbv2", js.undefined)
    
    @scala.inline
    def setElasticsearch(value: TopicRuleErrorActionElasticsearch): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
    
    @scala.inline
    def setFirehose(value: TopicRuleErrorActionFirehose): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    @scala.inline
    def setIotAnalytics(value: TopicRuleErrorActionIotAnalytics): Self = StObject.set(x, "iotAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotAnalyticsUndefined: Self = StObject.set(x, "iotAnalytics", js.undefined)
    
    @scala.inline
    def setIotEvents(value: TopicRuleErrorActionIotEvents): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
    
    @scala.inline
    def setKinesis(value: TopicRuleErrorActionKinesis): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    @scala.inline
    def setLambda(value: TopicRuleErrorActionLambda): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    @scala.inline
    def setRepublish(value: TopicRuleErrorActionRepublish): Self = StObject.set(x, "republish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepublishUndefined: Self = StObject.set(x, "republish", js.undefined)
    
    @scala.inline
    def setS3(value: TopicRuleErrorActionS3): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    @scala.inline
    def setSns(value: TopicRuleErrorActionSns): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    @scala.inline
    def setSqs(value: TopicRuleErrorActionSqs): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    @scala.inline
    def setStepFunctions(value: TopicRuleErrorActionStepFunctions): Self = StObject.set(x, "stepFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepFunctionsUndefined: Self = StObject.set(x, "stepFunctions", js.undefined)
  }
}
