package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryservice {
  
  trait DirectoryConnectSettings extends StObject {
    
    var availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The IP addresses of the AD Connector servers.
      */
    var connectIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The DNS IP addresses of the domain to connect to.
      */
    var customerDnsIps: Input[js.Array[Input[String]]]
    
    /**
      * The username corresponding to the password provided.
      */
    var customerUsername: Input[String]
    
    /**
      * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
      */
    var subnetIds: Input[js.Array[Input[String]]]
    
    /**
      * The identifier of the VPC that the directory is in.
      */
    var vpcId: Input[String]
  }
  object DirectoryConnectSettings {
    
    inline def apply(
      customerDnsIps: Input[js.Array[Input[String]]],
      customerUsername: Input[String],
      subnetIds: Input[js.Array[Input[String]]],
      vpcId: Input[String]
    ): DirectoryConnectSettings = {
      val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryConnectSettings]
    }
    
    extension [Self <: DirectoryConnectSettings](x: Self) {
      
      inline def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      inline def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setConnectIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "connectIps", value.asInstanceOf[js.Any])
      
      inline def setConnectIpsUndefined: Self = StObject.set(x, "connectIps", js.undefined)
      
      inline def setConnectIpsVarargs(value: Input[String]*): Self = StObject.set(x, "connectIps", js.Array(value :_*))
      
      inline def setCustomerDnsIps(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "customerDnsIps", value.asInstanceOf[js.Any])
      
      inline def setCustomerDnsIpsVarargs(value: Input[String]*): Self = StObject.set(x, "customerDnsIps", js.Array(value :_*))
      
      inline def setCustomerUsername(value: Input[String]): Self = StObject.set(x, "customerUsername", value.asInstanceOf[js.Any])
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectoryVpcSettings extends StObject {
    
    var availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
      */
    var subnetIds: Input[js.Array[Input[String]]]
    
    /**
      * The identifier of the VPC that the directory is in.
      */
    var vpcId: Input[String]
  }
  object DirectoryVpcSettings {
    
    inline def apply(subnetIds: Input[js.Array[Input[String]]], vpcId: Input[String]): DirectoryVpcSettings = {
      val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryVpcSettings]
    }
    
    extension [Self <: DirectoryVpcSettings](x: Self) {
      
      inline def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      inline def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
