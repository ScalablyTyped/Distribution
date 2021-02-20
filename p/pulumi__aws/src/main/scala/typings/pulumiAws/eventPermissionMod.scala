package typings.pulumiAws

import typings.pulumiAws.outputMod.cloudwatch.EventPermissionCondition
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventPermissionMod {
  
  @JSImport("@pulumi/aws/cloudwatch/eventPermission", "EventPermission")
  @js.native
  class EventPermission protected () extends CustomResource {
    /**
      * Create a EventPermission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventPermissionArgs) = this()
    def this(name: String, args: EventPermissionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
      */
    val action: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
      */
    val condition: Output_[js.UndefOr[EventPermissionCondition]] = js.native
    
    /**
      * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
      */
    val eventBusName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
      */
    val principal: Output_[String] = js.native
    
    /**
      * An identifier string for the external account that you are granting permissions to.
      */
    val statementId: Output_[String] = js.native
  }
  /* static members */
  object EventPermission {
    
    /**
      * Get an existing EventPermission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/eventPermission", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID]): EventPermission = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventPermission", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EventPermission = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventPermission", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventPermissionState): EventPermission = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventPermission", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventPermissionState, opts: CustomResourceOptions): EventPermission = js.native
    
    /**
      * Returns true if the given object is an instance of EventPermission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/eventPermission", "EventPermission.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventPermission.EventPermission */ Boolean = js.native
  }
  
  @js.native
  trait EventPermissionArgs extends StObject {
    
    /**
      * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
      */
    val action: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
      */
    val condition: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventPermissionCondition]] = js.native
    
    /**
      * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
      */
    val eventBusName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
      */
    val principal: Input[String] = js.native
    
    /**
      * An identifier string for the external account that you are granting permissions to.
      */
    val statementId: Input[String] = js.native
  }
  object EventPermissionArgs {
    
    @scala.inline
    def apply(principal: Input[String], statementId: Input[String]): EventPermissionArgs = {
      val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], statementId = statementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPermissionArgs]
    }
    
    @scala.inline
    implicit class EventPermissionArgsMutableBuilder[Self <: EventPermissionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCondition(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventPermissionCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setEventBusName(value: Input[String]): Self = StObject.set(x, "eventBusName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventBusNameUndefined: Self = StObject.set(x, "eventBusName", js.undefined)
      
      @scala.inline
      def setPrincipal(value: Input[String]): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementId(value: Input[String]): Self = StObject.set(x, "statementId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventPermissionState extends StObject {
    
    /**
      * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
      */
    val action: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
      */
    val condition: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventPermissionCondition]] = js.native
    
    /**
      * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
      */
    val eventBusName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
      */
    val principal: js.UndefOr[Input[String]] = js.native
    
    /**
      * An identifier string for the external account that you are granting permissions to.
      */
    val statementId: js.UndefOr[Input[String]] = js.native
  }
  object EventPermissionState {
    
    @scala.inline
    def apply(): EventPermissionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventPermissionState]
    }
    
    @scala.inline
    implicit class EventPermissionStateMutableBuilder[Self <: EventPermissionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCondition(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventPermissionCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setEventBusName(value: Input[String]): Self = StObject.set(x, "eventBusName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventBusNameUndefined: Self = StObject.set(x, "eventBusName", js.undefined)
      
      @scala.inline
      def setPrincipal(value: Input[String]): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
      
      @scala.inline
      def setStatementId(value: Input[String]): Self = StObject.set(x, "statementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementIdUndefined: Self = StObject.set(x, "statementId", js.undefined)
    }
  }
}
