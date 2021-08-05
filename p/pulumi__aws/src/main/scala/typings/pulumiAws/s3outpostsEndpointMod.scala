package typings.pulumiAws

import typings.pulumiAws.outputMod.s3outposts.EndpointNetworkInterface
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3outpostsEndpointMod {
  
  @JSImport("@pulumi/aws/s3outposts/endpoint", "Endpoint")
  @js.native
  class Endpoint protected () extends CustomResource {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the endpoint.
      */
    val arn: Output_[String] = js.native
    
    /**
      * VPC CIDR block of the endpoint.
      */
    val cidrBlock: Output_[String] = js.native
    
    /**
      * UTC creation time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    val creationTime: Output_[String] = js.native
    
    /**
      * Set of nested attributes for associated Elastic Network Interfaces (ENIs).
      */
    val networkInterfaces: Output_[js.Array[EndpointNetworkInterface]] = js.native
    
    /**
      * Identifier of the Outpost to contain this endpoint.
      */
    val outpostId: Output_[String] = js.native
    
    /**
      * Identifier of the EC2 Security Group.
      */
    val securityGroupId: Output_[String] = js.native
    
    /**
      * Identifier of the EC2 Subnet.
      */
    val subnetId: Output_[String] = js.native
  }
  /* static members */
  object Endpoint {
    
    @JSImport("@pulumi/aws/s3outposts/endpoint", "Endpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def get(name: String, id: Input[ID], state: EndpointState): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3outposts/endpoint.Endpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3outposts/endpoint.Endpoint */ Boolean]
  }
  
  trait EndpointArgs extends StObject {
    
    /**
      * Identifier of the Outpost to contain this endpoint.
      */
    val outpostId: Input[String]
    
    /**
      * Identifier of the EC2 Security Group.
      */
    val securityGroupId: Input[String]
    
    /**
      * Identifier of the EC2 Subnet.
      */
    val subnetId: Input[String]
  }
  object EndpointArgs {
    
    inline def apply(outpostId: Input[String], securityGroupId: Input[String], subnetId: Input[String]): EndpointArgs = {
      val __obj = js.Dynamic.literal(outpostId = outpostId.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointArgs]
    }
    
    extension [Self <: EndpointArgs](x: Self) {
      
      inline def setOutpostId(value: Input[String]): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the endpoint.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * VPC CIDR block of the endpoint.
      */
    val cidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * UTC creation time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    val creationTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of nested attributes for associated Elastic Network Interfaces (ENIs).
      */
    val networkInterfaces: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.s3outposts.EndpointNetworkInterface]]]
      ] = js.undefined
    
    /**
      * Identifier of the Outpost to contain this endpoint.
      */
    val outpostId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the EC2 Security Group.
      */
    val securityGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the EC2 Subnet.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointState {
    
    inline def apply(): EndpointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointState]
    }
    
    extension [Self <: EndpointState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      inline def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      inline def setCreationTime(value: Input[String]): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
      
      inline def setNetworkInterfaces(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3outposts.EndpointNetworkInterface]]]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
      
      inline def setNetworkInterfacesVarargs(value: Input[typings.pulumiAws.inputMod.s3outposts.EndpointNetworkInterface]*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
      
      inline def setOutpostId(value: Input[String]): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
      
      inline def setOutpostIdUndefined: Self = StObject.set(x, "outpostId", js.undefined)
      
      inline def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "securityGroupId", js.undefined)
      
      inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    }
  }
}
