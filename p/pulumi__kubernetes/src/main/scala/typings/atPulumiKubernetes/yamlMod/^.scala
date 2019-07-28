package typings.atPulumiKubernetes.yamlMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.yamlYamlMod.ConfigGroupOpts
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/yaml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(config: ConfigGroupOpts): Output[StringDictionary[CustomResource]] = js.native
  def parse(config: ConfigGroupOpts, opts: CustomResourceOptions): Output[StringDictionary[CustomResource]] = js.native
}

