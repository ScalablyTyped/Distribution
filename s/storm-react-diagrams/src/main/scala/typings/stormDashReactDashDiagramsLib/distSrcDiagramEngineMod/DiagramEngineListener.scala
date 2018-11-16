package typings
package stormDashReactDashDiagramsLib.distSrcDiagramEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DiagramEngineListener
  extends stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[js.Any] {
  var labelFactoriesUpdated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var linkFactoriesUpdated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var nodeFactoriesUpdated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var portFactoriesUpdated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var repaintCanvas: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

