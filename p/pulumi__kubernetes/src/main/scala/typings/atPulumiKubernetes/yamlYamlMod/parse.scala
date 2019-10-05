package typings.atPulumiKubernetes.yamlYamlMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/yaml/yaml", "parse")
@js.native
object parse extends js.Object {
  def apply(config: ConfigGroupOpts): Output[StringDictionary[CustomResource]] = js.native
  def apply(config: ConfigGroupOpts, opts: CustomResourceOptions): Output[StringDictionary[CustomResource]] = js.native
}

