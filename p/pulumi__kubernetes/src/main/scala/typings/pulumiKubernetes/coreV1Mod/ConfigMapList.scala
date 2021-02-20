package typings.pulumiKubernetes.coreV1Mod

import typings.pulumiKubernetes.configMapListMod.ConfigMapListArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/core/v1", "ConfigMapList")
@js.native
class ConfigMapList protected ()
  extends typings.pulumiKubernetes.configMapListMod.ConfigMapList {
  /**
    * Create a ConfigMapList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ConfigMapListArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ConfigMapListArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object ConfigMapList {
  
  /**
    * Get an existing ConfigMapList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/kubernetes/core/v1", "ConfigMapList.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiKubernetes.configMapListMod.ConfigMapList = js.native
  @JSImport("@pulumi/kubernetes/core/v1", "ConfigMapList.get")
  @js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.configMapListMod.ConfigMapList = js.native
  
  /**
    * Returns true if the given object is an instance of ConfigMapList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/kubernetes/core/v1", "ConfigMapList.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/configMapList.ConfigMapList */ Boolean = js.native
}
