package typings
package reactDashResponsiveLib.reactDashResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MediaQueryProps extends MediaQueryAllQueryable {
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* matches */ scala.Boolean, reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[
    java.lang.String | reactLib.reactMod.ReactNs.SFC[_] | (reactLib.reactMod.ReactNs.ClassType[_, _, _]) | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState])
  ] = js.undefined
  var onBeforeChange: js.UndefOr[js.Function1[/* matches */ scala.Boolean, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ scala.Boolean, scala.Unit]] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var values: js.UndefOr[stdLib.Partial[MediaQueryMatchers]] = js.undefined
}

