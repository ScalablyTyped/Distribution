package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizations {
  
  @js.native
  trait GetOrganizationAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String = js.native
    
    /**
      * Email of the account
      */
    var email: String = js.native
    
    /**
      * Identifier of the root
      */
    var id: String = js.native
    
    /**
      * The name of the policy type
      */
    var name: String = js.native
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String = js.native
  }
  object GetOrganizationAccount {
    
    @scala.inline
    def apply(arn: String, email: String, id: String, name: String, status: String): GetOrganizationAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationAccount]
    }
    
    @scala.inline
    implicit class GetOrganizationAccountMutableBuilder[Self <: GetOrganizationAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetOrganizationNonMasterAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String = js.native
    
    /**
      * Email of the account
      */
    var email: String = js.native
    
    /**
      * Identifier of the root
      */
    var id: String = js.native
    
    /**
      * The name of the policy type
      */
    var name: String = js.native
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String = js.native
  }
  object GetOrganizationNonMasterAccount {
    
    @scala.inline
    def apply(arn: String, email: String, id: String, name: String, status: String): GetOrganizationNonMasterAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationNonMasterAccount]
    }
    
    @scala.inline
    implicit class GetOrganizationNonMasterAccountMutableBuilder[Self <: GetOrganizationNonMasterAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetOrganizationRoot extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String = js.native
    
    /**
      * Identifier of the root
      */
    var id: String = js.native
    
    /**
      * The name of the policy type
      */
    var name: String = js.native
    
    /**
      * List of policy types enabled for this root. All elements have these attributes:
      */
    var policyTypes: js.Array[GetOrganizationRootPolicyType] = js.native
  }
  object GetOrganizationRoot {
    
    @scala.inline
    def apply(arn: String, id: String, name: String, policyTypes: js.Array[GetOrganizationRootPolicyType]): GetOrganizationRoot = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policyTypes = policyTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationRoot]
    }
    
    @scala.inline
    implicit class GetOrganizationRootMutableBuilder[Self <: GetOrganizationRoot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyTypes(value: js.Array[GetOrganizationRootPolicyType]): Self = StObject.set(x, "policyTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyTypesVarargs(value: GetOrganizationRootPolicyType*): Self = StObject.set(x, "policyTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetOrganizationRootPolicyType extends StObject {
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String = js.native
    
    var `type`: String = js.native
  }
  object GetOrganizationRootPolicyType {
    
    @scala.inline
    def apply(status: String, `type`: String): GetOrganizationRootPolicyType = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationRootPolicyType]
    }
    
    @scala.inline
    implicit class GetOrganizationRootPolicyTypeMutableBuilder[Self <: GetOrganizationRootPolicyType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetOrganizationalUnitsChildren extends StObject {
    
    /**
      * ARN of the organizational unit
      */
    var arn: String = js.native
    
    /**
      * Parent identifier of the organizational units.
      */
    var id: String = js.native
    
    /**
      * Name of the organizational unit
      */
    var name: String = js.native
  }
  object GetOrganizationalUnitsChildren {
    
    @scala.inline
    def apply(arn: String, id: String, name: String): GetOrganizationalUnitsChildren = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrganizationalUnitsChildren]
    }
    
    @scala.inline
    implicit class GetOrganizationalUnitsChildrenMutableBuilder[Self <: GetOrganizationalUnitsChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OrganizationAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String = js.native
    
    /**
      * Email of the account
      */
    var email: String = js.native
    
    /**
      * Identifier of the root
      */
    var id: String = js.native
    
    /**
      * The name of the policy type
      */
    var name: String = js.native
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String = js.native
  }
  object OrganizationAccount {
    
    @scala.inline
    def apply(arn: String, email: String, id: String, name: String, status: String): OrganizationAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationAccount]
    }
    
    @scala.inline
    implicit class OrganizationAccountMutableBuilder[Self <: OrganizationAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OrganizationNonMasterAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String = js.native
    
    /**
      * Email of the account
      */
    var email: String = js.native
    
    /**
      * Identifier of the root
      */
    var id: String = js.native
    
    /**
      * The name of the policy type
      */
    var name: String = js.native
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String = js.native
  }
  object OrganizationNonMasterAccount {
    
    @scala.inline
    def apply(arn: String, email: String, id: String, name: String, status: String): OrganizationNonMasterAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationNonMasterAccount]
    }
    
    @scala.inline
    implicit class OrganizationNonMasterAccountMutableBuilder[Self <: OrganizationNonMasterAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OrganizationRoot extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: String = js.native
    
    /**
      * Identifier of the root
      */
    var id: String = js.native
    
    /**
      * The name of the policy type
      */
    var name: String = js.native
    
    /**
      * List of policy types enabled for this root. All elements have these attributes:
      */
    var policyTypes: js.Array[OrganizationRootPolicyType] = js.native
  }
  object OrganizationRoot {
    
    @scala.inline
    def apply(arn: String, id: String, name: String, policyTypes: js.Array[OrganizationRootPolicyType]): OrganizationRoot = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policyTypes = policyTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationRoot]
    }
    
    @scala.inline
    implicit class OrganizationRootMutableBuilder[Self <: OrganizationRoot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyTypes(value: js.Array[OrganizationRootPolicyType]): Self = StObject.set(x, "policyTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyTypesVarargs(value: OrganizationRootPolicyType*): Self = StObject.set(x, "policyTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OrganizationRootPolicyType extends StObject {
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: String = js.native
    
    var `type`: String = js.native
  }
  object OrganizationRootPolicyType {
    
    @scala.inline
    def apply(status: String, `type`: String): OrganizationRootPolicyType = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationRootPolicyType]
    }
    
    @scala.inline
    implicit class OrganizationRootPolicyTypeMutableBuilder[Self <: OrganizationRootPolicyType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OrganizationalUnitAccount extends StObject {
    
    /**
      * ARN of the organizational unit
      */
    var arn: String = js.native
    
    /**
      * Email of the account
      */
    var email: String = js.native
    
    /**
      * Identifier of the organization unit
      */
    var id: String = js.native
    
    /**
      * The name for the organizational unit
      */
    var name: String = js.native
  }
  object OrganizationalUnitAccount {
    
    @scala.inline
    def apply(arn: String, email: String, id: String, name: String): OrganizationalUnitAccount = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationalUnitAccount]
    }
    
    @scala.inline
    implicit class OrganizationalUnitAccountMutableBuilder[Self <: OrganizationalUnitAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
