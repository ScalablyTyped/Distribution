package typings.puppeteer.mod

import typings.puppeteer.anon.HasTouch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserOptions extends js.Object {
  
  /**
    * Sets a consistent viewport for each page. Defaults to an 800x600 viewport. null disables the default viewport.
    */
  var defaultViewport: js.UndefOr[HasTouch | Null] = js.native
  
  /**
    * Whether to ignore HTTPS errors during navigation.
    * @default false
    */
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.native
  
  /**
    * Slows down Puppeteer operations by the specified amount of milliseconds.
    * Useful so that you can see what is going on.
    */
  var slowMo: js.UndefOr[Double] = js.native
}
object BrowserOptions {
  
  @scala.inline
  def apply(): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserOptions]
  }
  
  @scala.inline
  implicit class BrowserOptionsOps[Self <: BrowserOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultViewport(value: HasTouch): Self = this.set("defaultViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultViewport: Self = this.set("defaultViewport", js.undefined)
    
    @scala.inline
    def setDefaultViewportNull: Self = this.set("defaultViewport", null)
    
    @scala.inline
    def setIgnoreHTTPSErrors(value: Boolean): Self = this.set("ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreHTTPSErrors: Self = this.set("ignoreHTTPSErrors", js.undefined)
    
    @scala.inline
    def setSlowMo(value: Double): Self = this.set("slowMo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowMo: Self = this.set("slowMo", js.undefined)
  }
}
