package typings.stormReactDiagrams.diagramWidgetMod

import typings.stormReactDiagrams.baseActionMod.BaseAction
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramProps extends BaseWidgetProps {
  
  var actionStartedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Boolean]] = js.native
  
  var actionStillFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.native
  
  var actionStoppedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.native
  
  var allowCanvasTranslation: js.UndefOr[Boolean] = js.native
  
  var allowCanvasZoom: js.UndefOr[Boolean] = js.native
  
  var allowLooseLinks: js.UndefOr[Boolean] = js.native
  
  var deleteKeys: js.UndefOr[js.Array[Double]] = js.native
  
  var diagramEngine: DiagramEngine = js.native
  
  var inverseZoom: js.UndefOr[Boolean] = js.native
  
  var maxNumberPointsPerLink: js.UndefOr[Double] = js.native
  
  var smartRouting: js.UndefOr[Boolean] = js.native
}
object DiagramProps {
  
  @scala.inline
  def apply(diagramEngine: DiagramEngine): DiagramProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramProps]
  }
  
  @scala.inline
  implicit class DiagramPropsOps[Self <: DiagramProps] (val x: Self) extends AnyVal {
    
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
    def setDiagramEngine(value: DiagramEngine): Self = this.set("diagramEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionStartedFiring(value: /* action */ BaseAction => Boolean): Self = this.set("actionStartedFiring", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionStartedFiring: Self = this.set("actionStartedFiring", js.undefined)
    
    @scala.inline
    def setActionStillFiring(value: /* action */ BaseAction => Unit): Self = this.set("actionStillFiring", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionStillFiring: Self = this.set("actionStillFiring", js.undefined)
    
    @scala.inline
    def setActionStoppedFiring(value: /* action */ BaseAction => Unit): Self = this.set("actionStoppedFiring", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionStoppedFiring: Self = this.set("actionStoppedFiring", js.undefined)
    
    @scala.inline
    def setAllowCanvasTranslation(value: Boolean): Self = this.set("allowCanvasTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCanvasTranslation: Self = this.set("allowCanvasTranslation", js.undefined)
    
    @scala.inline
    def setAllowCanvasZoom(value: Boolean): Self = this.set("allowCanvasZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCanvasZoom: Self = this.set("allowCanvasZoom", js.undefined)
    
    @scala.inline
    def setAllowLooseLinks(value: Boolean): Self = this.set("allowLooseLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLooseLinks: Self = this.set("allowLooseLinks", js.undefined)
    
    @scala.inline
    def setDeleteKeysVarargs(value: Double*): Self = this.set("deleteKeys", js.Array(value :_*))
    
    @scala.inline
    def setDeleteKeys(value: js.Array[Double]): Self = this.set("deleteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteKeys: Self = this.set("deleteKeys", js.undefined)
    
    @scala.inline
    def setInverseZoom(value: Boolean): Self = this.set("inverseZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverseZoom: Self = this.set("inverseZoom", js.undefined)
    
    @scala.inline
    def setMaxNumberPointsPerLink(value: Double): Self = this.set("maxNumberPointsPerLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumberPointsPerLink: Self = this.set("maxNumberPointsPerLink", js.undefined)
    
    @scala.inline
    def setSmartRouting(value: Boolean): Self = this.set("smartRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartRouting: Self = this.set("smartRouting", js.undefined)
  }
}
