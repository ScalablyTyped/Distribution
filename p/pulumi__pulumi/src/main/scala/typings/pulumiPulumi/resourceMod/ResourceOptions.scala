package typings.pulumiPulumi.resourceMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOptions extends js.Object {
  /**
    * An optional list of aliases to treat this resource as matching.
    */
  var aliases: js.UndefOr[js.Array[Input[URN | Alias]]] = js.undefined
  /**
    * An optional customTimeouts configuration block.
    */
  var customTimeouts: js.UndefOr[CustomTimeouts] = js.undefined
  /**
    * An optional additional explicit dependencies on other resources.
    */
  var dependsOn: js.UndefOr[Input[js.Array[Input[Resource]] | Resource]] = js.undefined
  /**
    * An optional existing ID to load, rather than create.
    */
  var id: js.UndefOr[Input[ID]] = js.undefined
  /**
    * Ignore changes to any of the specified properties.
    */
  var ignoreChanges: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An optional parent resource to which this resource belongs.
    */
  var parent: js.UndefOr[Resource] = js.undefined
  /**
    * When set to true, protect ensures this resource cannot be deleted.
    */
  var protect: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional provider to use for this resource's CRUD operations. If no provider is supplied,
    * the default provider for the resource's package will be used. The default provider is pulled
    * from the parent's provider bag (see also ComponentResourceOptions.providers).
    *
    * If this is a [ComponentResourceOptions] do not provide both [provider] and [providers]
    */
  var provider: js.UndefOr[ProviderResource] = js.undefined
  /**
    * Optional list of transformations to apply to this resource during construction. The
    * transformations are applied in order, and are applied prior to transformation applied to
    * parents walking from the resource up to the stack.
    */
  var transformations: js.UndefOr[js.Array[ResourceTransformation]] = js.undefined
  /**
    * An optional version, corresponding to the version of the provider plugin that should be used when operating on
    * this resource. This version overrides the version information inferred from the current package and should
    * rarely be used.
    */
  var version: js.UndefOr[String] = js.undefined
}

object ResourceOptions {
  @scala.inline
  def apply(
    aliases: js.Array[Input[URN | Alias]] = null,
    customTimeouts: CustomTimeouts = null,
    dependsOn: Input[js.Array[Input[Resource]] | Resource] = null,
    id: Input[ID] = null,
    ignoreChanges: js.Array[String] = null,
    parent: Resource = null,
    protect: js.UndefOr[Boolean] = js.undefined,
    provider: ProviderResource = null,
    transformations: js.Array[ResourceTransformation] = null,
    version: String = null
  ): ResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (customTimeouts != null) __obj.updateDynamic("customTimeouts")(customTimeouts.asInstanceOf[js.Any])
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoreChanges != null) __obj.updateDynamic("ignoreChanges")(ignoreChanges.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(protect)) __obj.updateDynamic("protect")(protect.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (transformations != null) __obj.updateDynamic("transformations")(transformations.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOptions]
  }
}

