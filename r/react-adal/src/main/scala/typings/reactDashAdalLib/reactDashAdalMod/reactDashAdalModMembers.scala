package typings
package reactDashAdalLib.reactDashAdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adal", JSImport.Namespace)
@js.native
object reactDashAdalModMembers extends js.Object {
  def adalFetch(
    authContext: AuthenticationContext,
    resource: java.lang.String,
    fetch: js.Function2[/* input */ java.lang.String, /* init */ js.Any, stdLib.Promise[_]],
    url: java.lang.String,
    options: js.Any
  ): stdLib.Promise[_] = js.native
  def adalGetToken(authContext: AuthenticationContext, resourceUrl: java.lang.String): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def runWithAdal(authContext: AuthenticationContext, app: js.Function0[scala.Unit], doNotLogin: scala.Boolean): scala.Unit = js.native
  def withAdalLogin(authContext: AuthenticationContext, resource: java.lang.String): js.Function3[
    /* wrappedComponent */ (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[js.Object], 
    /* renderLoading */ js.Function0[reactLib.reactMod.Global.JSXNs.Element | scala.Null], 
    /* renderError */ js.Function1[/* error */ js.Any, reactLib.reactMod.Global.JSXNs.Element | scala.Null], 
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.native
}

