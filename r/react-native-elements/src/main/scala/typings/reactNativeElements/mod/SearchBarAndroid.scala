package typings.reactNativeElements.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBarAndroid extends SearchBarPlatform {
  
  /**
    * Override the cancel Icon props or use a custom component. Use null or false to hide the icon.
    */
  var cancelIcon: js.UndefOr[IconNode] = js.native
}
object SearchBarAndroid {
  
  @scala.inline
  def apply(): SearchBarAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarAndroid]
  }
  
  @scala.inline
  implicit class SearchBarAndroidOps[Self <: SearchBarAndroid] (val x: Self) extends AnyVal {
    
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
    def setCancelIcon(value: IconNode): Self = this.set("cancelIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelIcon: Self = this.set("cancelIcon", js.undefined)
  }
}
