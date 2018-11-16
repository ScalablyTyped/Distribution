package typings
package atPulumiPulumiLib.runtimeClosureSerializeClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SerializeFunctionArgs extends js.Object {
  /**
       * The name to export from the module defined by the generated module text.  Defaults to 'handler'.
       */
  var exportName: js.UndefOr[java.lang.String] = js.undefined
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
  var isFactoryFunction: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The resource to log any errors we encounter against.
       */
  var logResource: js.UndefOr[atPulumiPulumiLib.resourceMod.Resource] = js.undefined
  /**
       * A function to prevent serialization of certain objects captured during the serialization.  Primarily used to
       * prevent potential cycles.
       */
  var serialize: js.UndefOr[js.Function1[/* o */ js.Any, scala.Boolean]] = js.undefined
}

