package typings
package sandboxedDashModuleLib.sandboxedDashModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sandboxed-module", JSImport.Namespace)
@js.native
class namespaced () extends SandboxedModule {
  /**
       * A getter returning the sandboxedModule.module.exports object.
       */
  /* CompleteClass */
  override var exports: js.Any = js.native
  /**
       * The full path to the module.
       */
  /* CompleteClass */
  override var filename: java.lang.String = js.native
  /**
       * See {@link SandboxOptions.globals}
       */
  /* CompleteClass */
  override var globals: js.Object = js.native
  /**
       * See {@link SandboxOptions.locals}
       */
  /* CompleteClass */
  override var locals: js.Object = js.native
  /**
       * The underlaying node.js Module instance.
       */
  /* CompleteClass */
  override var module: java.lang.String = js.native
  /**
       * See {@link SandboxOptions.requires}
       */
  /* CompleteClass */
  override var required: js.Object = js.native
  /**
       * See {@link SandboxOptions.sourceTransformers}.
       */
  /* CompleteClass */
  override var sourceTransformers: js.Object = js.native
}

@JSImport("sandboxed-module", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
       * Sets options globally across all uses of {@link SandboxedModule.load()} and {@link SandboxedModule.require()}.
       * This way, a commonly needed require, global, local, or sourceTransformer can be specified once across all
       * sandboxed modules.
       * @param options the loading and requiring default options
       */
  def configure(options: sandboxedDashModuleLib.sandboxedDashModuleMod.SandboxOptions): scala.Unit = js.native
  /**
       * Returns a new SandboxedModule where moduleId is a regular module path / id as you would normally pass into
       * require(). The new module will be loaded in its own v8 context, but otherwise have access to the normal
       * node.js environment.
       *
       * @param moduleId the ID of the module to load
       * @param options the loading options
       */
  def load(moduleId: java.lang.String): sandboxedDashModuleLib.sandboxedDashModuleMod.SandboxedModule = js.native
  /**
       * Returns a new SandboxedModule where moduleId is a regular module path / id as you would normally pass into
       * require(). The new module will be loaded in its own v8 context, but otherwise have access to the normal
       * node.js environment.
       *
       * @param moduleId the ID of the module to load
       * @param options the loading options
       */
  def load(moduleId: java.lang.String, options: sandboxedDashModuleLib.sandboxedDashModuleMod.SandboxOptions): sandboxedDashModuleLib.sandboxedDashModuleMod.SandboxedModule = js.native
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
  def registerBuiltInSourceTransformer(name: java.lang.String): scala.Unit = js.native
  /**
       * Identical to {@link SandboxedModule.load()}, but returns sandboxedModule.exports directly.
       *
       * @param moduleId the ID of the module to require
       * @param options the requiring options
       */
  def require(moduleId: java.lang.String): js.Any = js.native
  /**
       * Identical to {@link SandboxedModule.load()}, but returns sandboxedModule.exports directly.
       *
       * @param moduleId the ID of the module to require
       * @param options the requiring options
       */
  def require(moduleId: java.lang.String, options: sandboxedDashModuleLib.sandboxedDashModuleMod.SandboxOptions): js.Any = js.native
}

