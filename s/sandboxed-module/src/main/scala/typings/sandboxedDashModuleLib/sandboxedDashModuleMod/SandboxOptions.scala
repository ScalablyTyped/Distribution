package typings
package sandboxedDashModuleLib.sandboxedDashModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SandboxOptions extends js.Object {
  /**
    * An object of global variables to inject into the sandboxed module.
    */
  var globals: js.UndefOr[js.Object] = js.undefined
  /**
    * An object of local variables to inject into the sandboxed module.
    */
  var locals: js.UndefOr[js.Object] = js.undefined
  /**
    * An object containing moduleIds and the values to inject for them when required by the sandboxed module.
    * This does not affect children of the sandboxed module.
    */
  var requires: js.UndefOr[js.Object] = js.undefined
  /**
    * If false, modules that are required by the sandboxed module will not be sandboxed. By default all modules
    * required by the sandboxedModule will be sandboxed using the same options that were used for the original
    * sandboxed module.
    */
  var singleOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An object of named functions which will transform the source code required with SandboxedModule.require.
    * For example, CoffeeScript & istanbul support is implemented with built-in sourceTransformer functions
    * (see #registerBuiltInSourceTransformer).
    *
    * A source transformer receives the source (as it's been transformed thus far) and must return the transformed
    * source (whether it's changed or unchanged).
    *
    * An example source transformer to change all instances of the number "3" to "5" would look like this:
    *
    * SandboxedModule.require('../fixture/baz', {
    *   sourceTransformers: {
    *     turn3sInto5s: function(source) {
    *       return source.replace(/3/g,'5');
    *     }
    *   }
    * })
    */
  var sourceTransformers: js.UndefOr[js.Object] = js.undefined
  /**
    * If false, the source transformers will not be run against modules required by the sandboxed module.
    * By default it will take the same value as {@link SandboxOptions.singleOnly}.
    */
  var sourceTransformersSingleOnly: js.UndefOr[scala.Boolean] = js.undefined
}

