package typings.pulumiPulumi.resourceMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomResourceOptions extends ResourceOptions {
  /**
    * The names of outputs for this resource that should be treated as secrets. This augments the list that
    * the resource provider and pulumi engine already determine based on inputs to your resource. It can be used
    * to mark certain ouputs as a secrets on a per resource basis.
    */
  var additionalSecretOutputs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When set to true, deleteBeforeReplace indicates that this resource should be deleted before its replacement
    * is created when replacement is necessary.
    */
  var deleteBeforeReplace: js.UndefOr[Boolean] = js.undefined
  /**
    * When provided with a resource ID, import indicates that this resource's provider should import its state from
    * the cloud resource with the given ID. The inputs to the resource's constructor must align with the resource's
    * current state. Once a resource has been imported, the import property must be removed from the resource's
    * options.
    */
  var `import`: js.UndefOr[ID] = js.undefined
}

object CustomResourceOptions {
  @scala.inline
  def apply(
    additionalSecretOutputs: js.Array[String] = null,
    aliases: js.Array[Input[URN | Alias]] = null,
    customTimeouts: CustomTimeouts = null,
    deleteBeforeReplace: js.UndefOr[Boolean] = js.undefined,
    dependsOn: Input[js.Array[Input[Resource]] | Resource] = null,
    id: Input[ID] = null,
    ignoreChanges: js.Array[String] = null,
    `import`: ID = null,
    parent: Resource = null,
    protect: js.UndefOr[Boolean] = js.undefined,
    provider: ProviderResource = null,
    transformations: js.Array[ResourceTransformation] = null,
    version: String = null
  ): CustomResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalSecretOutputs != null) __obj.updateDynamic("additionalSecretOutputs")(additionalSecretOutputs.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (customTimeouts != null) __obj.updateDynamic("customTimeouts")(customTimeouts.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteBeforeReplace)) __obj.updateDynamic("deleteBeforeReplace")(deleteBeforeReplace.asInstanceOf[js.Any])
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoreChanges != null) __obj.updateDynamic("ignoreChanges")(ignoreChanges.asInstanceOf[js.Any])
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (transformations != null) __obj.updateDynamic("transformations")(transformations.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceOptions]
  }
}

