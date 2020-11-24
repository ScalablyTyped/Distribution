package typings.sandboxedModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sandboxed-module", JSImport.Namespace)
@js.native
class ^ () extends SandboxedModule
@JSImport("sandboxed-module", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Sets options globally across all uses of {@link SandboxedModule.load()} and {@link SandboxedModule.require()}.
    * This way, a commonly needed require, global, local, or sourceTransformer can be specified once across all
    * sandboxed modules.
    * @param options the loading and requiring default options
    */
  def configure(options: SandboxOptions): Unit = js.native
  
  /**
    * Returns a new SandboxedModule where moduleId is a regular module path / id as you would normally pass into
    * require(). The new module will be loaded in its own v8 context, but otherwise have access to the normal
    * node.js environment.
    *
    * @param moduleId the ID of the module to load
    * @param options the loading options
    */
  def load(moduleId: String): SandboxedModule = js.native
  def load(moduleId: String, options: SandboxOptions): SandboxedModule = js.native
  
  /**
    * Enables a built-in source transformer by name. Currently, SandboxedModule ships with two built in source
    * transformers:
    *  * "coffee" - Compiles source with CoffeeScript [Enabled by default for backwards compatibility].
    *    Be sure to run require('coffee-script').register() or require('coffee-script/register') as well.
    *  * "istanbul" - Instruments sources via istanbul when istanbul code coverage is running.
    *    For example, if you'd like to use SandboxedModule in conjunction with istanbul, just run
    *    SandboxedModule.registerBuiltInSourceTransformer('istanbul').
    * @param name The name of the built-in source transformer
    */
  def registerBuiltInSourceTransformer(name: String): Unit = js.native
  
  /**
    * Identical to {@link SandboxedModule.load()}, but returns sandboxedModule.exports directly.
    *
    * @param moduleId the ID of the module to require
    * @param options the requiring options
    */
  def require(moduleId: String): js.Any = js.native
  def require(moduleId: String, options: SandboxOptions): js.Any = js.native
}
