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

object vpcEndpointServiceAllowedPrincipleMod {
  
  @JSImport("@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple", "VpcEndpointServiceAllowedPrinciple")
  @js.native
  class VpcEndpointServiceAllowedPrinciple protected () extends CustomResource {
    /**
      * Create a VpcEndpointServiceAllowedPrinciple resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcEndpointServiceAllowedPrincipleArgs) = this()
    def this(name: String, args: VpcEndpointServiceAllowedPrincipleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the principal to allow permissions.
      */
    val principalArn: Output_[String] = js.native
    
    /**
      * The ID of the VPC endpoint service to allow permission.
      */
    val vpcEndpointServiceId: Output_[String] = js.native
  }
  /* static members */
  object VpcEndpointServiceAllowedPrinciple {
    
    /**
      * Get an existing VpcEndpointServiceAllowedPrinciple resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple", "VpcEndpointServiceAllowedPrinciple.get")
    @js.native
    def get(name: String, id: Input[ID]): VpcEndpointServiceAllowedPrinciple = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple", "VpcEndpointServiceAllowedPrinciple.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcEndpointServiceAllowedPrinciple = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple", "VpcEndpointServiceAllowedPrinciple.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcEndpointServiceAllowedPrincipleState): VpcEndpointServiceAllowedPrinciple = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple", "VpcEndpointServiceAllowedPrinciple.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: VpcEndpointServiceAllowedPrincipleState,
      opts: CustomResourceOptions
    ): VpcEndpointServiceAllowedPrinciple = js.native
    
    /**
      * Returns true if the given object is an instance of VpcEndpointServiceAllowedPrinciple.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple", "VpcEndpointServiceAllowedPrinciple.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple.VpcEndpointServiceAllowedPrinciple */ Boolean = js.native
  }
  
  @js.native
  trait VpcEndpointServiceAllowedPrincipleArgs extends StObject {
    
    /**
      * The ARN of the principal to allow permissions.
      */
    val principalArn: Input[String] = js.native
    
    /**
      * The ID of the VPC endpoint service to allow permission.
      */
    val vpcEndpointServiceId: Input[String] = js.native
  }
  object VpcEndpointServiceAllowedPrincipleArgs {
    
    @scala.inline
    def apply(principalArn: Input[String], vpcEndpointServiceId: Input[String]): VpcEndpointServiceAllowedPrincipleArgs = {
      val __obj = js.Dynamic.literal(principalArn = principalArn.asInstanceOf[js.Any], vpcEndpointServiceId = vpcEndpointServiceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleArgs]
    }
    
    @scala.inline
    implicit class VpcEndpointServiceAllowedPrincipleArgsMutableBuilder[Self <: VpcEndpointServiceAllowedPrincipleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrincipalArn(value: Input[String]): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointServiceId(value: Input[String]): Self = StObject.set(x, "vpcEndpointServiceId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VpcEndpointServiceAllowedPrincipleState extends StObject {
    
    /**
      * The ARN of the principal to allow permissions.
      */
    val principalArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the VPC endpoint service to allow permission.
      */
    val vpcEndpointServiceId: js.UndefOr[Input[String]] = js.native
  }
  object VpcEndpointServiceAllowedPrincipleState {
    
    @scala.inline
    def apply(): VpcEndpointServiceAllowedPrincipleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleState]
    }
    
    @scala.inline
    implicit class VpcEndpointServiceAllowedPrincipleStateMutableBuilder[Self <: VpcEndpointServiceAllowedPrincipleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrincipalArn(value: Input[String]): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
      
      @scala.inline
      def setVpcEndpointServiceId(value: Input[String]): Self = StObject.set(x, "vpcEndpointServiceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointServiceIdUndefined: Self = StObject.set(x, "vpcEndpointServiceId", js.undefined)
    }
  }
}
