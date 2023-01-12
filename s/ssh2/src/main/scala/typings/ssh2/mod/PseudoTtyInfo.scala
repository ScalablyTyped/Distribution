package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoTtyInfo extends StObject {
  
  /** The number of columns for the pseudo-TTY. */
  var cols: Double
  
  /** The height of the pseudo-TTY in pixels. */
  var height: Double
  
  /** Contains the requested terminal modes of the pseudo-TTY. */
  var modes: TerminalModes
  
  /** The number of rows for the pseudo-TTY. */
  var rows: Double
  
  /** The width of the pseudo-TTY in pixels. */
  var width: Double
}
object PseudoTtyInfo {
  
  inline def apply(cols: Double, height: Double, modes: TerminalModes, rows: Double, width: Double): PseudoTtyInfo = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoTtyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PseudoTtyInfo] (val x: Self) extends AnyVal {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setModes(value: TerminalModes): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
