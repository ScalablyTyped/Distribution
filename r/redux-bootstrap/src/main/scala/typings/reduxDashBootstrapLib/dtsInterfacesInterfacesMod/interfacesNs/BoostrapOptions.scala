package typings
package reduxDashBootstrapLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BoostrapOptions extends js.Object {
  var container: js.UndefOr[java.lang.String] = js.undefined
  var createHistory: js.UndefOr[js.Any] = js.undefined
  var devToolsOptions: js.UndefOr[DevToolsOptions] = js.undefined
  var enhancers: js.UndefOr[js.Array[reduxLib.reduxMod.StoreEnhancer[_, js.Object]]] = js.undefined
  var historyOptions: js.UndefOr[js.Any] = js.undefined
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

