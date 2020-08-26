package typings.reduxBootstrap.interfacesMod.interfaces

import typings.react.mod.global.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoostrapOptions extends js.Object {
  var container: js.UndefOr[String] = js.native
  var createHistory: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any
  ] = js.native
  var devToolsOptions: js.UndefOr[DevToolsOptions] = js.native
  var enhancers: js.UndefOr[js.Array[StoreEnhancer[_, js.Object]]] = js.native
  var historyOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any
  ] = js.native
  var initialState: js.UndefOr[js.Any] = js.native
  var middlewares: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.native
  var reducers: ReducersOption = js.native
  var render: js.UndefOr[js.Function] = js.native
  var routerProps: js.UndefOr[RouterProps] = js.native
  var routes: Element = js.native
}

object BoostrapOptions {
  @scala.inline
  def apply(reducers: ReducersOption, routes: Element): BoostrapOptions = {
    val __obj = js.Dynamic.literal(reducers = reducers.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoostrapOptions]
  }
  @scala.inline
  implicit class BoostrapOptionsOps[Self <: BoostrapOptions] (val x: Self) extends AnyVal {
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
    def setReducers(value: ReducersOption): Self = this.set("reducers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutes(value: Element): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCreateHistory(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any
    ): Self = this.set("createHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateHistory: Self = this.set("createHistory", js.undefined)
    @scala.inline
    def setDevToolsOptions(value: DevToolsOptions): Self = this.set("devToolsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevToolsOptions: Self = this.set("devToolsOptions", js.undefined)
    @scala.inline
    def setEnhancersVarargs(value: (StoreEnhancer[js.Any, js.Object])*): Self = this.set("enhancers", js.Array(value :_*))
    @scala.inline
    def setEnhancers(value: js.Array[StoreEnhancer[_, js.Object]]): Self = this.set("enhancers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancers: Self = this.set("enhancers", js.undefined)
    @scala.inline
    def setHistoryOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any
    ): Self = this.set("historyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryOptions: Self = this.set("historyOptions", js.undefined)
    @scala.inline
    def setInitialState(value: js.Any): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setMiddlewaresVarargs(value: (Middleware[js.Object, js.Any, Dispatch[AnyAction]])*): Self = this.set("middlewares", js.Array(value :_*))
    @scala.inline
    def setMiddlewares(value: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): Self = this.set("middlewares", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddlewares: Self = this.set("middlewares", js.undefined)
    @scala.inline
    def setRender(value: js.Function): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setRouterProps(value: RouterProps): Self = this.set("routerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouterProps: Self = this.set("routerProps", js.undefined)
  }
  
}

