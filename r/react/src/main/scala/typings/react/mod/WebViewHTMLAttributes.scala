package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebViewHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var allowFullScreen: js.UndefOr[Boolean] = js.native
  
  var allowpopups: js.UndefOr[Boolean] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autosize: js.UndefOr[Boolean] = js.native
  
  var blinkfeatures: js.UndefOr[String] = js.native
  
  var disableblinkfeatures: js.UndefOr[String] = js.native
  
  var disableguestresize: js.UndefOr[Boolean] = js.native
  
  var disablewebsecurity: js.UndefOr[Boolean] = js.native
  
  var guestinstance: js.UndefOr[String] = js.native
  
  var httpreferrer: js.UndefOr[String] = js.native
  
  var nodeintegration: js.UndefOr[Boolean] = js.native
  
  var partition: js.UndefOr[String] = js.native
  
  var plugins: js.UndefOr[Boolean] = js.native
  
  var preload: js.UndefOr[String] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var useragent: js.UndefOr[String] = js.native
  
  var webpreferences: js.UndefOr[String] = js.native
}
object WebViewHTMLAttributes {
  
  @scala.inline
  def apply[T](): WebViewHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebViewHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class WebViewHTMLAttributesMutableBuilder[Self <: WebViewHTMLAttributes[_], T] (val x: Self with WebViewHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
    
    @scala.inline
    def setAllowpopups(value: Boolean): Self = StObject.set(x, "allowpopups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowpopupsUndefined: Self = StObject.set(x, "allowpopups", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setAutosize(value: Boolean): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
    
    @scala.inline
    def setBlinkfeatures(value: String): Self = StObject.set(x, "blinkfeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlinkfeaturesUndefined: Self = StObject.set(x, "blinkfeatures", js.undefined)
    
    @scala.inline
    def setDisableblinkfeatures(value: String): Self = StObject.set(x, "disableblinkfeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableblinkfeaturesUndefined: Self = StObject.set(x, "disableblinkfeatures", js.undefined)
    
    @scala.inline
    def setDisableguestresize(value: Boolean): Self = StObject.set(x, "disableguestresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableguestresizeUndefined: Self = StObject.set(x, "disableguestresize", js.undefined)
    
    @scala.inline
    def setDisablewebsecurity(value: Boolean): Self = StObject.set(x, "disablewebsecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablewebsecurityUndefined: Self = StObject.set(x, "disablewebsecurity", js.undefined)
    
    @scala.inline
    def setGuestinstance(value: String): Self = StObject.set(x, "guestinstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestinstanceUndefined: Self = StObject.set(x, "guestinstance", js.undefined)
    
    @scala.inline
    def setHttpreferrer(value: String): Self = StObject.set(x, "httpreferrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpreferrerUndefined: Self = StObject.set(x, "httpreferrer", js.undefined)
    
    @scala.inline
    def setNodeintegration(value: Boolean): Self = StObject.set(x, "nodeintegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeintegrationUndefined: Self = StObject.set(x, "nodeintegration", js.undefined)
    
    @scala.inline
    def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    @scala.inline
    def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setUseragent(value: String): Self = StObject.set(x, "useragent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseragentUndefined: Self = StObject.set(x, "useragent", js.undefined)
    
    @scala.inline
    def setWebpreferences(value: String): Self = StObject.set(x, "webpreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebpreferencesUndefined: Self = StObject.set(x, "webpreferences", js.undefined)
  }
}
