package typings.reactDashAdal.reactDashAdalMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adal", "withAdalLogin")
@js.native
object withAdalLogin extends js.Object {
  def apply(authContext: AuthenticationContext, resource: String): js.Function3[
    /* wrappedComponent */ (ComponentClass[js.Object, ComponentState]) | StatelessComponent[js.Object], 
    /* renderLoading */ js.Function0[Element | Null], 
    /* renderError */ js.Function1[/* error */ js.Any, Element | Null], 
    ComponentClass[js.Object, ComponentState]
  ] = js.native
}

