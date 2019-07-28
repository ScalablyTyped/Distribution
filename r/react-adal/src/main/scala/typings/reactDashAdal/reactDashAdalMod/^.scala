package typings.reactDashAdal.reactDashAdalMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def adalFetch(
    authContext: AuthenticationContext,
    resource: String,
    fetch: js.Function2[/* input */ String, /* init */ js.Any, js.Promise[_]],
    url: String,
    options: js.Any
  ): js.Promise[_] = js.native
  def adalGetToken(authContext: AuthenticationContext, resourceUrl: String): js.Promise[String | Null] = js.native
  def runWithAdal(authContext: AuthenticationContext, app: js.Function0[Unit], doNotLogin: Boolean): Unit = js.native
  def withAdalLogin(authContext: AuthenticationContext, resource: String): js.Function3[
    /* wrappedComponent */ (ComponentClass[js.Object, ComponentState]) | StatelessComponent[js.Object], 
    /* renderLoading */ js.Function0[Element | Null], 
    /* renderError */ js.Function1[/* error */ js.Any, Element | Null], 
    ComponentClass[js.Object, ComponentState]
  ] = js.native
}

