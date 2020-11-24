package typings.seamless.Seamless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends js.Object {
  
  /**
    * Allow appended styles to be injected.
    * @default false
    */
  var allowAppendedStyleInjection: js.UndefOr[Boolean] = js.native
  
  /**
    *  If this page should allow injected styles.
    *  @default false
    */
  var allowStyleInjection: js.UndefOr[Boolean] = js.native
  
  /**
    * The container for the main content on the page which determines the height of the page.
    * @default 'body'
    */
  var container: js.UndefOr[String] = js.native
  
  /**
    * The text to place after the link when the cookie test fails.
    * @default ' to open in a separate window.'
    */
  var cookieFallbackAfterMsg: js.UndefOr[String] = js.native
  
  /**
    * The text to place inside the link to have them open a new window if the cookie test fails.
    * @default 'Click Here'
    */
  var cookieFallbackLinkMsg: js.UndefOr[String] = js.native
  
  /**
    * The message to show if the cookie test fails.
    * @default 'Your browser requires this page to be opened in a separate window.'
    */
  var cookieFallbackMsg: js.UndefOr[String] = js.native
  
  /**
    *  Called when the parent connects to this iframe.
    *  @default null
    */
  var onConnect: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  
  /**
    *  Callback that is called when an update is triggered to the parent.
    *  @default null
    */
  var onUpdate: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  
  /**
    * If the child page requires cookies (See Child iFrame Cookie Problem section)
    * @default false
    */
  var requireCookies: js.UndefOr[Boolean] = js.native
  
  /**
    * The milliseconds that an update is created from the child to the parent.
    * @default 200
    */
  var update: js.UndefOr[Double] = js.native
  
  /**
    * The url of the parent page to connect to.
    * @default ''
    */
  var url: js.UndefOr[String] = js.native
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowAppendedStyleInjection(value: Boolean): Self = this.set("allowAppendedStyleInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAppendedStyleInjection: Self = this.set("allowAppendedStyleInjection", js.undefined)
    
    @scala.inline
    def setAllowStyleInjection(value: Boolean): Self = this.set("allowStyleInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowStyleInjection: Self = this.set("allowStyleInjection", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCookieFallbackAfterMsg(value: String): Self = this.set("cookieFallbackAfterMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieFallbackAfterMsg: Self = this.set("cookieFallbackAfterMsg", js.undefined)
    
    @scala.inline
    def setCookieFallbackLinkMsg(value: String): Self = this.set("cookieFallbackLinkMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieFallbackLinkMsg: Self = this.set("cookieFallbackLinkMsg", js.undefined)
    
    @scala.inline
    def setCookieFallbackMsg(value: String): Self = this.set("cookieFallbackMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieFallbackMsg: Self = this.set("cookieFallbackMsg", js.undefined)
    
    @scala.inline
    def setOnConnect(value: /* data */ js.Any => Unit): Self = this.set("onConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* data */ js.Any => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setRequireCookies(value: Boolean): Self = this.set("requireCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireCookies: Self = this.set("requireCookies", js.undefined)
    
    @scala.inline
    def setUpdate(value: Double): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
