package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CategoryConfiguration extends js.Object {
  var category: Input[String]
  var configuration: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var inputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var name: Input[String]
  var outputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var owner: Input[String]
  var provider: Input[String]
  var roleArn: js.UndefOr[Input[String]] = js.undefined
  var runOrder: js.UndefOr[Input[Double]] = js.undefined
  var version: Input[String]
}

object Anon_CategoryConfiguration {
  @scala.inline
  def apply(
    category: Input[String],
    name: Input[String],
    owner: Input[String],
    provider: Input[String],
    version: Input[String],
    configuration: Input[StringDictionary[_]] = null,
    inputArtifacts: Input[js.Array[Input[String]]] = null,
    outputArtifacts: Input[js.Array[Input[String]]] = null,
    roleArn: Input[String] = null,
    runOrder: Input[Double] = null
  ): Anon_CategoryConfiguration = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts.asInstanceOf[js.Any])
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (runOrder != null) __obj.updateDynamic("runOrder")(runOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CategoryConfiguration]
  }
}

