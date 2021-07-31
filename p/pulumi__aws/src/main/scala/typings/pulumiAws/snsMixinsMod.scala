package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.lambdaMixinsMod.EventHandler
import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiAws.topicMod.Topic
import typings.pulumiAws.topicSubscriptionMod.TopicSubscription
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snsMixinsMod {
  
  @JSImport("@pulumi/aws/sns/snsMixins", "TopicEventSubscription")
  @js.native
  class TopicEventSubscription protected () extends EventSubscription {
    def this(name: String, topic: Topic, handler: TopicEventHandler) = this()
    def this(name: String, topic: Topic, handler: TopicEventHandler, args: TopicEventSubscriptionArgs) = this()
    def this(name: String, topic: Topic, handler: TopicEventHandler, args: Unit, opts: ComponentResourceOptions) = this()
    def this(
      name: String,
      topic: Topic,
      handler: TopicEventHandler,
      args: TopicEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
    
    /**
      * The underlying sns object created for the subscription.
      */
    val subscription: TopicSubscription = js.native
    
    val topic: Topic = js.native
  }
  
  trait SNSItem extends StObject {
    
    var Message: String
    
    var MessageAttributes: StringDictionary[SNSMessageAttribute]
    
    var MessageId: String
    
    var Signature: String
    
    var SignatureVersion: String
    
    var SigningCertUrl: String
    
    var Subject: String
    
    var Timestamp: String
    
    var TopicArn: String
    
    var Type: String
    
    var UnsubscribeUrl: String
  }
  object SNSItem {
    
    @scala.inline
    def apply(
      Message: String,
      MessageAttributes: StringDictionary[SNSMessageAttribute],
      MessageId: String,
      Signature: String,
      SignatureVersion: String,
      SigningCertUrl: String,
      Subject: String,
      Timestamp: String,
      TopicArn: String,
      Type: String,
      UnsubscribeUrl: String
    ): SNSItem = {
      val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], MessageAttributes = MessageAttributes.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SignatureVersion = SignatureVersion.asInstanceOf[js.Any], SigningCertUrl = SigningCertUrl.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UnsubscribeUrl = UnsubscribeUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNSItem]
    }
    
    @scala.inline
    implicit class SNSItemMutableBuilder[Self <: SNSItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageAttributes(value: StringDictionary[SNSMessageAttribute]): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureVersion(value: String): Self = StObject.set(x, "SignatureVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningCertUrl(value: String): Self = StObject.set(x, "SigningCertUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: String): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribeUrl(value: String): Self = StObject.set(x, "UnsubscribeUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait SNSMessageAttribute extends StObject {
    
    var Type: String
    
    var Value: String
  }
  object SNSMessageAttribute {
    
    @scala.inline
    def apply(Type: String, Value: String): SNSMessageAttribute = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNSMessageAttribute]
    }
    
    @scala.inline
    implicit class SNSMessageAttributeMutableBuilder[Self <: SNSMessageAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopicEvent extends StObject {
    
    var Records: js.Array[TopicRecord]
  }
  object TopicEvent {
    
    @scala.inline
    def apply(Records: js.Array[TopicRecord]): TopicEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicEvent]
    }
    
    @scala.inline
    implicit class TopicEventMutableBuilder[Self <: TopicEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[TopicRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: TopicRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type TopicEventHandler = EventHandler[TopicEvent, Unit]
  
  type TopicEventSubscriptionArgs = js.Object
  
  trait TopicRecord extends StObject {
    
    var EventSource: String
    
    var EventSubscriptionArn: String
    
    var EventVersion: String
    
    var Sns: SNSItem
  }
  object TopicRecord {
    
    @scala.inline
    def apply(EventSource: String, EventSubscriptionArn: String, EventVersion: String, Sns: SNSItem): TopicRecord = {
      val __obj = js.Dynamic.literal(EventSource = EventSource.asInstanceOf[js.Any], EventSubscriptionArn = EventSubscriptionArn.asInstanceOf[js.Any], EventVersion = EventVersion.asInstanceOf[js.Any], Sns = Sns.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicRecord]
    }
    
    @scala.inline
    implicit class TopicRecordMutableBuilder[Self <: TopicRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSubscriptionArn(value: String): Self = StObject.set(x, "EventSubscriptionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVersion(value: String): Self = StObject.set(x, "EventVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSns(value: SNSItem): Self = StObject.set(x, "Sns", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object pulumiAwsSnsTopicAugmentingMod {
    
    @js.native
    trait Topic extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Topic to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: TopicEventHandler): TopicEventSubscription = js.native
      def onEvent(name: String, handler: TopicEventHandler, args: Unit, opts: ComponentResourceOptions): TopicEventSubscription = js.native
      def onEvent(name: String, handler: TopicEventHandler, args: TopicEventSubscriptionArgs): TopicEventSubscription = js.native
      def onEvent(
        name: String,
        handler: TopicEventHandler,
        args: TopicEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): TopicEventSubscription = js.native
    }
  }
}
