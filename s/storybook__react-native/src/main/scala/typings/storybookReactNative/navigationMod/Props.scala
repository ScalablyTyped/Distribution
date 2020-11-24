package typings.storybookReactNative.navigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var initialUiVisible: js.UndefOr[Boolean] = js.native
  
  def onChangeTab(index: Double): Unit = js.native
  
  var tabOpen: Double = js.native
}
object Props {
  
  @scala.inline
  def apply(onChangeTab: Double => Unit, tabOpen: Double): Props = {
    val __obj = js.Dynamic.literal(onChangeTab = js.Any.fromFunction1(onChangeTab), tabOpen = tabOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setOnChangeTab(value: Double => Unit): Self = this.set("onChangeTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabOpen(value: Double): Self = this.set("tabOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUiVisible(value: Boolean): Self = this.set("initialUiVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialUiVisible: Self = this.set("initialUiVisible", js.undefined)
  }
}
