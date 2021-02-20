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

object memberAccountAssociationMod {
  
  @JSImport("@pulumi/aws/macie/memberAccountAssociation", "MemberAccountAssociation")
  @js.native
  class MemberAccountAssociation protected () extends CustomResource {
    /**
      * Create a MemberAccountAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemberAccountAssociationArgs) = this()
    def this(name: String, args: MemberAccountAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
      */
    val memberAccountId: Output_[String] = js.native
  }
  /* static members */
  object MemberAccountAssociation {
    
    /**
      * Get an existing MemberAccountAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/macie/memberAccountAssociation", "MemberAccountAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): MemberAccountAssociation = js.native
    @JSImport("@pulumi/aws/macie/memberAccountAssociation", "MemberAccountAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MemberAccountAssociation = js.native
    @JSImport("@pulumi/aws/macie/memberAccountAssociation", "MemberAccountAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState): MemberAccountAssociation = js.native
    @JSImport("@pulumi/aws/macie/memberAccountAssociation", "MemberAccountAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState, opts: CustomResourceOptions): MemberAccountAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of MemberAccountAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/macie/memberAccountAssociation", "MemberAccountAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/memberAccountAssociation.MemberAccountAssociation */ Boolean = js.native
  }
  
  @js.native
  trait MemberAccountAssociationArgs extends StObject {
    
    /**
      * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
      */
    val memberAccountId: Input[String] = js.native
  }
  object MemberAccountAssociationArgs {
    
    @scala.inline
    def apply(memberAccountId: Input[String]): MemberAccountAssociationArgs = {
      val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberAccountAssociationArgs]
    }
    
    @scala.inline
    implicit class MemberAccountAssociationArgsMutableBuilder[Self <: MemberAccountAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMemberAccountId(value: Input[String]): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MemberAccountAssociationState extends StObject {
    
    /**
      * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
      */
    val memberAccountId: js.UndefOr[Input[String]] = js.native
  }
  object MemberAccountAssociationState {
    
    @scala.inline
    def apply(): MemberAccountAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberAccountAssociationState]
    }
    
    @scala.inline
    implicit class MemberAccountAssociationStateMutableBuilder[Self <: MemberAccountAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMemberAccountId(value: Input[String]): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberAccountIdUndefined: Self = StObject.set(x, "memberAccountId", js.undefined)
    }
  }
}
