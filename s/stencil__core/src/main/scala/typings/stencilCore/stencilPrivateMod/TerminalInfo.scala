package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalInfo extends StObject {
  
  /**
    * Whether this is in CI or not.
    */
  val ci: Boolean
  
  /**
    * Whether the terminal is an interactive TTY or not.
    */
  val tty: Boolean
}
object TerminalInfo {
  
  inline def apply(ci: Boolean, tty: Boolean): TerminalInfo = {
    val __obj = js.Dynamic.literal(ci = ci.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalInfo]
  }
  
  extension [Self <: TerminalInfo](x: Self) {
    
    inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    inline def setTty(value: Boolean): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
  }
}
