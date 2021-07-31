package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object principalAssociationMod {
  
  @JSImport("@pulumi/aws/ram/principalAssociation", "PrincipalAssociation")
  @js.native
  class PrincipalAssociation protected () extends CustomResource {
    /**
      * Create a PrincipalAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PrincipalAssociationArgs) = this()
    def this(name: String, args: PrincipalAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
      */
    val principal: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val resourceShareArn: Output_[String] = js.native
  }
  /* static members */
  object PrincipalAssociation {
    
    @JSImport("@pulumi/aws/ram/principalAssociation", "PrincipalAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PrincipalAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): PrincipalAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PrincipalAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): PrincipalAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PrincipalAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: PrincipalAssociationState): PrincipalAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PrincipalAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: PrincipalAssociationState, opts: CustomResourceOptions): PrincipalAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PrincipalAssociation]
    
    /**
      * Returns true if the given object is an instance of PrincipalAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/principalAssociation.PrincipalAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ram/principalAssociation.PrincipalAssociation */ Boolean]
  }
  
  trait PrincipalAssociationArgs extends StObject {
    
    /**
      * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
      */
    val principal: Input[String]
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val resourceShareArn: Input[String]
  }
  object PrincipalAssociationArgs {
    
    @scala.inline
    def apply(principal: Input[String], resourceShareArn: Input[String]): PrincipalAssociationArgs = {
      val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrincipalAssociationArgs]
    }
    
    @scala.inline
    implicit class PrincipalAssociationArgsMutableBuilder[Self <: PrincipalAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrincipal(value: Input[String]): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceShareArn(value: Input[String]): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrincipalAssociationState extends StObject {
    
    /**
      * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
      */
    val principal: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val resourceShareArn: js.UndefOr[Input[String]] = js.undefined
  }
  object PrincipalAssociationState {
    
    @scala.inline
    def apply(): PrincipalAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrincipalAssociationState]
    }
    
    @scala.inline
    implicit class PrincipalAssociationStateMutableBuilder[Self <: PrincipalAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrincipal(value: Input[String]): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
      
      @scala.inline
      def setResourceShareArn(value: Input[String]): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    }
  }
}
