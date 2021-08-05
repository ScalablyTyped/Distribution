package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple", "VpcEndpointServiceAllowedPrinciple")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcEndpointServiceAllowedPrinciple resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): VpcEndpointServiceAllowedPrinciple = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointServiceAllowedPrinciple]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcEndpointServiceAllowedPrinciple = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointServiceAllowedPrinciple]
    inline def get(name: String, id: Input[ID], state: VpcEndpointServiceAllowedPrincipleState): VpcEndpointServiceAllowedPrinciple = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointServiceAllowedPrinciple]
    inline def get(
      name: String,
      id: Input[ID],
      state: VpcEndpointServiceAllowedPrincipleState,
      opts: CustomResourceOptions
    ): VpcEndpointServiceAllowedPrinciple = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointServiceAllowedPrinciple]
    
    /**
      * Returns true if the given object is an instance of VpcEndpointServiceAllowedPrinciple.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple.VpcEndpointServiceAllowedPrinciple */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointServiceAllowedPrinciple.VpcEndpointServiceAllowedPrinciple */ Boolean]
  }
  
  trait VpcEndpointServiceAllowedPrincipleArgs extends StObject {
    
    /**
      * The ARN of the principal to allow permissions.
      */
    val principalArn: Input[String]
    
    /**
      * The ID of the VPC endpoint service to allow permission.
      */
    val vpcEndpointServiceId: Input[String]
  }
  object VpcEndpointServiceAllowedPrincipleArgs {
    
    inline def apply(principalArn: Input[String], vpcEndpointServiceId: Input[String]): VpcEndpointServiceAllowedPrincipleArgs = {
      val __obj = js.Dynamic.literal(principalArn = principalArn.asInstanceOf[js.Any], vpcEndpointServiceId = vpcEndpointServiceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleArgs]
    }
    
    extension [Self <: VpcEndpointServiceAllowedPrincipleArgs](x: Self) {
      
      inline def setPrincipalArn(value: Input[String]): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
      
      inline def setVpcEndpointServiceId(value: Input[String]): Self = StObject.set(x, "vpcEndpointServiceId", value.asInstanceOf[js.Any])
    }
  }
  
  trait VpcEndpointServiceAllowedPrincipleState extends StObject {
    
    /**
      * The ARN of the principal to allow permissions.
      */
    val principalArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC endpoint service to allow permission.
      */
    val vpcEndpointServiceId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpcEndpointServiceAllowedPrincipleState {
    
    inline def apply(): VpcEndpointServiceAllowedPrincipleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleState]
    }
    
    extension [Self <: VpcEndpointServiceAllowedPrincipleState](x: Self) {
      
      inline def setPrincipalArn(value: Input[String]): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
      
      inline def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
      
      inline def setVpcEndpointServiceId(value: Input[String]): Self = StObject.set(x, "vpcEndpointServiceId", value.asInstanceOf[js.Any])
      
      inline def setVpcEndpointServiceIdUndefined: Self = StObject.set(x, "vpcEndpointServiceId", js.undefined)
    }
  }
}
