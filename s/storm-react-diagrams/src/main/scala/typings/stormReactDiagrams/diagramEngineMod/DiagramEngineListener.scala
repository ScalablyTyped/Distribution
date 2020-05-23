package typings.stormReactDiagrams.diagramEngineMod

import typings.stormReactDiagrams.anon.Locked
import typings.stormReactDiagrams.baseEntityMod.BaseEvent
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEngineListener
  extends BaseListener[js.Any] {
  var labelFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var linkFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var nodeFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var portFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var repaintCanvas: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object DiagramEngineListener {
  @scala.inline
  def apply(
    labelFactoriesUpdated: () => Unit = null,
    linkFactoriesUpdated: () => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with Locked => Unit = null,
    nodeFactoriesUpdated: () => Unit = null,
    portFactoriesUpdated: () => Unit = null,
    repaintCanvas: () => Unit = null
  ): DiagramEngineListener = {
    val __obj = js.Dynamic.literal()
    if (labelFactoriesUpdated != null) __obj.updateDynamic("labelFactoriesUpdated")(js.Any.fromFunction0(labelFactoriesUpdated))
    if (linkFactoriesUpdated != null) __obj.updateDynamic("linkFactoriesUpdated")(js.Any.fromFunction0(linkFactoriesUpdated))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1(lockChanged))
    if (nodeFactoriesUpdated != null) __obj.updateDynamic("nodeFactoriesUpdated")(js.Any.fromFunction0(nodeFactoriesUpdated))
    if (portFactoriesUpdated != null) __obj.updateDynamic("portFactoriesUpdated")(js.Any.fromFunction0(portFactoriesUpdated))
    if (repaintCanvas != null) __obj.updateDynamic("repaintCanvas")(js.Any.fromFunction0(repaintCanvas))
    __obj.asInstanceOf[DiagramEngineListener]
  }
}

