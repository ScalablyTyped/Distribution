package typings.rcDrawer.idrawerproptypesMod

import typings.rcDrawer.rcDrawerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDrawerProps extends IProps {
  
  var forceRender: js.UndefOr[Boolean] = js.native
  
  var getContainer: js.UndefOr[IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | Null | `false`] = js.native
  
  var wrapperClassName: js.UndefOr[String] = js.native
}
object IDrawerProps {
  
  @scala.inline
  def apply(): IDrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawerProps]
  }
  
  @scala.inline
  implicit class IDrawerPropsOps[Self <: IDrawerProps] (val x: Self) extends AnyVal {
    
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
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    
    @scala.inline
    def setGetContainerFunction0(value: () => IStringOrHtmlElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainer(value: IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | `false`): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setGetContainerNull: Self = this.set("getContainer", null)
    
    @scala.inline
    def setWrapperClassName(value: String): Self = this.set("wrapperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperClassName: Self = this.set("wrapperClassName", js.undefined)
  }
}
