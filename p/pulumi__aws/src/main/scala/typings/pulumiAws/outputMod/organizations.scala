package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizations {
  
  trait GetOrganizationAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String
    
    /**
      * Email of the account
      */
    var email: String
    
    /**
      * Identifier of the root
      */
    var id: String
    
    /**
      * The name of the policy type
      */
    var name: String
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String
  }
  object GetOrganizationAccount {
    
    inline def apply(arn: String, email: String, id: String, name: String, status: String): GetOrganizationAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationAccount]
    }
    
    extension [Self <: GetOrganizationAccount](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetOrganizationNonMasterAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String
    
    /**
      * Email of the account
      */
    var email: String
    
    /**
      * Identifier of the root
      */
    var id: String
    
    /**
      * The name of the policy type
      */
    var name: String
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String
  }
  object GetOrganizationNonMasterAccount {
    
    inline def apply(arn: String, email: String, id: String, name: String, status: String): GetOrganizationNonMasterAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationNonMasterAccount]
    }
    
    extension [Self <: GetOrganizationNonMasterAccount](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetOrganizationRoot extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String
    
    /**
      * Identifier of the root
      */
    var id: String
    
    /**
      * The name of the policy type
      */
    var name: String
    
    /**
      * List of policy types enabled for this root. All elements have these attributes:
      */
    var policyTypes: js.Array[GetOrganizationRootPolicyType]
  }
  object GetOrganizationRoot {
    
    inline def apply(arn: String, id: String, name: String, policyTypes: js.Array[GetOrganizationRootPolicyType]): GetOrganizationRoot = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policyTypes = policyTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationRoot]
    }
    
    extension [Self <: GetOrganizationRoot](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPolicyTypes(value: js.Array[GetOrganizationRootPolicyType]): Self = StObject.set(x, "policyTypes", value.asInstanceOf[js.Any])
      
      inline def setPolicyTypesVarargs(value: GetOrganizationRootPolicyType*): Self = StObject.set(x, "policyTypes", js.Array(value :_*))
    }
  }
  
  trait GetOrganizationRootPolicyType extends StObject {
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String
    
    var `type`: String
  }
  object GetOrganizationRootPolicyType {
    
    inline def apply(status: String, `type`: String): GetOrganizationRootPolicyType = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationRootPolicyType]
    }
    
    extension [Self <: GetOrganizationRootPolicyType](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetOrganizationalUnitsChildren extends StObject {
    
    /**
      * ARN of the organizational unit
      */
    var arn: String
    
    /**
      * Parent identifier of the organizational units.
      */
    var id: String
    
    /**
      * Name of the organizational unit
      */
    var name: String
  }
  object GetOrganizationalUnitsChildren {
    
    inline def apply(arn: String, id: String, name: String): GetOrganizationalUnitsChildren = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationalUnitsChildren]
    }
    
    extension [Self <: GetOrganizationalUnitsChildren](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait OrganizationAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String
    
    /**
      * Email of the account
      */
    var email: String
    
    /**
      * Identifier of the root
      */
    var id: String
    
    /**
      * The name of the policy type
      */
    var name: String
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String
  }
  object OrganizationAccount {
    
    inline def apply(arn: String, email: String, id: String, name: String, status: String): OrganizationAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationAccount]
    }
    
    extension [Self <: OrganizationAccount](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait OrganizationNonMasterAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String
    
    /**
      * Email of the account
      */
    var email: String
    
    /**
      * Identifier of the root
      */
    var id: String
    
    /**
      * The name of the policy type
      */
    var name: String
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String
  }
  object OrganizationNonMasterAccount {
    
    inline def apply(arn: String, email: String, id: String, name: String, status: String): OrganizationNonMasterAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationNonMasterAccount]
    }
    
    extension [Self <: OrganizationNonMasterAccount](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait OrganizationRoot extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String
    
    /**
      * Identifier of the root
      */
    var id: String
    
    /**
      * The name of the policy type
      */
    var name: String
    
    /**
      * List of policy types enabled for this root. All elements have these attributes:
      */
    var policyTypes: js.Array[OrganizationRootPolicyType]
  }
  object OrganizationRoot {
    
    inline def apply(arn: String, id: String, name: String, policyTypes: js.Array[OrganizationRootPolicyType]): OrganizationRoot = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policyTypes = policyTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationRoot]
    }
    
    extension [Self <: OrganizationRoot](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPolicyTypes(value: js.Array[OrganizationRootPolicyType]): Self = StObject.set(x, "policyTypes", value.asInstanceOf[js.Any])
      
      inline def setPolicyTypesVarargs(value: OrganizationRootPolicyType*): Self = StObject.set(x, "policyTypes", js.Array(value :_*))
    }
  }
  
  trait OrganizationRootPolicyType extends StObject {
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String
    
    var `type`: String
  }
  object OrganizationRootPolicyType {
    
    inline def apply(status: String, `type`: String): OrganizationRootPolicyType = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationRootPolicyType]
    }
    
    extension [Self <: OrganizationRootPolicyType](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OrganizationalUnitAccount extends StObject {
    
    /**
      * ARN of the organizational unit
      */
    var arn: String
    
    /**
      * Email of the account
      */
    var email: String
    
    /**
      * Identifier of the organization unit
      */
    var id: String
    
    /**
      * The name for the organizational unit
      */
    var name: String
  }
  object OrganizationalUnitAccount {
    
    inline def apply(arn: String, email: String, id: String, name: String): OrganizationalUnitAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationalUnitAccount]
    }
    
    extension [Self <: OrganizationalUnitAccount](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
