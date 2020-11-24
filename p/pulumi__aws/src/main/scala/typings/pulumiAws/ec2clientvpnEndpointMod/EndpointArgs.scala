package typings.pulumiAws.ec2clientvpnEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2clientvpn.EndpointAuthenticationOption
import typings.pulumiAws.inputMod.ec2clientvpn.EndpointConnectionLogOptions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointArgs extends js.Object {
  
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  val authenticationOptions: Input[js.Array[Input[EndpointAuthenticationOption]]] = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  val clientCidrBlock: Input[String] = js.native
  
  /**
    * Information about the client connection logging options.
    */
  val connectionLogOptions: Input[EndpointConnectionLogOptions] = js.native
  
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
    authenticationOptions: Input[js.Array[Input[EndpointAuthenticationOption]]],
    clientCidrBlock: Input[String],
    connectionLogOptions: Input[EndpointConnectionLogOptions],
    serverCertificateArn: Input[String]
  ): EndpointArgs = {
    val __obj = js.Dynamic.literal(authenticationOptions = authenticationOptions.asInstanceOf[js.Any], clientCidrBlock = clientCidrBlock.asInstanceOf[js.Any], connectionLogOptions = connectionLogOptions.asInstanceOf[js.Any], serverCertificateArn = serverCertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointArgs]
  }
  
  @scala.inline
  implicit class EndpointArgsOps[Self <: EndpointArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticationOptionsVarargs(value: Input[EndpointAuthenticationOption]*): Self = this.set("authenticationOptions", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticationOptions(value: Input[js.Array[Input[EndpointAuthenticationOption]]]): Self = this.set("authenticationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCidrBlock(value: Input[String]): Self = this.set("clientCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionLogOptions(value: Input[EndpointConnectionLogOptions]): Self = this.set("connectionLogOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateArn(value: Input[String]): Self = this.set("serverCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDnsServersVarargs(value: Input[String]*): Self = this.set("dnsServers", js.Array(value :_*))
    
    @scala.inline
    def setDnsServers(value: Input[js.Array[Input[String]]]): Self = this.set("dnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsServers: Self = this.set("dnsServers", js.undefined)
    
    @scala.inline
    def setSplitTunnel(value: Input[Boolean]): Self = this.set("splitTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitTunnel: Self = this.set("splitTunnel", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTransportProtocol(value: Input[String]): Self = this.set("transportProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportProtocol: Self = this.set("transportProtocol", js.undefined)
  }
}
