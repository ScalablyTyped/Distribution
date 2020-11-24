package typings.reactMdUtils.useAppSizeMediaMod

import typings.reactMdUtils.sizingConstantsMod.QuerySize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSizeOptions extends js.Object {
  
  /**
    * An optional default size to use for your app. This is really only helpful
    * when trying to do server side rendering or initial page render since the
    * default behavior is to check and update the size once mounted in the DOM.
    */
  var defaultSize: js.UndefOr[AppSize] = js.native
  
  /**
    * The min width for a large desktop screen.
    */
  var desktopLargeMinWidth: js.UndefOr[QuerySize] = js.native
  
  /**
    * The min width for a desktop screen.
    */
  var desktopMinWidth: js.UndefOr[QuerySize] = js.native
  
  /**
    * The max width to use for phones. This one is a max width unline the others
    * since everything from 0 to this value will be considered a phone.
    */
  var phoneMaxWidth: js.UndefOr[QuerySize] = js.native
  
  /**
    * The max width for a tablet device. This should normally be `1px` less than
    * the `desktopMinWidth`, but it can be any value if needed. The tablet has a
    * range of min to max so that you can have a bit more control.
    */
  var tabletMaxWidth: js.UndefOr[QuerySize] = js.native
  
  /**
    * The min width for a tablet device.
    */
  var tabletMinWidth: js.UndefOr[QuerySize] = js.native
}
object AppSizeOptions {
  
  @scala.inline
  def apply(): AppSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSizeOptions]
  }
  
  @scala.inline
  implicit class AppSizeOptionsOps[Self <: AppSizeOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultSize(value: AppSize): Self = this.set("defaultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSize: Self = this.set("defaultSize", js.undefined)
    
    @scala.inline
    def setDesktopLargeMinWidth(value: QuerySize): Self = this.set("desktopLargeMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktopLargeMinWidth: Self = this.set("desktopLargeMinWidth", js.undefined)
    
    @scala.inline
    def setDesktopMinWidth(value: QuerySize): Self = this.set("desktopMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktopMinWidth: Self = this.set("desktopMinWidth", js.undefined)
    
    @scala.inline
    def setPhoneMaxWidth(value: QuerySize): Self = this.set("phoneMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneMaxWidth: Self = this.set("phoneMaxWidth", js.undefined)
    
    @scala.inline
    def setTabletMaxWidth(value: QuerySize): Self = this.set("tabletMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabletMaxWidth: Self = this.set("tabletMaxWidth", js.undefined)
    
    @scala.inline
    def setTabletMinWidth(value: QuerySize): Self = this.set("tabletMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabletMinWidth: Self = this.set("tabletMinWidth", js.undefined)
  }
}
