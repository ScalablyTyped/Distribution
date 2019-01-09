package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var activeProps: js.UndefOr[ObjectLiteral[_]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var href: Href
  var location: js.UndefOr[Location] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ reactLib.Event, _]] = js.undefined
  var persistQuery: js.UndefOr[scala.Boolean] = js.undefined
  var push: js.UndefOr[
    js.Function2[
      /* href */ Href, 
      /* options */ LocationOptions, 
      reduxDashLittleDashRouterLib.Anon_Payload
    ]
  ] = js.undefined
  var replace: js.UndefOr[
    js.Function2[
      /* href */ Href, 
      /* options */ LocationOptions, 
      reduxDashLittleDashRouterLib.Anon_Payload
    ]
  ] = js.undefined
  var replaceState: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[ObjectLiteral[_]] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

