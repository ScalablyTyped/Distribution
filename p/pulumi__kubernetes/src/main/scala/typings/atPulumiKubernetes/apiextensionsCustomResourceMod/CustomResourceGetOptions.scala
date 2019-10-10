package typings.atPulumiKubernetes.apiextensionsCustomResourceMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.Alias
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomTimeouts
import typings.atPulumiPulumi.resourceMod.ID
import typings.atPulumiPulumi.resourceMod.ProviderResource
import typings.atPulumiPulumi.resourceMod.Resource
import typings.atPulumiPulumi.resourceMod.ResourceTransformation
import typings.atPulumiPulumi.resourceMod.URN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomResourceGetOptions extends CustomResourceOptions {
  /**
    * apiVersion is the API version of the apiExtensions.CustomResource we wish to select,
    * as specified by the CustomResourceDefinition that defines it on the API server.
    */
  var apiVersion: Input[String]
  /**
    * An ID for the Kubernetes resource to retrieve. Takes the form [namespace]/[name] or
    * [name].
    */
  @JSName("id")
  var id_CustomResourceGetOptions: Input[ID]
  /**
    * kind is the kind of the apiextensions.CustomResource we wish to select, as specified by
    * the CustomResourceDefinition that defines it on the API server.
    */
  var kind: Input[String]
}

object CustomResourceGetOptions {
  @scala.inline
  def apply(
    apiVersion: Input[String],
    id: Input[ID],
    kind: Input[String],
    additionalSecretOutputs: js.Array[String] = null,
    aliases: js.Array[Input[URN | Alias]] = null,
    customTimeouts: CustomTimeouts = null,
    deleteBeforeReplace: js.UndefOr[Boolean] = js.undefined,
    dependsOn: Input[js.Array[Input[Resource]] | Resource] = null,
    ignoreChanges: js.Array[String] = null,
    `import`: ID = null,
    parent: Resource = null,
    protect: js.UndefOr[Boolean] = js.undefined,
    provider: ProviderResource = null,
    transformations: js.Array[ResourceTransformation] = null,
    version: String = null
  ): CustomResourceGetOptions = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (additionalSecretOutputs != null) __obj.updateDynamic("additionalSecretOutputs")(additionalSecretOutputs)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (customTimeouts != null) __obj.updateDynamic("customTimeouts")(customTimeouts)
    if (!js.isUndefined(deleteBeforeReplace)) __obj.updateDynamic("deleteBeforeReplace")(deleteBeforeReplace)
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (ignoreChanges != null) __obj.updateDynamic("ignoreChanges")(ignoreChanges)
    if (`import` != null) __obj.updateDynamic("import")(`import`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CustomResourceGetOptions]
  }
}

