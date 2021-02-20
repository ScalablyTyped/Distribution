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
    
    /**
      * Get an existing PrincipalAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ram/principalAssociation", "PrincipalAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): PrincipalAssociation = js.native
    @JSImport("@pulumi/aws/ram/principalAssociation", "PrincipalAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PrincipalAssociation = js.native
    @JSImport("@pulumi/aws/ram/principalAssociation", "PrincipalAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: PrincipalAssociationState): PrincipalAssociation = js.native
    @JSImport("@pulumi/aws/ram/principalAssociation", "PrincipalAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: PrincipalAssociationState, opts: CustomResourceOptions): PrincipalAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of PrincipalAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ram/principalAssociation", "PrincipalAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/principalAssociation.PrincipalAssociation */ Boolean = js.native
  }
  
  @js.native
  trait PrincipalAssociationArgs extends StObject {
    
    /**
      * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
      */
    val principal: Input[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val resourceShareArn: Input[String] = js.native
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
  
  @js.native
  trait PrincipalAssociationState extends StObject {
    
    /**
      * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
      */
    val principal: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val resourceShareArn: js.UndefOr[Input[String]] = js.native
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
