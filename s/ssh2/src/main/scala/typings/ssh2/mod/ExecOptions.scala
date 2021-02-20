package typings.ssh2.mod

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.ssh2.ssh2Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecOptions extends StObject {
  
  /** An environment to use for the execution of the command. */
  var env: js.UndefOr[ProcessEnv] = js.native
  
  /** Set to `true` to allocate a pseudo-tty with defaults, or an object containing specific pseudo-tty settings. */
  var pty: js.UndefOr[`true` | PseudoTtyOptions] = js.native
  
  /** Set either to `true` to use defaults, a number to specify a specific screen number, or an object containing x11 settings. */
  var x11: js.UndefOr[Boolean | Double | X11Options] = js.native
}
object ExecOptions {
  
  @scala.inline
  def apply(): ExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptions]
  }
  
  @scala.inline
  implicit class ExecOptionsMutableBuilder[Self <: ExecOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setPty(value: `true` | PseudoTtyOptions): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPtyUndefined: Self = StObject.set(x, "pty", js.undefined)
    
    @scala.inline
    def setX11(value: Boolean | Double | X11Options): Self = StObject.set(x, "x11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX11Undefined: Self = StObject.set(x, "x11", js.undefined)
  }
}
