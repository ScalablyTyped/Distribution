package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2clientvpn.EndpointAuthenticationOption
import typings.pulumiAws.outputMod.ec2clientvpn.EndpointConnectionLogOptions
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2clientvpnEndpointMod {
  
  @JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint")
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
      * The ARN of the Client VPN endpoint.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Information about the authentication method to be used to authenticate clients.
      */
    val authenticationOptions: Output_[js.Array[EndpointAuthenticationOption]] = js.native
    
    /**
      * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
      */
    val clientCidrBlock: Output_[String] = js.native
    
    /**
      * Information about the client connection logging options.
      */
    val connectionLogOptions: Output_[EndpointConnectionLogOptions] = js.native
    
    /**
      * Name of the repository.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The DNS name to be used by clients when establishing their VPN session.
      */
    val dnsName: Output_[String] = js.native
    
    /**
      * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
      */
    val dnsServers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The ARN of the ACM server certificate.
      */
    val serverCertificateArn: Output_[String] = js.native
    
    /**
      * Indicates whether split-tunnel is enabled on VPN endpoint. Default value is `false`.
      */
    val splitTunnel: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The current state of the Client VPN endpoint.
      */
    val status: Output_[String] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The transport protocol to be used by the VPN session. Default value is `udp`.
      */
    val transportProtocol: Output_[js.UndefOr[String]] = js.native
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
    @JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): Endpoint = js.native
    @JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Endpoint = js.native
    @JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState): Endpoint = js.native
    @JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = js.native
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/endpoint.Endpoint */ Boolean = js.native
  }
  
  @js.native
  trait EndpointArgs extends StObject {
    
    /**
      * Information about the authentication method to be used to authenticate clients.
      */
    val authenticationOptions: Input[
        js.Array[Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointAuthenticationOption]]
      ] = js.native
    
    /**
      * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
      */
    val clientCidrBlock: Input[String] = js.native
    
    /**
      * Information about the client connection logging options.
      */
    val connectionLogOptions: Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointConnectionLogOptions] = js.native
    
    /**
      * Name of the repository.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
      */
    val dnsServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ARN of the ACM server certificate.
      */
    val serverCertificateArn: Input[String] = js.native
    
    /**
      * Indicates whether split-tunnel is enabled on VPN endpoint. Default value is `false`.
      */
    val splitTunnel: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The transport protocol to be used by the VPN session. Default value is `udp`.
      */
    val transportProtocol: js.UndefOr[Input[String]] = js.native
  }
  object EndpointArgs {
    
    @scala.inline
    def apply(
      authenticationOptions: Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointAuthenticationOption]]
        ],
      clientCidrBlock: Input[String],
      connectionLogOptions: Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointConnectionLogOptions],
      serverCertificateArn: Input[String]
    ): EndpointArgs = {
      val __obj = js.Dynamic.literal(authenticationOptions = authenticationOptions.asInstanceOf[js.Any], clientCidrBlock = clientCidrBlock.asInstanceOf[js.Any], connectionLogOptions = connectionLogOptions.asInstanceOf[js.Any], serverCertificateArn = serverCertificateArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointArgs]
    }
    
    @scala.inline
    implicit class EndpointArgsMutableBuilder[Self <: EndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticationOptions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointAuthenticationOption]]
            ]
      ): Self = StObject.set(x, "authenticationOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationOptionsVarargs(value: Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointAuthenticationOption]*): Self = StObject.set(x, "authenticationOptions", js.Array(value :_*))
      
      @scala.inline
      def setClientCidrBlock(value: Input[String]): Self = StObject.set(x, "clientCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionLogOptions(value: Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointConnectionLogOptions]): Self = StObject.set(x, "connectionLogOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDnsServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "dnsServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsServersUndefined: Self = StObject.set(x, "dnsServers", js.undefined)
      
      @scala.inline
      def setDnsServersVarargs(value: Input[String]*): Self = StObject.set(x, "dnsServers", js.Array(value :_*))
      
      @scala.inline
      def setServerCertificateArn(value: Input[String]): Self = StObject.set(x, "serverCertificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitTunnel(value: Input[Boolean]): Self = StObject.set(x, "splitTunnel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitTunnelUndefined: Self = StObject.set(x, "splitTunnel", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransportProtocol(value: Input[String]): Self = StObject.set(x, "transportProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportProtocolUndefined: Self = StObject.set(x, "transportProtocol", js.undefined)
    }
  }
  
  @js.native
  trait EndpointState extends StObject {
    
    /**
      * The ARN of the Client VPN endpoint.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Information about the authentication method to be used to authenticate clients.
      */
    val authenticationOptions: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointAuthenticationOption]]
        ]
      ] = js.native
    
    /**
      * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
      */
    val clientCidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * Information about the client connection logging options.
      */
    val connectionLogOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointConnectionLogOptions]] = js.native
    
    /**
      * Name of the repository.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The DNS name to be used by clients when establishing their VPN session.
      */
    val dnsName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
      */
    val dnsServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ARN of the ACM server certificate.
      */
    val serverCertificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether split-tunnel is enabled on VPN endpoint. Default value is `false`.
      */
    val splitTunnel: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The current state of the Client VPN endpoint.
      */
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The transport protocol to be used by the VPN session. Default value is `udp`.
      */
    val transportProtocol: js.UndefOr[Input[String]] = js.native
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
      def setAuthenticationOptions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointAuthenticationOption]]
            ]
      ): Self = StObject.set(x, "authenticationOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationOptionsUndefined: Self = StObject.set(x, "authenticationOptions", js.undefined)
      
      @scala.inline
      def setAuthenticationOptionsVarargs(value: Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointAuthenticationOption]*): Self = StObject.set(x, "authenticationOptions", js.Array(value :_*))
      
      @scala.inline
      def setClientCidrBlock(value: Input[String]): Self = StObject.set(x, "clientCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCidrBlockUndefined: Self = StObject.set(x, "clientCidrBlock", js.undefined)
      
      @scala.inline
      def setConnectionLogOptions(value: Input[typings.pulumiAws.inputMod.ec2clientvpn.EndpointConnectionLogOptions]): Self = StObject.set(x, "connectionLogOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionLogOptionsUndefined: Self = StObject.set(x, "connectionLogOptions", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDnsName(value: Input[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
      
      @scala.inline
      def setDnsServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "dnsServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsServersUndefined: Self = StObject.set(x, "dnsServers", js.undefined)
      
      @scala.inline
      def setDnsServersVarargs(value: Input[String]*): Self = StObject.set(x, "dnsServers", js.Array(value :_*))
      
      @scala.inline
      def setServerCertificateArn(value: Input[String]): Self = StObject.set(x, "serverCertificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerCertificateArnUndefined: Self = StObject.set(x, "serverCertificateArn", js.undefined)
      
      @scala.inline
      def setSplitTunnel(value: Input[Boolean]): Self = StObject.set(x, "splitTunnel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitTunnelUndefined: Self = StObject.set(x, "splitTunnel", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransportProtocol(value: Input[String]): Self = StObject.set(x, "transportProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportProtocolUndefined: Self = StObject.set(x, "transportProtocol", js.undefined)
    }
  }
}
