package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoTtyOptions extends StObject {
  
  /** The number of columns (default: `80`). */
  var cols: js.UndefOr[Double] = js.undefined
  
  /** The height in pixels (default: `480`). */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The number of rows (default: `24`). */
  var rows: js.UndefOr[Double] = js.undefined
  
  /** The value to use for $TERM (default: `'vt100'`) */
  var term: js.UndefOr[String] = js.undefined
  
  /** The width in pixels (default: `640`). */
  var width: js.UndefOr[Double] = js.undefined
}
object PseudoTtyOptions {
  
  @scala.inline
  def apply(): PseudoTtyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PseudoTtyOptions]
  }
  
  @scala.inline
  implicit class PseudoTtyOptionsMutableBuilder[Self <: PseudoTtyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
