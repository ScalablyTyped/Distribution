package typings
package atPulumiKubernetesLib.apiextensionsCustomResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomResourceGetOptions
  extends atPulumiPulumiLib.resourceMod.CustomResourceOptions {
  /**
    * apiVersion is the API version of the apiExtensions.CustomResource we wish to select,
    * as specified by the CustomResourceDefinition that defines it on the API server.
    */
  var apiVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * An ID for the Kubernetes resource to retrive. Takes the form <namespace>/<name> or
    * <name>.
    */
  @JSName("id")
  var id_CustomResourceGetOptions: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]
  /**
    * kind is the kind of the apiextensions.CustomResource we wish to select, as specified by
    * the CustomResourceDefinition that defines it on the API server.
    */
  var kind: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object CustomResourceGetOptions {
  @scala.inline
  def apply(
    apiVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    kind: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    deleteBeforeReplace: js.UndefOr[scala.Boolean] = js.undefined,
    dependsOn: (atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.Resource]]
    ]) | atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.Resource] = null,
    ignoreChanges: js.Array[java.lang.String] = null,
    parent: atPulumiPulumiLib.resourceMod.Resource = null,
    protect: js.UndefOr[scala.Boolean] = js.undefined,
    provider: atPulumiPulumiLib.resourceMod.ProviderResource = null,
    version: java.lang.String = null
  ): CustomResourceGetOptions = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteBeforeReplace)) __obj.updateDynamic("deleteBeforeReplace")(deleteBeforeReplace)
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (ignoreChanges != null) __obj.updateDynamic("ignoreChanges")(ignoreChanges)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CustomResourceGetOptions]
  }
}

