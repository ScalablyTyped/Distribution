package typings
package protractorLib.builtDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/debugger", "DebugHelper")
@js.native
class DebugHelper protected () extends js.Object {
  def this(`browserUnderDebug_`: protractorLib.builtBrowserMod.ProtractorBrowser) = this()
  var `browserUnderDebug_`: js.Any = js.native
  var dbgCodeExecutor: js.Any = js.native
  /**
       * Set to true when we validate that the debug port is open. Since the debug
       * port is held open forever once the debugger is attached, it's important
       * we only do validation once.
       */
  var `debuggerValidated_`: scala.Boolean = js.native
  def init(debuggerClientPath: java.lang.String, onStartFn: js.Function): scala.Unit = js.native
  def init(debuggerClientPath: java.lang.String, onStartFn: js.Function, opt_debugPort: scala.Double): scala.Unit = js.native
  def initBlocking(debuggerClientPath: java.lang.String, onStartFn: js.Function): scala.Unit = js.native
  def initBlocking(debuggerClientPath: java.lang.String, onStartFn: js.Function, opt_debugPort: scala.Double): scala.Unit = js.native
  /**
       *  1) Set up helper functions for debugger clients to call on (e.g.
       *     execute code, get autocompletion).
       *  2) Enter process into debugger mode. (i.e. process._debugProcess).
       *  3) Invoke the debugger client specified by debuggerClientPath.
       *
       * @param {string} debuggerClientPath Absolute path of debugger client to use.
       * @param {boolean} blockUntilExit Whether to block the flow until process exit or resume
       *     immediately.
       * @param {Function} onStartFn Function to call when the debugger starts. The
       *     function takes a single parameter, which represents whether this is the
       *     first time that the debugger is called.
       * @param {number=} opt_debugPort Optional port to use for the debugging
       *     process.
       *
       * @return {Promise} If blockUntilExit, a promise resolved when the debugger process
       *     exits. Otherwise, resolved when the debugger process is ready to begin.
       */
  def `init_`(debuggerClientPath: java.lang.String, blockUntilExit: scala.Boolean, onStartFn: js.Function): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Object] = js.native
  /**
       *  1) Set up helper functions for debugger clients to call on (e.g.
       *     execute code, get autocompletion).
       *  2) Enter process into debugger mode. (i.e. process._debugProcess).
       *  3) Invoke the debugger client specified by debuggerClientPath.
       *
       * @param {string} debuggerClientPath Absolute path of debugger client to use.
       * @param {boolean} blockUntilExit Whether to block the flow until process exit or resume
       *     immediately.
       * @param {Function} onStartFn Function to call when the debugger starts. The
       *     function takes a single parameter, which represents whether this is the
       *     first time that the debugger is called.
       * @param {number=} opt_debugPort Optional port to use for the debugging
       *     process.
       *
       * @return {Promise} If blockUntilExit, a promise resolved when the debugger process
       *     exits. Otherwise, resolved when the debugger process is ready to begin.
       */
  def `init_`(
    debuggerClientPath: java.lang.String,
    blockUntilExit: scala.Boolean,
    onStartFn: js.Function,
    opt_debugPort: scala.Double
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Object] = js.native
  def isAttached(): scala.Boolean = js.native
  /**
       * Validates that the port is free to use. This will only validate the first
       * time it is called. The reason is that on subsequent calls, the port will
       * already be bound to the debugger, so it will not be available, but that is
       * okay.
       *
       * @returns {Promise<boolean>} A promise that becomes ready when the
       * validation
       *     is done. The promise will resolve to a boolean which represents whether
       *     this is the first time that the debugger is called.
       */
  /* private */ def `validatePortAvailability_`(port: js.Any): js.Any = js.native
}

