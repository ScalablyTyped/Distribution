package typings.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.yamlYamlMod.ConfigFileOpts
import typings.pulumiKubernetes.yamlYamlMod.ConfigGroupOpts
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/yaml", JSImport.Namespace)
@js.native
object yamlMod extends js.Object {
  @js.native
  abstract class CollectionComponentResource protected ()
    extends typings.pulumiKubernetes.yamlYamlMod.CollectionComponentResource {
    protected def this(resourceType: String, name: String, config: js.Any) = this()
    protected def this(resourceType: String, name: String, config: js.Any, opts: ComponentResourceOptions) = this()
  }
  
  @js.native
  class ConfigFile protected ()
    extends typings.pulumiKubernetes.yamlYamlMod.ConfigFile {
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
  
  @js.native
  class ConfigGroup protected ()
    extends typings.pulumiKubernetes.yamlYamlMod.ConfigGroup {
    /**
      * Create a ConfigGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param config The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, config: ConfigGroupOpts) = this()
    def this(name: String, config: ConfigGroupOpts, opts: ComponentResourceOptions) = this()
  }
  
  def parse(config: ConfigGroupOpts): Output_[StringDictionary[CustomResource]] = js.native
  def parse(config: ConfigGroupOpts, opts: CustomResourceOptions): Output_[StringDictionary[CustomResource]] = js.native
}

