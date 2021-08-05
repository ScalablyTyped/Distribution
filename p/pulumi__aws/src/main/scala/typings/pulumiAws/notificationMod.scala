package typings.pulumiAws

import typings.pulumiAws.enumsAutoscalingMod.NotificationType
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("@pulumi/aws/autoscaling/notification", "Notification")
  @js.native
  class Notification protected () extends CustomResource {
    /**
      * Create a Notification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotificationArgs) = this()
    def this(name: String, args: NotificationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of AutoScaling Group Names
      */
    val groupNames: Output_[js.Array[String]] = js.native
    
    /**
      * A list of Notification Types that trigger
      * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
      */
    val notifications: Output_[js.Array[NotificationType]] = js.native
    
    /**
      * The Topic ARN for notifications to be sent through
      */
    val topicArn: Output_[String] = js.native
  }
  /* static members */
  object Notification {
    
    @JSImport("@pulumi/aws/autoscaling/notification", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Notification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Notification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Notification]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Notification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Notification]
    inline def get(name: String, id: Input[ID], state: NotificationState): Notification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Notification]
    inline def get(name: String, id: Input[ID], state: NotificationState, opts: CustomResourceOptions): Notification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Notification]
    
    /**
      * Returns true if the given object is an instance of Notification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/notification.Notification */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/autoscaling/notification.Notification */ Boolean]
  }
  
  trait NotificationArgs extends StObject {
    
    /**
      * A list of AutoScaling Group Names
      */
    val groupNames: Input[js.Array[Input[String]]]
    
    /**
      * A list of Notification Types that trigger
      * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
      */
    val notifications: Input[js.Array[Input[NotificationType]]]
    
    /**
      * The Topic ARN for notifications to be sent through
      */
    val topicArn: Input[String]
  }
  object NotificationArgs {
    
    inline def apply(
      groupNames: Input[js.Array[Input[String]]],
      notifications: Input[js.Array[Input[NotificationType]]],
      topicArn: Input[String]
    ): NotificationArgs = {
      val __obj = js.Dynamic.literal(groupNames = groupNames.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationArgs]
    }
    
    extension [Self <: NotificationArgs](x: Self) {
      
      inline def setGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groupNames", value.asInstanceOf[js.Any])
      
      inline def setGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "groupNames", js.Array(value :_*))
      
      inline def setNotifications(value: Input[js.Array[Input[NotificationType]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: Input[NotificationType]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      inline def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationState extends StObject {
    
    /**
      * A list of AutoScaling Group Names
      */
    val groupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of Notification Types that trigger
      * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
      */
    val notifications: js.UndefOr[Input[js.Array[Input[NotificationType]]]] = js.undefined
    
    /**
      * The Topic ARN for notifications to be sent through
      */
    val topicArn: js.UndefOr[Input[String]] = js.undefined
  }
  object NotificationState {
    
    inline def apply(): NotificationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationState]
    }
    
    extension [Self <: NotificationState](x: Self) {
      
      inline def setGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groupNames", value.asInstanceOf[js.Any])
      
      inline def setGroupNamesUndefined: Self = StObject.set(x, "groupNames", js.undefined)
      
      inline def setGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "groupNames", js.Array(value :_*))
      
      inline def setNotifications(value: Input[js.Array[Input[NotificationType]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      inline def setNotificationsVarargs(value: Input[NotificationType]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      inline def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
}
