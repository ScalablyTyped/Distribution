package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elbAttachmentMod {
  
  @JSImport("@pulumi/aws/elb/attachment", "Attachment")
  @js.native
  class Attachment protected () extends CustomResource {
    /**
      * Create a Attachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AttachmentArgs) = this()
    def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the ELB.
      */
    val elb: Output_[String] = js.native
    
    /**
      * Instance ID to place in the ELB pool.
      */
    val instance: Output_[String] = js.native
  }
  /* static members */
  object Attachment {
    
    @JSImport("@pulumi/aws/elb/attachment", "Attachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Attachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Attachment]
    inline def get(name: String, id: Input[ID], state: AttachmentState): Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Attachment]
    inline def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): Attachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Attachment]
    
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/attachment.Attachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elb/attachment.Attachment */ Boolean]
  }
  
  trait AttachmentArgs extends StObject {
    
    /**
      * The name of the ELB.
      */
    val elb: Input[String]
    
    /**
      * Instance ID to place in the ELB pool.
      */
    val instance: Input[String]
  }
  object AttachmentArgs {
    
    inline def apply(elb: Input[String], instance: Input[String]): AttachmentArgs = {
      val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachmentArgs]
    }
    
    extension [Self <: AttachmentArgs](x: Self) {
      
      inline def setElb(value: Input[String]): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: Input[String]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttachmentState extends StObject {
    
    /**
      * The name of the ELB.
      */
    val elb: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Instance ID to place in the ELB pool.
      */
    val instance: js.UndefOr[Input[String]] = js.undefined
  }
  object AttachmentState {
    
    inline def apply(): AttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachmentState]
    }
    
    extension [Self <: AttachmentState](x: Self) {
      
      inline def setElb(value: Input[String]): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
      
      inline def setElbUndefined: Self = StObject.set(x, "elb", js.undefined)
      
      inline def setInstance(value: Input[String]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    }
  }
}
