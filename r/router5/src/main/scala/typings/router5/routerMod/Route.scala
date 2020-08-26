package typings.router5.routerMod

import typings.router5.baseMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route[Dependencies /* <: DefaultDependencies */] extends js.Object {
  var canActivate: js.UndefOr[ActivationFnFactory[Dependencies]] = js.native
  var children: js.UndefOr[js.Array[Route[Dependencies]]] = js.native
  var decodeParams: js.UndefOr[js.Function1[/* pathParams */ Params, Params]] = js.native
  var defaultParams: js.UndefOr[Params] = js.native
  var encodeParams: js.UndefOr[js.Function1[/* stateParams */ Params, Params]] = js.native
  var forwardTo: js.UndefOr[String] = js.native
  var name: String = js.native
  var path: String = js.native
}

object Route {
  @scala.inline
  def apply[/* <: typings.router5.routerMod.DefaultDependencies */ Dependencies](name: String, path: String): Route[Dependencies] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[Dependencies]]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route[_], /* <: typings.router5.routerMod.DefaultDependencies */ Dependencies] (val x: Self with Route[Dependencies]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanActivate(
      value: (/* router */ Router[DefaultDependencies], /* dependencies */ js.UndefOr[Dependencies]) => ActivationFn
    ): Self = this.set("canActivate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCanActivate: Self = this.set("canActivate", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: Route[Dependencies]*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Route[Dependencies]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDecodeParams(value: /* pathParams */ Params => Params): Self = this.set("decodeParams", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDecodeParams: Self = this.set("decodeParams", js.undefined)
    @scala.inline
    def setDefaultParams(value: Params): Self = this.set("defaultParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultParams: Self = this.set("defaultParams", js.undefined)
    @scala.inline
    def setEncodeParams(value: /* stateParams */ Params => Params): Self = this.set("encodeParams", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncodeParams: Self = this.set("encodeParams", js.undefined)
    @scala.inline
    def setForwardTo(value: String): Self = this.set("forwardTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardTo: Self = this.set("forwardTo", js.undefined)
  }
  
}

