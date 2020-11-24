package typings.reactStonecutter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeResponsiveOptions extends js.Object {
  
  /**
    * Default number of columns before the breakpoints kick in.
    * May be useful when rendering server-side in a universal app.
    * Default: 4.
    */
  var defaultColumns: js.UndefOr[Double] = js.native
  
  /**
    * Maximum width for the Grid in px.
    */
  var maxWidth: Double = js.native
  
  /**
    * Minimum horizontal length between the edge of the Grid and the edge of the viewport in px. Default: 0.
    */
  var minPadding: js.UndefOr[Double] = js.native
}
object MakeResponsiveOptions {
  
  @scala.inline
  def apply(maxWidth: Double): MakeResponsiveOptions = {
    val __obj = js.Dynamic.literal(maxWidth = maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeResponsiveOptions]
  }
  
  @scala.inline
  implicit class MakeResponsiveOptionsOps[Self <: MakeResponsiveOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColumns(value: Double): Self = this.set("defaultColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColumns: Self = this.set("defaultColumns", js.undefined)
    
    @scala.inline
    def setMinPadding(value: Double): Self = this.set("minPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPadding: Self = this.set("minPadding", js.undefined)
  }
}
