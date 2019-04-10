package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "yaml")
@js.native
object yamlNs extends js.Object {
  @js.native
  abstract class CollectionComponentResource protected ()
    extends atPulumiKubernetesLib.yamlMod.CollectionComponentResource {
    def this(resourceType: java.lang.String, name: java.lang.String, config: js.Any) = this()
    def this(resourceType: java.lang.String, name: java.lang.String, config: js.Any, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  @js.native
  class ConfigFile protected ()
    extends atPulumiKubernetesLib.yamlMod.ConfigFile {
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, config: atPulumiKubernetesLib.yamlYamlMod.ConfigFileOpts) = this()
    def this(name: java.lang.String, config: atPulumiKubernetesLib.yamlYamlMod.ConfigFileOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  @js.native
  class ConfigGroup protected ()
    extends atPulumiKubernetesLib.yamlMod.ConfigGroup {
    def this(name: java.lang.String, config: atPulumiKubernetesLib.yamlYamlMod.ConfigGroupOpts) = this()
    def this(name: java.lang.String, config: atPulumiKubernetesLib.yamlYamlMod.ConfigGroupOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  def parse(config: atPulumiKubernetesLib.yamlYamlMod.ConfigGroupOpts): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.atPulumiPulumiMod.CustomResource]
  ] = js.native
  def parse(
    config: atPulumiKubernetesLib.yamlYamlMod.ConfigGroupOpts,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.atPulumiPulumiMod.CustomResource]
  ] = js.native
}

