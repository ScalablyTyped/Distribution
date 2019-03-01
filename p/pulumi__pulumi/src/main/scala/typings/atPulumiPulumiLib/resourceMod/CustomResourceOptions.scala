package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomResourceOptions extends ResourceOptions {
  /**
    * When set to true, deleteBeforeReplace indicates that this resource should be deleted before its replacement
    * is created when replacement is necessary.
    */
  var deleteBeforeReplace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional provider to use for this resource's CRUD operations. If no provider is supplied, the default
    * provider for the resource's package will be used. The default provider is pulled from the parent's
    * provider bag (see also ComponentResourceOptions.providers).
    */
  var provider: js.UndefOr[ProviderResource] = js.undefined
}

object CustomResourceOptions {
  @scala.inline
  def apply(
    deleteBeforeReplace: js.UndefOr[scala.Boolean] = js.undefined,
    dependsOn: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Resource]]] | atPulumiPulumiLib.outputMod.Input[Resource] = null,
    id: atPulumiPulumiLib.outputMod.Input[ID] = null,
    parent: Resource = null,
    protect: js.UndefOr[scala.Boolean] = js.undefined,
    provider: ProviderResource = null
  ): CustomResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteBeforeReplace)) __obj.updateDynamic("deleteBeforeReplace")(deleteBeforeReplace)
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[CustomResourceOptions]
  }
}

