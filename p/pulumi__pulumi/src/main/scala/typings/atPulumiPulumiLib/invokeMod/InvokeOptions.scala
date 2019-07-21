package typings
package atPulumiPulumiLib.invokeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeOptions extends js.Object {
  /**
    * Invoke this function asynchronously.  If 'true' is passed in here, then an invoked function
    * will only supply the `Promise<>` side of its result.
    */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional parent to use for default options for this invoke (e.g. the default provider to use).
    */
  var parent: js.UndefOr[atPulumiPulumiLib.resourceMod.Resource] = js.undefined
  /**
    * An optional provider to use for this invocation. If no provider is supplied, the default provider for the
    * invoked function's package will be used.
    */
  var provider: js.UndefOr[atPulumiPulumiLib.resourceMod.ProviderResource] = js.undefined
  /**
    * An optional version, corresponding to the version of the provider plugin that should be used when performing this
    * invoke.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object InvokeOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    parent: atPulumiPulumiLib.resourceMod.Resource = null,
    provider: atPulumiPulumiLib.resourceMod.ProviderResource = null,
    version: java.lang.String = null
  ): InvokeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[InvokeOptions]
  }
}

