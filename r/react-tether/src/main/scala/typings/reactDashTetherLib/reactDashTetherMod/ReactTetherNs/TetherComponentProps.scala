package typings
package reactDashTetherLib.reactDashTetherMod.ReactTetherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherComponentProps
  extends reactLib.reactMod.ReactNs.Props[reactDashTetherLib.reactDashTetherMod.TetherComponent]
     with tetherLib.tetherMod.TetherNs.ITetherOptions {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onRepositioned: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderElementTag: js.UndefOr[java.lang.String] = js.undefined
  var renderElementTo: js.UndefOr[java.lang.String | reactDashTetherLib.Anon_AppendChild] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

