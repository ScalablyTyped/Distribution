package typings.pulumiKubernetes.mod

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

@JSImport("@pulumi/kubernetes", "yaml")
@js.native
object yaml extends js.Object {
  @js.native
  abstract class CollectionComponentResource protected ()
    extends typings.pulumiKubernetes.yamlMod.CollectionComponentResource {
    def this(resourceType: String, name: String, config: js.Any) = this()
    def this(resourceType: String, name: String, config: js.Any, opts: ComponentResourceOptions) = this()
  }
  
  @js.native
  class ConfigFile protected ()
    extends typings.pulumiKubernetes.yamlMod.ConfigFile {
    def this(name: String) = this()
    def this(name: String, config: ConfigFileOpts) = this()
    def this(name: String, config: ConfigFileOpts, opts: ComponentResourceOptions) = this()
  }
  
  @js.native
  class ConfigGroup protected ()
    extends typings.pulumiKubernetes.yamlMod.ConfigGroup {
    def this(name: String, config: ConfigGroupOpts) = this()
    def this(name: String, config: ConfigGroupOpts, opts: ComponentResourceOptions) = this()
  }
  
  def parse(config: ConfigGroupOpts): Output_[StringDictionary[CustomResource]] = js.native
  def parse(config: ConfigGroupOpts, opts: CustomResourceOptions): Output_[StringDictionary[CustomResource]] = js.native
}

