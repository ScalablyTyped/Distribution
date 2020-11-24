package typings.reactDatagrid.anon

import typings.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisabledStyle extends js.Object {
  
  var disabledStyle: SVGAttributes[js.Object] = js.native
  
  var overStyle: SVGAttributes[js.Object] = js.native
  
  var style: SVGAttributes[js.Object] = js.native
}
object DisabledStyle {
  
  @scala.inline
  def apply(
    disabledStyle: SVGAttributes[js.Object],
    overStyle: SVGAttributes[js.Object],
    style: SVGAttributes[js.Object]
  ): DisabledStyle = {
    val __obj = js.Dynamic.literal(disabledStyle = disabledStyle.asInstanceOf[js.Any], overStyle = overStyle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledStyle]
  }
  
  @scala.inline
  implicit class DisabledStyleOps[Self <: DisabledStyle] (val x: Self) extends AnyVal {
    
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
    def setDisabledStyle(value: SVGAttributes[js.Object]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverStyle(value: SVGAttributes[js.Object]): Self = this.set("overStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: SVGAttributes[js.Object]): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
