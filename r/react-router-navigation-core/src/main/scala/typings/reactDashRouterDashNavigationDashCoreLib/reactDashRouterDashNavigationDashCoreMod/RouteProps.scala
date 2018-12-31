package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.UndefOr[
    (js.Function1[
      /* props */ reactDashRouterLib.reactDashRouterMod.RouterProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]) | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  var component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[
      reactDashRouterLib.reactDashRouterMod.RouterProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ]
  ] = js.undefined
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var render: js.UndefOr[
    js.Function1[
      /* props */ reactDashRouterLib.reactDashRouterMod.RouterProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

