package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RootContainerProps
  extends reactLib.reactMod.ReactNs.Props[RootContainer] {
  var Component: RelayContainerClass[_]
  var renderFailure: js.UndefOr[
    js.Function2[
      /* error */ stdLib.Error, 
      /* retry */ js.Function1[/* repeated */js.Any, _], 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var renderFetched: js.UndefOr[js.Function1[/* data */ js.Any, reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var renderLoading: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var route: Route
}

