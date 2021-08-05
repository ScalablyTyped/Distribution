package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ses {
  
  trait EventDestinationCloudwatchDestination extends StObject {
    
    /**
      * The default value for the event
      */
    var defaultValue: String
    
    /**
      * The name for the dimension
      */
    var dimensionName: String
    
    /**
      * The source for the value. It can be either `"messageTag"` or `"emailHeader"`
      */
    var valueSource: String
  }
  object EventDestinationCloudwatchDestination {
    
    inline def apply(defaultValue: String, dimensionName: String, valueSource: String): EventDestinationCloudwatchDestination = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], dimensionName = dimensionName.asInstanceOf[js.Any], valueSource = valueSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationCloudwatchDestination]
    }
    
    extension [Self <: EventDestinationCloudwatchDestination](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
      
      inline def setValueSource(value: String): Self = StObject.set(x, "valueSource", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventDestinationKinesisDestination extends StObject {
    
    /**
      * The ARN of the role that has permissions to access the Kinesis Stream
      */
    var roleArn: String
    
    /**
      * The ARN of the Kinesis Stream
      */
    var streamArn: String
  }
  object EventDestinationKinesisDestination {
    
    inline def apply(roleArn: String, streamArn: String): EventDestinationKinesisDestination = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationKinesisDestination]
    }
    
    extension [Self <: EventDestinationKinesisDestination](x: Self) {
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setStreamArn(value: String): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventDestinationSnsDestination extends StObject {
    
    /**
      * The ARN of the SNS topic
      */
    var topicArn: String
  }
  object EventDestinationSnsDestination {
    
    inline def apply(topicArn: String): EventDestinationSnsDestination = {
      val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationSnsDestination]
    }
    
    extension [Self <: EventDestinationSnsDestination](x: Self) {
      
      inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiptRuleAddHeaderAction extends StObject {
    
    /**
      * The name of the header to add
      */
    var headerName: String
    
    /**
      * The value of the header to add
      */
    var headerValue: String
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double
  }
  object ReceiptRuleAddHeaderAction {
    
    inline def apply(headerName: String, headerValue: String, position: Double): ReceiptRuleAddHeaderAction = {
      val __obj = js.Dynamic.literal(headerName = headerName.asInstanceOf[js.Any], headerValue = headerValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleAddHeaderAction]
    }
    
    extension [Self <: ReceiptRuleAddHeaderAction](x: Self) {
      
      inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      inline def setHeaderValue(value: String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiptRuleBounceAction extends StObject {
    
    /**
      * The message to send
      */
    var message: String
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double
    
    /**
      * The email address of the sender
      */
    var sender: String
    
    /**
      * The RFC 5321 SMTP reply code
      */
    var smtpReplyCode: String
    
    /**
      * The RFC 3463 SMTP enhanced status code
      */
    var statusCode: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.undefined
  }
  object ReceiptRuleBounceAction {
    
    inline def apply(message: String, position: Double, sender: String, smtpReplyCode: String): ReceiptRuleBounceAction = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleBounceAction]
    }
    
    extension [Self <: ReceiptRuleBounceAction](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSmtpReplyCode(value: String): Self = StObject.set(x, "smtpReplyCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  trait ReceiptRuleLambdaAction extends StObject {
    
    /**
      * The ARN of the Lambda function to invoke
      */
    var functionArn: String
    
    /**
      * Event or RequestResponse
      */
    var invocationType: String
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.undefined
  }
  object ReceiptRuleLambdaAction {
    
    inline def apply(functionArn: String, invocationType: String, position: Double): ReceiptRuleLambdaAction = {
      val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], invocationType = invocationType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleLambdaAction]
    }
    
    extension [Self <: ReceiptRuleLambdaAction](x: Self) {
      
      inline def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
      
      inline def setInvocationType(value: String): Self = StObject.set(x, "invocationType", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  trait ReceiptRuleS3Action extends StObject {
    
    /**
      * The name of the S3 bucket
      */
    var bucketName: String
    
    /**
      * The ARN of the KMS key
      */
    var kmsKeyArn: js.UndefOr[String] = js.undefined
    
    /**
      * The key prefix of the S3 bucket
      */
    var objectKeyPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.undefined
  }
  object ReceiptRuleS3Action {
    
    inline def apply(bucketName: String, position: Double): ReceiptRuleS3Action = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleS3Action]
    }
    
    extension [Self <: ReceiptRuleS3Action](x: Self) {
      
      inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      inline def setObjectKeyPrefix(value: String): Self = StObject.set(x, "objectKeyPrefix", value.asInstanceOf[js.Any])
      
      inline def setObjectKeyPrefixUndefined: Self = StObject.set(x, "objectKeyPrefix", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  trait ReceiptRuleSnsAction extends StObject {
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: String
  }
  object ReceiptRuleSnsAction {
    
    inline def apply(position: Double, topicArn: String): ReceiptRuleSnsAction = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleSnsAction]
    }
    
    extension [Self <: ReceiptRuleSnsAction](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiptRuleStopAction extends StObject {
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double
    
    /**
      * The scope to apply
      */
    var scope: String
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.undefined
  }
  object ReceiptRuleStopAction {
    
    inline def apply(position: Double, scope: String): ReceiptRuleStopAction = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleStopAction]
    }
    
    extension [Self <: ReceiptRuleStopAction](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  trait ReceiptRuleWorkmailAction extends StObject {
    
    /**
      * The ARN of the WorkMail organization
      */
    var organizationArn: String
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.undefined
  }
  object ReceiptRuleWorkmailAction {
    
    inline def apply(organizationArn: String, position: Double): ReceiptRuleWorkmailAction = {
      val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleWorkmailAction]
    }
    
    extension [Self <: ReceiptRuleWorkmailAction](x: Self) {
      
      inline def setOrganizationArn(value: String): Self = StObject.set(x, "organizationArn", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
}
