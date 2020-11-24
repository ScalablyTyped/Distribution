package typings.protonNative.mod

import typings.protonNative.anon.BackgroundColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyledTextProps extends js.Object {
  
  var style: js.UndefOr[BackgroundColor] = js.native
  
  /**
    * The x coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var x: js.UndefOr[Double | String] = js.native
  
  /**
    * The y coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var y: js.UndefOr[Double | String] = js.native
}
object StyledTextProps {
  
  @scala.inline
  def apply(): StyledTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledTextProps]
  }
  
  @scala.inline
  implicit class StyledTextPropsOps[Self <: StyledTextProps] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: BackgroundColor): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
