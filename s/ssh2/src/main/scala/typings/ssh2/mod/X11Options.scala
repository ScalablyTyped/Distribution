package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X11Options extends StObject {
  
  /** The Screen number to use (default: `0`). */
  var screen: js.UndefOr[Double] = js.undefined
  
  /** Whether to allow just a single connection (default: `false`).*/
  var single: js.UndefOr[Boolean] = js.undefined
}
object X11Options {
  
  inline def apply(): X11Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X11Options]
  }
  
  extension [Self <: X11Options](x: Self) {
    
    inline def setScreen(value: Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
  }
}
