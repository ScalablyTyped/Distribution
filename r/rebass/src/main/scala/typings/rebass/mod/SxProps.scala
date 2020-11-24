package typings.rebass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SxProps extends js.Object {
  
  /**
    * The sx prop lets you style elements inline, using values from your theme.
    */
  var sx: js.UndefOr[SxStyleProp] = js.native
}
object SxProps {
  
  @scala.inline
  def apply(): SxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SxProps]
  }
  
  @scala.inline
  implicit class SxPropsOps[Self <: SxProps] (val x: Self) extends AnyVal {
    
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
    def setSx(value: SxStyleProp): Self = this.set("sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSx: Self = this.set("sx", js.undefined)
    
    @scala.inline
    def setSxNull: Self = this.set("sx", null)
  }
}
