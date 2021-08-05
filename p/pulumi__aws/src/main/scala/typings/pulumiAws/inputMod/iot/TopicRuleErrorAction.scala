package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorAction extends StObject {
  
  var cloudwatchAlarm: js.UndefOr[Input[TopicRuleErrorActionCloudwatchAlarm]] = js.undefined
  
  var cloudwatchMetric: js.UndefOr[Input[TopicRuleErrorActionCloudwatchMetric]] = js.undefined
  
  var dynamodb: js.UndefOr[Input[TopicRuleErrorActionDynamodb]] = js.undefined
  
  var dynamodbv2: js.UndefOr[Input[TopicRuleErrorActionDynamodbv2]] = js.undefined
  
  var elasticsearch: js.UndefOr[Input[TopicRuleErrorActionElasticsearch]] = js.undefined
  
  var firehose: js.UndefOr[Input[TopicRuleErrorActionFirehose]] = js.undefined
  
  var iotAnalytics: js.UndefOr[Input[TopicRuleErrorActionIotAnalytics]] = js.undefined
  
  var iotEvents: js.UndefOr[Input[TopicRuleErrorActionIotEvents]] = js.undefined
  
  var kinesis: js.UndefOr[Input[TopicRuleErrorActionKinesis]] = js.undefined
  
  var lambda: js.UndefOr[Input[TopicRuleErrorActionLambda]] = js.undefined
  
  var republish: js.UndefOr[Input[TopicRuleErrorActionRepublish]] = js.undefined
  
  var s3: js.UndefOr[Input[TopicRuleErrorActionS3]] = js.undefined
  
  var sns: js.UndefOr[Input[TopicRuleErrorActionSns]] = js.undefined
  
  var sqs: js.UndefOr[Input[TopicRuleErrorActionSqs]] = js.undefined
  
  var stepFunctions: js.UndefOr[Input[TopicRuleErrorActionStepFunctions]] = js.undefined
}
object TopicRuleErrorAction {
  
  inline def apply(): TopicRuleErrorAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleErrorAction]
  }
  
  extension [Self <: TopicRuleErrorAction](x: Self) {
    
    inline def setCloudwatchAlarm(value: Input[TopicRuleErrorActionCloudwatchAlarm]): Self = StObject.set(x, "cloudwatchAlarm", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchAlarmUndefined: Self = StObject.set(x, "cloudwatchAlarm", js.undefined)
    
    inline def setCloudwatchMetric(value: Input[TopicRuleErrorActionCloudwatchMetric]): Self = StObject.set(x, "cloudwatchMetric", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchMetricUndefined: Self = StObject.set(x, "cloudwatchMetric", js.undefined)
    
    inline def setDynamodb(value: Input[TopicRuleErrorActionDynamodb]): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setDynamodbv2(value: Input[TopicRuleErrorActionDynamodbv2]): Self = StObject.set(x, "dynamodbv2", value.asInstanceOf[js.Any])
    
    inline def setDynamodbv2Undefined: Self = StObject.set(x, "dynamodbv2", js.undefined)
    
    inline def setElasticsearch(value: Input[TopicRuleErrorActionElasticsearch]): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
    
    inline def setFirehose(value: Input[TopicRuleErrorActionFirehose]): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setIotAnalytics(value: Input[TopicRuleErrorActionIotAnalytics]): Self = StObject.set(x, "iotAnalytics", value.asInstanceOf[js.Any])
    
    inline def setIotAnalyticsUndefined: Self = StObject.set(x, "iotAnalytics", js.undefined)
    
    inline def setIotEvents(value: Input[TopicRuleErrorActionIotEvents]): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
    
    inline def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
    
    inline def setKinesis(value: Input[TopicRuleErrorActionKinesis]): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setLambda(value: Input[TopicRuleErrorActionLambda]): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setRepublish(value: Input[TopicRuleErrorActionRepublish]): Self = StObject.set(x, "republish", value.asInstanceOf[js.Any])
    
    inline def setRepublishUndefined: Self = StObject.set(x, "republish", js.undefined)
    
    inline def setS3(value: Input[TopicRuleErrorActionS3]): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    inline def setSns(value: Input[TopicRuleErrorActionSns]): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    inline def setSqs(value: Input[TopicRuleErrorActionSqs]): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    inline def setStepFunctions(value: Input[TopicRuleErrorActionStepFunctions]): Self = StObject.set(x, "stepFunctions", value.asInstanceOf[js.Any])
    
    inline def setStepFunctionsUndefined: Self = StObject.set(x, "stepFunctions", js.undefined)
  }
}
