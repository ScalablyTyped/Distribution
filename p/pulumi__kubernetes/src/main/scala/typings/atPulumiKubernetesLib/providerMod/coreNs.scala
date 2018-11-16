package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "core")
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.Binding resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.Binding resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Binding) = this()
      /**
                  * Create a core.v1.Binding resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Binding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * The target object that you want to bind to the standard object.
                   */
      val target: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Binding = js.native
    }
    
    /**
             * ComponentStatus (and ComponentStatusList) holds the cluster validation info.
             */
    @js.native
    class ComponentStatus protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ComponentStatus resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ComponentStatus resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatus) = this()
      /**
                  * Create a core.v1.ComponentStatus resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatus, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of component conditions observed
                   */
      val conditions: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentCondition]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatus = js.native
    }
    
    /**
             * Status of all the conditions for the component as a list of ComponentStatus objects.
             */
    @js.native
    class ComponentStatusList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ComponentStatusList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ComponentStatusList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatusList) = this()
      /**
                  * Create a core.v1.ComponentStatusList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatusList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of ComponentStatus objects.
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ComponentStatus]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ComponentStatusList = js.native
    }
    
    /**
             * ConfigMap holds configuration data for pods to consume.
             */
    @js.native
    class ConfigMap protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ConfigMap resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ConfigMap resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMap) = this()
      /**
                  * Create a core.v1.ConfigMap resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMap, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Data contains the configuration data. Each key must consist of alphanumeric characters,
                   * '-', '_' or '.'.
                   */
      val data: atPulumiPulumiLib.pulumiMod.Output[
            ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
          ] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMap = js.native
    }
    
    /**
             * ConfigMapList is a resource containing a list of ConfigMap objects.
             */
    @js.native
    class ConfigMapList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ConfigMapList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ConfigMapList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMapList) = this()
      /**
                  * Create a core.v1.ConfigMapList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMapList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Items is the list of ConfigMaps.
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ConfigMap]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMapList = js.native
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.Endpoints resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.Endpoints resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Endpoints) = this()
      /**
                  * Create a core.v1.Endpoints resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Endpoints, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * The set of all endpoints is the union of all subsets. Addresses are placed into subsets
                   * according to the IPs they share. A single address with multiple ports, some of which are
                   * ready and some of which are not (because they come from different containers) will result
                   * in the address being displayed in different subsets for the different ports. No address
                   * will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses
                   * and ports that comprise a service.
                   */
      val subsets: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EndpointSubset]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Endpoints = js.native
    }
    
    /**
             * EndpointsList is a list of endpoints.
             */
    @js.native
    class EndpointsList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.EndpointsList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.EndpointsList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EndpointsList) = this()
      /**
                  * Create a core.v1.EndpointsList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EndpointsList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of endpoints.
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Endpoints]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EndpointsList = js.native
    }
    
    /**
             * Event is a report of an event somewhere in the cluster.
             */
    @js.native
    class Event protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.Event resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.Event resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Event) = this()
      /**
                  * Create a core.v1.Event resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Event, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * What action was taken/failed regarding to the Regarding object.
                   */
      val action: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * The number of times this event has occurred.
                   */
      val count: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
      /**
                   * Time when this Event was first observed.
                   */
      val eventTime: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
                   */
      val firstTimestamp: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * The object that this event is about.
                   */
      val involvedObject: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * The time at which the most recent occurrence of this event was recorded.
                   */
      val lastTimestamp: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * A human-readable description of the status of this operation.
                   */
      val message: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * This should be a short, machine understandable string that gives the reason for the
                   * transition into the object's current status.
                   */
      val reason: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Optional secondary object for more complex actions.
                   */
      val related: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
      /**
                   * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
                   */
      val reportingComponent: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * ID of the controller instance, e.g. `kubelet-xyzf`.
                   */
      val reportingInstance: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Data about the Event series this event represents or nil if it's a singleton Event.
                   */
      val series: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSeries] = js.native
      /**
                   * The component reporting this event. Should be a short machine understandable string.
                   */
      val source: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
      /**
                   * Type of this event (Normal, Warning), new types could be added in the future
                   */
      val `type`: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Event = js.native
    }
    
    /**
             * EventList is a list of events.
             */
    @js.native
    class EventList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.EventList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.EventList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EventList) = this()
      /**
                  * Create a core.v1.EventList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EventList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of events
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Event]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EventList = js.native
    }
    
    /**
             * LimitRange sets resource usage limits for each kind of resource in a Namespace.
             */
    @js.native
    class LimitRange protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.LimitRange resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.LimitRange resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRange) = this()
      /**
                  * Create a core.v1.LimitRange resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRange, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Spec defines the limits enforced. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRangeSpec] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRange = js.native
    }
    
    /**
             * LimitRangeList is a list of LimitRange items.
             */
    @js.native
    class LimitRangeList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.LimitRangeList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.LimitRangeList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRangeList) = this()
      /**
                  * Create a core.v1.LimitRangeList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRangeList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Items is a list of LimitRange objects. More info:
                   * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LimitRange]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LimitRangeList = js.native
    }
    
    /**
             * Namespace provides a scope for Names. Use of multiple namespaces is optional.
             */
    @js.native
    class Namespace protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.Namespace resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.Namespace resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Namespace) = this()
      /**
                  * Create a core.v1.Namespace resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Namespace, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Spec defines the behavior of the Namespace. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceSpec] = js.native
      /**
                   * Status describes the current status of a Namespace. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NamespaceStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Namespace = js.native
    }
    
    /**
             * NamespaceList is a list of Namespaces.
             */
    @js.native
    class NamespaceList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.NamespaceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.NamespaceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NamespaceList) = this()
      /**
                  * Create a core.v1.NamespaceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NamespaceList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Items is the list of Namespace objects in the list. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Namespace]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NamespaceList = js.native
    }
    
    /**
             * Node is a worker node in Kubernetes. Each node will have a unique identifier in the cache
             * (i.e. in etcd).
             */
    @js.native
    class Node protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.Node resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.Node resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Node) = this()
      /**
                  * Create a core.v1.Node resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Node, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Spec defines the behavior of a node.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeSpec] = js.native
      /**
                   * Most recently observed status of the node. Populated by the system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.NodeStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Node = js.native
    }
    
    /**
             * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding
             * metadata) must be non-nil.
             */
    @js.native
    class NodeConfigSource protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.NodeConfigSource resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.NodeConfigSource resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NodeConfigSource) = this()
      /**
                  * Create a core.v1.NodeConfigSource resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NodeConfigSource, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val configMapRef: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NodeConfigSource = js.native
    }
    
    /**
             * NodeList is the whole list of all Nodes which have been registered with master.
             */
    @js.native
    class NodeList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.NodeList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.NodeList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NodeList) = this()
      /**
                  * Create a core.v1.NodeList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NodeList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of nodes
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Node]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.NodeList = js.native
    }
    
    /**
             * ObjectReference contains enough information to let you inspect or modify the referred object.
             */
    @js.native
    class ObjectReference protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ObjectReference resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ObjectReference resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ObjectReference) = this()
      /**
                  * Create a core.v1.ObjectReference resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ObjectReference, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * API version of the referent.
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * If referring to a piece of an object instead of an entire object, this string should
                   * contain a valid JSON/Go field access statement, such as
                   * desiredState.manifest.containers[2]. For example, if the object reference is to a container
                   * within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers
                   * to the name of the container that triggered the event) or if no container name is specified
                   * "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to
                   * have some well-defined way of referencing a part of an object.
                   */
      val fieldPath: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind of the referent. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Namespace of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
                   */
      val namespace: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Specific resourceVersion to which this reference is made, if any. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
                   */
      val resourceVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * UID of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
                   */
      val uid: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ObjectReference = js.native
    }
    
    /**
             * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous
             * to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
             */
    @js.native
    class PersistentVolume protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.PersistentVolume resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.PersistentVolume resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolume) = this()
      /**
                  * Create a core.v1.PersistentVolume resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolume, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an
                   * administrator. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeSpec] = js.native
      /**
                   * Status represents the current information/status for the persistent volume. Populated by
                   * the system. Read-only. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolume = js.native
    }
    
    /**
             * PersistentVolumeClaim is a user's request for and claim to a persistent volume
             */
    @js.native
    class PersistentVolumeClaim protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.PersistentVolumeClaim resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.PersistentVolumeClaim resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim) = this()
      /**
                  * Create a core.v1.PersistentVolumeClaim resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Spec defines the desired characteristics of a volume requested by a pod author. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimSpec] = js.native
      /**
                   * Status represents the current information/status of a persistent volume claim. Read-only.
                   * More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim = js.native
    }
    
    /**
             * PersistentVolumeClaimList is a list of PersistentVolumeClaim items.
             */
    @js.native
    class PersistentVolumeClaimList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.PersistentVolumeClaimList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.PersistentVolumeClaimList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaimList) = this()
      /**
                  * Create a core.v1.PersistentVolumeClaimList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaimList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * A list of persistent volume claims. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaim]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaimList = js.native
    }
    
    /**
             * PersistentVolumeList is a list of PersistentVolume items.
             */
    @js.native
    class PersistentVolumeList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.PersistentVolumeList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.PersistentVolumeList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeList) = this()
      /**
                  * Create a core.v1.PersistentVolumeList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of persistent volumes. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PersistentVolume]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeList = js.native
    }
    
    /**
             * Pod is a collection of containers that can run on a host. This resource is created by clients
             * and scheduled onto hosts.
             */
    @js.native
    class Pod protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.Pod resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.Pod resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Pod) = this()
      /**
                  * Create a core.v1.Pod resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Pod, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Specification of the desired behavior of the pod. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodSpec] = js.native
      /**
                   * Most recently observed status of the pod. This data may not be up to date. Populated by the
                   * system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Pod = js.native
    }
    
    /**
             * PodList is a list of Pods.
             */
    @js.native
    class PodList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.PodList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.PodList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodList) = this()
      /**
                  * Create a core.v1.PodList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of pods. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Pod]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodList = js.native
    }
    
    /**
             * PodTemplate describes a template for creating copies of a predefined pod.
             */
    @js.native
    class PodTemplate protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.PodTemplate resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.PodTemplate resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplate) = this()
      /**
                  * Create a core.v1.PodTemplate resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplate, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Template defines the pods that will be created from this pod template.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val template: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplateSpec] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplate = js.native
    }
    
    /**
             * PodTemplateList is a list of PodTemplates.
             */
    @js.native
    class PodTemplateList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.PodTemplateList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.PodTemplateList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateList) = this()
      /**
                  * Create a core.v1.PodTemplateList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of pod templates
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.PodTemplate]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateList = js.native
    }
    
    /**
             * ReplicationController represents the configuration of a replication controller.
             */
    @js.native
    class ReplicationController protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ReplicationController resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ReplicationController resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationController) = this()
      /**
                  * Create a core.v1.ReplicationController resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationController, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * If the Labels of a ReplicationController are empty, they are defaulted to be the same as
                   * the Pod(s) that the replication controller manages. Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Spec defines the specification of the desired behavior of the replication controller. More
                   * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerSpec] = js.native
      /**
                   * Status is the most recently observed status of the replication controller. This data may be
                   * out of date by some window of time. Populated by the system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationControllerStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationController = js.native
    }
    
    /**
             * ReplicationControllerList is a collection of replication controllers.
             */
    @js.native
    class ReplicationControllerList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ReplicationControllerList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ReplicationControllerList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationControllerList) = this()
      /**
                  * Create a core.v1.ReplicationControllerList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationControllerList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of replication controllers. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ReplicationController]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ReplicationControllerList = js.native
    }
    
    /**
             * ResourceQuota sets aggregate quota restrictions enforced per namespace
             */
    @js.native
    class ResourceQuota protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ResourceQuota resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ResourceQuota resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuota) = this()
      /**
                  * Create a core.v1.ResourceQuota resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuota, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Spec defines the desired quota.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaSpec] = js.native
      /**
                   * Status defines the actual enforced quota and its current usage.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuotaStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuota = js.native
    }
    
    /**
             * ResourceQuotaList is a list of ResourceQuota items.
             */
    @js.native
    class ResourceQuotaList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ResourceQuotaList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ResourceQuotaList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuotaList) = this()
      /**
                  * Create a core.v1.ResourceQuotaList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuotaList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Items is a list of ResourceQuota objects. More info:
                   * https://kubernetes.io/docs/concepts/policy/resource-quotas/
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ResourceQuota]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuotaList = js.native
    }
    
    /**
             * Secret holds secret data of a certain type. The total bytes of the values in the Data field
             * must be less than MaxSecretSize bytes.
             */
    @js.native
    class Secret protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.Secret resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.Secret resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Secret) = this()
      /**
                  * Create a core.v1.Secret resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Secret, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_'
                   * or '.'. The serialized form of the secret data is a base64 encoded string, representing the
                   * arbitrary (possibly non-string) data value here. Described in
                   * https://tools.ietf.org/html/rfc4648#section-4
                   */
      val data: atPulumiPulumiLib.pulumiMod.Output[js.Object] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * stringData allows specifying non-binary secret data in string form. It is provided as a
                   * write-only convenience method. All keys and values are merged into the data field on write,
                   * overwriting any existing values. It is never output when reading from the API.
                   */
      val stringData: atPulumiPulumiLib.pulumiMod.Output[
            ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
          ] = js.native
      /**
                   * Used to facilitate programmatic handling of secret data.
                   */
      val `type`: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Secret = js.native
    }
    
    /**
             * SecretList is a list of Secret.
             */
    @js.native
    class SecretList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.SecretList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.SecretList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.SecretList) = this()
      /**
                  * Create a core.v1.SecretList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.SecretList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Items is a list of secret objects. More info:
                   * https://kubernetes.io/docs/concepts/configuration/secret
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Secret]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.SecretList = js.native
    }
    
    /**
             * Service is a named abstraction of software service (for example, mysql) consisting of local
             * port (for example 3306) that the proxy listens on, and the selector that determines which
             * pods will answer requests sent through the proxy.
             */
    @js.native
    class Service protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.Service resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.Service resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Service) = this()
      /**
                  * Create a core.v1.Service resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Service, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Spec defines the behavior of a service.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceSpec] = js.native
      /**
                   * Most recently observed status of the service. Populated by the system. Read-only. More
                   * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Service = js.native
    }
    
    /**
             * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral
             * systems, for an identity * a principal that can be authenticated and authorized * a set of
             * secrets
             */
    @js.native
    class ServiceAccount protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ServiceAccount resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ServiceAccount resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccount) = this()
      /**
                  * Create a core.v1.ServiceAccount resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccount, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * AutomountServiceAccountToken indicates whether pods running as this service account should
                   * have an API token automatically mounted. Can be overridden at the pod level.
                   */
      val automountServiceAccountToken: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
      /**
                   * ImagePullSecrets is a list of references to secrets in the same namespace to use for
                   * pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are
                   * distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are
                   * only accessed by the kubelet. More info:
                   * https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
                   */
      val imagePullSecrets: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LocalObjectReference]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Secrets is the list of secrets allowed to be used by pods running using this
                   * ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
                   */
      val secrets: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccount = js.native
    }
    
    /**
             * ServiceAccountList is a list of ServiceAccount objects
             */
    @js.native
    class ServiceAccountList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ServiceAccountList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ServiceAccountList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccountList) = this()
      /**
                  * Create a core.v1.ServiceAccountList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccountList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of ServiceAccounts. More info:
                   * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ServiceAccount]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceAccountList = js.native
    }
    
    /**
             * ServiceList holds a list of services.
             */
    @js.native
    class ServiceList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a core.v1.ServiceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a core.v1.ServiceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceList) = this()
      /**
                  * Create a core.v1.ServiceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * List of services
                   */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.Service]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ServiceList = js.native
    }
    
    /**
             * Binding ties one object to another; for example, a pod is bound to a node by a scheduler.
             * Deprecated in 1.7, please use the bindings subresource of pods instead.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Binding = js.native
    }
    
    /**
             * ComponentStatus (and ComponentStatusList) holds the cluster validation info.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatus = js.native
    }
    
    /**
             * Status of all the conditions for the component as a list of ComponentStatus objects.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ComponentStatusList = js.native
    }
    
    /**
             * ConfigMap holds configuration data for pods to consume.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMap = js.native
    }
    
    /**
             * ConfigMapList is a resource containing a list of ConfigMap objects.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ConfigMapList = js.native
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Endpoints = js.native
    }
    
    /**
             * EndpointsList is a list of endpoints.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EndpointsList = js.native
    }
    
    /**
             * Event is a report of an event somewhere in the cluster.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Event = js.native
    }
    
    /**
             * EventList is a list of events.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.EventList = js.native
    }
    
    /**
             * LimitRange sets resource usage limits for each kind of resource in a Namespace.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRange = js.native
    }
    
    /**
             * LimitRangeList is a list of LimitRange items.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.LimitRangeList = js.native
    }
    
    /**
             * Namespace provides a scope for Names. Use of multiple namespaces is optional.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Namespace = js.native
    }
    
    /**
             * NamespaceList is a list of Namespaces.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NamespaceList = js.native
    }
    
    /**
             * Node is a worker node in Kubernetes. Each node will have a unique identifier in the cache
             * (i.e. in etcd).
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Node = js.native
    }
    
    /**
             * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding
             * metadata) must be non-nil.
             */
    @js.native
    object NodeConfigSource extends js.Object {
      /**
                   * Get the state of an existing `NodeConfigSource` resource, as identified by `id`.
                   * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
                   * Kubernetes convention) the ID becomes default/<name>.
                   *
                   * Pulumi will keep track of this resource using `name` as the Pulumi ID.
                   *
                   * @param name _Unique_ name used to register this resource with Pulumi.
                   * @param id An ID for the Kubernetes resource to retrive. Takes the form
                   *  <namespace>/<name> or <name>.
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NodeConfigSource = js.native
    }
    
    /**
             * NodeList is the whole list of all Nodes which have been registered with master.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.NodeList = js.native
    }
    
    /**
             * ObjectReference contains enough information to let you inspect or modify the referred object.
             */
    @js.native
    object ObjectReference extends js.Object {
      /**
                   * Get the state of an existing `ObjectReference` resource, as identified by `id`.
                   * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
                   * Kubernetes convention) the ID becomes default/<name>.
                   *
                   * Pulumi will keep track of this resource using `name` as the Pulumi ID.
                   *
                   * @param name _Unique_ name used to register this resource with Pulumi.
                   * @param id An ID for the Kubernetes resource to retrive. Takes the form
                   *  <namespace>/<name> or <name>.
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ObjectReference = js.native
    }
    
    /**
             * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous
             * to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolume = js.native
    }
    
    /**
             * PersistentVolumeClaim is a user's request for and claim to a persistent volume
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaim = js.native
    }
    
    /**
             * PersistentVolumeClaimList is a list of PersistentVolumeClaim items.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeClaimList = js.native
    }
    
    /**
             * PersistentVolumeList is a list of PersistentVolume items.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PersistentVolumeList = js.native
    }
    
    /**
             * Pod is a collection of containers that can run on a host. This resource is created by clients
             * and scheduled onto hosts.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Pod = js.native
    }
    
    /**
             * PodList is a list of Pods.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodList = js.native
    }
    
    /**
             * PodTemplate describes a template for creating copies of a predefined pod.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplate = js.native
    }
    
    /**
             * PodTemplateList is a list of PodTemplates.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.PodTemplateList = js.native
    }
    
    /**
             * ReplicationController represents the configuration of a replication controller.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationController = js.native
    }
    
    /**
             * ReplicationControllerList is a collection of replication controllers.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ReplicationControllerList = js.native
    }
    
    /**
             * ResourceQuota sets aggregate quota restrictions enforced per namespace
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuota = js.native
    }
    
    /**
             * ResourceQuotaList is a list of ResourceQuota items.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ResourceQuotaList = js.native
    }
    
    /**
             * Secret holds secret data of a certain type. The total bytes of the values in the Data field
             * must be less than MaxSecretSize bytes.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Secret = js.native
    }
    
    /**
             * SecretList is a list of Secret.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.SecretList = js.native
    }
    
    /**
             * Service is a named abstraction of software service (for example, mysql) consisting of local
             * port (for example 3306) that the proxy listens on, and the selector that determines which
             * pods will answer requests sent through the proxy.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.Service = js.native
    }
    
    /**
             * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral
             * systems, for an identity * a principal that can be authenticated and authorized * a set of
             * secrets
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccount = js.native
    }
    
    /**
             * ServiceAccountList is a list of ServiceAccount objects
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceAccountList = js.native
    }
    
    /**
             * ServiceList holds a list of services.
             */
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
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coreNs.v1Ns.ServiceList = js.native
    }
    
  }
  
}

