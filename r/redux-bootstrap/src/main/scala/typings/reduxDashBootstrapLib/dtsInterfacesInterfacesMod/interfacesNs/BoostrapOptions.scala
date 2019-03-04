package typings
package reduxDashBootstrapLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoostrapOptions extends js.Object {
  var container: js.UndefOr[java.lang.String] = js.undefined
  var createHistory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any
  ] = js.undefined
  var devToolsOptions: js.UndefOr[DevToolsOptions] = js.undefined
  var enhancers: js.UndefOr[js.Array[reduxLib.reduxMod.StoreEnhancer[_, js.Object]]] = js.undefined
  var historyOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any
  ] = js.undefined
  var initialState: js.UndefOr[js.Any] = js.undefined
  var middlewares: js.UndefOr[
    js.Array[
      reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
    ]
  ] = js.undefined
  var reducers: ReducersOption
  var render: js.UndefOr[js.Function] = js.undefined
  var routerProps: js.UndefOr[RouterProps] = js.undefined
  var routes: reactLib.reactMod.Global.JSXNs.Element
}

object BoostrapOptions {
  @scala.inline
  def apply(
    reducers: ReducersOption,
    routes: reactLib.reactMod.Global.JSXNs.Element,
    container: java.lang.String = null,
    createHistory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify History.CreateHistory<History.HistoryOptions, History.History> */ js.Any = null,
    devToolsOptions: DevToolsOptions = null,
    enhancers: js.Array[reduxLib.reduxMod.StoreEnhancer[_, js.Object]] = null,
    historyOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify History.HistoryOptions */ js.Any = null,
    initialState: js.Any = null,
    middlewares: js.Array[
      reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
    ] = null,
    render: js.Function = null,
    routerProps: RouterProps = null
  ): BoostrapOptions = {
    val __obj = js.Dynamic.literal(reducers = reducers, routes = routes)
    if (container != null) __obj.updateDynamic("container")(container)
    if (createHistory != null) __obj.updateDynamic("createHistory")(createHistory)
    if (devToolsOptions != null) __obj.updateDynamic("devToolsOptions")(devToolsOptions)
    if (enhancers != null) __obj.updateDynamic("enhancers")(enhancers)
    if (historyOptions != null) __obj.updateDynamic("historyOptions")(historyOptions)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (middlewares != null) __obj.updateDynamic("middlewares")(middlewares)
    if (render != null) __obj.updateDynamic("render")(render)
    if (routerProps != null) __obj.updateDynamic("routerProps")(routerProps)
    __obj.asInstanceOf[BoostrapOptions]
  }
}

