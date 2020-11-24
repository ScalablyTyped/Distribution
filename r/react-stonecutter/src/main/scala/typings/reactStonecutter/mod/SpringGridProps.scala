package typings.reactStonecutter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpringGridProps extends CommonGridProps {
  
  /**
    * Configuration of the React-Motion spring.
    * See the React-Motion docs for more info. Default: { stiffness: 60, damping: 14, precision: 0.1 }.
    */
  var springConfig: js.UndefOr[js.Any] = js.native
}
object SpringGridProps {
  
  @scala.inline
  def apply(columnWidth: Double, columns: Double): SpringGridProps = {
    val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringGridProps]
  }
  
  @scala.inline
  implicit class SpringGridPropsOps[Self <: SpringGridProps] (val x: Self) extends AnyVal {
    
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
    def setSpringConfig(value: js.Any): Self = this.set("springConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpringConfig: Self = this.set("springConfig", js.undefined)
  }
}
