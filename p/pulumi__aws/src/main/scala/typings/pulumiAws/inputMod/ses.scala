package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ses {
  
  trait EventDestinationCloudwatchDestination extends StObject {
    
    /**
      * The default value for the event
      */
    var defaultValue: Input[String]
    
    /**
      * The name for the dimension
      */
    var dimensionName: Input[String]
    
    /**
      * The source for the value. It can be either `"messageTag"` or `"emailHeader"`
      */
    var valueSource: Input[String]
  }
  object EventDestinationCloudwatchDestination {
    
    inline def apply(defaultValue: Input[String], dimensionName: Input[String], valueSource: Input[String]): EventDestinationCloudwatchDestination = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], dimensionName = dimensionName.asInstanceOf[js.Any], valueSource = valueSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationCloudwatchDestination]
    }
    
    extension [Self <: EventDestinationCloudwatchDestination](x: Self) {
      
      inline def setDefaultValue(value: Input[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDimensionName(value: Input[String]): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
      
      inline def setValueSource(value: Input[String]): Self = StObject.set(x, "valueSource", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventDestinationKinesisDestination extends StObject {
    
    /**
      * The ARN of the role that has permissions to access the Kinesis Stream
      */
    var roleArn: Input[String]
    
    /**
      * The ARN of the Kinesis Stream
      */
    var streamArn: Input[String]
  }
  object EventDestinationKinesisDestination {
    
    inline def apply(roleArn: Input[String], streamArn: Input[String]): EventDestinationKinesisDestination = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationKinesisDestination]
    }
    
    extension [Self <: EventDestinationKinesisDestination](x: Self) {
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setStreamArn(value: Input[String]): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventDestinationSnsDestination extends StObject {
    
    /**
      * The ARN of the SNS topic
      */
    var topicArn: Input[String]
  }
  object EventDestinationSnsDestination {
    
    inline def apply(topicArn: Input[String]): EventDestinationSnsDestination = {
      val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationSnsDestination]
    }
    
    extension [Self <: EventDestinationSnsDestination](x: Self) {
      
      inline def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiptRuleAddHeaderAction extends StObject {
    
    /**
      * The name of the header to add
      */
    var headerName: Input[String]
    
    /**
      * The value of the header to add
      */
    var headerValue: Input[String]
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Input[Double]
  }
  object ReceiptRuleAddHeaderAction {
    
    inline def apply(headerName: Input[String], headerValue: Input[String], position: Input[Double]): ReceiptRuleAddHeaderAction = {
      val __obj = js.Dynamic.literal(headerName = headerName.asInstanceOf[js.Any], headerValue = headerValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleAddHeaderAction]
    }
    
    extension [Self <: ReceiptRuleAddHeaderAction](x: Self) {
      
      inline def setHeaderName(value: Input[String]): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      inline def setHeaderValue(value: Input[String]): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiptRuleBounceAction extends StObject {
    
    /**
      * The message to send
      */
    var message: Input[String]
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Input[Double]
    
    /**
      * The email address of the sender
      */
    var sender: Input[String]
    
    /**
      * The RFC 5321 SMTP reply code
      */
    var smtpReplyCode: Input[String]
    
    /**
      * The RFC 3463 SMTP enhanced status code
      */
    var statusCode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ReceiptRuleBounceAction {
    
    inline def apply(
      message: Input[String],
      position: Input[Double],
      sender: Input[String],
      smtpReplyCode: Input[String]
    ): ReceiptRuleBounceAction = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleBounceAction]
    }
    
    extension [Self <: ReceiptRuleBounceAction](x: Self) {
      
      inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSender(value: Input[String]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSmtpReplyCode(value: Input[String]): Self = StObject.set(x, "smtpReplyCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  trait ReceiptRuleLambdaAction extends StObject {
    
    /**
      * The ARN of the Lambda function to invoke
      */
    var functionArn: Input[String]
    
    /**
      * Event or RequestResponse
      */
    var invocationType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Input[Double]
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ReceiptRuleLambdaAction {
    
    inline def apply(functionArn: Input[String], position: Input[Double]): ReceiptRuleLambdaAction = {
      val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleLambdaAction]
    }
    
    extension [Self <: ReceiptRuleLambdaAction](x: Self) {
      
      inline def setFunctionArn(value: Input[String]): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
      
      inline def setInvocationType(value: Input[String]): Self = StObject.set(x, "invocationType", value.asInstanceOf[js.Any])
      
      inline def setInvocationTypeUndefined: Self = StObject.set(x, "invocationType", js.undefined)
      
      inline def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  trait ReceiptRuleS3Action extends StObject {
    
    /**
      * The name of the S3 bucket
      */
    var bucketName: Input[String]
    
    /**
      * The ARN of the KMS key
      */
    var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The key prefix of the S3 bucket
      */
    var objectKeyPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Input[Double]
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ReceiptRuleS3Action {
    
    inline def apply(bucketName: Input[String], position: Input[Double]): ReceiptRuleS3Action = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleS3Action]
    }
    
    extension [Self <: ReceiptRuleS3Action](x: Self) {
      
      inline def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      inline def setObjectKeyPrefix(value: Input[String]): Self = StObject.set(x, "objectKeyPrefix", value.asInstanceOf[js.Any])
      
      inline def setObjectKeyPrefixUndefined: Self = StObject.set(x, "objectKeyPrefix", js.undefined)
      
      inline def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  trait ReceiptRuleSnsAction extends StObject {
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Input[Double]
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: Input[String]
  }
  object ReceiptRuleSnsAction {
    
    inline def apply(position: Input[Double], topicArn: Input[String]): ReceiptRuleSnsAction = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleSnsAction]
    }
    
    extension [Self <: ReceiptRuleSnsAction](x: Self) {
      
      inline def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiptRuleStopAction extends StObject {
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Input[Double]
    
    /**
      * The scope to apply
      */
    var scope: Input[String]
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ReceiptRuleStopAction {
    
    inline def apply(position: Input[Double], scope: Input[String]): ReceiptRuleStopAction = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleStopAction]
    }
    
    extension [Self <: ReceiptRuleStopAction](x: Self) {
      
      inline def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  trait ReceiptRuleWorkmailAction extends StObject {
    
    /**
      * The ARN of the WorkMail organization
      */
    var organizationArn: Input[String]
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Input[Double]
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ReceiptRuleWorkmailAction {
    
    inline def apply(organizationArn: Input[String], position: Input[Double]): ReceiptRuleWorkmailAction = {
      val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleWorkmailAction]
    }
    
    extension [Self <: ReceiptRuleWorkmailAction](x: Self) {
      
      inline def setOrganizationArn(value: Input[String]): Self = StObject.set(x, "organizationArn", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
}
