package typings.reactAdal.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.react.mod.global.JSX.Element
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

