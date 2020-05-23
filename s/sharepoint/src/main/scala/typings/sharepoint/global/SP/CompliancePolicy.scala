package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.CompliancePolicy")
@js.native
object CompliancePolicy extends js.Object {
  @js.native
  class SPContainerId ()
    extends typings.sharepoint.SP.CompliancePolicy.SPContainerId
  
  @js.native
  class SPPolicyAssociation ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyAssociation
  
  @js.native
  class SPPolicyBinding ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyBinding
  
  @js.native
  class SPPolicyDefinition ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyDefinition
  
  @js.native
  class SPPolicyRule ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyRule
  
  @js.native
  class SPPolicyStore protected ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyStore {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web) = this()
  }
  
  @js.native
  class SPPolicyStoreProxy protected ()
    extends typings.sharepoint.SP.CompliancePolicy.SPPolicyStoreProxy {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web) = this()
  }
  
  /* static members */
  @js.native
  object SPContainerId extends js.Object {
    def create(context: typings.sharepoint.SP.ClientRuntimeContext, containerId: js.Any): typings.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    def createFromList(context: typings.sharepoint.SP.ClientRuntimeContext, list: typings.sharepoint.SP.List[_]): typings.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    def createFromSite(context: typings.sharepoint.SP.ClientRuntimeContext, site: typings.sharepoint.SP.Site): typings.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    def createFromWeb(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
  }
  
  @js.native
  object SPContainerType extends js.Object {
    /* 2 */ val list: typings.sharepoint.SP.CompliancePolicy.SPContainerType.list with Double = js.native
    /* 0 */ val site: typings.sharepoint.SP.CompliancePolicy.SPContainerType.site with Double = js.native
    /* 1 */ val web: typings.sharepoint.SP.CompliancePolicy.SPContainerType.web with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.CompliancePolicy.SPContainerType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object SPPolicyStore extends js.Object {
    def createPolicyAssociation(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyAssociation = js.native
    def createPolicyBinding(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyBinding = js.native
    def createPolicyDefinition(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyDefinition = js.native
    def createPolicyRule(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyRule = js.native
  }
  
}

