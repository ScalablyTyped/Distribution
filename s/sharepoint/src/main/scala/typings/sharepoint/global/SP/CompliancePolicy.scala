package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompliancePolicy {
  
  @JSGlobal("SP.CompliancePolicy.SPContainerId")
  @js.native
  open class SPContainerId ()
    extends StObject
       with typings.sharepoint.SP.CompliancePolicy.SPContainerId
  object SPContainerId {
    
    @JSGlobal("SP.CompliancePolicy.SPContainerId")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(context: typings.sharepoint.SP.ClientRuntimeContext, containerId: Any): typings.sharepoint.SP.CompliancePolicy.SPContainerId = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(context.asInstanceOf[js.Any], containerId.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.CompliancePolicy.SPContainerId]
    
    /* static member */
    inline def createFromList(context: typings.sharepoint.SP.ClientRuntimeContext, list: typings.sharepoint.SP.List[Any]): typings.sharepoint.SP.CompliancePolicy.SPContainerId = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromList")(context.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.CompliancePolicy.SPContainerId]
    
    /* static member */
    inline def createFromSite(context: typings.sharepoint.SP.ClientRuntimeContext, site: typings.sharepoint.SP.Site): typings.sharepoint.SP.CompliancePolicy.SPContainerId = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromSite")(context.asInstanceOf[js.Any], site.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.CompliancePolicy.SPContainerId]
    
    /* static member */
    inline def createFromWeb(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web): typings.sharepoint.SP.CompliancePolicy.SPContainerId = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromWeb")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.CompliancePolicy.SPContainerId]
  }
  
  @JSGlobal("SP.CompliancePolicy.SPContainerType")
  @js.native
  object SPContainerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.CompliancePolicy.SPContainerType & Double] = js.native
    
    /* 2 */ val list: typings.sharepoint.SP.CompliancePolicy.SPContainerType.list & Double = js.native
    
    /* 0 */ val site: typings.sharepoint.SP.CompliancePolicy.SPContainerType.site & Double = js.native
    
    /* 1 */ val web: typings.sharepoint.SP.CompliancePolicy.SPContainerType.web & Double = js.native
  }
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyAssociation")
  @js.native
  open class SPPolicyAssociation ()
    extends StObject
       with typings.sharepoint.SP.CompliancePolicy.SPPolicyAssociation
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyBinding")
  @js.native
  open class SPPolicyBinding ()
    extends StObject
       with typings.sharepoint.SP.CompliancePolicy.SPPolicyBinding
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyDefinition")
  @js.native
  open class SPPolicyDefinition ()
    extends StObject
       with typings.sharepoint.SP.CompliancePolicy.SPPolicyDefinition
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyRule")
  @js.native
  open class SPPolicyRule ()
    extends StObject
       with typings.sharepoint.SP.CompliancePolicy.SPPolicyRule
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyStore")
  @js.native
  open class SPPolicyStore protected ()
    extends StObject
       with typings.sharepoint.SP.CompliancePolicy.SPPolicyStore {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web) = this()
  }
  object SPPolicyStore {
    
    @JSGlobal("SP.CompliancePolicy.SPPolicyStore")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createPolicyAssociation(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createPolicyAssociation")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.CompliancePolicy.SPPolicyAssociation]
    
    /* static member */
    inline def createPolicyBinding(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyBinding = ^.asInstanceOf[js.Dynamic].applyDynamic("createPolicyBinding")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.CompliancePolicy.SPPolicyBinding]
    
    /* static member */
    inline def createPolicyDefinition(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createPolicyDefinition")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.CompliancePolicy.SPPolicyDefinition]
    
    /* static member */
    inline def createPolicyRule(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.CompliancePolicy.SPPolicyRule = ^.asInstanceOf[js.Dynamic].applyDynamic("createPolicyRule")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.CompliancePolicy.SPPolicyRule]
  }
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyStoreProxy")
  @js.native
  open class SPPolicyStoreProxy protected ()
    extends StObject
       with typings.sharepoint.SP.CompliancePolicy.SPPolicyStoreProxy {
    def this(context: typings.sharepoint.SP.ClientRuntimeContext, web: typings.sharepoint.SP.Web) = this()
  }
}
