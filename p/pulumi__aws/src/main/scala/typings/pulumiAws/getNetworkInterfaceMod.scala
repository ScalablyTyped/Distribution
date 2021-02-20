package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetNetworkInterfaceFilter
import typings.pulumiAws.outputMod.ec2.GetNetworkInterfaceAssociation
import typings.pulumiAws.outputMod.ec2.GetNetworkInterfaceAttachment
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNetworkInterfaceMod {
  
  @JSImport("@pulumi/aws/ec2/getNetworkInterface", "getNetworkInterface")
  @js.native
  def getNetworkInterface(): js.Promise[GetNetworkInterfaceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getNetworkInterface", "getNetworkInterface")
  @js.native
  def getNetworkInterface(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetNetworkInterfaceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getNetworkInterface", "getNetworkInterface")
  @js.native
  def getNetworkInterface(args: GetNetworkInterfaceArgs): js.Promise[GetNetworkInterfaceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getNetworkInterface", "getNetworkInterface")
  @js.native
  def getNetworkInterface(args: GetNetworkInterfaceArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfaceResult] = js.native
  
  @js.native
  trait GetNetworkInterfaceArgs extends StObject {
    
    /**
      * One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
      */
    val filters: js.UndefOr[js.Array[GetNetworkInterfaceFilter]] = js.native
    
    /**
      * The identifier for the network interface.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Any tags assigned to the network interface.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetNetworkInterfaceArgs {
    
    @scala.inline
    def apply(): GetNetworkInterfaceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNetworkInterfaceArgs]
    }
    
    @scala.inline
    implicit class GetNetworkInterfaceArgsMutableBuilder[Self <: GetNetworkInterfaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetNetworkInterfaceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetNetworkInterfaceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetNetworkInterfaceResult extends StObject {
    
    /**
      * The association information for an Elastic IP address (IPv4) associated with the network interface. See supported fields below.
      */
    val associations: js.Array[GetNetworkInterfaceAssociation] = js.native
    
    val attachments: js.Array[GetNetworkInterfaceAttachment] = js.native
    
    /**
      * The Availability Zone.
      */
    val availabilityZone: String = js.native
    
    /**
      * Description of the network interface.
      */
    val description: String = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetNetworkInterfaceFilter]] = js.native
    
    val id: String = js.native
    
    /**
      * The type of interface.
      */
    val interfaceType: String = js.native
    
    /**
      * List of IPv6 addresses to assign to the ENI.
      */
    val ipv6Addresses: js.Array[String] = js.native
    
    /**
      * The MAC address.
      */
    val macAddress: String = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: String = js.native
    
    /**
      * The AWS account ID of the owner of the network interface.
      */
    val ownerId: String = js.native
    
    /**
      * The private DNS name.
      */
    val privateDnsName: String = js.native
    
    /**
      * The private IPv4 address of the network interface within the subnet.
      */
    val privateIp: String = js.native
    
    /**
      * The private IPv4 addresses associated with the network interface.
      */
    val privateIps: js.Array[String] = js.native
    
    /**
      * The ID of the entity that launched the instance on your behalf.
      */
    val requesterId: String = js.native
    
    /**
      * The list of security groups for the network interface.
      */
    val securityGroups: js.Array[String] = js.native
    
    /**
      * The ID of the subnet.
      */
    val subnetId: String = js.native
    
    /**
      * Any tags assigned to the network interface.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * The ID of the VPC.
      */
    val vpcId: String = js.native
  }
  object GetNetworkInterfaceResult {
    
    @scala.inline
    def apply(
      associations: js.Array[GetNetworkInterfaceAssociation],
      attachments: js.Array[GetNetworkInterfaceAttachment],
      availabilityZone: String,
      description: String,
      id: String,
      interfaceType: String,
      ipv6Addresses: js.Array[String],
      macAddress: String,
      outpostArn: String,
      ownerId: String,
      privateDnsName: String,
      privateIp: String,
      privateIps: js.Array[String],
      requesterId: String,
      securityGroups: js.Array[String],
      subnetId: String,
      tags: StringDictionary[String],
      vpcId: String
    ): GetNetworkInterfaceResult = {
      val __obj = js.Dynamic.literal(associations = associations.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interfaceType = interfaceType.asInstanceOf[js.Any], ipv6Addresses = ipv6Addresses.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], privateDnsName = privateDnsName.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], privateIps = privateIps.asInstanceOf[js.Any], requesterId = requesterId.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetNetworkInterfaceResult]
    }
    
    @scala.inline
    implicit class GetNetworkInterfaceResultMutableBuilder[Self <: GetNetworkInterfaceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociations(value: js.Array[GetNetworkInterfaceAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociationsVarargs(value: GetNetworkInterfaceAssociation*): Self = StObject.set(x, "associations", js.Array(value :_*))
      
      @scala.inline
      def setAttachments(value: js.Array[GetNetworkInterfaceAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsVarargs(value: GetNetworkInterfaceAttachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetNetworkInterfaceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetNetworkInterfaceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterfaceType(value: String): Self = StObject.set(x, "interfaceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6Addresses(value: js.Array[String]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
      
      @scala.inline
      def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDnsName(value: String): Self = StObject.set(x, "privateDnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIp(value: String): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIps(value: js.Array[String]): Self = StObject.set(x, "privateIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpsVarargs(value: String*): Self = StObject.set(x, "privateIps", js.Array(value :_*))
      
      @scala.inline
      def setRequesterId(value: String): Self = StObject.set(x, "requesterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
