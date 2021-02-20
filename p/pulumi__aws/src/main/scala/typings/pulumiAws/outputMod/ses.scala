package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ses {
  
  @js.native
  trait EventDestinationCloudwatchDestination extends StObject {
    
    /**
      * The default value for the event
      */
    var defaultValue: String = js.native
    
    /**
      * The name for the dimension
      */
    var dimensionName: String = js.native
    
    /**
      * The source for the value. It can be either `"messageTag"` or `"emailHeader"`
      */
    var valueSource: String = js.native
  }
  object EventDestinationCloudwatchDestination {
    
    @scala.inline
    def apply(defaultValue: String, dimensionName: String, valueSource: String): EventDestinationCloudwatchDestination = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], dimensionName = dimensionName.asInstanceOf[js.Any], valueSource = valueSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationCloudwatchDestination]
    }
    
    @scala.inline
    implicit class EventDestinationCloudwatchDestinationMutableBuilder[Self <: EventDestinationCloudwatchDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSource(value: String): Self = StObject.set(x, "valueSource", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventDestinationKinesisDestination extends StObject {
    
    /**
      * The ARN of the role that has permissions to access the Kinesis Stream
      */
    var roleArn: String = js.native
    
    /**
      * The ARN of the Kinesis Stream
      */
    var streamArn: String = js.native
  }
  object EventDestinationKinesisDestination {
    
    @scala.inline
    def apply(roleArn: String, streamArn: String): EventDestinationKinesisDestination = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationKinesisDestination]
    }
    
    @scala.inline
    implicit class EventDestinationKinesisDestinationMutableBuilder[Self <: EventDestinationKinesisDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamArn(value: String): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventDestinationSnsDestination extends StObject {
    
    /**
      * The ARN of the SNS topic
      */
    var topicArn: String = js.native
  }
  object EventDestinationSnsDestination {
    
    @scala.inline
    def apply(topicArn: String): EventDestinationSnsDestination = {
      val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationSnsDestination]
    }
    
    @scala.inline
    implicit class EventDestinationSnsDestinationMutableBuilder[Self <: EventDestinationSnsDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReceiptRuleAddHeaderAction extends StObject {
    
    /**
      * The name of the header to add
      */
    var headerName: String = js.native
    
    /**
      * The value of the header to add
      */
    var headerValue: String = js.native
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double = js.native
  }
  object ReceiptRuleAddHeaderAction {
    
    @scala.inline
    def apply(headerName: String, headerValue: String, position: Double): ReceiptRuleAddHeaderAction = {
      val __obj = js.Dynamic.literal(headerName = headerName.asInstanceOf[js.Any], headerValue = headerValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleAddHeaderAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleAddHeaderActionMutableBuilder[Self <: ReceiptRuleAddHeaderAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderValue(value: String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReceiptRuleBounceAction extends StObject {
    
    /**
      * The message to send
      */
    var message: String = js.native
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double = js.native
    
    /**
      * The email address of the sender
      */
    var sender: String = js.native
    
    /**
      * The RFC 5321 SMTP reply code
      */
    var smtpReplyCode: String = js.native
    
    /**
      * The RFC 3463 SMTP enhanced status code
      */
    var statusCode: js.UndefOr[String] = js.native
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.native
  }
  object ReceiptRuleBounceAction {
    
    @scala.inline
    def apply(message: String, position: Double, sender: String, smtpReplyCode: String): ReceiptRuleBounceAction = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleBounceAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleBounceActionMutableBuilder[Self <: ReceiptRuleBounceAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmtpReplyCode(value: String): Self = StObject.set(x, "smtpReplyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  @js.native
  trait ReceiptRuleLambdaAction extends StObject {
    
    /**
      * The ARN of the Lambda function to invoke
      */
    var functionArn: String = js.native
    
    /**
      * Event or RequestResponse
      */
    var invocationType: String = js.native
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double = js.native
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.native
  }
  object ReceiptRuleLambdaAction {
    
    @scala.inline
    def apply(functionArn: String, invocationType: String, position: Double): ReceiptRuleLambdaAction = {
      val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], invocationType = invocationType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleLambdaAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleLambdaActionMutableBuilder[Self <: ReceiptRuleLambdaAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationType(value: String): Self = StObject.set(x, "invocationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  @js.native
  trait ReceiptRuleS3Action extends StObject {
    
    /**
      * The name of the S3 bucket
      */
    var bucketName: String = js.native
    
    /**
      * The ARN of the KMS key
      */
    var kmsKeyArn: js.UndefOr[String] = js.native
    
    /**
      * The key prefix of the S3 bucket
      */
    var objectKeyPrefix: js.UndefOr[String] = js.native
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double = js.native
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.native
  }
  object ReceiptRuleS3Action {
    
    @scala.inline
    def apply(bucketName: String, position: Double): ReceiptRuleS3Action = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleS3Action]
    }
    
    @scala.inline
    implicit class ReceiptRuleS3ActionMutableBuilder[Self <: ReceiptRuleS3Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      @scala.inline
      def setObjectKeyPrefix(value: String): Self = StObject.set(x, "objectKeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectKeyPrefixUndefined: Self = StObject.set(x, "objectKeyPrefix", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  @js.native
  trait ReceiptRuleSnsAction extends StObject {
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double = js.native
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: String = js.native
  }
  object ReceiptRuleSnsAction {
    
    @scala.inline
    def apply(position: Double, topicArn: String): ReceiptRuleSnsAction = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleSnsAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleSnsActionMutableBuilder[Self <: ReceiptRuleSnsAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReceiptRuleStopAction extends StObject {
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double = js.native
    
    /**
      * The scope to apply
      */
    var scope: String = js.native
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.native
  }
  object ReceiptRuleStopAction {
    
    @scala.inline
    def apply(position: Double, scope: String): ReceiptRuleStopAction = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleStopAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleStopActionMutableBuilder[Self <: ReceiptRuleStopAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  @js.native
  trait ReceiptRuleWorkmailAction extends StObject {
    
    /**
      * The ARN of the WorkMail organization
      */
    var organizationArn: String = js.native
    
    /**
      * The position of the action in the receipt rule
      */
    var position: Double = js.native
    
    /**
      * The ARN of an SNS topic to notify
      */
    var topicArn: js.UndefOr[String] = js.native
  }
  object ReceiptRuleWorkmailAction {
    
    @scala.inline
    def apply(organizationArn: String, position: Double): ReceiptRuleWorkmailAction = {
      val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleWorkmailAction]
    }
    
    @scala.inline
    implicit class ReceiptRuleWorkmailActionMutableBuilder[Self <: ReceiptRuleWorkmailAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrganizationArn(value: String): Self = StObject.set(x, "organizationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
}
