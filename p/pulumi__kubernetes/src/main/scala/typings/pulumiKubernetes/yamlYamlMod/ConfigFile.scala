package typings.pulumiKubernetes.yamlYamlMod

import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/yaml/yaml", "ConfigFile")
@js.native
class ConfigFile protected () extends CollectionComponentResource {
  /**
    * Create a ConfigFile resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param config The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, config: ConfigFileOpts) = this()
  def this(name: String, config: js.UndefOr[scala.Nothing], opts: ComponentResourceOptions) = this()
  def this(name: String, config: ConfigFileOpts, opts: ComponentResourceOptions) = this()
}
