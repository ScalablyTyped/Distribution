package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryservice {
  
  trait DirectoryConnectSettings extends StObject {
    
    var availabilityZones: js.Array[String]
    
    /**
      * The IP addresses of the AD Connector servers.
      */
    var connectIps: js.Array[String]
    
    /**
      * The DNS IP addresses of the domain to connect to.
      */
    var customerDnsIps: js.Array[String]
    
    /**
      * The username corresponding to the password provided.
      */
    var customerUsername: String
    
    /**
      * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
      */
    var subnetIds: js.Array[String]
    
    /**
      * The identifier of the VPC that the directory is in.
      */
    var vpcId: String
  }
  object DirectoryConnectSettings {
    
    inline def apply(
      availabilityZones: js.Array[String],
      connectIps: js.Array[String],
      customerDnsIps: js.Array[String],
      customerUsername: String,
      subnetIds: js.Array[String],
      vpcId: String
    ): DirectoryConnectSettings = {
      val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], connectIps = connectIps.asInstanceOf[js.Any], customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryConnectSettings]
    }
    
    extension [Self <: DirectoryConnectSettings](x: Self) {
      
      inline def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setConnectIps(value: js.Array[String]): Self = StObject.set(x, "connectIps", value.asInstanceOf[js.Any])
      
      inline def setConnectIpsVarargs(value: String*): Self = StObject.set(x, "connectIps", js.Array(value :_*))
      
      inline def setCustomerDnsIps(value: js.Array[String]): Self = StObject.set(x, "customerDnsIps", value.asInstanceOf[js.Any])
      
      inline def setCustomerDnsIpsVarargs(value: String*): Self = StObject.set(x, "customerDnsIps", js.Array(value :_*))
      
      inline def setCustomerUsername(value: String): Self = StObject.set(x, "customerUsername", value.asInstanceOf[js.Any])
      
      inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectoryVpcSettings extends StObject {
    
    var availabilityZones: js.Array[String]
    
    /**
      * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
      */
    var subnetIds: js.Array[String]
    
    /**
      * The identifier of the VPC that the directory is in.
      */
    var vpcId: String
  }
  object DirectoryVpcSettings {
    
    inline def apply(availabilityZones: js.Array[String], subnetIds: js.Array[String], vpcId: String): DirectoryVpcSettings = {
      val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryVpcSettings]
    }
    
    extension [Self <: DirectoryVpcSettings](x: Self) {
      
      inline def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDirectoryConnectSetting extends StObject {
    
    var availabilityZones: js.Array[String]
    
    /**
      * The IP addresses of the AD Connector servers.
      */
    var connectIps: js.Array[String]
    
    /**
      * The DNS IP addresses of the domain to connect to.
      */
    var customerDnsIps: js.Array[String]
    
    /**
      * The username corresponding to the password provided.
      */
    var customerUsername: String
    
    /**
      * The identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
      */
    var subnetIds: js.Array[String]
    
    /**
      * The ID of the VPC that the connector is in.
      */
    var vpcId: String
  }
  object GetDirectoryConnectSetting {
    
    inline def apply(
      availabilityZones: js.Array[String],
      connectIps: js.Array[String],
      customerDnsIps: js.Array[String],
      customerUsername: String,
      subnetIds: js.Array[String],
      vpcId: String
    ): GetDirectoryConnectSetting = {
      val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], connectIps = connectIps.asInstanceOf[js.Any], customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectoryConnectSetting]
    }
    
    extension [Self <: GetDirectoryConnectSetting](x: Self) {
      
      inline def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setConnectIps(value: js.Array[String]): Self = StObject.set(x, "connectIps", value.asInstanceOf[js.Any])
      
      inline def setConnectIpsVarargs(value: String*): Self = StObject.set(x, "connectIps", js.Array(value :_*))
      
      inline def setCustomerDnsIps(value: js.Array[String]): Self = StObject.set(x, "customerDnsIps", value.asInstanceOf[js.Any])
      
      inline def setCustomerDnsIpsVarargs(value: String*): Self = StObject.set(x, "customerDnsIps", js.Array(value :_*))
      
      inline def setCustomerUsername(value: String): Self = StObject.set(x, "customerUsername", value.asInstanceOf[js.Any])
      
      inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDirectoryVpcSetting extends StObject {
    
    var availabilityZones: js.Array[String]
    
    /**
      * The identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
      */
    var subnetIds: js.Array[String]
    
    /**
      * The ID of the VPC that the connector is in.
      */
    var vpcId: String
  }
  object GetDirectoryVpcSetting {
    
    inline def apply(availabilityZones: js.Array[String], subnetIds: js.Array[String], vpcId: String): GetDirectoryVpcSetting = {
      val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectoryVpcSetting]
    }
    
    extension [Self <: GetDirectoryVpcSetting](x: Self) {
      
      inline def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
