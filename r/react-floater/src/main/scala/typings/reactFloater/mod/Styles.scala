package typings.reactFloater.mod

import typings.react.mod.CSSProperties
import typings.reactFloater.anon.CSSPropertieslengthnumber
import typings.reactFloater.anon.ZIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends js.Object {
  
  var arrow: CSSPropertieslengthnumber = js.native
  
  var close: CSSProperties = js.native
  
  var container: CSSProperties = js.native
  
  var content: CSSProperties = js.native
  
  var floater: CSSProperties = js.native
  
  var floaterCentered: CSSProperties = js.native
  
  var floaterClosing: CSSProperties = js.native
  
  var floaterOpening: CSSProperties = js.native
  
  var floaterWithAnimation: CSSProperties = js.native
  
  var floaterWithComponent: CSSProperties = js.native
  
  var footer: CSSProperties = js.native
  
  var options: ZIndex = js.native
  
  var title: CSSProperties = js.native
  
  var wrapper: CSSProperties = js.native
  
  var wrapperPosition: CSSProperties = js.native
}
object Styles {
  
  @scala.inline
  def apply(
    arrow: CSSPropertieslengthnumber,
    close: CSSProperties,
    container: CSSProperties,
    content: CSSProperties,
    floater: CSSProperties,
    floaterCentered: CSSProperties,
    floaterClosing: CSSProperties,
    floaterOpening: CSSProperties,
    floaterWithAnimation: CSSProperties,
    floaterWithComponent: CSSProperties,
    footer: CSSProperties,
    options: ZIndex,
    title: CSSProperties,
    wrapper: CSSProperties,
    wrapperPosition: CSSProperties
  ): Styles = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], floater = floater.asInstanceOf[js.Any], floaterCentered = floaterCentered.asInstanceOf[js.Any], floaterClosing = floaterClosing.asInstanceOf[js.Any], floaterOpening = floaterOpening.asInstanceOf[js.Any], floaterWithAnimation = floaterWithAnimation.asInstanceOf[js.Any], floaterWithComponent = floaterWithComponent.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any], wrapperPosition = wrapperPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
  
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
    
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
    def setArrow(value: CSSPropertieslengthnumber): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: CSSProperties): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: CSSProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: CSSProperties): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloater(value: CSSProperties): Self = this.set("floater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloaterCentered(value: CSSProperties): Self = this.set("floaterCentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloaterClosing(value: CSSProperties): Self = this.set("floaterClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloaterOpening(value: CSSProperties): Self = this.set("floaterOpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloaterWithAnimation(value: CSSProperties): Self = this.set("floaterWithAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloaterWithComponent(value: CSSProperties): Self = this.set("floaterWithComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: CSSProperties): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ZIndex): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: CSSProperties): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: CSSProperties): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperPosition(value: CSSProperties): Self = this.set("wrapperPosition", value.asInstanceOf[js.Any])
  }
}
