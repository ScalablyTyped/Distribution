package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowChangeInfo extends StObject {
  
  /** The number of columns for the pseudo-TTY. */
  var cols: Double
  
  /** The height of the pseudo-TTY in pixels. */
  var height: Double
  
  /** The number of rows for the pseudo-TTY. */
  var rows: Double
  
  /** The width of the pseudo-TTY in pixels. */
  var width: Double
}
object WindowChangeInfo {
  
  inline def apply(cols: Double, height: Double, rows: Double, width: Double): WindowChangeInfo = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowChangeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowChangeInfo] (val x: Self) extends AnyVal {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
