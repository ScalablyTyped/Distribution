package typings.pulumiKubernetes.coreMod.v1

import typings.pulumiKubernetes.configMapMod.ConfigMapArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core", "v1.ConfigMap")
@js.native
class ConfigMap protected ()
  extends typings.pulumiKubernetes.coreV1Mod.ConfigMap {
  /**
    * Create a ConfigMap resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ConfigMapArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ConfigMapArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/core", "v1.ConfigMap")
@js.native
object ConfigMap extends js.Object {
  /**
    * Get an existing ConfigMap resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiKubernetes.configMapMod.ConfigMap = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.configMapMod.ConfigMap = js.native
  /**
    * Returns true if the given object is an instance of ConfigMap.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/configMap.ConfigMap */ Boolean = js.native
}

