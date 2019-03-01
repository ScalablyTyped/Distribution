package typings
package sandboxedDashModuleLib.sandboxedDashModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SandboxedModule extends js.Object {
  /**
    * A getter returning the sandboxedModule.module.exports object.
    */
  var exports: js.Any
  /**
    * The full path to the module.
    */
  var filename: java.lang.String
  /**
    * See {@link SandboxOptions.globals}
    */
  var globals: js.Object
  /**
    * See {@link SandboxOptions.locals}
    */
  var locals: js.Object
  /**
    * The underlaying node.js Module instance.
    */
  var module: java.lang.String
  /**
    * See {@link SandboxOptions.requires}
    */
  var required: js.Object
  /**
    * See {@link SandboxOptions.sourceTransformers}.
    */
  var sourceTransformers: js.Object
}

object SandboxedModule {
  @scala.inline
  def apply(
    exports: js.Any,
    filename: java.lang.String,
    globals: js.Object,
    locals: js.Object,
    module: java.lang.String,
    required: js.Object,
    sourceTransformers: js.Object
  ): SandboxedModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exports")(exports)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("globals")(globals)
    __obj.updateDynamic("locals")(locals)
    __obj.updateDynamic("module")(module)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("sourceTransformers")(sourceTransformers)
    __obj.asInstanceOf[SandboxedModule]
  }
}

