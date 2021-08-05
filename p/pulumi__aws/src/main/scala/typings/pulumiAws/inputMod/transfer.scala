package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transfer {
  
  trait ServerEndpointDetails extends StObject {
    
    /**
      * A list of address allocation IDs that are required to attach an Elastic IP address to your SFTP server's endpoint. This property can only be used when `endpointType` is set to `VPC`.
      */
    var addressAllocationIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of subnet IDs that are required to host your SFTP server endpoint in your VPC. This property can only be used when `endpointType` is set to `VPC`.
      */
    var subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the VPC endpoint. This property can only be used when `endpointType` is set to `VPC_ENDPOINT`
      */
    var vpcEndpointId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The VPC ID of the virtual private cloud in which the SFTP server's endpoint will be hosted. This property can only be used when `endpointType` is set to `VPC`.
      */
    var vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object ServerEndpointDetails {
    
    inline def apply(): ServerEndpointDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerEndpointDetails]
    }
    
    extension [Self <: ServerEndpointDetails](x: Self) {
      
      inline def setAddressAllocationIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "addressAllocationIds", value.asInstanceOf[js.Any])
      
      inline def setAddressAllocationIdsUndefined: Self = StObject.set(x, "addressAllocationIds", js.undefined)
      
      inline def setAddressAllocationIdsVarargs(value: Input[String]*): Self = StObject.set(x, "addressAllocationIds", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
      
      inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait UserHomeDirectoryMapping extends StObject {
    
    /**
      * Represents an entry and a target.
      */
    var entry: Input[String]
    
    /**
      * Represents the map target.
      */
    var target: Input[String]
  }
  object UserHomeDirectoryMapping {
    
    inline def apply(entry: Input[String], target: Input[String]): UserHomeDirectoryMapping = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserHomeDirectoryMapping]
    }
    
    extension [Self <: UserHomeDirectoryMapping](x: Self) {
      
      inline def setEntry(value: Input[String]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Input[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
