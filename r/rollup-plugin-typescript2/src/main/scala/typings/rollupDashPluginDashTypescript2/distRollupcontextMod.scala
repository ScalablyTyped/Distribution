package typings.rollupDashPluginDashTypescript2

import typings.rollup.rollupMod.PluginContext
import typings.rollupDashPluginDashTypescript2.distContextMod.IContext
import typings.rollupDashPluginDashTypescript2.distContextMod.VerbosityLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/rollupcontext", JSImport.Namespace)
@js.native
object distRollupcontextMod extends js.Object {
  @js.native
  class RollupContext protected () extends IContext {
    def this(verbosity: VerbosityLevel, bail: Boolean, context: PluginContext) = this()
    def this(verbosity: VerbosityLevel, bail: Boolean, context: PluginContext, prefix: String) = this()
    var bail: js.Any = js.native
    var context: js.Any = js.native
    var hasContext: js.Any = js.native
    var prefix: js.Any = js.native
    var verbosity: js.Any = js.native
  }
  
}

