package typings.reactCollapse.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.reactCollapse.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseProps
  extends AllHTMLAttributes[Collapse]
     with ClassAttributes[Collapse] {
  
  /** How often (in ms) the height of the content is checked. */
  var checkTimeout: js.UndefOr[Double] = js.native
  
  /** One or multiple children with static, variable or dynamic height. */
  @JSName("children")
  var children_CollapseProps: ReactNode = js.native
  
  /** A way to control the initial element style. Will not be valid after the initial render */
  var initialStyle: js.UndefOr[Height] = js.native
  
  /** Expands or collapses content. */
  var isOpened: Boolean = js.native
  
  /** Callback function triggered when animation has completed */
  var onRest: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.native
  
  /** Callback function triggered when animation begins */
  var onWork: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.native
  
  /** It is possible to set className for extra div elements that ReactCollapse creates. */
  var theme: js.UndefOr[typings.reactCollapse.anon.Collapse] = js.native
}
object CollapseProps {
  
  @scala.inline
  def apply(isOpened: Boolean): CollapseProps = {
    val __obj = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
  
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
    
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
    def setIsOpened(value: Boolean): Self = this.set("isOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckTimeout(value: Double): Self = this.set("checkTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckTimeout: Self = this.set("checkTimeout", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setInitialStyle(value: Height): Self = this.set("initialStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialStyle: Self = this.set("initialStyle", js.undefined)
    
    @scala.inline
    def setOnRest(value: /* args */ CollapseCallbackArgs => Unit): Self = this.set("onRest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRest: Self = this.set("onRest", js.undefined)
    
    @scala.inline
    def setOnWork(value: /* args */ CollapseCallbackArgs => Unit): Self = this.set("onWork", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWork: Self = this.set("onWork", js.undefined)
    
    @scala.inline
    def setTheme(value: typings.reactCollapse.anon.Collapse): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
