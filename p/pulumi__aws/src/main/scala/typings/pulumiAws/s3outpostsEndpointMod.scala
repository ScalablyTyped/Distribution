package typings.pulumiAws

import typings.pulumiAws.outputMod.s3outposts.EndpointNetworkInterface
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3outposts/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): Endpoint = js.native
    @JSImport("@pulumi/aws/s3outposts/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Endpoint = js.native
    @JSImport("@pulumi/aws/s3outposts/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState): Endpoint = js.native
    @JSImport("@pulumi/aws/s3outposts/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = js.native
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3outposts/endpoint", "Endpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3outposts/endpoint.Endpoint */ Boolean = js.native
  }
  
  @js.native
  trait EndpointArgs extends StObject {
    
    /**
      * Identifier of the Outpost to contain this endpoint.
      */
    val outpostId: Input[String] = js.native
    
    /**
      * Identifier of the EC2 Security Group.
      */
    val securityGroupId: Input[String] = js.native
    
    /**
      * Identifier of the EC2 Subnet.
      */
    val subnetId: Input[String] = js.native
  }
  object EndpointArgs {
    
    @scala.inline
    def apply(outpostId: Input[String], securityGroupId: Input[String], subnetId: Input[String]): EndpointArgs = {
      val __obj = js.Dynamic.literal(outpostId = outpostId.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointArgs]
    }
    
    @scala.inline
    implicit class EndpointArgsMutableBuilder[Self <: EndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutpostId(value: Input[String]): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EndpointState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the endpoint.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * VPC CIDR block of the endpoint.
      */
    val cidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * UTC creation time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    val creationTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set of nested attributes for associated Elastic Network Interfaces (ENIs).
      */
    val networkInterfaces: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.s3outposts.EndpointNetworkInterface]]]
      ] = js.native
    
    /**
      * Identifier of the Outpost to contain this endpoint.
      */
    val outpostId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the EC2 Security Group.
      */
    val securityGroupId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the EC2 Subnet.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
  }
  object EndpointState {
    
    @scala.inline
    def apply(): EndpointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointState]
    }
    
    @scala.inline
    implicit class EndpointStateMutableBuilder[Self <: EndpointState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      @scala.inline
      def setCreationTime(value: Input[String]): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
      
      @scala.inline
      def setNetworkInterfaces(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3outposts.EndpointNetworkInterface]]]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
      
      @scala.inline
      def setNetworkInterfacesVarargs(value: Input[typings.pulumiAws.inputMod.s3outposts.EndpointNetworkInterface]*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
      
      @scala.inline
      def setOutpostId(value: Input[String]): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostIdUndefined: Self = StObject.set(x, "outpostId", js.undefined)
      
      @scala.inline
      def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdUndefined: Self = StObject.set(x, "securityGroupId", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    }
  }
}
