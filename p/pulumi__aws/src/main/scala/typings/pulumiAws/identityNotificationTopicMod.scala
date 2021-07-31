package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityNotificationTopicMod {
  
  @JSImport("@pulumi/aws/ses/identityNotificationTopic", "IdentityNotificationTopic")
  @js.native
  class IdentityNotificationTopic protected () extends CustomResource {
    /**
      * Create a IdentityNotificationTopic resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityNotificationTopicArgs) = this()
    def this(name: String, args: IdentityNotificationTopicArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
      */
    val identity: Output_[String] = js.native
    
    /**
      * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
      */
    val includeOriginalHeaders: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
      */
    val notificationType: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
      */
    val topicArn: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object IdentityNotificationTopic {
    
    @JSImport("@pulumi/aws/ses/identityNotificationTopic", "IdentityNotificationTopic")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IdentityNotificationTopic resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): IdentityNotificationTopic = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[IdentityNotificationTopic]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): IdentityNotificationTopic = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IdentityNotificationTopic]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState): IdentityNotificationTopic = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IdentityNotificationTopic]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState, opts: CustomResourceOptions): IdentityNotificationTopic = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IdentityNotificationTopic]
    
    /**
      * Returns true if the given object is an instance of IdentityNotificationTopic.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityNotificationTopic.IdentityNotificationTopic */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/identityNotificationTopic.IdentityNotificationTopic */ Boolean]
  }
  
  trait IdentityNotificationTopicArgs extends StObject {
    
    /**
      * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
      */
    val identity: Input[String]
    
    /**
      * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
      */
    val includeOriginalHeaders: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
      */
    val notificationType: Input[String]
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
      */
    val topicArn: js.UndefOr[Input[String]] = js.undefined
  }
  object IdentityNotificationTopicArgs {
    
    @scala.inline
    def apply(identity: Input[String], notificationType: Input[String]): IdentityNotificationTopicArgs = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityNotificationTopicArgs]
    }
    
    @scala.inline
    implicit class IdentityNotificationTopicArgsMutableBuilder[Self <: IdentityNotificationTopicArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Input[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeOriginalHeaders(value: Input[Boolean]): Self = StObject.set(x, "includeOriginalHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeOriginalHeadersUndefined: Self = StObject.set(x, "includeOriginalHeaders", js.undefined)
      
      @scala.inline
      def setNotificationType(value: Input[String]): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
  
  trait IdentityNotificationTopicState extends StObject {
    
    /**
      * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
      */
    val identity: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
      */
    val includeOriginalHeaders: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
      */
    val notificationType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
      */
    val topicArn: js.UndefOr[Input[String]] = js.undefined
  }
  object IdentityNotificationTopicState {
    
    @scala.inline
    def apply(): IdentityNotificationTopicState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityNotificationTopicState]
    }
    
    @scala.inline
    implicit class IdentityNotificationTopicStateMutableBuilder[Self <: IdentityNotificationTopicState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Input[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      @scala.inline
      def setIncludeOriginalHeaders(value: Input[Boolean]): Self = StObject.set(x, "includeOriginalHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeOriginalHeadersUndefined: Self = StObject.set(x, "includeOriginalHeaders", js.undefined)
      
      @scala.inline
      def setNotificationType(value: Input[String]): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
}
