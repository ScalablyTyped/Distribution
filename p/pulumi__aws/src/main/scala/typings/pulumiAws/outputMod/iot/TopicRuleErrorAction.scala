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
  
  inline def apply(): TopicRuleErrorAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleErrorAction]
  }
  
  extension [Self <: TopicRuleErrorAction](x: Self) {
    
    inline def setCloudwatchAlarm(value: TopicRuleErrorActionCloudwatchAlarm): Self = StObject.set(x, "cloudwatchAlarm", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchAlarmUndefined: Self = StObject.set(x, "cloudwatchAlarm", js.undefined)
    
    inline def setCloudwatchMetric(value: TopicRuleErrorActionCloudwatchMetric): Self = StObject.set(x, "cloudwatchMetric", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchMetricUndefined: Self = StObject.set(x, "cloudwatchMetric", js.undefined)
    
    inline def setDynamodb(value: TopicRuleErrorActionDynamodb): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setDynamodbv2(value: TopicRuleErrorActionDynamodbv2): Self = StObject.set(x, "dynamodbv2", value.asInstanceOf[js.Any])
    
    inline def setDynamodbv2Undefined: Self = StObject.set(x, "dynamodbv2", js.undefined)
    
    inline def setElasticsearch(value: TopicRuleErrorActionElasticsearch): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
    
    inline def setFirehose(value: TopicRuleErrorActionFirehose): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setIotAnalytics(value: TopicRuleErrorActionIotAnalytics): Self = StObject.set(x, "iotAnalytics", value.asInstanceOf[js.Any])
    
    inline def setIotAnalyticsUndefined: Self = StObject.set(x, "iotAnalytics", js.undefined)
    
    inline def setIotEvents(value: TopicRuleErrorActionIotEvents): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
    
    inline def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
    
    inline def setKinesis(value: TopicRuleErrorActionKinesis): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setLambda(value: TopicRuleErrorActionLambda): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setRepublish(value: TopicRuleErrorActionRepublish): Self = StObject.set(x, "republish", value.asInstanceOf[js.Any])
    
    inline def setRepublishUndefined: Self = StObject.set(x, "republish", js.undefined)
    
    inline def setS3(value: TopicRuleErrorActionS3): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    inline def setSns(value: TopicRuleErrorActionSns): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    inline def setSqs(value: TopicRuleErrorActionSqs): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    inline def setStepFunctions(value: TopicRuleErrorActionStepFunctions): Self = StObject.set(x, "stepFunctions", value.asInstanceOf[js.Any])
    
    inline def setStepFunctionsUndefined: Self = StObject.set(x, "stepFunctions", js.undefined)
  }
}
