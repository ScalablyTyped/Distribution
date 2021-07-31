package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeSpec describes the attributes that a node is created with.
  */
trait NodeSpec extends StObject {
  
  /**
    * If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field
    */
  var configSource: js.UndefOr[Input[NodeConfigSource]] = js.undefined
  
  /**
    * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
    */
  var externalID: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * PodCIDR represents the pod IP range assigned to the node.
    */
  var podCIDR: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
    */
  var podCIDRs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
    */
  var providerID: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If specified, the node's taints.
    */
  var taints: js.UndefOr[Input[js.Array[Input[Taint]]]] = js.undefined
  
  /**
    * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
    */
  var unschedulable: js.UndefOr[Input[Boolean]] = js.undefined
}
object NodeSpec {
  
  @scala.inline
  def apply(): NodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSpec]
  }
  
  @scala.inline
  implicit class NodeSpecMutableBuilder[Self <: NodeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigSource(value: Input[NodeConfigSource]): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigSourceUndefined: Self = StObject.set(x, "configSource", js.undefined)
    
    @scala.inline
    def setExternalID(value: Input[String]): Self = StObject.set(x, "externalID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIDUndefined: Self = StObject.set(x, "externalID", js.undefined)
    
    @scala.inline
    def setPodCIDR(value: Input[String]): Self = StObject.set(x, "podCIDR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodCIDRUndefined: Self = StObject.set(x, "podCIDR", js.undefined)
    
    @scala.inline
    def setPodCIDRs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "podCIDRs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodCIDRsUndefined: Self = StObject.set(x, "podCIDRs", js.undefined)
    
    @scala.inline
    def setPodCIDRsVarargs(value: Input[String]*): Self = StObject.set(x, "podCIDRs", js.Array(value :_*))
    
    @scala.inline
    def setProviderID(value: Input[String]): Self = StObject.set(x, "providerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIDUndefined: Self = StObject.set(x, "providerID", js.undefined)
    
    @scala.inline
    def setTaints(value: Input[js.Array[Input[Taint]]]): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    @scala.inline
    def setTaintsVarargs(value: Input[Taint]*): Self = StObject.set(x, "taints", js.Array(value :_*))
    
    @scala.inline
    def setUnschedulable(value: Input[Boolean]): Self = StObject.set(x, "unschedulable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnschedulableUndefined: Self = StObject.set(x, "unschedulable", js.undefined)
  }
}
