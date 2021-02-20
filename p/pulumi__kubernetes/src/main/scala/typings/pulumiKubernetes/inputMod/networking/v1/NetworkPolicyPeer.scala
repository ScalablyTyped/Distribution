package typings.pulumiKubernetes.inputMod.networking.v1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicyPeer describes a peer to allow traffic to/from. Only certain combinations of fields are allowed
  */
@js.native
trait NetworkPolicyPeer extends StObject {
  
  /**
    * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
    */
  var ipBlock: js.UndefOr[Input[IPBlock]] = js.native
  
  /**
    * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
    *
    * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
    */
  var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.native
  
  /**
    * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
    *
    * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
    */
  var podSelector: js.UndefOr[Input[LabelSelector]] = js.native
}
object NetworkPolicyPeer {
  
  @scala.inline
  def apply(): NetworkPolicyPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyPeer]
  }
  
  @scala.inline
  implicit class NetworkPolicyPeerMutableBuilder[Self <: NetworkPolicyPeer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpBlock(value: Input[IPBlock]): Self = StObject.set(x, "ipBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpBlockUndefined: Self = StObject.set(x, "ipBlock", js.undefined)
    
    @scala.inline
    def setNamespaceSelector(value: Input[LabelSelector]): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceSelectorUndefined: Self = StObject.set(x, "namespaceSelector", js.undefined)
    
    @scala.inline
    def setPodSelector(value: Input[LabelSelector]): Self = StObject.set(x, "podSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodSelectorUndefined: Self = StObject.set(x, "podSelector", js.undefined)
  }
}
