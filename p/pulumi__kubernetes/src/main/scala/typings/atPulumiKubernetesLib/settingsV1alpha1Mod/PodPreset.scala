package typings
package atPulumiKubernetesLib.settingsV1alpha1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/settings/v1alpha1", "PodPreset")
@js.native
class PodPreset protected ()
  extends atPulumiKubernetesLib.settingsV1alpha1PodPresetMod.PodPreset {
  /**
    * Create a settings.v1alpha1.PodPreset resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.settingsNs.v1alpha1Ns.PodPreset) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.settingsNs.v1alpha1Ns.PodPreset, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/settings/v1alpha1", "PodPreset")
@js.native
object PodPreset extends js.Object {
  /**
    * Get the state of an existing `PodPreset` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.settingsV1alpha1PodPresetMod.PodPreset = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.settingsV1alpha1PodPresetMod.PodPreset = js.native
}

