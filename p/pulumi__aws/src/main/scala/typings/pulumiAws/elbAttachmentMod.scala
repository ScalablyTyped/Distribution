package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb/attachment", "Attachment.get")
    @js.native
    def get(name: String, id: Input[ID]): Attachment = js.native
    @JSImport("@pulumi/aws/elb/attachment", "Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Attachment = js.native
    @JSImport("@pulumi/aws/elb/attachment", "Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: AttachmentState): Attachment = js.native
    @JSImport("@pulumi/aws/elb/attachment", "Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): Attachment = js.native
    
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb/attachment", "Attachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/attachment.Attachment */ Boolean = js.native
  }
  
  @js.native
  trait AttachmentArgs extends StObject {
    
    /**
      * The name of the ELB.
      */
    val elb: Input[String] = js.native
    
    /**
      * Instance ID to place in the ELB pool.
      */
    val instance: Input[String] = js.native
  }
  object AttachmentArgs {
    
    @scala.inline
    def apply(elb: Input[String], instance: Input[String]): AttachmentArgs = {
      val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachmentArgs]
    }
    
    @scala.inline
    implicit class AttachmentArgsMutableBuilder[Self <: AttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElb(value: Input[String]): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstance(value: Input[String]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AttachmentState extends StObject {
    
    /**
      * The name of the ELB.
      */
    val elb: js.UndefOr[Input[String]] = js.native
    
    /**
      * Instance ID to place in the ELB pool.
      */
    val instance: js.UndefOr[Input[String]] = js.native
  }
  object AttachmentState {
    
    @scala.inline
    def apply(): AttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachmentState]
    }
    
    @scala.inline
    implicit class AttachmentStateMutableBuilder[Self <: AttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElb(value: Input[String]): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElbUndefined: Self = StObject.set(x, "elb", js.undefined)
      
      @scala.inline
      def setInstance(value: Input[String]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    }
  }
}
