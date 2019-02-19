package typings
package reactDashBootstrapLib.libCollapseMod.CollapseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[reactDashBootstrapLib.libCollapseMod.Collapse]
     with reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks {
  var dimension: js.UndefOr[
    reactDashBootstrapLib.reactDashBootstrapLibStrings.height | reactDashBootstrapLib.reactDashBootstrapLibStrings.width | reactDashBootstrapLib.Anon_String
  ] = js.undefined
  var getDimensionValue: js.UndefOr[
    js.Function2[
      /* dimension */ scala.Double, 
      /* element */ reactLib.reactMod.ReactNs.ReactElement[_], 
      scala.Double
    ]
  ] = js.undefined
  var in: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transitionAppear: js.UndefOr[scala.Boolean] = js.undefined
  var unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
}

