package typings.reactNativeSettingsList.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderProps extends js.Object {
  
  /**
    * default: 1
    */
  var headerNumberOfLines: js.UndefOr[Double] = js.native
  
  var headerRef: js.UndefOr[js.Function0[Unit]] = js.native
  
  var headerStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var headerText: js.UndefOr[String] = js.native
}
object HeaderProps {
  
  @scala.inline
  def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  
  @scala.inline
  implicit class HeaderPropsOps[Self <: HeaderProps] (val x: Self) extends AnyVal {
    
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
    def setHeaderNumberOfLines(value: Double): Self = this.set("headerNumberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderNumberOfLines: Self = this.set("headerNumberOfLines", js.undefined)
    
    @scala.inline
    def setHeaderRef(value: () => Unit): Self = this.set("headerRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHeaderRef: Self = this.set("headerRef", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: StyleProp[TextStyle]): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderStyleNull: Self = this.set("headerStyle", null)
    
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
  }
}
