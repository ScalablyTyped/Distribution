package typings.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  trackingId :string} & react-ga.react-ga.InitializeOptions */
@js.native
trait Tracker extends js.Object {
  
  var alwaysSendToDefaultTracker: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var gaAddress: js.UndefOr[String] = js.native
  
  var gaOptions: js.UndefOr[GaOptions] = js.native
  
  /** Optional. Defaults to `true`. Enables redacting a email as the string that in "Event Category" and "Event Action". */
  var redactEmail: js.UndefOr[Boolean] = js.native
  
  var standardImplementation: js.UndefOr[Boolean] = js.native
  
  var testMode: js.UndefOr[Boolean] = js.native
  
  var titleCase: js.UndefOr[Boolean] = js.native
  
  var trackingId: String = js.native
  
  var useExistingGa: js.UndefOr[Boolean] = js.native
}
object Tracker {
  
  @scala.inline
  def apply(trackingId: String): Tracker = {
    val __obj = js.Dynamic.literal(trackingId = trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracker]
  }
  
  @scala.inline
  implicit class TrackerOps[Self <: Tracker] (val x: Self) extends AnyVal {
    
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
    def setTrackingId(value: String): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysSendToDefaultTracker(value: Boolean): Self = this.set("alwaysSendToDefaultTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysSendToDefaultTracker: Self = this.set("alwaysSendToDefaultTracker", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setGaAddress(value: String): Self = this.set("gaAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaAddress: Self = this.set("gaAddress", js.undefined)
    
    @scala.inline
    def setGaOptions(value: GaOptions): Self = this.set("gaOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaOptions: Self = this.set("gaOptions", js.undefined)
    
    @scala.inline
    def setRedactEmail(value: Boolean): Self = this.set("redactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedactEmail: Self = this.set("redactEmail", js.undefined)
    
    @scala.inline
    def setStandardImplementation(value: Boolean): Self = this.set("standardImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardImplementation: Self = this.set("standardImplementation", js.undefined)
    
    @scala.inline
    def setTestMode(value: Boolean): Self = this.set("testMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestMode: Self = this.set("testMode", js.undefined)
    
    @scala.inline
    def setTitleCase(value: Boolean): Self = this.set("titleCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleCase: Self = this.set("titleCase", js.undefined)
    
    @scala.inline
    def setUseExistingGa(value: Boolean): Self = this.set("useExistingGa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExistingGa: Self = this.set("useExistingGa", js.undefined)
  }
}
