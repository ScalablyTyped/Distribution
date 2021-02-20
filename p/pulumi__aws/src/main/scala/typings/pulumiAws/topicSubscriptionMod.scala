package typings.pulumiAws

import typings.pulumiAws.snsMod.Topic
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topicSubscriptionMod {
  
  @JSImport("@pulumi/aws/sns/topicSubscription", "TopicSubscription")
  @js.native
  class TopicSubscription protected () extends CustomResource {
    /**
      * Create a TopicSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TopicSubscriptionArgs) = this()
    def this(name: String, args: TopicSubscriptionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the subscription stored as a more user-friendly property
      */
    val arn: Output_[String] = js.native
    
    /**
      * Integer indicating number of minutes to wait in retying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols (default is 1 minute).
      */
    val confirmationTimeoutInMinutes: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
      */
    val deliveryPolicy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The endpoint to send data to, the contents will vary with the protocol. (see below for more information)
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * Boolean indicating whether the end point is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) e.g., PagerDuty (default is false)
      */
    val endpointAutoConfirms: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
      */
    val filterPolicy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The protocol to use. The possible values for this are: `sqs`, `sms`, `lambda`, `application`. (`http` or `https` are partially supported, see below) (`email` is an option but is unsupported, see below).
      */
    val protocol: Output_[String] = js.native
    
    /**
      * Boolean indicating whether or not to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property) (default is false).
      */
    val rawMessageDelivery: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ARN of the SNS topic to subscribe to
      */
    val topic: Output_[String] = js.native
  }
  /* static members */
  object TopicSubscription {
    
    /**
      * Get an existing TopicSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sns/topicSubscription", "TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): TopicSubscription = js.native
    @JSImport("@pulumi/aws/sns/topicSubscription", "TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TopicSubscription = js.native
    @JSImport("@pulumi/aws/sns/topicSubscription", "TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicSubscriptionState): TopicSubscription = js.native
    @JSImport("@pulumi/aws/sns/topicSubscription", "TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicSubscriptionState, opts: CustomResourceOptions): TopicSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of TopicSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sns/topicSubscription", "TopicSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicSubscription.TopicSubscription */ Boolean = js.native
  }
  
  @js.native
  trait TopicSubscriptionArgs extends StObject {
    
    /**
      * Integer indicating number of minutes to wait in retying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols (default is 1 minute).
      */
    val confirmationTimeoutInMinutes: js.UndefOr[Input[Double]] = js.native
    
    /**
      * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
      */
    val deliveryPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The endpoint to send data to, the contents will vary with the protocol. (see below for more information)
      */
    val endpoint: Input[String] = js.native
    
    /**
      * Boolean indicating whether the end point is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) e.g., PagerDuty (default is false)
      */
    val endpointAutoConfirms: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
      */
    val filterPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The protocol to use. The possible values for this are: `sqs`, `sms`, `lambda`, `application`. (`http` or `https` are partially supported, see below) (`email` is an option but is unsupported, see below).
      */
    val protocol: Input[String] = js.native
    
    /**
      * Boolean indicating whether or not to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property) (default is false).
      */
    val rawMessageDelivery: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN of the SNS topic to subscribe to
      */
    val topic: Input[String | Topic] = js.native
  }
  object TopicSubscriptionArgs {
    
    @scala.inline
    def apply(endpoint: Input[String], protocol: Input[String], topic: Input[String | Topic]): TopicSubscriptionArgs = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicSubscriptionArgs]
    }
    
    @scala.inline
    implicit class TopicSubscriptionArgsMutableBuilder[Self <: TopicSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmationTimeoutInMinutes(value: Input[Double]): Self = StObject.set(x, "confirmationTimeoutInMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmationTimeoutInMinutesUndefined: Self = StObject.set(x, "confirmationTimeoutInMinutes", js.undefined)
      
      @scala.inline
      def setDeliveryPolicy(value: Input[String]): Self = StObject.set(x, "deliveryPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryPolicyUndefined: Self = StObject.set(x, "deliveryPolicy", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointAutoConfirms(value: Input[Boolean]): Self = StObject.set(x, "endpointAutoConfirms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointAutoConfirmsUndefined: Self = StObject.set(x, "endpointAutoConfirms", js.undefined)
      
      @scala.inline
      def setFilterPolicy(value: Input[String]): Self = StObject.set(x, "filterPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPolicyUndefined: Self = StObject.set(x, "filterPolicy", js.undefined)
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawMessageDelivery(value: Input[Boolean]): Self = StObject.set(x, "rawMessageDelivery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawMessageDeliveryUndefined: Self = StObject.set(x, "rawMessageDelivery", js.undefined)
      
      @scala.inline
      def setTopic(value: Input[String | Topic]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TopicSubscriptionState extends StObject {
    
    /**
      * The ARN of the subscription stored as a more user-friendly property
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Integer indicating number of minutes to wait in retying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols (default is 1 minute).
      */
    val confirmationTimeoutInMinutes: js.UndefOr[Input[Double]] = js.native
    
    /**
      * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
      */
    val deliveryPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The endpoint to send data to, the contents will vary with the protocol. (see below for more information)
      */
    val endpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean indicating whether the end point is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) e.g., PagerDuty (default is false)
      */
    val endpointAutoConfirms: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
      */
    val filterPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The protocol to use. The possible values for this are: `sqs`, `sms`, `lambda`, `application`. (`http` or `https` are partially supported, see below) (`email` is an option but is unsupported, see below).
      */
    val protocol: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean indicating whether or not to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property) (default is false).
      */
    val rawMessageDelivery: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN of the SNS topic to subscribe to
      */
    val topic: js.UndefOr[Input[String | Topic]] = js.native
  }
  object TopicSubscriptionState {
    
    @scala.inline
    def apply(): TopicSubscriptionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TopicSubscriptionState]
    }
    
    @scala.inline
    implicit class TopicSubscriptionStateMutableBuilder[Self <: TopicSubscriptionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setConfirmationTimeoutInMinutes(value: Input[Double]): Self = StObject.set(x, "confirmationTimeoutInMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmationTimeoutInMinutesUndefined: Self = StObject.set(x, "confirmationTimeoutInMinutes", js.undefined)
      
      @scala.inline
      def setDeliveryPolicy(value: Input[String]): Self = StObject.set(x, "deliveryPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryPolicyUndefined: Self = StObject.set(x, "deliveryPolicy", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointAutoConfirms(value: Input[Boolean]): Self = StObject.set(x, "endpointAutoConfirms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointAutoConfirmsUndefined: Self = StObject.set(x, "endpointAutoConfirms", js.undefined)
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setFilterPolicy(value: Input[String]): Self = StObject.set(x, "filterPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPolicyUndefined: Self = StObject.set(x, "filterPolicy", js.undefined)
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRawMessageDelivery(value: Input[Boolean]): Self = StObject.set(x, "rawMessageDelivery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawMessageDeliveryUndefined: Self = StObject.set(x, "rawMessageDelivery", js.undefined)
      
      @scala.inline
      def setTopic(value: Input[String | Topic]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
}
