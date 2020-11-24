package typings.reactMdAppBar.appBarTitleMod

import typings.react.mod.HTMLAttributes
import typings.reactMdAppBar.useInheritContextMod.AppBarColorInherit
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBarTitleProps
  extends HTMLAttributes[HTMLHeadingElement]
     with AppBarColorInherit {
  
  /**
    * Boolean if the title should be placed at the `$rmd-app-bar-title-keyline`.
    */
  var keyline: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the title should not automatically try to wrap the content and
    * span two lines if it is too big. This will automatically add trailing
    * ellipsis for the text overflow as well.
    */
  var noWrap: js.UndefOr[Boolean] = js.native
}
object AppBarTitleProps {
  
  @scala.inline
  def apply(): AppBarTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarTitleProps]
  }
  
  @scala.inline
  implicit class AppBarTitlePropsOps[Self <: AppBarTitleProps] (val x: Self) extends AnyVal {
    
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
    def setKeyline(value: Boolean): Self = this.set("keyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyline: Self = this.set("keyline", js.undefined)
    
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
  }
}
