package typings.seatsio.Seatsio

import typings.seatsio.anon.Disabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeatingChartDesignerConfig extends js.Object {
  
  var chartKey: String = js.native
  
  var divId: String = js.native
  
  var features: js.UndefOr[Disabled] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var onChartCreated: js.UndefOr[js.Function1[/* chartKey */ String, Unit]] = js.native
  
  var onChartPublished: js.UndefOr[js.Function1[/* chartKey */ String, Unit]] = js.native
  
  var onChartUpdated: js.UndefOr[js.Function1[/* chartKey */ String, Unit]] = js.native
  
  var onDesignerRendered: js.UndefOr[js.Function1[/* designer */ SeatingChartDesigner, Unit]] = js.native
  
  var onDesignerRenderingFailed: js.UndefOr[js.Function1[/* designer */ SeatingChartDesigner, Unit]] = js.native
  
  var onExitRequested: js.UndefOr[js.Function0[Unit]] = js.native
  
  var openDraftDrawing: js.UndefOr[Boolean] = js.native
  
  var openLatestDrawing: js.UndefOr[Boolean] = js.native
  
  var secretKey: String = js.native
}
object SeatingChartDesignerConfig {
  
  @scala.inline
  def apply(chartKey: String, divId: String, secretKey: String): SeatingChartDesignerConfig = {
    val __obj = js.Dynamic.literal(chartKey = chartKey.asInstanceOf[js.Any], divId = divId.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeatingChartDesignerConfig]
  }
  
  @scala.inline
  implicit class SeatingChartDesignerConfigOps[Self <: SeatingChartDesignerConfig] (val x: Self) extends AnyVal {
    
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
    def setChartKey(value: String): Self = this.set("chartKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivId(value: String): Self = this.set("divId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatures(value: Disabled): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setOnChartCreated(value: /* chartKey */ String => Unit): Self = this.set("onChartCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChartCreated: Self = this.set("onChartCreated", js.undefined)
    
    @scala.inline
    def setOnChartPublished(value: /* chartKey */ String => Unit): Self = this.set("onChartPublished", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChartPublished: Self = this.set("onChartPublished", js.undefined)
    
    @scala.inline
    def setOnChartUpdated(value: /* chartKey */ String => Unit): Self = this.set("onChartUpdated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChartUpdated: Self = this.set("onChartUpdated", js.undefined)
    
    @scala.inline
    def setOnDesignerRendered(value: /* designer */ SeatingChartDesigner => Unit): Self = this.set("onDesignerRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDesignerRendered: Self = this.set("onDesignerRendered", js.undefined)
    
    @scala.inline
    def setOnDesignerRenderingFailed(value: /* designer */ SeatingChartDesigner => Unit): Self = this.set("onDesignerRenderingFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDesignerRenderingFailed: Self = this.set("onDesignerRenderingFailed", js.undefined)
    
    @scala.inline
    def setOnExitRequested(value: () => Unit): Self = this.set("onExitRequested", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnExitRequested: Self = this.set("onExitRequested", js.undefined)
    
    @scala.inline
    def setOpenDraftDrawing(value: Boolean): Self = this.set("openDraftDrawing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenDraftDrawing: Self = this.set("openDraftDrawing", js.undefined)
    
    @scala.inline
    def setOpenLatestDrawing(value: Boolean): Self = this.set("openLatestDrawing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenLatestDrawing: Self = this.set("openLatestDrawing", js.undefined)
  }
}
