package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceMetricsDetails
  extends /* key */ StringDictionary[js.Any] {
  
  var document_count: js.UndefOr[Double] = js.native
  
  var document_size: js.UndefOr[Double] = js.native
  
  var domContentLoaded: js.UndefOr[Double] = js.native
  
  var estimatedInputLatency: js.UndefOr[Double] = js.native
  
  var firstCPUIdle: js.UndefOr[Double] = js.native
  
  var firstContentfulPaint: js.UndefOr[Double] = js.native
  
  var firstInteractive: js.UndefOr[Double] = js.native
  
  var firstMeaningfulPaint: js.UndefOr[Double] = js.native
  
  var firstPaint: js.UndefOr[Double] = js.native
  
  var firstVisualChange: js.UndefOr[Double] = js.native
  
  var font_count: js.UndefOr[Double] = js.native
  
  var font_size: js.UndefOr[Double] = js.native
  
  var image_count: js.UndefOr[Double] = js.native
  
  var image_size: js.UndefOr[Double] = js.native
  
  var lastVisualChange: js.UndefOr[Double] = js.native
  
  var load: js.UndefOr[Double] = js.native
  
  var mainDocumentTransferSize: js.UndefOr[Double] = js.native
  
  var maxRtt: js.UndefOr[Double] = js.native
  
  var maxServerLatency: js.UndefOr[Double] = js.native
  
  var numFonts: js.UndefOr[Double] = js.native
  
  var numRequests: js.UndefOr[Double] = js.native
  
  var numScripts: js.UndefOr[Double] = js.native
  
  var numStylesheets: js.UndefOr[Double] = js.native
  
  var numTasks: js.UndefOr[Double] = js.native
  
  var numTasksOver100ms: js.UndefOr[Double] = js.native
  
  var numTasksOver10ms: js.UndefOr[Double] = js.native
  
  var numTasksOver25ms: js.UndefOr[Double] = js.native
  
  var numTasksOver500ms: js.UndefOr[Double] = js.native
  
  var numTasksOver50ms: js.UndefOr[Double] = js.native
  
  var other_count: js.UndefOr[Double] = js.native
  
  var other_size: js.UndefOr[Double] = js.native
  
  var requestsCount: js.UndefOr[Double] = js.native
  
  var requestsSize: js.UndefOr[Double] = js.native
  
  var rtt: js.UndefOr[Double] = js.native
  
  var score: js.UndefOr[Double] = js.native
  
  var script_count: js.UndefOr[Double] = js.native
  
  var script_size: js.UndefOr[Double] = js.native
  
  var speedIndex: js.UndefOr[Double] = js.native
  
  var stylesheet_count: js.UndefOr[Double] = js.native
  
  var stylesheet_size: js.UndefOr[Double] = js.native
  
  var throughput: js.UndefOr[Double] = js.native
  
  var timeToFirstByte: js.UndefOr[Double] = js.native
  
  var totalByteWeight: js.UndefOr[Double] = js.native
  
  var totalTaskTime: js.UndefOr[Double] = js.native
}
object PerformanceMetricsDetails {
  
  @scala.inline
  def apply(): PerformanceMetricsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMetricsDetails]
  }
  
  @scala.inline
  implicit class PerformanceMetricsDetailsOps[Self <: PerformanceMetricsDetails] (val x: Self) extends AnyVal {
    
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
    def setDocument_count(value: Double): Self = this.set("document_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument_count: Self = this.set("document_count", js.undefined)
    
    @scala.inline
    def setDocument_size(value: Double): Self = this.set("document_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument_size: Self = this.set("document_size", js.undefined)
    
    @scala.inline
    def setDomContentLoaded(value: Double): Self = this.set("domContentLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomContentLoaded: Self = this.set("domContentLoaded", js.undefined)
    
    @scala.inline
    def setEstimatedInputLatency(value: Double): Self = this.set("estimatedInputLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedInputLatency: Self = this.set("estimatedInputLatency", js.undefined)
    
    @scala.inline
    def setFirstCPUIdle(value: Double): Self = this.set("firstCPUIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstCPUIdle: Self = this.set("firstCPUIdle", js.undefined)
    
    @scala.inline
    def setFirstContentfulPaint(value: Double): Self = this.set("firstContentfulPaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstContentfulPaint: Self = this.set("firstContentfulPaint", js.undefined)
    
    @scala.inline
    def setFirstInteractive(value: Double): Self = this.set("firstInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstInteractive: Self = this.set("firstInteractive", js.undefined)
    
    @scala.inline
    def setFirstMeaningfulPaint(value: Double): Self = this.set("firstMeaningfulPaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstMeaningfulPaint: Self = this.set("firstMeaningfulPaint", js.undefined)
    
    @scala.inline
    def setFirstPaint(value: Double): Self = this.set("firstPaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPaint: Self = this.set("firstPaint", js.undefined)
    
    @scala.inline
    def setFirstVisualChange(value: Double): Self = this.set("firstVisualChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstVisualChange: Self = this.set("firstVisualChange", js.undefined)
    
    @scala.inline
    def setFont_count(value: Double): Self = this.set("font_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont_count: Self = this.set("font_count", js.undefined)
    
    @scala.inline
    def setFont_size(value: Double): Self = this.set("font_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont_size: Self = this.set("font_size", js.undefined)
    
    @scala.inline
    def setImage_count(value: Double): Self = this.set("image_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_count: Self = this.set("image_count", js.undefined)
    
    @scala.inline
    def setImage_size(value: Double): Self = this.set("image_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_size: Self = this.set("image_size", js.undefined)
    
    @scala.inline
    def setLastVisualChange(value: Double): Self = this.set("lastVisualChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastVisualChange: Self = this.set("lastVisualChange", js.undefined)
    
    @scala.inline
    def setLoad(value: Double): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setMainDocumentTransferSize(value: Double): Self = this.set("mainDocumentTransferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainDocumentTransferSize: Self = this.set("mainDocumentTransferSize", js.undefined)
    
    @scala.inline
    def setMaxRtt(value: Double): Self = this.set("maxRtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRtt: Self = this.set("maxRtt", js.undefined)
    
    @scala.inline
    def setMaxServerLatency(value: Double): Self = this.set("maxServerLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxServerLatency: Self = this.set("maxServerLatency", js.undefined)
    
    @scala.inline
    def setNumFonts(value: Double): Self = this.set("numFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFonts: Self = this.set("numFonts", js.undefined)
    
    @scala.inline
    def setNumRequests(value: Double): Self = this.set("numRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumRequests: Self = this.set("numRequests", js.undefined)
    
    @scala.inline
    def setNumScripts(value: Double): Self = this.set("numScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumScripts: Self = this.set("numScripts", js.undefined)
    
    @scala.inline
    def setNumStylesheets(value: Double): Self = this.set("numStylesheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumStylesheets: Self = this.set("numStylesheets", js.undefined)
    
    @scala.inline
    def setNumTasks(value: Double): Self = this.set("numTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTasks: Self = this.set("numTasks", js.undefined)
    
    @scala.inline
    def setNumTasksOver100ms(value: Double): Self = this.set("numTasksOver100ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTasksOver100ms: Self = this.set("numTasksOver100ms", js.undefined)
    
    @scala.inline
    def setNumTasksOver10ms(value: Double): Self = this.set("numTasksOver10ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTasksOver10ms: Self = this.set("numTasksOver10ms", js.undefined)
    
    @scala.inline
    def setNumTasksOver25ms(value: Double): Self = this.set("numTasksOver25ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTasksOver25ms: Self = this.set("numTasksOver25ms", js.undefined)
    
    @scala.inline
    def setNumTasksOver500ms(value: Double): Self = this.set("numTasksOver500ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTasksOver500ms: Self = this.set("numTasksOver500ms", js.undefined)
    
    @scala.inline
    def setNumTasksOver50ms(value: Double): Self = this.set("numTasksOver50ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTasksOver50ms: Self = this.set("numTasksOver50ms", js.undefined)
    
    @scala.inline
    def setOther_count(value: Double): Self = this.set("other_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther_count: Self = this.set("other_count", js.undefined)
    
    @scala.inline
    def setOther_size(value: Double): Self = this.set("other_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther_size: Self = this.set("other_size", js.undefined)
    
    @scala.inline
    def setRequestsCount(value: Double): Self = this.set("requestsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestsCount: Self = this.set("requestsCount", js.undefined)
    
    @scala.inline
    def setRequestsSize(value: Double): Self = this.set("requestsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestsSize: Self = this.set("requestsSize", js.undefined)
    
    @scala.inline
    def setRtt(value: Double): Self = this.set("rtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtt: Self = this.set("rtt", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setScript_count(value: Double): Self = this.set("script_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript_count: Self = this.set("script_count", js.undefined)
    
    @scala.inline
    def setScript_size(value: Double): Self = this.set("script_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript_size: Self = this.set("script_size", js.undefined)
    
    @scala.inline
    def setSpeedIndex(value: Double): Self = this.set("speedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeedIndex: Self = this.set("speedIndex", js.undefined)
    
    @scala.inline
    def setStylesheet_count(value: Double): Self = this.set("stylesheet_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheet_count: Self = this.set("stylesheet_count", js.undefined)
    
    @scala.inline
    def setStylesheet_size(value: Double): Self = this.set("stylesheet_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheet_size: Self = this.set("stylesheet_size", js.undefined)
    
    @scala.inline
    def setThroughput(value: Double): Self = this.set("throughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThroughput: Self = this.set("throughput", js.undefined)
    
    @scala.inline
    def setTimeToFirstByte(value: Double): Self = this.set("timeToFirstByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToFirstByte: Self = this.set("timeToFirstByte", js.undefined)
    
    @scala.inline
    def setTotalByteWeight(value: Double): Self = this.set("totalByteWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalByteWeight: Self = this.set("totalByteWeight", js.undefined)
    
    @scala.inline
    def setTotalTaskTime(value: Double): Self = this.set("totalTaskTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalTaskTime: Self = this.set("totalTaskTime", js.undefined)
  }
}
