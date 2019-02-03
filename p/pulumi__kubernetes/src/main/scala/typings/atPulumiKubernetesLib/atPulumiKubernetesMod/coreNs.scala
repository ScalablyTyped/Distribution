package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "core")
@js.native
object coreNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * Binding ties one object to another; for example, a pod is bound to a node by a scheduler.
      * Deprecated in 1.7, please use the bindings subresource of pods instead.
      */
    @js.native
    class Binding protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Binding {
      /**
        * Create a core.v1.Binding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Binding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Binding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ComponentStatus (and ComponentStatusList) holds the cluster validation info.
      */
    @js.native
    class ComponentStatus protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatus {
      /**
        * Create a core.v1.ComponentStatus resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatus) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatus, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Status of all the conditions for the component as a list of ComponentStatus objects.
      */
    @js.native
    class ComponentStatusList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatusList {
      /**
        * Create a core.v1.ComponentStatusList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatusList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatusList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ConfigMap holds configuration data for pods to consume.
      */
    @js.native
    class ConfigMap protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMap {
      /**
        * Create a core.v1.ConfigMap resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMap) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMap, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ConfigMapList is a resource containing a list of ConfigMap objects.
      */
    @js.native
    class ConfigMapList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMapList {
      /**
        * Create a core.v1.ConfigMapList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMapList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMapList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Endpoints is a collection of endpoints that implement the actual service. Example:
      *   Name: "mysvc",
      *   Subsets: [
      *     {
      *       Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
      *       Ports: [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
      *     },
      *     {
      *       Addresses: [{"ip": "10.10.3.3"}],
      *       Ports: [{"name": "a", "port": 93}, {"name": "b", "port": 76}]
      *     },
      *  ]
      */
    @js.native
    class Endpoints protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Endpoints {
      /**
        * Create a core.v1.Endpoints resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Endpoints) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Endpoints, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * EndpointsList is a list of endpoints.
      */
    @js.native
    class EndpointsList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EndpointsList {
      /**
        * Create a core.v1.EndpointsList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EndpointsList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EndpointsList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Event is a report of an event somewhere in the cluster.
      */
    @js.native
    class Event protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Event {
      /**
        * Create a core.v1.Event resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Event) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Event, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * EventList is a list of events.
      */
    @js.native
    class EventList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EventList {
      /**
        * Create a core.v1.EventList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EventList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EventList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * LimitRange sets resource usage limits for each kind of resource in a Namespace.
      */
    @js.native
    class LimitRange protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRange {
      /**
        * Create a core.v1.LimitRange resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRange) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRange, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * LimitRangeList is a list of LimitRange items.
      */
    @js.native
    class LimitRangeList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRangeList {
      /**
        * Create a core.v1.LimitRangeList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRangeList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRangeList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Namespace provides a scope for Names. Use of multiple namespaces is optional.
      */
    @js.native
    class Namespace protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Namespace {
      /**
        * Create a core.v1.Namespace resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Namespace) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Namespace, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * NamespaceList is a list of Namespaces.
      */
    @js.native
    class NamespaceList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NamespaceList {
      /**
        * Create a core.v1.NamespaceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NamespaceList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NamespaceList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Node is a worker node in Kubernetes. Each node will have a unique identifier in the cache
      * (i.e. in etcd).
      */
    @js.native
    class Node protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Node {
      /**
        * Create a core.v1.Node resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Node) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Node, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * NodeList is the whole list of all Nodes which have been registered with master.
      */
    @js.native
    class NodeList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NodeList {
      /**
        * Create a core.v1.NodeList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NodeList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NodeList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous
      * to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
      */
    @js.native
    class PersistentVolume protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolume {
      /**
        * Create a core.v1.PersistentVolume resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolume) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolume, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PersistentVolumeClaim is a user's request for and claim to a persistent volume
      */
    @js.native
    class PersistentVolumeClaim protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaim {
      /**
        * Create a core.v1.PersistentVolumeClaim resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PersistentVolumeClaimList is a list of PersistentVolumeClaim items.
      */
    @js.native
    class PersistentVolumeClaimList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaimList {
      /**
        * Create a core.v1.PersistentVolumeClaimList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaimList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaimList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PersistentVolumeList is a list of PersistentVolume items.
      */
    @js.native
    class PersistentVolumeList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeList {
      /**
        * Create a core.v1.PersistentVolumeList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Pod is a collection of containers that can run on a host. This resource is created by clients
      * and scheduled onto hosts.
      */
    @js.native
    class Pod protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Pod {
      /**
        * Create a core.v1.Pod resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Pod) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Pod, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PodList is a list of Pods.
      */
    @js.native
    class PodList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodList {
      /**
        * Create a core.v1.PodList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PodTemplate describes a template for creating copies of a predefined pod.
      */
    @js.native
    class PodTemplate protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplate {
      /**
        * Create a core.v1.PodTemplate resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplate) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplate, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PodTemplateList is a list of PodTemplates.
      */
    @js.native
    class PodTemplateList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplateList {
      /**
        * Create a core.v1.PodTemplateList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ReplicationController represents the configuration of a replication controller.
      */
    @js.native
    class ReplicationController protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationController {
      /**
        * Create a core.v1.ReplicationController resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationController) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationController, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ReplicationControllerList is a collection of replication controllers.
      */
    @js.native
    class ReplicationControllerList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationControllerList {
      /**
        * Create a core.v1.ReplicationControllerList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationControllerList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationControllerList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ResourceQuota sets aggregate quota restrictions enforced per namespace
      */
    @js.native
    class ResourceQuota protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuota {
      /**
        * Create a core.v1.ResourceQuota resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuota) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuota, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ResourceQuotaList is a list of ResourceQuota items.
      */
    @js.native
    class ResourceQuotaList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuotaList {
      /**
        * Create a core.v1.ResourceQuotaList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuotaList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuotaList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Secret holds secret data of a certain type. The total bytes of the values in the Data field
      * must be less than MaxSecretSize bytes.
      */
    @js.native
    class Secret protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Secret {
      /**
        * Create a core.v1.Secret resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Secret) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Secret, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * SecretList is a list of Secret.
      */
    @js.native
    class SecretList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.SecretList {
      /**
        * Create a core.v1.SecretList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.SecretList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.SecretList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Service is a named abstraction of software service (for example, mysql) consisting of local
      * port (for example 3306) that the proxy listens on, and the selector that determines which
      * pods will answer requests sent through the proxy.
      */
    @js.native
    class Service protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Service {
      /**
        * Create a core.v1.Service resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Service) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Service, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral
      * systems, for an identity * a principal that can be authenticated and authorized * a set of
      * secrets
      */
    @js.native
    class ServiceAccount protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccount {
      /**
        * Create a core.v1.ServiceAccount resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccount) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccount, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ServiceAccountList is a list of ServiceAccount objects
      */
    @js.native
    class ServiceAccountList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccountList {
      /**
        * Create a core.v1.ServiceAccountList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccountList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccountList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ServiceList holds a list of services.
      */
    @js.native
    class ServiceList protected ()
      extends atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceList {
      /**
        * Create a core.v1.ServiceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object Binding extends js.Object {
      /**
        * Get the state of an existing `Binding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Binding = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Binding = js.native
    }
    
    /* static members */
    @js.native
    object ComponentStatus extends js.Object {
      /**
        * Get the state of an existing `ComponentStatus` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatus = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatus = js.native
    }
    
    /* static members */
    @js.native
    object ComponentStatusList extends js.Object {
      /**
        * Get the state of an existing `ComponentStatusList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatusList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatusList = js.native
    }
    
    /* static members */
    @js.native
    object ConfigMap extends js.Object {
      /**
        * Get the state of an existing `ConfigMap` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMap = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMap = js.native
    }
    
    /* static members */
    @js.native
    object ConfigMapList extends js.Object {
      /**
        * Get the state of an existing `ConfigMapList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMapList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMapList = js.native
    }
    
    /* static members */
    @js.native
    object Endpoints extends js.Object {
      /**
        * Get the state of an existing `Endpoints` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Endpoints = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Endpoints = js.native
    }
    
    /* static members */
    @js.native
    object EndpointsList extends js.Object {
      /**
        * Get the state of an existing `EndpointsList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EndpointsList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EndpointsList = js.native
    }
    
    /* static members */
    @js.native
    object Event extends js.Object {
      /**
        * Get the state of an existing `Event` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Event = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Event = js.native
    }
    
    /* static members */
    @js.native
    object EventList extends js.Object {
      /**
        * Get the state of an existing `EventList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EventList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EventList = js.native
    }
    
    /* static members */
    @js.native
    object LimitRange extends js.Object {
      /**
        * Get the state of an existing `LimitRange` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRange = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRange = js.native
    }
    
    /* static members */
    @js.native
    object LimitRangeList extends js.Object {
      /**
        * Get the state of an existing `LimitRangeList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRangeList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRangeList = js.native
    }
    
    /* static members */
    @js.native
    object Namespace extends js.Object {
      /**
        * Get the state of an existing `Namespace` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Namespace = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Namespace = js.native
    }
    
    /* static members */
    @js.native
    object NamespaceList extends js.Object {
      /**
        * Get the state of an existing `NamespaceList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NamespaceList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NamespaceList = js.native
    }
    
    /* static members */
    @js.native
    object Node extends js.Object {
      /**
        * Get the state of an existing `Node` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Node = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Node = js.native
    }
    
    /* static members */
    @js.native
    object NodeList extends js.Object {
      /**
        * Get the state of an existing `NodeList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NodeList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NodeList = js.native
    }
    
    /* static members */
    @js.native
    object PersistentVolume extends js.Object {
      /**
        * Get the state of an existing `PersistentVolume` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolume = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolume = js.native
    }
    
    /* static members */
    @js.native
    object PersistentVolumeClaim extends js.Object {
      /**
        * Get the state of an existing `PersistentVolumeClaim` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaim = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaim = js.native
    }
    
    /* static members */
    @js.native
    object PersistentVolumeClaimList extends js.Object {
      /**
        * Get the state of an existing `PersistentVolumeClaimList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaimList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaimList = js.native
    }
    
    /* static members */
    @js.native
    object PersistentVolumeList extends js.Object {
      /**
        * Get the state of an existing `PersistentVolumeList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeList = js.native
    }
    
    /* static members */
    @js.native
    object Pod extends js.Object {
      /**
        * Get the state of an existing `Pod` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Pod = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Pod = js.native
    }
    
    /* static members */
    @js.native
    object PodList extends js.Object {
      /**
        * Get the state of an existing `PodList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodList = js.native
    }
    
    /* static members */
    @js.native
    object PodTemplate extends js.Object {
      /**
        * Get the state of an existing `PodTemplate` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplate = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplate = js.native
    }
    
    /* static members */
    @js.native
    object PodTemplateList extends js.Object {
      /**
        * Get the state of an existing `PodTemplateList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplateList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplateList = js.native
    }
    
    /* static members */
    @js.native
    object ReplicationController extends js.Object {
      /**
        * Get the state of an existing `ReplicationController` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationController = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationController = js.native
    }
    
    /* static members */
    @js.native
    object ReplicationControllerList extends js.Object {
      /**
        * Get the state of an existing `ReplicationControllerList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationControllerList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationControllerList = js.native
    }
    
    /* static members */
    @js.native
    object ResourceQuota extends js.Object {
      /**
        * Get the state of an existing `ResourceQuota` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuota = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuota = js.native
    }
    
    /* static members */
    @js.native
    object ResourceQuotaList extends js.Object {
      /**
        * Get the state of an existing `ResourceQuotaList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuotaList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuotaList = js.native
    }
    
    /* static members */
    @js.native
    object Secret extends js.Object {
      /**
        * Get the state of an existing `Secret` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Secret = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Secret = js.native
    }
    
    /* static members */
    @js.native
    object SecretList extends js.Object {
      /**
        * Get the state of an existing `SecretList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.SecretList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.SecretList = js.native
    }
    
    /* static members */
    @js.native
    object Service extends js.Object {
      /**
        * Get the state of an existing `Service` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Service = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Service = js.native
    }
    
    /* static members */
    @js.native
    object ServiceAccount extends js.Object {
      /**
        * Get the state of an existing `ServiceAccount` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccount = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccount = js.native
    }
    
    /* static members */
    @js.native
    object ServiceAccountList extends js.Object {
      /**
        * Get the state of an existing `ServiceAccountList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccountList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccountList = js.native
    }
    
    /* static members */
    @js.native
    object ServiceList extends js.Object {
      /**
        * Get the state of an existing `ServiceList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceList = js.native
    }
    
  }
  
}

