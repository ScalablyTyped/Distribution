package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizations {
  
  trait OrganizationAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Email of the account
      */
    var email: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the root
      */
    var id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the policy type
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: js.UndefOr[Input[String]] = js.undefined
  }
  object OrganizationAccount {
    
    inline def apply(): OrganizationAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationAccount]
    }
    
    extension [Self <: OrganizationAccount](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait OrganizationNonMasterAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Email of the account
      */
    var email: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the root
      */
    var id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the policy type
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: js.UndefOr[Input[String]] = js.undefined
  }
  object OrganizationNonMasterAccount {
    
    inline def apply(): OrganizationNonMasterAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationNonMasterAccount]
    }
    
    extension [Self <: OrganizationNonMasterAccount](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait OrganizationRoot extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the root
      */
    var id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the policy type
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of policy types enabled for this root. All elements have these attributes:
      */
    var policyTypes: js.UndefOr[Input[js.Array[Input[OrganizationRootPolicyType]]]] = js.undefined
  }
  object OrganizationRoot {
    
    inline def apply(): OrganizationRoot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationRoot]
    }
    
    extension [Self <: OrganizationRoot](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPolicyTypes(value: Input[js.Array[Input[OrganizationRootPolicyType]]]): Self = StObject.set(x, "policyTypes", value.asInstanceOf[js.Any])
      
      inline def setPolicyTypesUndefined: Self = StObject.set(x, "policyTypes", js.undefined)
      
      inline def setPolicyTypesVarargs(value: Input[OrganizationRootPolicyType]*): Self = StObject.set(x, "policyTypes", js.Array(value :_*))
    }
  }
  
  trait OrganizationRootPolicyType extends StObject {
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: js.UndefOr[Input[String]] = js.undefined
    
    var `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object OrganizationRootPolicyType {
    
    inline def apply(): OrganizationRootPolicyType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationRootPolicyType]
    }
    
    extension [Self <: OrganizationRootPolicyType](x: Self) {
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OrganizationalUnitAccount extends StObject {
    
    /**
      * ARN of the organizational unit
      */
    var arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Email of the account
      */
    var email: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the organization unit
      */
    var id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name for the organizational unit
      */
    var name: js.UndefOr[Input[String]] = js.undefined
  }
  object OrganizationalUnitAccount {
    
    inline def apply(): OrganizationalUnitAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationalUnitAccount]
    }
    
    extension [Self <: OrganizationalUnitAccount](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
