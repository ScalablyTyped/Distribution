package typings.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.v1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/ConfigMap", JSImport.Namespace)
@js.native
object configMapMod extends js.Object {
  @js.native
  class ConfigMap protected () extends CustomResource {
    /**
      * Create a core.v1.ConfigMap resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.core.v1.ConfigMap) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.core.v1.ConfigMap,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[v1] = js.native
    /**
      * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-',
      * '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys
      * stored in BinaryData must not overlap with the ones in the Data field, this is enforced
      * during validation process. Using this field will require 1.10+ apiserver and kubelet.
      */
    val binaryData: Output_[js.Object] = js.native
    /**
      * Data contains the configuration data. Each key must consist of alphanumeric characters,
      * '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The
      * keys stored in Data must not overlap with the keys in the BinaryData field, this is
      * enforced during validation process.
      */
    val data: Output_[StringDictionary[Output_[String]]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap] = js.native
    /**
      * Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
  }
  
  /* static members */
  @js.native
  object ConfigMap extends js.Object {
    /**
      * Get the state of an existing `ConfigMap` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): ConfigMap = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ConfigMap = js.native
    /**
      * Returns true if the given object is an instance of ConfigMap.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/ConfigMap.ConfigMap */ Boolean = js.native
  }
  
}

