package typings.pulumiPulumi.invokeMod

import typings.pulumiPulumi.resourceMod.ProviderResource
import typings.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeOptions extends js.Object {
  /**
    * Invoke this function asynchronously.  If 'true' is passed in here, then an invoked function
    * will only supply the `Promise<>` side of its result.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional parent to use for default options for this invoke (e.g. the default provider to use).
    */
  var parent: js.UndefOr[Resource] = js.undefined
  /**
    * An optional provider to use for this invocation. If no provider is supplied, the default provider for the
    * invoked function's package will be used.
    */
  var provider: js.UndefOr[ProviderResource] = js.undefined
  /**
    * An optional version, corresponding to the version of the provider plugin that should be used when performing this
    * invoke.
    */
  var version: js.UndefOr[String] = js.undefined
}

object InvokeOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    parent: Resource = null,
    provider: ProviderResource = null,
    version: String = null
  ): InvokeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeOptions]
  }
}

