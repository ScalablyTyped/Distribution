package typings.router5.routerMod

import typings.router5.baseMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[Dependencies /* <: DefaultDependencies */] extends js.Object {
  var canActivate: js.UndefOr[ActivationFnFactory[Dependencies]] = js.undefined
  var children: js.UndefOr[js.Array[Route[Dependencies]]] = js.undefined
  var decodeParams: js.UndefOr[js.Function1[/* pathParams */ Params, Params]] = js.undefined
  var defaultParams: js.UndefOr[Params] = js.undefined
  var encodeParams: js.UndefOr[js.Function1[/* stateParams */ Params, Params]] = js.undefined
  var forwardTo: js.UndefOr[String] = js.undefined
  var name: String
  var path: String
}

object Route {
  @scala.inline
  def apply[/* <: typings.router5.routerMod.DefaultDependencies */ Dependencies](
    name: String,
    path: String,
    canActivate: (/* router */ Router[DefaultDependencies], /* dependencies */ js.UndefOr[Dependencies]) => ActivationFn = null,
    children: js.Array[Route[Dependencies]] = null,
    decodeParams: /* pathParams */ Params => Params = null,
    defaultParams: Params = null,
    encodeParams: /* stateParams */ Params => Params = null,
    forwardTo: String = null
  ): Route[Dependencies] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (canActivate != null) __obj.updateDynamic("canActivate")(js.Any.fromFunction2(canActivate))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (decodeParams != null) __obj.updateDynamic("decodeParams")(js.Any.fromFunction1(decodeParams))
    if (defaultParams != null) __obj.updateDynamic("defaultParams")(defaultParams.asInstanceOf[js.Any])
    if (encodeParams != null) __obj.updateDynamic("encodeParams")(js.Any.fromFunction1(encodeParams))
    if (forwardTo != null) __obj.updateDynamic("forwardTo")(forwardTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[Dependencies]]
  }
}

