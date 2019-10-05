package typings.router5.typesTypesRouterMod

import typings.router5.typesTypesBaseMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var canActivate: js.UndefOr[ActivationFnFactory] = js.undefined
  var children: js.UndefOr[js.Array[Route]] = js.undefined
  var decodeParams: js.UndefOr[js.Function1[/* pathParams */ Params, Params]] = js.undefined
  var defaultParams: js.UndefOr[Params] = js.undefined
  var encodeParams: js.UndefOr[js.Function1[/* stateParams */ Params, Params]] = js.undefined
  var forwardTo: js.UndefOr[String] = js.undefined
  var name: String
  var path: String
}

object Route {
  @scala.inline
  def apply(
    name: String,
    path: String,
    canActivate: (/* router */ Router, /* dependencies */ js.UndefOr[Dependencies]) => ActivationFn = null,
    children: js.Array[Route] = null,
    decodeParams: /* pathParams */ Params => Params = null,
    defaultParams: Params = null,
    encodeParams: /* stateParams */ Params => Params = null,
    forwardTo: String = null
  ): Route = {
    val __obj = js.Dynamic.literal(name = name, path = path)
    if (canActivate != null) __obj.updateDynamic("canActivate")(js.Any.fromFunction2(canActivate))
    if (children != null) __obj.updateDynamic("children")(children)
    if (decodeParams != null) __obj.updateDynamic("decodeParams")(js.Any.fromFunction1(decodeParams))
    if (defaultParams != null) __obj.updateDynamic("defaultParams")(defaultParams)
    if (encodeParams != null) __obj.updateDynamic("encodeParams")(js.Any.fromFunction1(encodeParams))
    if (forwardTo != null) __obj.updateDynamic("forwardTo")(forwardTo)
    __obj.asInstanceOf[Route]
  }
}

