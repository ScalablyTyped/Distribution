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
    extends atPulumiKubernetesLib.providerMod.yamlNs.CollectionComponentResource {
    def this(resourceType: java.lang.String, name: java.lang.String, config: js.Any) = this()
    def this(resourceType: java.lang.String, name: java.lang.String, config: js.Any, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  /**
    * ConfigFile creates a set of Kubernetes resources from Kubernetes YAML file. If `config.name`
    * is not specified, `ConfigFile` assumes the argument `name` is the filename.
    */
  @js.native
  class ConfigFile protected ()
    extends atPulumiKubernetesLib.providerMod.yamlNs.ConfigFile {
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, config: atPulumiKubernetesLib.providerMod.yamlNs.ConfigFileOpts) = this()
    def this(name: java.lang.String, config: atPulumiKubernetesLib.providerMod.yamlNs.ConfigFileOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  /**
    * ConfigGroup creates a set of Kubernetes resources from Kubernetes YAML text. The YAML text
    * may be supplied using any of the following `ConfigGroupOpts`:
    *
    *   1. Using a filename or a list of filenames:
    *        a. `{files: "foo.yaml"}`
    *        b. `{files: ["foo.yaml", "bar.yaml"]}`
    *   2. Using a file pattern or a list of file patterns:
    *        a. `{files: "*.yaml"}`
    *        b. `{files: ["foo/ *.yaml", "bar/ *.yaml"]}`
    *   3. Using a literal string containing YAML, or a list of such strings:
    *        a. `{yaml: "(LITERAL YAML HERE)"}`
    *        b. `{yaml: ["(LITERAL YAML HERE)", "(MORE YAML)"]}`
    *   4. Any combination of files, patterns, or YAML strings:
    *        a. `{files: "foo.yaml", yaml: "(LITERAL YAML HERE)"}`
    */
  @js.native
  class ConfigGroup protected ()
    extends atPulumiKubernetesLib.providerMod.yamlNs.ConfigGroup {
    def this(name: java.lang.String, config: atPulumiKubernetesLib.providerMod.yamlNs.ConfigGroupOpts) = this()
    def this(name: java.lang.String, config: atPulumiKubernetesLib.providerMod.yamlNs.ConfigGroupOpts, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  def parse(config: atPulumiKubernetesLib.providerMod.yamlNs.ConfigGroupOpts): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.atPulumiPulumiMod.CustomResource]
  ] = js.native
  def parse(
    config: atPulumiKubernetesLib.providerMod.yamlNs.ConfigGroupOpts,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiPulumiLib.outputMod.Output[
    org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.atPulumiPulumiMod.CustomResource]
  ] = js.native
}

