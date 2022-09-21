package typings.seamless

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Seamless {
  
  type Callback = js.Function2[/* data */ Any, /* event */ Any, Any | Boolean | Unit]
  
  trait ConnectOptions extends StObject {
    
    /**
      * Allow appended styles to be injected.
      * @default false
      */
    var allowAppendedStyleInjection: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  If this page should allow injected styles.
      *  @default false
      */
    var allowStyleInjection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The container for the main content on the page which determines the height of the page.
      * @default 'body'
      */
    var container: js.UndefOr[String] = js.undefined
    
    /**
      * The text to place after the link when the cookie test fails.
      * @default ' to open in a separate window.'
      */
    var cookieFallbackAfterMsg: js.UndefOr[String] = js.undefined
    
    /**
      * The text to place inside the link to have them open a new window if the cookie test fails.
      * @default 'Click Here'
      */
    var cookieFallbackLinkMsg: js.UndefOr[String] = js.undefined
    
    /**
      * The message to show if the cookie test fails.
      * @default 'Your browser requires this page to be opened in a separate window.'
      */
    var cookieFallbackMsg: js.UndefOr[String] = js.undefined
    
    /**
      *  Called when the parent connects to this iframe.
      *  @default null
      */
    var onConnect: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
    
    /**
      *  Callback that is called when an update is triggered to the parent.
      *  @default null
      */
    var onUpdate: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
    
    /**
      * If the child page requires cookies (See Child iFrame Cookie Problem section)
      * @default false
      */
    var requireCookies: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The milliseconds that an update is created from the child to the parent.
      * @default 200
      */
    var update: js.UndefOr[Double] = js.undefined
    
    /**
      * The url of the parent page to connect to.
      * @default ''
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    extension [Self <: ConnectOptions](x: Self) {
      
      inline def setAllowAppendedStyleInjection(value: Boolean): Self = StObject.set(x, "allowAppendedStyleInjection", value.asInstanceOf[js.Any])
      
      inline def setAllowAppendedStyleInjectionUndefined: Self = StObject.set(x, "allowAppendedStyleInjection", js.undefined)
      
      inline def setAllowStyleInjection(value: Boolean): Self = StObject.set(x, "allowStyleInjection", value.asInstanceOf[js.Any])
      
      inline def setAllowStyleInjectionUndefined: Self = StObject.set(x, "allowStyleInjection", js.undefined)
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCookieFallbackAfterMsg(value: String): Self = StObject.set(x, "cookieFallbackAfterMsg", value.asInstanceOf[js.Any])
      
      inline def setCookieFallbackAfterMsgUndefined: Self = StObject.set(x, "cookieFallbackAfterMsg", js.undefined)
      
      inline def setCookieFallbackLinkMsg(value: String): Self = StObject.set(x, "cookieFallbackLinkMsg", value.asInstanceOf[js.Any])
      
      inline def setCookieFallbackLinkMsgUndefined: Self = StObject.set(x, "cookieFallbackLinkMsg", js.undefined)
      
      inline def setCookieFallbackMsg(value: String): Self = StObject.set(x, "cookieFallbackMsg", value.asInstanceOf[js.Any])
      
      inline def setCookieFallbackMsgUndefined: Self = StObject.set(x, "cookieFallbackMsg", js.undefined)
      
      inline def setOnConnect(value: /* data */ Any => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnUpdate(value: /* data */ Any => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRequireCookies(value: Boolean): Self = StObject.set(x, "requireCookies", value.asInstanceOf[js.Any])
      
      inline def setRequireCookiesUndefined: Self = StObject.set(x, "requireCookies", js.undefined)
      
      inline def setUpdate(value: Double): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Connection extends StObject {
    
    var active: Boolean = js.native
    
    var id: Double = js.native
    
    var queue: js.Array[Any] = js.native
    
    def receive(callback: Callback): Unit = js.native
    def receive(`type`: String, callback: Callback): Unit = js.native
    
    def send(data: Any): Unit = js.native
    
    def setActive(active: Boolean): Unit = js.native
    
    var target: String = js.native
    
    var url: String = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * If the fallback functionality is enabled.
      * @default false
      */
    var fallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text to add after the fallbackLinkText link.
      * @default 'to open in a separate window.'
      */
    var fallbackLinkAfter: js.UndefOr[String] = js.undefined
    
    /**
      * An array of string styles to add to the fallback link on hover.
      * @default [ 'background-color:#ebebeb', 'border-color:#adadad' ]
      */
    var fallbackLinkHoverStyles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An array of string styles to add to the fallback link.
      * @default [ 'display: inline-block', 'color: #333', 'border: 1px solid #ccc', 'background-color: #fff', 'padding: 5px 10px', 'text-decoration: none', 'font-size: 12px', 'line-height: 1.5', 'border-radius: 6px', 'font-weight: 400', 'cursor: pointer', '-webkit-user-select: none', '-moz-user-select: none', '-ms-user-select: none', 'user-select: none' ]
      */
    var fallbackLinkStyles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The string to show within the 'Click here' link to open the fallback window.
      * @default 'Click Here'
      */
    var fallbackLinkText: js.UndefOr[String] = js.undefined
    
    /**
      * Additional query params to attach to the fallback window when it is opened.
      * @default ''
      */
    var fallbackParams: js.UndefOr[String] = js.undefined
    
    /**
      * An array of string styles to add to the fallback text when something bad happens.
      * @default [ 'padding: 15px', 'border: 1px solid transparent', 'border-radius: 4px', 'color: #3a87ad', 'background-color: #d9edf7', 'border-color: #bce8f1' ]
      */
    var fallbackStyles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A message to show below the child iframe to offer assistance if they are having problems.
      * @default ''
      */
    var fallbackText: js.UndefOr[String] = js.undefined
    
    /**
      * The height of the window that is opened up for the fallback.
      * @default 800
      */
    var fallbackWindowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the window that is opened up for the fallback.
      * @default 960
      */
    var fallbackWindowWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The text to show when the child page is loading.
      * @default 'Loading ...'
      */
    var loading: js.UndefOr[String] = js.undefined
    
    /**
      * Called when a child iframe has finished connecting.
      * @default null
      */
    var onConnect: js.UndefOr[(js.Function1[/* data */ Any, Unit]) | Null] = js.undefined
    
    /**
      * Show or not the loading indicator.
      * @default true
      */
    var showLoadingIndicator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The url of the spinner GIF that is shown when the child page is loading.
      * @default 'http://www.travistidwell.com/seamless.js/src/loader.gif'
      */
    var spinner: js.UndefOr[String] = js.undefined
    
    /**
      * The styles to inject into the child page.
      * @default []
      */
    var styles: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackLinkAfter(value: String): Self = StObject.set(x, "fallbackLinkAfter", value.asInstanceOf[js.Any])
      
      inline def setFallbackLinkAfterUndefined: Self = StObject.set(x, "fallbackLinkAfter", js.undefined)
      
      inline def setFallbackLinkHoverStyles(value: js.Array[String]): Self = StObject.set(x, "fallbackLinkHoverStyles", value.asInstanceOf[js.Any])
      
      inline def setFallbackLinkHoverStylesUndefined: Self = StObject.set(x, "fallbackLinkHoverStyles", js.undefined)
      
      inline def setFallbackLinkHoverStylesVarargs(value: String*): Self = StObject.set(x, "fallbackLinkHoverStyles", js.Array(value*))
      
      inline def setFallbackLinkStyles(value: js.Array[String]): Self = StObject.set(x, "fallbackLinkStyles", value.asInstanceOf[js.Any])
      
      inline def setFallbackLinkStylesUndefined: Self = StObject.set(x, "fallbackLinkStyles", js.undefined)
      
      inline def setFallbackLinkStylesVarargs(value: String*): Self = StObject.set(x, "fallbackLinkStyles", js.Array(value*))
      
      inline def setFallbackLinkText(value: String): Self = StObject.set(x, "fallbackLinkText", value.asInstanceOf[js.Any])
      
      inline def setFallbackLinkTextUndefined: Self = StObject.set(x, "fallbackLinkText", js.undefined)
      
      inline def setFallbackParams(value: String): Self = StObject.set(x, "fallbackParams", value.asInstanceOf[js.Any])
      
      inline def setFallbackParamsUndefined: Self = StObject.set(x, "fallbackParams", js.undefined)
      
      inline def setFallbackStyles(value: js.Array[String]): Self = StObject.set(x, "fallbackStyles", value.asInstanceOf[js.Any])
      
      inline def setFallbackStylesUndefined: Self = StObject.set(x, "fallbackStyles", js.undefined)
      
      inline def setFallbackStylesVarargs(value: String*): Self = StObject.set(x, "fallbackStyles", js.Array(value*))
      
      inline def setFallbackText(value: String): Self = StObject.set(x, "fallbackText", value.asInstanceOf[js.Any])
      
      inline def setFallbackTextUndefined: Self = StObject.set(x, "fallbackText", js.undefined)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFallbackWindowHeight(value: Double): Self = StObject.set(x, "fallbackWindowHeight", value.asInstanceOf[js.Any])
      
      inline def setFallbackWindowHeightUndefined: Self = StObject.set(x, "fallbackWindowHeight", js.undefined)
      
      inline def setFallbackWindowWidth(value: Double): Self = StObject.set(x, "fallbackWindowWidth", value.asInstanceOf[js.Any])
      
      inline def setFallbackWindowWidthUndefined: Self = StObject.set(x, "fallbackWindowWidth", js.undefined)
      
      inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnConnect(value: /* data */ Any => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      inline def setOnConnectNull: Self = StObject.set(x, "onConnect", null)
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setShowLoadingIndicator(value: Boolean): Self = StObject.set(x, "showLoadingIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowLoadingIndicatorUndefined: Self = StObject.set(x, "showLoadingIndicator", js.undefined)
      
      inline def setSpinner(value: String): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    }
  }
  
  @js.native
  trait SeamlessJQuery
    extends StObject
       with JQuery {
    
    var connection: Connection = js.native
    
    def receive(callback: Callback): Unit = js.native
    def receive(`type`: String, callback: Callback): Unit = js.native
    
    def seamless_error(data: Any, event: Any): Unit = js.native
    
    var seamless_options: Options = js.native
    
    def seamless_ready(data: Any, event: Any): Unit = js.native
    
    def seamless_update(data: Any, event: Any): Any = js.native
    
    def send(data: Any): Unit = js.native
  }
  
  trait Static extends StObject {
    
    def connect(options: ConnectOptions): Connection
    
    var options: ConnectOptions
  }
  object Static {
    
    inline def apply(connect: ConnectOptions => Connection, options: ConnectOptions): Static = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    extension [Self <: Static](x: Self) {
      
      inline def setConnect(value: ConnectOptions => Connection): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setOptions(value: ConnectOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
