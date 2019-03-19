package typings
package atPulumiKubernetesLib.coreV1ConfigMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/ConfigMap", "ConfigMap")
@js.native
class ConfigMap protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
  val __inputs: js.Any = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1] = js.native
  /**
    * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-',
    * '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys
    * stored in BinaryData must not overlap with the ones in the Data field, this is enforced
    * during validation process. Using this field will require 1.10+ apiserver and kubelet.
    */
  val binaryData: atPulumiPulumiLib.outputMod.Output[js.Object] = js.native
  /**
    * Data contains the configuration data. Each key must consist of alphanumeric characters,
    * '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The
    * keys stored in Data must not overlap with the keys in the BinaryData field, this is
    * enforced during validation process.
    */
  val data: atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Output[java.lang.String]]
  ] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ConfigMap] = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  def getInputs(): atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ConfigMap = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/core/v1/ConfigMap", "ConfigMap")
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
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form
    *  <namespace>/<name> or <name>.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.coreV1ConfigMapMod.ConfigMap = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.coreV1ConfigMapMod.ConfigMap = js.native
}

