package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompliancePolicy {
  
  @js.native
  sealed trait SPContainerType extends StObject
  @JSGlobal("SP.CompliancePolicy.SPContainerType")
  @js.native
  object SPContainerType extends StObject {
    
    // : 1,
    @js.native
    sealed trait list
      extends StObject
         with SPContainerType
    
    @js.native
    sealed trait site
      extends StObject
         with SPContainerType
    
    // : 0,
    @js.native
    sealed trait web
      extends StObject
         with SPContainerType
  }
  
  @js.native
  trait SPContainerId
    extends StObject
       with ClientObject {
    
    def get_containerType(): ContentType = js.native
    
    def get_listId(): Guid = js.native
    
    def get_siteId(): Guid = js.native
    
    def get_siteUrl(): String = js.native
    
    def get_tenantId(): Guid = js.native
    
    def get_title(): String = js.native
    
    def get_version(): Any = js.native
    
    def get_webId(): Guid = js.native
    
    def serialize(): StringResult = js.native
    
    def set_containerType(value: ContentType): ContentType = js.native
    
    def set_listId(value: Guid): Guid = js.native
    
    def set_siteId(value: Guid): Guid = js.native
    
    def set_siteUrl(value: String): String = js.native
    
    def set_tenantId(value: Guid): Guid = js.native
    
    def set_title(value: String): String = js.native
    
    def set_version(value: Any): Any = js.native
    
    def set_webId(value: Guid): Guid = js.native
  }
  
  @js.native
  trait SPPolicyAssociation
    extends StObject
       with ClientObject {
    
    def get_allowOverride(): Boolean = js.native
    
    def get_comment(): String = js.native
    
    def get_defaultPolicyDefinitionConfigId(): js.Array[Any] = js.native
    
    def get_description(): String = js.native
    
    def get_identity(): Boolean = js.native
    
    def get_name(): String = js.native
    
    def get_policyApplyStatus(): Any = js.native
    
    def get_policyDefinitionConfigIds(): js.Array[Any] = js.native
    
    def get_scope(): Any = js.native
    
    def get_source(): Any = js.native
    
    def get_version(): Any = js.native
    
    def get_whenAppliedUTC(): js.Date = js.native
    
    def get_whenChangedUTC(): js.Date = js.native
    
    def get_whenCreatedUTC(): js.Date = js.native
    
    def set_allowOverride(value: Boolean): Boolean = js.native
    
    def set_comment(value: String): String = js.native
    
    def set_defaultPolicyDefinitionConfigId(value: js.Array[Any]): js.Array[Any] = js.native
    
    def set_description(value: String): String = js.native
    
    def set_identity(value: Boolean): Boolean = js.native
    
    def set_name(value: String): String = js.native
    
    def set_policyApplyStatus(value: Any): Any = js.native
    
    def set_policyDefinitionConfigIds(value: js.Array[Any]): js.Array[Any] = js.native
    
    def set_scope(value: Any): Any = js.native
    
    def set_source(value: Any): Any = js.native
    
    def set_version(value: Any): Any = js.native
    
    def set_whenAppliedUTC(value: js.Date): js.Date = js.native
    
    def set_whenChangedUTC(value: js.Date): js.Date = js.native
    
    def set_whenCreatedUTC(value: js.Date): js.Date = js.native
  }
  
  @js.native
  trait SPPolicyBinding
    extends StObject
       with ClientObject {
    
    def get_identity(): Any = js.native
    
    def get_isExempt(): Boolean = js.native
    
    def get_mode(): Any = js.native
    
    def get_name(): String = js.native
    
    def get_policyApplyStatus(): Any = js.native
    
    def get_policyAssociationConfigId(): Any = js.native
    
    def get_policyDefinitionConfigId(): Any = js.native
    
    def get_policyRuleConfigId(): Any = js.native
    
    def get_scope(): Any = js.native
    
    def get_source(): Any = js.native
    
    def get_version(): Any = js.native
    
    def get_whenAppliedUTC(): js.Date = js.native
    
    def get_whenChangedUTC(): js.Date = js.native
    
    def get_whenCreatedUTC(): js.Date = js.native
    
    def set_identity(value: Any): Any = js.native
    
    def set_isExempt(value: Boolean): Boolean = js.native
    
    def set_mode(value: Any): Any = js.native
    
    def set_name(value: String): String = js.native
    
    def set_policyApplyStatus(value: Any): Any = js.native
    
    def set_policyAssociationConfigId(value: Any): Any = js.native
    
    def set_policyDefinitionConfigId(value: Any): Any = js.native
    
    def set_policyRuleConfigId(value: Any): Any = js.native
    
    def set_scope(value: Any): Any = js.native
    
    def set_source(value: Any): Any = js.native
    
    def set_version(value: Any): Any = js.native
    
    def set_whenAppliedUTC(value: js.Date): js.Date = js.native
    
    def set_whenChangedUTC(value: js.Date): js.Date = js.native
    
    def set_whenCreatedUTC(value: js.Date): js.Date = js.native
  }
  
  @js.native
  trait SPPolicyDefinition
    extends StObject
       with ClientObject {
    
    def get_comment(): String = js.native
    
    def get_createdBy(): Any = js.native
    
    def get_defaultPolicyRuleConfigId(): Any = js.native
    
    def get_description(): String = js.native
    
    def get_enabled(): Boolean = js.native
    
    def get_identity(): Any = js.native
    
    def get_lastModifiedBy(): Any = js.native
    
    def get_mode(): Any = js.native
    
    def get_name(): String = js.native
    
    def get_scenario(): Any = js.native
    
    def get_source(): Any = js.native
    
    def get_version(): Any = js.native
    
    def get_whenChangedUTC(): js.Date = js.native
    
    def get_whenCreatedUTC(): js.Date = js.native
    
    def set_comment(value: String): String = js.native
    
    def set_createdBy(value: Any): Any = js.native
    
    def set_defaultPolicyRuleConfigId(value: Any): Any = js.native
    
    def set_description(value: String): String = js.native
    
    def set_enabled(value: Boolean): Boolean = js.native
    
    def set_identity(value: Any): Any = js.native
    
    def set_lastModifiedBy(value: Any): Any = js.native
    
    def set_mode(value: Any): Any = js.native
    
    def set_name(value: String): String = js.native
    
    def set_scenario(value: Any): Any = js.native
    
    def set_source(value: Any): Any = js.native
    
    def set_version(value: Any): Any = js.native
    
    def set_whenChangedUTC(value: js.Date): js.Date = js.native
    
    def set_whenCreatedUTC(value: js.Date): js.Date = js.native
  }
  
  @js.native
  trait SPPolicyRule
    extends StObject
       with ClientObject {
    
    def get_comment(): String = js.native
    
    def get_createdBy(): Any = js.native
    
    def get_description(): String = js.native
    
    def get_enabled(): Boolean = js.native
    
    def get_identity(): Any = js.native
    
    def get_lastModifiedBy(): Any = js.native
    
    def get_mode(): Any = js.native
    
    def get_name(): String = js.native
    
    def get_policyDefinitionConfigId(): Any = js.native
    
    def get_priority(): Any = js.native
    
    def get_ruleBlob(): Any = js.native
    
    def get_whenChangedUTC(): js.Date = js.native
    
    def get_whenCreatedUTC(): js.Date = js.native
    
    def set_comment(value: String): String = js.native
    
    def set_createdBy(value: Any): Any = js.native
    
    def set_description(value: String): String = js.native
    
    def set_enabled(value: Boolean): Boolean = js.native
    
    def set_identity(value: Any): Any = js.native
    
    def set_lastModifiedBy(value: Any): Any = js.native
    
    def set_mode(value: Any): Any = js.native
    
    def set_name(value: String): String = js.native
    
    def set_policyDefinitionConfigId(value: Any): Any = js.native
    
    def set_priority(value: Any): Any = js.native
    
    def set_ruleBlob(value: Any): Any = js.native
    
    def set_whenChangedUTC(value: js.Date): js.Date = js.native
    
    def set_whenCreatedUTC(value: js.Date): js.Date = js.native
  }
  
  @js.native
  trait SPPolicyStore
    extends StObject
       with ClientObject {
    
    def deletePolicyAssociation(policyAssociationId: Any): Unit = js.native
    
    def deletePolicyBinding(policyBindingId: Any): Unit = js.native
    
    def deletePolicyDefinition(policyDefinitionId: Any): Unit = js.native
    
    def deletePolicyRule(policyRuleId: Any): Unit = js.native
    
    def getPolicyAssociation(policyAssociationId: Any): SPPolicyAssociation = js.native
    
    def getPolicyAssociationForContainer(containerId: SPContainerId): SPPolicyAssociation = js.native
    
    def getPolicyBinding(policyBindingId: Any): SPPolicyBinding = js.native
    
    def getPolicyDefinition(policyDefinitionId: Any): SPPolicyDefinition = js.native
    
    def getPolicyDefinitions(scenario: Any): ClientObjectList[SPPolicyDefinition] = js.native
    
    def getPolicyRule(policyRuleId: Any, throwIfNull: Boolean): SPPolicyRule = js.native
    
    def notifyUnifiedPolicySync(
      notificationId: Any,
      syncSvcUrl: String,
      changeInfos: Any,
      syncNow: Boolean,
      fullSyncForTenant: Boolean
    ): Unit = js.native
    
    def updatePolicyAssociation(policyAssociation: SPPolicyAssociation): Unit = js.native
    
    def updatePolicyBinding(policyBinding: SPPolicyBinding): Unit = js.native
    
    def updatePolicyDefinition(policyDefinition: SPPolicyDefinition): Unit = js.native
    
    def updatePolicyRule(policyRule: SPPolicyRule): Unit = js.native
  }
  
  @js.native
  trait SPPolicyStoreProxy
    extends StObject
       with ClientObject {
    
    def get_policyStoreUrl(): String = js.native
  }
}
