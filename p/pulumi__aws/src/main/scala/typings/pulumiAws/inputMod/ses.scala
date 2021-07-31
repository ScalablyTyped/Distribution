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
    
    @scala.inline
    def apply(defaultValue: Input[String], dimensionName: Input[String], valueSource: Input[String]): EventDestinationCloudwatchDestination = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], dimensionName = dimensionName.asInstanceOf[js.Any], valueSource = valueSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationCloudwatchDestination]
    }
    
    @scala.inline
    implicit class EventDestinationCloudwatchDestinationMutableBuilder[Self <: EventDestinationCloudwatchDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: Input[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionName(value: Input[String]): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSource(value: Input[String]): Self = StObject.set(x, "valueSource", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(roleArn: Input[String], streamArn: Input[String]): EventDestinationKinesisDestination = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationKinesisDestination]
    }
    
    @scala.inline
    implicit class EventDestinationKinesisDestinationMutableBuilder[Self <: EventDestinationKinesisDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamArn(value: Input[String]): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventDestinationSnsDestination extends StObject {
    
    /**
      * The ARN of the SNS topic
      */
    var topicArn: Input[String]
  }
  object EventDestinationSnsDestination {
    
    @scala.inline
    def apply(topicArn: Input[String]): EventDestinationSnsDestination = {
      val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationSnsDestination]
    }
    
    @scala.inline
    implicit class EventDestinationSnsDestinationMutableBuilder[Self <: EventDestinationSnsDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(headerName: Input[String], headerValue: Input[String], position: Input[Double]): ReceiptRuleAddHeaderAction = {
      val __obj = js.Dynamic.literal(headerName = headerName.asInstanceOf[js.Any], headerValue = headerValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleAddHeaderAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleAddHeaderActionMutableBuilder[Self <: ReceiptRuleAddHeaderAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaderName(value: Input[String]): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderValue(value: Input[String]): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
      message: Input[String],
      position: Input[Double],
      sender: Input[String],
      smtpReplyCode: Input[String]
    ): ReceiptRuleBounceAction = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleBounceAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleBounceActionMutableBuilder[Self <: ReceiptRuleBounceAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSender(value: Input[String]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmtpReplyCode(value: Input[String]): Self = StObject.set(x, "smtpReplyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
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
    
    @scala.inline
    def apply(functionArn: Input[String], position: Input[Double]): ReceiptRuleLambdaAction = {
      val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleLambdaAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleLambdaActionMutableBuilder[Self <: ReceiptRuleLambdaAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionArn(value: Input[String]): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationType(value: Input[String]): Self = StObject.set(x, "invocationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationTypeUndefined: Self = StObject.set(x, "invocationType", js.undefined)
      
      @scala.inline
      def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
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
    
    @scala.inline
    def apply(bucketName: Input[String], position: Input[Double]): ReceiptRuleS3Action = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleS3Action]
    }
    
    @scala.inline
    implicit class ReceiptRuleS3ActionMutableBuilder[Self <: ReceiptRuleS3Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setObjectKeyPrefix(value: Input[String]): Self = StObject.set(x, "objectKeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectKeyPrefixUndefined: Self = StObject.set(x, "objectKeyPrefix", js.undefined)
      
      @scala.inline
      def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
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
    
    @scala.inline
    def apply(position: Input[Double], topicArn: Input[String]): ReceiptRuleSnsAction = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleSnsAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleSnsActionMutableBuilder[Self <: ReceiptRuleSnsAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(position: Input[Double], scope: Input[String]): ReceiptRuleStopAction = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleStopAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleStopActionMutableBuilder[Self <: ReceiptRuleStopAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
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
    
    @scala.inline
    def apply(organizationArn: Input[String], position: Input[Double]): ReceiptRuleWorkmailAction = {
      val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleWorkmailAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleWorkmailActionMutableBuilder[Self <: ReceiptRuleWorkmailAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrganizationArn(value: Input[String]): Self = StObject.set(x, "organizationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Input[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
}
