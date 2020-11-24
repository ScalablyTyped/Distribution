package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectNavigationOptions extends NavigationOptions {
  
  /**
    * Referer header value.
    * If provided it will take preference over the referer header value set by
    * [page.setExtraHTTPHeaders()](#pagesetextrahttpheadersheaders).
    */
  var referer: js.UndefOr[String] = js.native
}
object DirectNavigationOptions {
  
  @scala.inline
  def apply(): DirectNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectNavigationOptions]
  }
  
  @scala.inline
  implicit class DirectNavigationOptionsOps[Self <: DirectNavigationOptions] (val x: Self) extends AnyVal {
    
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
    def setReferer(value: String): Self = this.set("referer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferer: Self = this.set("referer", js.undefined)
  }
}
