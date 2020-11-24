package typings.reactMdUtils.appSizeListenerMod

import typings.react.mod.ReactNode
import typings.reactMdUtils.useAppSizeMediaMod.AppSize
import typings.reactMdUtils.useAppSizeMediaMod.AppSizeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSizeListenerProps extends AppSizeOptions {
  
  var children: ReactNode = js.native
  
  /**
    * An change handler for the app size. This will be called each time the app
    * size changes based on a window resize event and will be provided the next
    * size and the previous size.
    */
  var onChange: js.UndefOr[js.Function2[/* nextSize */ AppSize, /* lastSize */ AppSize, Unit]] = js.native
}
object AppSizeListenerProps {
  
  @scala.inline
  def apply(): AppSizeListenerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSizeListenerProps]
  }
  
  @scala.inline
  implicit class AppSizeListenerPropsOps[Self <: AppSizeListenerProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* nextSize */ AppSize, /* lastSize */ AppSize) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
}
