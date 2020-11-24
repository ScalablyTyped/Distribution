package typings.sharepoint.SP

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.CompliancePolicy")
@js.native
object CompliancePolicy extends js.Object {
  
  @js.native
  trait SPContainerId extends ClientObject {
    
    def get_containerType(): ContentType = js.native
    
    def get_listId(): Guid = js.native
    
    def get_siteId(): Guid = js.native
    
    def get_siteUrl(): String = js.native
    
    def get_tenantId(): Guid = js.native
    
    def get_title(): String = js.native
    
    def get_version(): js.Any = js.native
    
    def get_webId(): Guid = js.native
    
    def serialize(): StringResult = js.native
    
    def set_containerType(value: ContentType): ContentType = js.native
    
    def set_listId(value: Guid): Guid = js.native
    
    def set_siteId(value: Guid): Guid = js.native
    
    def set_siteUrl(value: String): String = js.native
    
    def set_tenantId(value: Guid): Guid = js.native
    
    def set_title(value: String): String = js.native
    
    def set_version(value: js.Any): js.Any = js.native
    
    def set_webId(value: Guid): Guid = js.native
  }
  
  @js.native
  sealed trait SPContainerType extends js.Object
  @js.native
  object SPContainerType extends js.Object {
    
    @js.native
    sealed trait list extends SPContainerType
    
     // : 0,
    @js.native
    sealed trait site extends SPContainerType
    
     // : 1,
    @js.native
    sealed trait web extends SPContainerType
  }
  
  @js.native
  trait SPPolicyAssociation extends ClientObject {
    
    def get_allowOverride(): Boolean = js.native
    
    def get_comment(): String = js.native
    
    def get_defaultPolicyDefinitionConfigId(): js.Array[_] = js.native
    
    def get_description(): String = js.native
    
    def get_identity(): Boolean = js.native
    
    def get_name(): String = js.native
    
    def get_policyApplyStatus(): js.Any = js.native
    
    def get_policyDefinitionConfigIds(): js.Array[_] = js.native
    
    def get_scope(): js.Any = js.native
    
    def get_source(): js.Any = js.native
    
    def get_version(): js.Any = js.native
    
    def get_whenAppliedUTC(): Date = js.native
    
    def get_whenChangedUTC(): Date = js.native
    
    def get_whenCreatedUTC(): Date = js.native
    
    def set_allowOverride(value: Boolean): Boolean = js.native
    
    def set_comment(value: String): String = js.native
    
    def set_defaultPolicyDefinitionConfigId(value: js.Array[_]): js.Array[_] = js.native
    
    def set_description(value: String): String = js.native
    
    def set_identity(value: Boolean): Boolean = js.native
    
    def set_name(value: String): String = js.native
    
    def set_policyApplyStatus(value: js.Any): js.Any = js.native
    
    def set_policyDefinitionConfigIds(value: js.Array[_]): js.Array[_] = js.native
    
    def set_scope(value: js.Any): js.Any = js.native
    
    def set_source(value: js.Any): js.Any = js.native
    
    def set_version(value: js.Any): js.Any = js.native
    
    def set_whenAppliedUTC(value: Date): Date = js.native
    
    def set_whenChangedUTC(value: Date): Date = js.native
    
    def set_whenCreatedUTC(value: Date): Date = js.native
  }
  
  @js.native
  trait SPPolicyBinding extends ClientObject {
    
    def get_identity(): js.Any = js.native
    
    def get_isExempt(): Boolean = js.native
    
    def get_mode(): js.Any = js.native
    
    def get_name(): String = js.native
    
    def get_policyApplyStatus(): js.Any = js.native
    
    def get_policyAssociationConfigId(): js.Any = js.native
    
    def get_policyDefinitionConfigId(): js.Any = js.native
    
    def get_policyRuleConfigId(): js.Any = js.native
    
    def get_scope(): js.Any = js.native
    
    def get_source(): js.Any = js.native
    
    def get_version(): js.Any = js.native
    
    def get_whenAppliedUTC(): Date = js.native
    
    def get_whenChangedUTC(): Date = js.native
    
    def get_whenCreatedUTC(): Date = js.native
    
    def set_identity(value: js.Any): js.Any = js.native
    
    def set_isExempt(value: Boolean): Boolean = js.native
    
    def set_mode(value: js.Any): js.Any = js.native
    
    def set_name(value: String): String = js.native
    
    def set_policyApplyStatus(value: js.Any): js.Any = js.native
    
    def set_policyAssociationConfigId(value: js.Any): js.Any = js.native
    
    def set_policyDefinitionConfigId(value: js.Any): js.Any = js.native
    
    def set_policyRuleConfigId(value: js.Any): js.Any = js.native
    
    def set_scope(value: js.Any): js.Any = js.native
    
    def set_source(value: js.Any): js.Any = js.native
    
    def set_version(value: js.Any): js.Any = js.native
    
    def set_whenAppliedUTC(value: Date): Date = js.native
    
    def set_whenChangedUTC(value: Date): Date = js.native
    
    def set_whenCreatedUTC(value: Date): Date = js.native
  }
  
  @js.native
  trait SPPolicyDefinition extends ClientObject {
    
    def get_comment(): String = js.native
    
    def get_createdBy(): js.Any = js.native
    
    def get_defaultPolicyRuleConfigId(): js.Any = js.native
    
    def get_description(): String = js.native
    
    def get_enabled(): Boolean = js.native
    
    def get_identity(): js.Any = js.native
    
    def get_lastModifiedBy(): js.Any = js.native
    
    def get_mode(): js.Any = js.native
    
    def get_name(): String = js.native
    
    def get_scenario(): js.Any = js.native
    
    def get_source(): js.Any = js.native
    
    def get_version(): js.Any = js.native
    
    def get_whenChangedUTC(): Date = js.native
    
    def get_whenCreatedUTC(): Date = js.native
    
    def set_comment(value: String): String = js.native
    
    def set_createdBy(value: js.Any): js.Any = js.native
    
    def set_defaultPolicyRuleConfigId(value: js.Any): js.Any = js.native
    
    def set_description(value: String): String = js.native
    
    def set_enabled(value: Boolean): Boolean = js.native
    
    def set_identity(value: js.Any): js.Any = js.native
    
    def set_lastModifiedBy(value: js.Any): js.Any = js.native
    
    def set_mode(value: js.Any): js.Any = js.native
    
    def set_name(value: String): String = js.native
    
    def set_scenario(value: js.Any): js.Any = js.native
    
    def set_source(value: js.Any): js.Any = js.native
    
    def set_version(value: js.Any): js.Any = js.native
    
    def set_whenChangedUTC(value: Date): Date = js.native
    
    def set_whenCreatedUTC(value: Date): Date = js.native
  }
  
  @js.native
  trait SPPolicyRule extends ClientObject {
    
    def get_comment(): String = js.native
    
    def get_createdBy(): js.Any = js.native
    
    def get_description(): String = js.native
    
    def get_enabled(): Boolean = js.native
    
    def get_identity(): js.Any = js.native
    
    def get_lastModifiedBy(): js.Any = js.native
    
    def get_mode(): js.Any = js.native
    
    def get_name(): String = js.native
    
    def get_policyDefinitionConfigId(): js.Any = js.native
    
    def get_priority(): js.Any = js.native
    
    def get_ruleBlob(): js.Any = js.native
    
    def get_whenChangedUTC(): Date = js.native
    
    def get_whenCreatedUTC(): Date = js.native
    
    def set_comment(value: String): String = js.native
    
    def set_createdBy(value: js.Any): js.Any = js.native
    
    def set_description(value: String): String = js.native
    
    def set_enabled(value: Boolean): Boolean = js.native
    
    def set_identity(value: js.Any): js.Any = js.native
    
    def set_lastModifiedBy(value: js.Any): js.Any = js.native
    
    def set_mode(value: js.Any): js.Any = js.native
    
    def set_name(value: String): String = js.native
    
    def set_policyDefinitionConfigId(value: js.Any): js.Any = js.native
    
    def set_priority(value: js.Any): js.Any = js.native
    
    def set_ruleBlob(value: js.Any): js.Any = js.native
    
    def set_whenChangedUTC(value: Date): Date = js.native
    
    def set_whenCreatedUTC(value: Date): Date = js.native
  }
  
  @js.native
  trait SPPolicyStore extends ClientObject {
    
    def deletePolicyAssociation(policyAssociationId: js.Any): Unit = js.native
    
    def deletePolicyBinding(policyBindingId: js.Any): Unit = js.native
    
    def deletePolicyDefinition(policyDefinitionId: js.Any): Unit = js.native
    
    def deletePolicyRule(policyRuleId: js.Any): Unit = js.native
    
    def getPolicyAssociation(policyAssociationId: js.Any): SPPolicyAssociation = js.native
    
    def getPolicyAssociationForContainer(containerId: SPContainerId): SPPolicyAssociation = js.native
    
    def getPolicyBinding(policyBindingId: js.Any): SPPolicyBinding = js.native
    
    def getPolicyDefinition(policyDefinitionId: js.Any): SPPolicyDefinition = js.native
    
    def getPolicyDefinitions(scenario: js.Any): ClientObjectList[SPPolicyDefinition] = js.native
    
    def getPolicyRule(policyRuleId: js.Any, throwIfNull: Boolean): SPPolicyRule = js.native
    
    def notifyUnifiedPolicySync(
      notificationId: js.Any,
      syncSvcUrl: String,
      changeInfos: js.Any,
      syncNow: Boolean,
      fullSyncForTenant: Boolean
    ): Unit = js.native
    
    def updatePolicyAssociation(policyAssociation: SPPolicyAssociation): Unit = js.native
    
    def updatePolicyBinding(policyBinding: SPPolicyBinding): Unit = js.native
    
    def updatePolicyDefinition(policyDefinition: SPPolicyDefinition): Unit = js.native
    
    def updatePolicyRule(policyRule: SPPolicyRule): Unit = js.native
  }
  
  @js.native
  trait SPPolicyStoreProxy extends ClientObject {
    
    def get_policyStoreUrl(): String = js.native
  }
}
