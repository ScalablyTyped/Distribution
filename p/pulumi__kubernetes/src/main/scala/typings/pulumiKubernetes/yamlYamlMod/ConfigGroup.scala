package typings.pulumiKubernetes.yamlYamlMod

import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/yaml/yaml", "ConfigGroup")
@js.native
class ConfigGroup protected () extends CollectionComponentResource {
  def this(name: String, config: ConfigGroupOpts) = this()
  def this(name: String, config: ConfigGroupOpts, opts: ComponentResourceOptions) = this()
}

