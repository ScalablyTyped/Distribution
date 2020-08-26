package typings.stormReactDiagrams.diagramEngineMod

import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramEngineListener
  extends BaseListener[js.Any] {
  var labelFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
  var linkFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
  var nodeFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
  var portFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
  var repaintCanvas: js.UndefOr[js.Function0[Unit]] = js.native
}

object DiagramEngineListener {
  @scala.inline
  def apply(): DiagramEngineListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEngineListener]
  }
  @scala.inline
  implicit class DiagramEngineListenerOps[Self <: DiagramEngineListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabelFactoriesUpdated(value: () => Unit): Self = this.set("labelFactoriesUpdated", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLabelFactoriesUpdated: Self = this.set("labelFactoriesUpdated", js.undefined)
    @scala.inline
    def setLinkFactoriesUpdated(value: () => Unit): Self = this.set("linkFactoriesUpdated", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLinkFactoriesUpdated: Self = this.set("linkFactoriesUpdated", js.undefined)
    @scala.inline
    def setNodeFactoriesUpdated(value: () => Unit): Self = this.set("nodeFactoriesUpdated", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNodeFactoriesUpdated: Self = this.set("nodeFactoriesUpdated", js.undefined)
    @scala.inline
    def setPortFactoriesUpdated(value: () => Unit): Self = this.set("portFactoriesUpdated", js.Any.fromFunction0(value))
    @scala.inline
    def deletePortFactoriesUpdated: Self = this.set("portFactoriesUpdated", js.undefined)
    @scala.inline
    def setRepaintCanvas(value: () => Unit): Self = this.set("repaintCanvas", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRepaintCanvas: Self = this.set("repaintCanvas", js.undefined)
  }
  
}

