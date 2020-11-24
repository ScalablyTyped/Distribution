package typings.reactGa.mod

import typings.reactGa.reactGaStrings.beacon
import typings.reactGa.reactGaStrings.image
import typings.reactGa.reactGaStrings.xhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventArgs extends js.Object {
  
  /** The type of interaction (e.g. 'play') */
  var action: String = js.native
  
  /** Typically the object that was interacted with (e.g. 'Video') */
  var category: String = js.native
  
  /** Custom dimensions */
  var dimension1: js.UndefOr[String] = js.native
  
  var dimension10: js.UndefOr[String] = js.native
  
  var dimension11: js.UndefOr[String] = js.native
  
  var dimension12: js.UndefOr[String] = js.native
  
  var dimension13: js.UndefOr[String] = js.native
  
  var dimension14: js.UndefOr[String] = js.native
  
  var dimension15: js.UndefOr[String] = js.native
  
  var dimension16: js.UndefOr[String] = js.native
  
  var dimension17: js.UndefOr[String] = js.native
  
  var dimension18: js.UndefOr[String] = js.native
  
  var dimension19: js.UndefOr[String] = js.native
  
  var dimension2: js.UndefOr[String] = js.native
  
  var dimension20: js.UndefOr[String] = js.native
  
  var dimension3: js.UndefOr[String] = js.native
  
  var dimension4: js.UndefOr[String] = js.native
  
  var dimension5: js.UndefOr[String] = js.native
  
  var dimension6: js.UndefOr[String] = js.native
  
  var dimension7: js.UndefOr[String] = js.native
  
  var dimension8: js.UndefOr[String] = js.native
  
  var dimension9: js.UndefOr[String] = js.native
  
  /** Useful for categorizing events (e.g. 'Fall Campaign') */
  var label: js.UndefOr[String] = js.native
  
  /** Custom metrics */
  var metric1: js.UndefOr[Double] = js.native
  
  var metric10: js.UndefOr[Double] = js.native
  
  var metric11: js.UndefOr[Double] = js.native
  
  var metric12: js.UndefOr[Double] = js.native
  
  var metric13: js.UndefOr[Double] = js.native
  
  var metric14: js.UndefOr[Double] = js.native
  
  var metric15: js.UndefOr[Double] = js.native
  
  var metric16: js.UndefOr[Double] = js.native
  
  var metric17: js.UndefOr[Double] = js.native
  
  var metric18: js.UndefOr[Double] = js.native
  
  var metric19: js.UndefOr[Double] = js.native
  
  var metric2: js.UndefOr[Double] = js.native
  
  var metric20: js.UndefOr[Double] = js.native
  
  var metric3: js.UndefOr[Double] = js.native
  
  var metric4: js.UndefOr[Double] = js.native
  
  var metric5: js.UndefOr[Double] = js.native
  
  var metric6: js.UndefOr[Double] = js.native
  
  var metric7: js.UndefOr[Double] = js.native
  
  var metric8: js.UndefOr[Double] = js.native
  
  var metric9: js.UndefOr[Double] = js.native
  
  /** Specifies that a hit be considered non-interactive. */
  var nonInteraction: js.UndefOr[Boolean] = js.native
  
  /**
    * This specifies the transport mechanism with which hits will be sent.
    * The options are 'beacon', 'xhr', or 'image'. By default, analytics.js
    * will try to figure out the best method based on the hit size and browser
    * capabilities. If you specify 'beacon' and the user's browser does not support
    * the `navigator.sendBeacon` method, it will fall back to 'image' or 'xhr'
    * depending on hit size.
    */
  var transport: js.UndefOr[beacon | xhr | image] = js.native
  
  /** A numeric value associated with the event (e.g. 42) */
  var value: js.UndefOr[Double] = js.native
}
object EventArgs {
  
  @scala.inline
  def apply(action: String, category: String): EventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArgs]
  }
  
  @scala.inline
  implicit class EventArgsOps[Self <: EventArgs] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimension1(value: String): Self = this.set("dimension1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension1: Self = this.set("dimension1", js.undefined)
    
    @scala.inline
    def setDimension10(value: String): Self = this.set("dimension10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension10: Self = this.set("dimension10", js.undefined)
    
    @scala.inline
    def setDimension11(value: String): Self = this.set("dimension11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension11: Self = this.set("dimension11", js.undefined)
    
    @scala.inline
    def setDimension12(value: String): Self = this.set("dimension12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension12: Self = this.set("dimension12", js.undefined)
    
    @scala.inline
    def setDimension13(value: String): Self = this.set("dimension13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension13: Self = this.set("dimension13", js.undefined)
    
    @scala.inline
    def setDimension14(value: String): Self = this.set("dimension14", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension14: Self = this.set("dimension14", js.undefined)
    
    @scala.inline
    def setDimension15(value: String): Self = this.set("dimension15", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension15: Self = this.set("dimension15", js.undefined)
    
    @scala.inline
    def setDimension16(value: String): Self = this.set("dimension16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension16: Self = this.set("dimension16", js.undefined)
    
    @scala.inline
    def setDimension17(value: String): Self = this.set("dimension17", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension17: Self = this.set("dimension17", js.undefined)
    
    @scala.inline
    def setDimension18(value: String): Self = this.set("dimension18", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension18: Self = this.set("dimension18", js.undefined)
    
    @scala.inline
    def setDimension19(value: String): Self = this.set("dimension19", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension19: Self = this.set("dimension19", js.undefined)
    
    @scala.inline
    def setDimension2(value: String): Self = this.set("dimension2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension2: Self = this.set("dimension2", js.undefined)
    
    @scala.inline
    def setDimension20(value: String): Self = this.set("dimension20", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension20: Self = this.set("dimension20", js.undefined)
    
    @scala.inline
    def setDimension3(value: String): Self = this.set("dimension3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension3: Self = this.set("dimension3", js.undefined)
    
    @scala.inline
    def setDimension4(value: String): Self = this.set("dimension4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension4: Self = this.set("dimension4", js.undefined)
    
    @scala.inline
    def setDimension5(value: String): Self = this.set("dimension5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension5: Self = this.set("dimension5", js.undefined)
    
    @scala.inline
    def setDimension6(value: String): Self = this.set("dimension6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension6: Self = this.set("dimension6", js.undefined)
    
    @scala.inline
    def setDimension7(value: String): Self = this.set("dimension7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension7: Self = this.set("dimension7", js.undefined)
    
    @scala.inline
    def setDimension8(value: String): Self = this.set("dimension8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension8: Self = this.set("dimension8", js.undefined)
    
    @scala.inline
    def setDimension9(value: String): Self = this.set("dimension9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension9: Self = this.set("dimension9", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMetric1(value: Double): Self = this.set("metric1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric1: Self = this.set("metric1", js.undefined)
    
    @scala.inline
    def setMetric10(value: Double): Self = this.set("metric10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric10: Self = this.set("metric10", js.undefined)
    
    @scala.inline
    def setMetric11(value: Double): Self = this.set("metric11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric11: Self = this.set("metric11", js.undefined)
    
    @scala.inline
    def setMetric12(value: Double): Self = this.set("metric12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric12: Self = this.set("metric12", js.undefined)
    
    @scala.inline
    def setMetric13(value: Double): Self = this.set("metric13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric13: Self = this.set("metric13", js.undefined)
    
    @scala.inline
    def setMetric14(value: Double): Self = this.set("metric14", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric14: Self = this.set("metric14", js.undefined)
    
    @scala.inline
    def setMetric15(value: Double): Self = this.set("metric15", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric15: Self = this.set("metric15", js.undefined)
    
    @scala.inline
    def setMetric16(value: Double): Self = this.set("metric16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric16: Self = this.set("metric16", js.undefined)
    
    @scala.inline
    def setMetric17(value: Double): Self = this.set("metric17", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric17: Self = this.set("metric17", js.undefined)
    
    @scala.inline
    def setMetric18(value: Double): Self = this.set("metric18", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric18: Self = this.set("metric18", js.undefined)
    
    @scala.inline
    def setMetric19(value: Double): Self = this.set("metric19", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric19: Self = this.set("metric19", js.undefined)
    
    @scala.inline
    def setMetric2(value: Double): Self = this.set("metric2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric2: Self = this.set("metric2", js.undefined)
    
    @scala.inline
    def setMetric20(value: Double): Self = this.set("metric20", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric20: Self = this.set("metric20", js.undefined)
    
    @scala.inline
    def setMetric3(value: Double): Self = this.set("metric3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric3: Self = this.set("metric3", js.undefined)
    
    @scala.inline
    def setMetric4(value: Double): Self = this.set("metric4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric4: Self = this.set("metric4", js.undefined)
    
    @scala.inline
    def setMetric5(value: Double): Self = this.set("metric5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric5: Self = this.set("metric5", js.undefined)
    
    @scala.inline
    def setMetric6(value: Double): Self = this.set("metric6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric6: Self = this.set("metric6", js.undefined)
    
    @scala.inline
    def setMetric7(value: Double): Self = this.set("metric7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric7: Self = this.set("metric7", js.undefined)
    
    @scala.inline
    def setMetric8(value: Double): Self = this.set("metric8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric8: Self = this.set("metric8", js.undefined)
    
    @scala.inline
    def setMetric9(value: Double): Self = this.set("metric9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric9: Self = this.set("metric9", js.undefined)
    
    @scala.inline
    def setNonInteraction(value: Boolean): Self = this.set("nonInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonInteraction: Self = this.set("nonInteraction", js.undefined)
    
    @scala.inline
    def setTransport(value: beacon | xhr | image): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
