package typings.ssh2.mod

import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecOptions extends StObject {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  
  /** An environment to use for the execution of the command. */
  var env: js.UndefOr[ProcessEnv] = js.undefined
  
  /** Set to `true` to allocate a pseudo-tty with defaults, or an object containing specific pseudo-tty settings. */
  var pty: js.UndefOr[PseudoTtyOptions | Boolean] = js.undefined
  
  /** Set either to `true` to use defaults, a number to specify a specific screen number, or an object containing x11 settings. */
  var x11: js.UndefOr[X11Options | Double | Boolean] = js.undefined
}
object ExecOptions {
  
  inline def apply(): ExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
    
    inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setPty(value: PseudoTtyOptions | Boolean): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
    
    inline def setPtyUndefined: Self = StObject.set(x, "pty", js.undefined)
    
    inline def setX11(value: X11Options | Double | Boolean): Self = StObject.set(x, "x11", value.asInstanceOf[js.Any])
    
    inline def setX11Undefined: Self = StObject.set(x, "x11", js.undefined)
  }
}
