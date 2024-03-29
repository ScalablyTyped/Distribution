package typings.pulumiAws

import typings.pulumiAws.arnMod.ARN
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thingPrincipalAttachmentMod {
  
  @JSImport("@pulumi/aws/iot/thingPrincipalAttachment", "ThingPrincipalAttachment")
  @js.native
  class ThingPrincipalAttachment protected () extends CustomResource {
    /**
      * Create a ThingPrincipalAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ThingPrincipalAttachmentArgs) = this()
    def this(name: String, args: ThingPrincipalAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
      */
    val principal: Output_[ARN] = js.native
    
    /**
      * The name of the thing.
      */
    val thing: Output_[String] = js.native
  }
  /* static members */
  object ThingPrincipalAttachment {
    
    @JSImport("@pulumi/aws/iot/thingPrincipalAttachment", "ThingPrincipalAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ThingPrincipalAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ThingPrincipalAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ThingPrincipalAttachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ThingPrincipalAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThingPrincipalAttachment]
    inline def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState): ThingPrincipalAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ThingPrincipalAttachment]
    inline def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState, opts: CustomResourceOptions): ThingPrincipalAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThingPrincipalAttachment]
    
    /**
      * Returns true if the given object is an instance of ThingPrincipalAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ Boolean]
  }
  
  trait ThingPrincipalAttachmentArgs extends StObject {
    
    /**
      * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
      */
    val principal: Input[ARN]
    
    /**
      * The name of the thing.
      */
    val thing: Input[String]
  }
  object ThingPrincipalAttachmentArgs {
    
    extension [Self <: ThingPrincipalAttachmentArgs](x: Self) {
      
      inline def setPrincipal(value: Input[ARN]): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
      
      inline def setThing(value: Input[String]): Self = StObject.set(x, "thing", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThingPrincipalAttachmentState extends StObject {
    
    /**
      * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
      */
    val principal: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * The name of the thing.
      */
    val thing: js.UndefOr[Input[String]] = js.undefined
  }
  object ThingPrincipalAttachmentState {
    
    inline def apply(): ThingPrincipalAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingPrincipalAttachmentState]
    }
    
    extension [Self <: ThingPrincipalAttachmentState](x: Self) {
      
      inline def setPrincipal(value: Input[ARN]): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
      
      inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
      
      inline def setThing(value: Input[String]): Self = StObject.set(x, "thing", value.asInstanceOf[js.Any])
      
      inline def setThingUndefined: Self = StObject.set(x, "thing", js.undefined)
    }
  }
}
