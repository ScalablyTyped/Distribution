package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worklink {
  
  @js.native
  trait FleetIdentityProvider extends StObject {
    
    /**
      * The SAML metadata document provided by the customer’s identity provider.
      */
    var samlMetadata: Input[String] = js.native
    
    /**
      * The type of identity provider.
      */
    var `type`: Input[String] = js.native
  }
  object FleetIdentityProvider {
    
    @scala.inline
    def apply(samlMetadata: Input[String], `type`: Input[String]): FleetIdentityProvider = {
      val __obj = js.Dynamic.literal(samlMetadata = samlMetadata.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetIdentityProvider]
    }
    
    @scala.inline
    implicit class FleetIdentityProviderMutableBuilder[Self <: FleetIdentityProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSamlMetadata(value: Input[String]): Self = StObject.set(x, "samlMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FleetNetwork extends StObject {
    
    /**
      * A list of security group IDs associated with access to the provided subnets.
      */
    var securityGroupIds: Input[js.Array[Input[String]]] = js.native
    
    /**
      * A list of subnet IDs used for X-ENI connections from Amazon WorkLink rendering containers.
      */
    var subnetIds: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The VPC ID with connectivity to associated websites.
      */
    var vpcId: Input[String] = js.native
  }
  object FleetNetwork {
    
    @scala.inline
    def apply(
      securityGroupIds: Input[js.Array[Input[String]]],
      subnetIds: Input[js.Array[Input[String]]],
      vpcId: Input[String]
    ): FleetNetwork = {
      val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetNetwork]
    }
    
    @scala.inline
    implicit class FleetNetworkMutableBuilder[Self <: FleetNetwork] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
