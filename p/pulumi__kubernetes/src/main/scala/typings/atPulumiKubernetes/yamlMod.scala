package typings.atPulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.yamlYamlMod.ConfigFileOpts
import typings.atPulumiKubernetes.yamlYamlMod.ConfigGroupOpts
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/yaml", JSImport.Namespace)
@js.native
object yamlMod extends js.Object {
  @js.native
  abstract class CollectionComponentResource protected ()
    extends typings.atPulumiKubernetes.yamlYamlMod.CollectionComponentResource {
    def this(resourceType: String, name: String, config: js.Any) = this()
    def this(resourceType: String, name: String, config: js.Any, opts: ComponentResourceOptions) = this()
  }
  
  @js.native
  class ConfigFile protected ()
    extends typings.atPulumiKubernetes.yamlYamlMod.ConfigFile {
    def this(name: String) = this()
    def this(name: String, config: ConfigFileOpts) = this()
    def this(name: String, config: ConfigFileOpts, opts: ComponentResourceOptions) = this()
  }
  
  @js.native
  class ConfigGroup protected ()
    extends typings.atPulumiKubernetes.yamlYamlMod.ConfigGroup {
    def this(name: String, config: ConfigGroupOpts) = this()
    def this(name: String, config: ConfigGroupOpts, opts: ComponentResourceOptions) = this()
  }
  
  def parse(config: ConfigGroupOpts): Output[StringDictionary[CustomResource]] = js.native
  def parse(config: ConfigGroupOpts, opts: CustomResourceOptions): Output[StringDictionary[CustomResource]] = js.native
}

