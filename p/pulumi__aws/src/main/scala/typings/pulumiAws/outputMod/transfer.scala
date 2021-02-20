package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transfer {
  
  @js.native
  trait ServerEndpointDetails extends StObject {
    
    /**
      * A list of address allocation IDs that are required to attach an Elastic IP address to your SFTP server's endpoint. This property can only be used when `endpointType` is set to `VPC`.
      */
    var addressAllocationIds: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A list of subnet IDs that are required to host your SFTP server endpoint in your VPC. This property can only be used when `endpointType` is set to `VPC`.
      */
    var subnetIds: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The ID of the VPC endpoint. This property can only be used when `endpointType` is set to `VPC_ENDPOINT`
      */
    var vpcEndpointId: String = js.native
    
    /**
      * The VPC ID of the virtual private cloud in which the SFTP server's endpoint will be hosted. This property can only be used when `endpointType` is set to `VPC`.
      */
    var vpcId: js.UndefOr[String] = js.native
  }
  object ServerEndpointDetails {
    
    @scala.inline
    def apply(vpcEndpointId: String): ServerEndpointDetails = {
      val __obj = js.Dynamic.literal(vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerEndpointDetails]
    }
    
    @scala.inline
    implicit class ServerEndpointDetailsMutableBuilder[Self <: ServerEndpointDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressAllocationIds(value: js.Array[String]): Self = StObject.set(x, "addressAllocationIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressAllocationIdsUndefined: Self = StObject.set(x, "addressAllocationIds", js.undefined)
      
      @scala.inline
      def setAddressAllocationIdsVarargs(value: String*): Self = StObject.set(x, "addressAllocationIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcEndpointId(value: String): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait UserHomeDirectoryMapping extends StObject {
    
    /**
      * Represents an entry and a target.
      */
    var entry: String = js.native
    
    /**
      * Represents the map target.
      */
    var target: String = js.native
  }
  object UserHomeDirectoryMapping {
    
    @scala.inline
    def apply(entry: String, target: String): UserHomeDirectoryMapping = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserHomeDirectoryMapping]
    }
    
    @scala.inline
    implicit class UserHomeDirectoryMappingMutableBuilder[Self <: UserHomeDirectoryMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
