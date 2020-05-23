package typings.pulumiPulumi.serializeClosureMod

import typings.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeFunctionArgs extends js.Object {
  /**
    * The name to export from the module defined by the generated module text.  Defaults to 'handler'.
    */
  var exportName: js.UndefOr[String] = js.undefined
  /**
    * If this is a function which, when invoked, will produce the actual entrypoint function.
    * Useful for when serializing a function that has high startup cost that only wants to be
    * run once. The signature of this function should be:  () => (provider_handler_args...) => provider_result
    *
    * This will then be emitted as: `exports.[exportName] = serialized_func_name();`
    *
    * In other words, the function will be invoked (once) and the resulting inner function will
    * be what is exported.
    */
  var isFactoryFunction: js.UndefOr[Boolean] = js.undefined
  /**
    * The resource to log any errors we encounter against.
    */
  var logResource: js.UndefOr[Resource] = js.undefined
  /**
    * A function to prevent serialization of certain objects captured during the serialization.  Primarily used to
    * prevent potential cycles.
    */
  var serialize: js.UndefOr[js.Function1[/* o */ js.Any, Boolean]] = js.undefined
}

object SerializeFunctionArgs {
  @scala.inline
  def apply(
    exportName: String = null,
    isFactoryFunction: js.UndefOr[Boolean] = js.undefined,
    logResource: Resource = null,
    serialize: /* o */ js.Any => Boolean = null
  ): SerializeFunctionArgs = {
    val __obj = js.Dynamic.literal()
    if (exportName != null) __obj.updateDynamic("exportName")(exportName.asInstanceOf[js.Any])
    if (!js.isUndefined(isFactoryFunction)) __obj.updateDynamic("isFactoryFunction")(isFactoryFunction.get.asInstanceOf[js.Any])
    if (logResource != null) __obj.updateDynamic("logResource")(logResource.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[SerializeFunctionArgs]
  }
}

