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

object DiagramEngineListener {
  @scala.inline
  def apply(
    labelFactoriesUpdated: js.Function0[scala.Unit] = null,
    linkFactoriesUpdated: js.Function0[scala.Unit] = null,
    lockChanged: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[js.Any] with stormDashReactDashDiagramsLib.Anon_Locked, 
      scala.Unit
    ] = null,
    nodeFactoriesUpdated: js.Function0[scala.Unit] = null,
    portFactoriesUpdated: js.Function0[scala.Unit] = null,
    repaintCanvas: js.Function0[scala.Unit] = null
  ): DiagramEngineListener = {
    val __obj = js.Dynamic.literal()
    if (labelFactoriesUpdated != null) __obj.updateDynamic("labelFactoriesUpdated")(labelFactoriesUpdated)
    if (linkFactoriesUpdated != null) __obj.updateDynamic("linkFactoriesUpdated")(linkFactoriesUpdated)
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(lockChanged)
    if (nodeFactoriesUpdated != null) __obj.updateDynamic("nodeFactoriesUpdated")(nodeFactoriesUpdated)
    if (portFactoriesUpdated != null) __obj.updateDynamic("portFactoriesUpdated")(portFactoriesUpdated)
    if (repaintCanvas != null) __obj.updateDynamic("repaintCanvas")(repaintCanvas)
    __obj.asInstanceOf[DiagramEngineListener]
  }
}

