package typings
package atPulumiPulumiLib.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOptions extends js.Object {
  /**
    * An optional list of aliases to treat this resource as matching.
    */
  var aliases: js.UndefOr[js.Array[atPulumiPulumiLib.outputMod.Input[URN | Alias]]] = js.undefined
  /**
    * An optional customTimeouts configuration block.
    */
  var customTimeouts: js.UndefOr[CustomTimeouts] = js.undefined
  /**
    * An optional additional explicit dependencies on other resources.
    */
  var dependsOn: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Resource]] | Resource]
  ] = js.undefined
  /**
    * An optional existing ID to load, rather than create.
    */
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[ID]] = js.undefined
  /**
    * Ignore changes to any of the specified properties.
    */
  var ignoreChanges: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An optional parent resource to which this resource belongs.
    */
  var parent: js.UndefOr[Resource] = js.undefined
  /**
    * When set to true, protect ensures this resource cannot be deleted.
    */
  var protect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional provider to use for this resource's CRUD operations. If no provider is supplied,
    * the default provider for the resource's package will be used. The default provider is pulled
    * from the parent's provider bag (see also ComponentResourceOptions.providers).
    *
    * If this is a [ComponentResourceOptions] do not provide both [provider] and [providers]
    */
  var provider: js.UndefOr[ProviderResource] = js.undefined
  /**
    * An optional version, corresponding to the version of the provider plugin that should be used when operating on
    * this resource. This version overrides the version information inferred from the current package and should
    * rarely be used.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceOptions {
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
    version: java.lang.String = null
  ): ResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (customTimeouts != null) __obj.updateDynamic("customTimeouts")(customTimeouts)
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoreChanges != null) __obj.updateDynamic("ignoreChanges")(ignoreChanges)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ResourceOptions]
  }
}

