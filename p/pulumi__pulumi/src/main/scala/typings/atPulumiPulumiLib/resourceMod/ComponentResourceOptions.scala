package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentResourceOptions extends ResourceOptions {
  /**
    * An optional set of providers to use for child resources. Keyed by package name (e.g. "aws")
    */
  var providers: js.UndefOr[stdLib.Record[java.lang.String, ProviderResource]] = js.undefined
}

object ComponentResourceOptions {
  @scala.inline
  def apply(
    dependsOn: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Resource]]] | atPulumiPulumiLib.outputMod.Input[Resource] = null,
    id: atPulumiPulumiLib.outputMod.Input[ID] = null,
    ignoreChanges: js.Array[java.lang.String] = null,
    parent: Resource = null,
    protect: js.UndefOr[scala.Boolean] = js.undefined,
    providers: stdLib.Record[java.lang.String, ProviderResource] = null,
    version: java.lang.String = null
  ): ComponentResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoreChanges != null) __obj.updateDynamic("ignoreChanges")(ignoreChanges)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ComponentResourceOptions]
  }
}

