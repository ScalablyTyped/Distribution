package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worklink {
  
  trait FleetIdentityProvider extends StObject {
    
    /**
      * The SAML metadata document provided by the customer’s identity provider.
      */
    var samlMetadata: String
    
    /**
      * The type of identity provider.
      */
    var `type`: String
  }
  object FleetIdentityProvider {
    
    inline def apply(samlMetadata: String, `type`: String): FleetIdentityProvider = {
      val __obj = js.Dynamic.literal(samlMetadata = samlMetadata.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetIdentityProvider]
    }
    
    extension [Self <: FleetIdentityProvider](x: Self) {
      
      inline def setSamlMetadata(value: String): Self = StObject.set(x, "samlMetadata", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FleetNetwork extends StObject {
    
    /**
      * A list of security group IDs associated with access to the provided subnets.
      */
    var securityGroupIds: js.Array[String]
    
    /**
      * A list of subnet IDs used for X-ENI connections from Amazon WorkLink rendering containers.
      */
    var subnetIds: js.Array[String]
    
    /**
      * The VPC ID with connectivity to associated websites.
      */
    var vpcId: String
  }
  object FleetNetwork {
    
    inline def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): FleetNetwork = {
      val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetNetwork]
    }
    
    extension [Self <: FleetNetwork](x: Self) {
      
      inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
