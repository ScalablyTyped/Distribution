package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticIpAttachmentMod {
  
  @JSImport("@pulumi/aws/lightsail/staticIpAttachment", "StaticIpAttachment")
  @js.native
  class StaticIpAttachment protected () extends CustomResource {
    /**
      * Create a StaticIpAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StaticIpAttachmentArgs) = this()
    def this(name: String, args: StaticIpAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the Lightsail instance to attach the IP to
      */
    val instanceName: Output_[String] = js.native
    
    /**
      * The allocated static IP address
      */
    val ipAddress: Output_[String] = js.native
    
    /**
      * The name of the allocated static IP
      */
    val staticIpName: Output_[String] = js.native
  }
  /* static members */
  object StaticIpAttachment {
    
    @JSImport("@pulumi/aws/lightsail/staticIpAttachment", "StaticIpAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StaticIpAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): StaticIpAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[StaticIpAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): StaticIpAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StaticIpAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState): StaticIpAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[StaticIpAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState, opts: CustomResourceOptions): StaticIpAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StaticIpAttachment]
    
    /**
      * Returns true if the given object is an instance of StaticIpAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIpAttachment.StaticIpAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lightsail/staticIpAttachment.StaticIpAttachment */ Boolean]
  }
  
  trait StaticIpAttachmentArgs extends StObject {
    
    /**
      * The name of the Lightsail instance to attach the IP to
      */
    val instanceName: Input[String]
    
    /**
      * The name of the allocated static IP
      */
    val staticIpName: Input[String]
  }
  object StaticIpAttachmentArgs {
    
    @scala.inline
    def apply(instanceName: Input[String], staticIpName: Input[String]): StaticIpAttachmentArgs = {
      val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], staticIpName = staticIpName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticIpAttachmentArgs]
    }
    
    @scala.inline
    implicit class StaticIpAttachmentArgsMutableBuilder[Self <: StaticIpAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstanceName(value: Input[String]): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticIpName(value: Input[String]): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
    }
  }
  
  trait StaticIpAttachmentState extends StObject {
    
    /**
      * The name of the Lightsail instance to attach the IP to
      */
    val instanceName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The allocated static IP address
      */
    val ipAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the allocated static IP
      */
    val staticIpName: js.UndefOr[Input[String]] = js.undefined
  }
  object StaticIpAttachmentState {
    
    @scala.inline
    def apply(): StaticIpAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticIpAttachmentState]
    }
    
    @scala.inline
    implicit class StaticIpAttachmentStateMutableBuilder[Self <: StaticIpAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstanceName(value: Input[String]): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setStaticIpName(value: Input[String]): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticIpNameUndefined: Self = StObject.set(x, "staticIpName", js.undefined)
    }
  }
}
