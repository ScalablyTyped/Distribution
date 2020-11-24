package typings.reactNativeSafariView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariViewOptions extends js.Object {
  
  /**
    * A String containing a hex or rgba color to use for the background of the browser controls (only available on iOS 10 and higher)
    *
    */
  var barTintColor: js.UndefOr[String] = js.native
  
  /**
    * A Boolean indicating to open the Safari View from the bottom
    *
    */
  var fromBottom: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean indicating to use Safari's Reader Mode if available
    *
    */
  var readerMode: js.UndefOr[Boolean] = js.native
  
  /**
    * A String containing a hex or rgba color to use for the browser controls
    *
    */
  var tintColor: js.UndefOr[String] = js.native
  
  /**
    * A String containing the url you want to load in the Safari View
    *
    */
  var url: String = js.native
}
object SafariViewOptions {
  
  @scala.inline
  def apply(url: String): SafariViewOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariViewOptions]
  }
  
  @scala.inline
  implicit class SafariViewOptionsOps[Self <: SafariViewOptions] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarTintColor(value: String): Self = this.set("barTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarTintColor: Self = this.set("barTintColor", js.undefined)
    
    @scala.inline
    def setFromBottom(value: Boolean): Self = this.set("fromBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromBottom: Self = this.set("fromBottom", js.undefined)
    
    @scala.inline
    def setReaderMode(value: Boolean): Self = this.set("readerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReaderMode: Self = this.set("readerMode", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
}
