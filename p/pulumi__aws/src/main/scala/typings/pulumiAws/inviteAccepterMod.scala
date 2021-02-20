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

object inviteAccepterMod {
  
  @JSImport("@pulumi/aws/guardduty/inviteAccepter", "InviteAccepter")
  @js.native
  class InviteAccepter protected () extends CustomResource {
    /**
      * Create a InviteAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InviteAccepterArgs) = this()
    def this(name: String, args: InviteAccepterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The detector ID of the member GuardDuty account.
      */
    val detectorId: Output_[String] = js.native
    
    /**
      * AWS account ID for primary account.
      */
    val masterAccountId: Output_[String] = js.native
  }
  /* static members */
  object InviteAccepter {
    
    /**
      * Get an existing InviteAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty/inviteAccepter", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): InviteAccepter = js.native
    @JSImport("@pulumi/aws/guardduty/inviteAccepter", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): InviteAccepter = js.native
    @JSImport("@pulumi/aws/guardduty/inviteAccepter", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState): InviteAccepter = js.native
    @JSImport("@pulumi/aws/guardduty/inviteAccepter", "InviteAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: InviteAccepterState, opts: CustomResourceOptions): InviteAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of InviteAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty/inviteAccepter", "InviteAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/inviteAccepter.InviteAccepter */ Boolean = js.native
  }
  
  @js.native
  trait InviteAccepterArgs extends StObject {
    
    /**
      * The detector ID of the member GuardDuty account.
      */
    val detectorId: Input[String] = js.native
    
    /**
      * AWS account ID for primary account.
      */
    val masterAccountId: Input[String] = js.native
  }
  object InviteAccepterArgs {
    
    @scala.inline
    def apply(detectorId: Input[String], masterAccountId: Input[String]): InviteAccepterArgs = {
      val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], masterAccountId = masterAccountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InviteAccepterArgs]
    }
    
    @scala.inline
    implicit class InviteAccepterArgsMutableBuilder[Self <: InviteAccepterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterAccountId(value: Input[String]): Self = StObject.set(x, "masterAccountId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InviteAccepterState extends StObject {
    
    /**
      * The detector ID of the member GuardDuty account.
      */
    val detectorId: js.UndefOr[Input[String]] = js.native
    
    /**
      * AWS account ID for primary account.
      */
    val masterAccountId: js.UndefOr[Input[String]] = js.native
  }
  object InviteAccepterState {
    
    @scala.inline
    def apply(): InviteAccepterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviteAccepterState]
    }
    
    @scala.inline
    implicit class InviteAccepterStateMutableBuilder[Self <: InviteAccepterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
      
      @scala.inline
      def setMasterAccountId(value: Input[String]): Self = StObject.set(x, "masterAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterAccountIdUndefined: Self = StObject.set(x, "masterAccountId", js.undefined)
    }
  }
}
