package typings.reactMdAppBar.useActionClassNameMod

import typings.reactMdAppBar.useInheritContextMod.AppBarColorInherit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBarActionClassNameProps extends AppBarColorInherit {
  
  /**
    * An optional className to merge with the nav classes.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Boolean if this is the first action within the app bar. This is really just
    * used to automatically right-align all the actions by applying `margin-left:
    * auto` to this action.
    */
  var first: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if this is the last action within the app bar's row. This will just
    * apply the `$rmd-app-bar-lr-margin` as `margin-right`.
    *
    * NOTE: This should not be used when using an overflow menu.
    */
  var last: js.UndefOr[Boolean] = js.native
}
object AppBarActionClassNameProps {
  
  @scala.inline
  def apply(): AppBarActionClassNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarActionClassNameProps]
  }
  
  @scala.inline
  implicit class AppBarActionClassNamePropsOps[Self <: AppBarActionClassNameProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setLast(value: Boolean): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
  }
}
