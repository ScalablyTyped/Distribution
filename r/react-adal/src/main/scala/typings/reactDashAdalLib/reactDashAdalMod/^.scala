package typings
package reactDashAdalLib.reactDashAdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def adalFetch(
    authContext: reactDashAdalLib.reactDashAdalMod.AuthenticationContext,
    resource: java.lang.String,
    fetch: js.Function2[/* input */ java.lang.String, /* init */ js.Any, js.Promise[_]],
    url: java.lang.String,
    options: js.Any
  ): js.Promise[_] = js.native
  def adalGetToken(
    authContext: reactDashAdalLib.reactDashAdalMod.AuthenticationContext,
    resourceUrl: java.lang.String
  ): js.Promise[java.lang.String | scala.Null] = js.native
  def runWithAdal(
    authContext: reactDashAdalLib.reactDashAdalMod.AuthenticationContext,
    app: js.Function0[scala.Unit],
    doNotLogin: scala.Boolean
  ): scala.Unit = js.native
  def withAdalLogin(authContext: reactDashAdalLib.reactDashAdalMod.AuthenticationContext, resource: java.lang.String): js.Function3[
    /* wrappedComponent */ (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[js.Object], 
    /* renderLoading */ js.Function0[reactLib.reactMod.Global.JSXNs.Element | scala.Null], 
    /* renderError */ js.Function1[/* error */ js.Any, reactLib.reactMod.Global.JSXNs.Element | scala.Null], 
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.native
}

