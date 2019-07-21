package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentResourceOptions extends ResourceOptions {
  /**
    * An optional set of providers to use for child resources. Either keyed by package name (e.g.
    * "aws"), or just provided as an array.  In the latter case, the package name will be retrieved
    * from the provider itself.
    *
    * In the case of a single provider, the options can be simplified to just pass along `provider: theProvider`
    *
    * Note: do not provide both [provider] and [providers];
    */
  var providers: js.UndefOr[(stdLib.Record[java.lang.String, ProviderResource]) | js.Array[ProviderResource]] = js.undefined
}

object ComponentResourceOptions {
  @scala.inline
  def apply(
    aliases: js.Array[atPulumiPulumiLib.outputMod.Input[URN | Alias]] = null,
    customTimeouts: CustomTimeouts = null,
    dependsOn: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Resource]] | Resource] = null,
    id: atPulumiPulumiLib.outputMod.Input[ID] = null,
    ignoreChanges: js.Array[java.lang.String] = null,
    parent: Resource = null,
    protect: js.UndefOr[scala.Boolean] = js.undefined,
    provider: ProviderResource = null,
    providers: (stdLib.Record[java.lang.String, ProviderResource]) | js.Array[ProviderResource] = null,
    version: java.lang.String = null
  ): ComponentResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (customTimeouts != null) __obj.updateDynamic("customTimeouts")(customTimeouts)
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoreChanges != null) __obj.updateDynamic("ignoreChanges")(ignoreChanges)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ComponentResourceOptions]
  }
}

