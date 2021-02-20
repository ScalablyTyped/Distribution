package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoTtyInfo extends StObject {
  
  /** The number of columns for the pseudo-TTY. */
  var cols: Double = js.native
  
  /** The height of the pseudo-TTY in pixels. */
  var height: Double = js.native
  
  /** Contains the requested terminal modes of the pseudo-TTY. */
  var modes: TerminalModes = js.native
  
  /** The number of rows for the pseudo-TTY. */
  var rows: Double = js.native
  
  /** The width of the pseudo-TTY in pixels. */
  var width: Double = js.native
}
object PseudoTtyInfo {
  
  @scala.inline
  def apply(cols: Double, height: Double, modes: TerminalModes, rows: Double, width: Double): PseudoTtyInfo = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoTtyInfo]
  }
  
  @scala.inline
  implicit class PseudoTtyInfoMutableBuilder[Self <: PseudoTtyInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModes(value: TerminalModes): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
