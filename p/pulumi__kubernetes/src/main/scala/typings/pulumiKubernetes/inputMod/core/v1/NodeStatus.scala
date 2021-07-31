package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeStatus is information about the current status of a node.
  */
trait NodeStatus extends StObject {
  
  /**
    * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.
    */
  var addresses: js.UndefOr[Input[js.Array[Input[NodeAddress]]]] = js.undefined
  
  /**
    * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
    */
  var allocatable: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
    */
  var conditions: js.UndefOr[Input[js.Array[Input[NodeCondition]]]] = js.undefined
  
  /**
    * Status of the config assigned to the node via the dynamic Kubelet config feature.
    */
  var config: js.UndefOr[Input[NodeConfigStatus]] = js.undefined
  
  /**
    * Endpoints of daemons running on the Node.
    */
  var daemonEndpoints: js.UndefOr[Input[NodeDaemonEndpoints]] = js.undefined
  
  /**
    * List of container images on this node
    */
  var images: js.UndefOr[Input[js.Array[Input[ContainerImage]]]] = js.undefined
  
  /**
    * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
    */
  var nodeInfo: js.UndefOr[Input[NodeSystemInfo]] = js.undefined
  
  /**
    * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * List of volumes that are attached to the node.
    */
  var volumesAttached: js.UndefOr[Input[js.Array[Input[AttachedVolume]]]] = js.undefined
  
  /**
    * List of attachable volumes in use (mounted) by the node.
    */
  var volumesInUse: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object NodeStatus {
  
  @scala.inline
  def apply(): NodeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeStatus]
  }
  
  @scala.inline
  implicit class NodeStatusMutableBuilder[Self <: NodeStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: Input[js.Array[Input[NodeAddress]]]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: Input[NodeAddress]*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setAllocatable(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "allocatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatableUndefined: Self = StObject.set(x, "allocatable", js.undefined)
    
    @scala.inline
    def setCapacity(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[NodeCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[NodeCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: Input[NodeConfigStatus]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDaemonEndpoints(value: Input[NodeDaemonEndpoints]): Self = StObject.set(x, "daemonEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaemonEndpointsUndefined: Self = StObject.set(x, "daemonEndpoints", js.undefined)
    
    @scala.inline
    def setImages(value: Input[js.Array[Input[ContainerImage]]]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: Input[ContainerImage]*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setNodeInfo(value: Input[NodeSystemInfo]): Self = StObject.set(x, "nodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeInfoUndefined: Self = StObject.set(x, "nodeInfo", js.undefined)
    
    @scala.inline
    def setPhase(value: Input[String]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    @scala.inline
    def setVolumesAttached(value: Input[js.Array[Input[AttachedVolume]]]): Self = StObject.set(x, "volumesAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesAttachedUndefined: Self = StObject.set(x, "volumesAttached", js.undefined)
    
    @scala.inline
    def setVolumesAttachedVarargs(value: Input[AttachedVolume]*): Self = StObject.set(x, "volumesAttached", js.Array(value :_*))
    
    @scala.inline
    def setVolumesInUse(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "volumesInUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesInUseUndefined: Self = StObject.set(x, "volumesInUse", js.undefined)
    
    @scala.inline
    def setVolumesInUseVarargs(value: Input[String]*): Self = StObject.set(x, "volumesInUse", js.Array(value :_*))
  }
}
