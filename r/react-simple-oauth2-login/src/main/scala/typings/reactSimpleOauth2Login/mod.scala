package typings.reactSimpleOauth2Login

import typings.react.mod.ReactChildren
import typings.react.mod.global.JSX.Element
import typings.reactSimpleOauth2Login.anon.ButtonText
import typings.reactSimpleOauth2Login.reactSimpleOauth2LoginStrings.code
import typings.reactSimpleOauth2Login.reactSimpleOauth2LoginStrings.token
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-simple-oauth2-login", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: OAuth2LoginProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait OAuth2LoginProps extends StObject {
    
    var authorizationUrl: String
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactChildren] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clientId: String
    
    var extraParams: js.UndefOr[Record[String, Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isCrossOrigin: js.UndefOr[Boolean] = js.undefined
    
    def onFailure(err: js.Error): Unit
    
    var onRequest: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onSuccess(data: Record[String, Any]): Unit
    
    var popupHeight: js.UndefOr[Double] = js.undefined
    
    var popupWidth: js.UndefOr[Double] = js.undefined
    
    var redirectUri: String
    
    var render: js.UndefOr[js.Function1[/* props */ ButtonText, Unit]] = js.undefined
    
    var responseType: code | token
    
    var scope: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object OAuth2LoginProps {
    
    inline def apply(
      authorizationUrl: String,
      clientId: String,
      onFailure: js.Error => Unit,
      onSuccess: Record[String, Any] => Unit,
      redirectUri: String,
      responseType: code | token
    ): OAuth2LoginProps = {
      val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess), redirectUri = redirectUri.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2LoginProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuth2LoginProps] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setChildren(value: ReactChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setExtraParams(value: Record[String, Any]): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
      
      inline def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsCrossOrigin(value: Boolean): Self = StObject.set(x, "isCrossOrigin", value.asInstanceOf[js.Any])
      
      inline def setIsCrossOriginUndefined: Self = StObject.set(x, "isCrossOrigin", js.undefined)
      
      inline def setOnFailure(value: js.Error => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
      
      inline def setOnRequest(value: () => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction0(value))
      
      inline def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
      
      inline def setOnSuccess(value: Record[String, Any] => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setPopupHeight(value: Double): Self = StObject.set(x, "popupHeight", value.asInstanceOf[js.Any])
      
      inline def setPopupHeightUndefined: Self = StObject.set(x, "popupHeight", js.undefined)
      
      inline def setPopupWidth(value: Double): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
      
      inline def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* props */ ButtonText => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setResponseType(value: code | token): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
