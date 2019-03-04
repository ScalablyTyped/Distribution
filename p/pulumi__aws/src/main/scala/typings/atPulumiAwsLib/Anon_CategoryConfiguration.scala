package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CategoryConfiguration extends js.Object {
  var category: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var configuration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var inputArtifacts: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var outputArtifacts: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var owner: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var provider: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var runOrder: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var version: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_CategoryConfiguration {
  @scala.inline
  def apply(
    category: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    owner: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    provider: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    version: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    configuration: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    inputArtifacts: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    outputArtifacts: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    runOrder: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
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

