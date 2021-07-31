package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/macie/memberAccountAssociation", "MemberAccountAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MemberAccountAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): MemberAccountAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[MemberAccountAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): MemberAccountAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MemberAccountAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState): MemberAccountAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[MemberAccountAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState, opts: CustomResourceOptions): MemberAccountAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MemberAccountAssociation]
    
    /**
      * Returns true if the given object is an instance of MemberAccountAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/memberAccountAssociation.MemberAccountAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/macie/memberAccountAssociation.MemberAccountAssociation */ Boolean]
  }
  
  trait MemberAccountAssociationArgs extends StObject {
    
    /**
      * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
      */
    val memberAccountId: Input[String]
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
  
  trait MemberAccountAssociationState extends StObject {
    
    /**
      * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
      */
    val memberAccountId: js.UndefOr[Input[String]] = js.undefined
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
