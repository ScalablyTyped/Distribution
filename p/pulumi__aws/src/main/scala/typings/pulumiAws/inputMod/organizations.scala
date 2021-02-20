package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizations {
  
  @js.native
  trait OrganizationAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Email of the account
      */
    var email: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the root
      */
    var id: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the policy type
      */
    var name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: js.UndefOr[Input[String]] = js.native
  }
  object OrganizationAccount {
    
    @scala.inline
    def apply(): OrganizationAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationAccount]
    }
    
    @scala.inline
    implicit class OrganizationAccountMutableBuilder[Self <: OrganizationAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait OrganizationNonMasterAccount extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Email of the account
      */
    var email: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the root
      */
    var id: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the policy type
      */
    var name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: js.UndefOr[Input[String]] = js.native
  }
  object OrganizationNonMasterAccount {
    
    @scala.inline
    def apply(): OrganizationNonMasterAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationNonMasterAccount]
    }
    
    @scala.inline
    implicit class OrganizationNonMasterAccountMutableBuilder[Self <: OrganizationNonMasterAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait OrganizationRoot extends StObject {
    
    /**
      * ARN of the root
      */
    var arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the root
      */
    var id: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the policy type
      */
    var name: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of policy types enabled for this root. All elements have these attributes:
      */
    var policyTypes: js.UndefOr[Input[js.Array[Input[OrganizationRootPolicyType]]]] = js.native
  }
  object OrganizationRoot {
    
    @scala.inline
    def apply(): OrganizationRoot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationRoot]
    }
    
    @scala.inline
    implicit class OrganizationRootMutableBuilder[Self <: OrganizationRoot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicyTypes(value: Input[js.Array[Input[OrganizationRootPolicyType]]]): Self = StObject.set(x, "policyTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyTypesUndefined: Self = StObject.set(x, "policyTypes", js.undefined)
      
      @scala.inline
      def setPolicyTypesVarargs(value: Input[OrganizationRootPolicyType]*): Self = StObject.set(x, "policyTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OrganizationRootPolicyType extends StObject {
    
    /**
      * The status of the policy type as it relates to the associated root
      */
    var status: js.UndefOr[Input[String]] = js.native
    
    var `type`: js.UndefOr[Input[String]] = js.native
  }
  object OrganizationRootPolicyType {
    
    @scala.inline
    def apply(): OrganizationRootPolicyType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationRootPolicyType]
    }
    
    @scala.inline
    implicit class OrganizationRootPolicyTypeMutableBuilder[Self <: OrganizationRootPolicyType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait OrganizationalUnitAccount extends StObject {
    
    /**
      * ARN of the organizational unit
      */
    var arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Email of the account
      */
    var email: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the organization unit
      */
    var id: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name for the organizational unit
      */
    var name: js.UndefOr[Input[String]] = js.native
  }
  object OrganizationalUnitAccount {
    
    @scala.inline
    def apply(): OrganizationalUnitAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationalUnitAccount]
    }
    
    @scala.inline
    implicit class OrganizationalUnitAccountMutableBuilder[Self <: OrganizationalUnitAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
