package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoTtyOptions extends js.Object {
  
  /** The number of columns (default: `80`). */
  var cols: js.UndefOr[Double] = js.native
  
  /** The height in pixels (default: `480`). */
  var height: js.UndefOr[Double] = js.native
  
  /** The number of rows (default: `24`). */
  var rows: js.UndefOr[Double] = js.native
  
  /** The value to use for $TERM (default: `'vt100'`) */
  var term: js.UndefOr[String] = js.native
  
  /** The width in pixels (default: `640`). */
  var width: js.UndefOr[Double] = js.native
}
object PseudoTtyOptions {
  
  @scala.inline
  def apply(): PseudoTtyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PseudoTtyOptions]
  }
  
  @scala.inline
  implicit class PseudoTtyOptionsOps[Self <: PseudoTtyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
