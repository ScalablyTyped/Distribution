package typings.seamless.Seamless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * If the fallback functionality is enabled.
    * @default false
    */
  var fallback: js.UndefOr[Boolean] = js.native
  
  /**
    * Text to add after the fallbackLinkText link.
    * @default 'to open in a separate window.'
    */
  var fallbackLinkAfter: js.UndefOr[String] = js.native
  
  /**
    * An array of string styles to add to the fallback link on hover.
    * @default [ 'background-color:#ebebeb', 'border-color:#adadad' ]
    */
  var fallbackLinkHoverStyles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of string styles to add to the fallback link.
    * @default [ 'display: inline-block', 'color: #333', 'border: 1px solid #ccc', 'background-color: #fff', 'padding: 5px 10px', 'text-decoration: none', 'font-size: 12px', 'line-height: 1.5', 'border-radius: 6px', 'font-weight: 400', 'cursor: pointer', '-webkit-user-select: none', '-moz-user-select: none', '-ms-user-select: none', 'user-select: none' ]
    */
  var fallbackLinkStyles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The string to show within the 'Click here' link to open the fallback window.
    * @default 'Click Here'
    */
  var fallbackLinkText: js.UndefOr[String] = js.native
  
  /**
    * Additional query params to attach to the fallback window when it is opened.
    * @default ''
    */
  var fallbackParams: js.UndefOr[String] = js.native
  
  /**
    * An array of string styles to add to the fallback text when something bad happens.
    * @default [ 'padding: 15px', 'border: 1px solid transparent', 'border-radius: 4px', 'color: #3a87ad', 'background-color: #d9edf7', 'border-color: #bce8f1' ]
    */
  var fallbackStyles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A message to show below the child iframe to offer assistance if they are having problems.
    * @default ''
    */
  var fallbackText: js.UndefOr[String] = js.native
  
  /**
    * The height of the window that is opened up for the fallback.
    * @default 800
    */
  var fallbackWindowHeight: js.UndefOr[Double] = js.native
  
  /**
    * The width of the window that is opened up for the fallback.
    * @default 960
    */
  var fallbackWindowWidth: js.UndefOr[Double] = js.native
  
  /**
    * The text to show when the child page is loading.
    * @default 'Loading ...'
    */
  var loading: js.UndefOr[String] = js.native
  
  /**
    * Called when a child iframe has finished connecting.
    * @default null
    */
  var onConnect: js.UndefOr[(js.Function1[/* data */ js.Any, Unit]) | Null] = js.native
  
  /**
    * Show or not the loading indicator.
    * @default true
    */
  var showLoadingIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * The url of the spinner GIF that is shown when the child page is loading.
    * @default 'http://www.travistidwell.com/seamless.js/src/loader.gif'
    */
  var spinner: js.UndefOr[String] = js.native
  
  /**
    * The styles to inject into the child page.
    * @default []
    */
  var styles: js.UndefOr[js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFallback(value: Boolean): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setFallbackLinkAfter(value: String): Self = this.set("fallbackLinkAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackLinkAfter: Self = this.set("fallbackLinkAfter", js.undefined)
    
    @scala.inline
    def setFallbackLinkHoverStylesVarargs(value: String*): Self = this.set("fallbackLinkHoverStyles", js.Array(value :_*))
    
    @scala.inline
    def setFallbackLinkHoverStyles(value: js.Array[String]): Self = this.set("fallbackLinkHoverStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackLinkHoverStyles: Self = this.set("fallbackLinkHoverStyles", js.undefined)
    
    @scala.inline
    def setFallbackLinkStylesVarargs(value: String*): Self = this.set("fallbackLinkStyles", js.Array(value :_*))
    
    @scala.inline
    def setFallbackLinkStyles(value: js.Array[String]): Self = this.set("fallbackLinkStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackLinkStyles: Self = this.set("fallbackLinkStyles", js.undefined)
    
    @scala.inline
    def setFallbackLinkText(value: String): Self = this.set("fallbackLinkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackLinkText: Self = this.set("fallbackLinkText", js.undefined)
    
    @scala.inline
    def setFallbackParams(value: String): Self = this.set("fallbackParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackParams: Self = this.set("fallbackParams", js.undefined)
    
    @scala.inline
    def setFallbackStylesVarargs(value: String*): Self = this.set("fallbackStyles", js.Array(value :_*))
    
    @scala.inline
    def setFallbackStyles(value: js.Array[String]): Self = this.set("fallbackStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackStyles: Self = this.set("fallbackStyles", js.undefined)
    
    @scala.inline
    def setFallbackText(value: String): Self = this.set("fallbackText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackText: Self = this.set("fallbackText", js.undefined)
    
    @scala.inline
    def setFallbackWindowHeight(value: Double): Self = this.set("fallbackWindowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackWindowHeight: Self = this.set("fallbackWindowHeight", js.undefined)
    
    @scala.inline
    def setFallbackWindowWidth(value: Double): Self = this.set("fallbackWindowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackWindowWidth: Self = this.set("fallbackWindowWidth", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setOnConnect(value: /* data */ js.Any => Unit): Self = this.set("onConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    
    @scala.inline
    def setOnConnectNull: Self = this.set("onConnect", null)
    
    @scala.inline
    def setShowLoadingIndicator(value: Boolean): Self = this.set("showLoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLoadingIndicator: Self = this.set("showLoadingIndicator", js.undefined)
    
    @scala.inline
    def setSpinner(value: String): Self = this.set("spinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinner: Self = this.set("spinner", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
