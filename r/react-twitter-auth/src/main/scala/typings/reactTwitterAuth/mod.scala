package typings.reactTwitterAuth

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.react.mod.StatelessComponent
import typings.reactTwitterAuth.reactTwitterAuthStrings.`same-origin`
import typings.reactTwitterAuth.reactTwitterAuthStrings.include
import typings.reactTwitterAuth.reactTwitterAuthStrings.omit
import typings.std.HeadersInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-twitter-auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-twitter-auth", JSImport.Default)
  @js.native
  def default: StatelessComponent[TwitterLoginProps] = js.native
  @scala.inline
  def default_=(x: StatelessComponent[TwitterLoginProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait TwitterLoginProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var credentials: js.UndefOr[omit | `same-origin` | include] = js.undefined
    
    var customHeaders: js.UndefOr[HeadersInit] = js.undefined
    
    var dialogHeight: js.UndefOr[Double] = js.undefined
    
    var dialogWidth: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var forceLogin: js.UndefOr[Boolean] = js.undefined
    
    var loginUrl: String
    
    def onFailure(msg: String): Unit
    
    def onSuccess(response: String): Unit
    
    var requestTokenUrl: String
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tag: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object TwitterLoginProps {
    
    @scala.inline
    def apply(loginUrl: String, onFailure: String => Unit, onSuccess: String => Unit, requestTokenUrl: String): TwitterLoginProps = {
      val __obj = js.Dynamic.literal(loginUrl = loginUrl.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess), requestTokenUrl = requestTokenUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwitterLoginProps]
    }
    
    @scala.inline
    implicit class TwitterLoginPropsMutableBuilder[Self <: TwitterLoginProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCredentials(value: omit | `same-origin` | include): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setCustomHeaders(value: HeadersInit): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setCustomHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "customHeaders", js.Array(value :_*))
      
      @scala.inline
      def setDialogHeight(value: Double): Self = StObject.set(x, "dialogHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogHeightUndefined: Self = StObject.set(x, "dialogHeight", js.undefined)
      
      @scala.inline
      def setDialogWidth(value: Double): Self = StObject.set(x, "dialogWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogWidthUndefined: Self = StObject.set(x, "dialogWidth", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setForceLogin(value: Boolean): Self = StObject.set(x, "forceLogin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceLoginUndefined: Self = StObject.set(x, "forceLogin", js.undefined)
      
      @scala.inline
      def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFailure(value: String => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuccess(value: String => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestTokenUrl(value: String): Self = StObject.set(x, "requestTokenUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTag(value: ReactType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
