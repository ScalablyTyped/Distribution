package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceMetricsDetails
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var document_count: js.UndefOr[Double] = js.undefined
  
  var document_size: js.UndefOr[Double] = js.undefined
  
  var domContentLoaded: js.UndefOr[Double] = js.undefined
  
  var estimatedInputLatency: js.UndefOr[Double] = js.undefined
  
  var firstCPUIdle: js.UndefOr[Double] = js.undefined
  
  var firstContentfulPaint: js.UndefOr[Double] = js.undefined
  
  var firstInteractive: js.UndefOr[Double] = js.undefined
  
  var firstMeaningfulPaint: js.UndefOr[Double] = js.undefined
  
  var firstPaint: js.UndefOr[Double] = js.undefined
  
  var firstVisualChange: js.UndefOr[Double] = js.undefined
  
  var font_count: js.UndefOr[Double] = js.undefined
  
  var font_size: js.UndefOr[Double] = js.undefined
  
  var image_count: js.UndefOr[Double] = js.undefined
  
  var image_size: js.UndefOr[Double] = js.undefined
  
  var lastVisualChange: js.UndefOr[Double] = js.undefined
  
  var load: js.UndefOr[Double] = js.undefined
  
  var mainDocumentTransferSize: js.UndefOr[Double] = js.undefined
  
  var maxRtt: js.UndefOr[Double] = js.undefined
  
  var maxServerLatency: js.UndefOr[Double] = js.undefined
  
  var numFonts: js.UndefOr[Double] = js.undefined
  
  var numRequests: js.UndefOr[Double] = js.undefined
  
  var numScripts: js.UndefOr[Double] = js.undefined
  
  var numStylesheets: js.UndefOr[Double] = js.undefined
  
  var numTasks: js.UndefOr[Double] = js.undefined
  
  var numTasksOver100ms: js.UndefOr[Double] = js.undefined
  
  var numTasksOver10ms: js.UndefOr[Double] = js.undefined
  
  var numTasksOver25ms: js.UndefOr[Double] = js.undefined
  
  var numTasksOver500ms: js.UndefOr[Double] = js.undefined
  
  var numTasksOver50ms: js.UndefOr[Double] = js.undefined
  
  var other_count: js.UndefOr[Double] = js.undefined
  
  var other_size: js.UndefOr[Double] = js.undefined
  
  var requestsCount: js.UndefOr[Double] = js.undefined
  
  var requestsSize: js.UndefOr[Double] = js.undefined
  
  var rtt: js.UndefOr[Double] = js.undefined
  
  var score: js.UndefOr[Double] = js.undefined
  
  var script_count: js.UndefOr[Double] = js.undefined
  
  var script_size: js.UndefOr[Double] = js.undefined
  
  var speedIndex: js.UndefOr[Double] = js.undefined
  
  var stylesheet_count: js.UndefOr[Double] = js.undefined
  
  var stylesheet_size: js.UndefOr[Double] = js.undefined
  
  var throughput: js.UndefOr[Double] = js.undefined
  
  var timeToFirstByte: js.UndefOr[Double] = js.undefined
  
  var totalByteWeight: js.UndefOr[Double] = js.undefined
  
  var totalTaskTime: js.UndefOr[Double] = js.undefined
}
object PerformanceMetricsDetails {
  
  @scala.inline
  def apply(): PerformanceMetricsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMetricsDetails]
  }
  
  @scala.inline
  implicit class PerformanceMetricsDetailsMutableBuilder[Self <: PerformanceMetricsDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument_count(value: Double): Self = StObject.set(x, "document_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_countUndefined: Self = StObject.set(x, "document_count", js.undefined)
    
    @scala.inline
    def setDocument_size(value: Double): Self = StObject.set(x, "document_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_sizeUndefined: Self = StObject.set(x, "document_size", js.undefined)
    
    @scala.inline
    def setDomContentLoaded(value: Double): Self = StObject.set(x, "domContentLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomContentLoadedUndefined: Self = StObject.set(x, "domContentLoaded", js.undefined)
    
    @scala.inline
    def setEstimatedInputLatency(value: Double): Self = StObject.set(x, "estimatedInputLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedInputLatencyUndefined: Self = StObject.set(x, "estimatedInputLatency", js.undefined)
    
    @scala.inline
    def setFirstCPUIdle(value: Double): Self = StObject.set(x, "firstCPUIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCPUIdleUndefined: Self = StObject.set(x, "firstCPUIdle", js.undefined)
    
    @scala.inline
    def setFirstContentfulPaint(value: Double): Self = StObject.set(x, "firstContentfulPaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstContentfulPaintUndefined: Self = StObject.set(x, "firstContentfulPaint", js.undefined)
    
    @scala.inline
    def setFirstInteractive(value: Double): Self = StObject.set(x, "firstInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstInteractiveUndefined: Self = StObject.set(x, "firstInteractive", js.undefined)
    
    @scala.inline
    def setFirstMeaningfulPaint(value: Double): Self = StObject.set(x, "firstMeaningfulPaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMeaningfulPaintUndefined: Self = StObject.set(x, "firstMeaningfulPaint", js.undefined)
    
    @scala.inline
    def setFirstPaint(value: Double): Self = StObject.set(x, "firstPaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPaintUndefined: Self = StObject.set(x, "firstPaint", js.undefined)
    
    @scala.inline
    def setFirstVisualChange(value: Double): Self = StObject.set(x, "firstVisualChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstVisualChangeUndefined: Self = StObject.set(x, "firstVisualChange", js.undefined)
    
    @scala.inline
    def setFont_count(value: Double): Self = StObject.set(x, "font_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_countUndefined: Self = StObject.set(x, "font_count", js.undefined)
    
    @scala.inline
    def setFont_size(value: Double): Self = StObject.set(x, "font_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_sizeUndefined: Self = StObject.set(x, "font_size", js.undefined)
    
    @scala.inline
    def setImage_count(value: Double): Self = StObject.set(x, "image_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_countUndefined: Self = StObject.set(x, "image_count", js.undefined)
    
    @scala.inline
    def setImage_size(value: Double): Self = StObject.set(x, "image_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_sizeUndefined: Self = StObject.set(x, "image_size", js.undefined)
    
    @scala.inline
    def setLastVisualChange(value: Double): Self = StObject.set(x, "lastVisualChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastVisualChangeUndefined: Self = StObject.set(x, "lastVisualChange", js.undefined)
    
    @scala.inline
    def setLoad(value: Double): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setMainDocumentTransferSize(value: Double): Self = StObject.set(x, "mainDocumentTransferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainDocumentTransferSizeUndefined: Self = StObject.set(x, "mainDocumentTransferSize", js.undefined)
    
    @scala.inline
    def setMaxRtt(value: Double): Self = StObject.set(x, "maxRtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRttUndefined: Self = StObject.set(x, "maxRtt", js.undefined)
    
    @scala.inline
    def setMaxServerLatency(value: Double): Self = StObject.set(x, "maxServerLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxServerLatencyUndefined: Self = StObject.set(x, "maxServerLatency", js.undefined)
    
    @scala.inline
    def setNumFonts(value: Double): Self = StObject.set(x, "numFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFontsUndefined: Self = StObject.set(x, "numFonts", js.undefined)
    
    @scala.inline
    def setNumRequests(value: Double): Self = StObject.set(x, "numRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRequestsUndefined: Self = StObject.set(x, "numRequests", js.undefined)
    
    @scala.inline
    def setNumScripts(value: Double): Self = StObject.set(x, "numScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumScriptsUndefined: Self = StObject.set(x, "numScripts", js.undefined)
    
    @scala.inline
    def setNumStylesheets(value: Double): Self = StObject.set(x, "numStylesheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumStylesheetsUndefined: Self = StObject.set(x, "numStylesheets", js.undefined)
    
    @scala.inline
    def setNumTasks(value: Double): Self = StObject.set(x, "numTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTasksOver100ms(value: Double): Self = StObject.set(x, "numTasksOver100ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTasksOver100msUndefined: Self = StObject.set(x, "numTasksOver100ms", js.undefined)
    
    @scala.inline
    def setNumTasksOver10ms(value: Double): Self = StObject.set(x, "numTasksOver10ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTasksOver10msUndefined: Self = StObject.set(x, "numTasksOver10ms", js.undefined)
    
    @scala.inline
    def setNumTasksOver25ms(value: Double): Self = StObject.set(x, "numTasksOver25ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTasksOver25msUndefined: Self = StObject.set(x, "numTasksOver25ms", js.undefined)
    
    @scala.inline
    def setNumTasksOver500ms(value: Double): Self = StObject.set(x, "numTasksOver500ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTasksOver500msUndefined: Self = StObject.set(x, "numTasksOver500ms", js.undefined)
    
    @scala.inline
    def setNumTasksOver50ms(value: Double): Self = StObject.set(x, "numTasksOver50ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTasksOver50msUndefined: Self = StObject.set(x, "numTasksOver50ms", js.undefined)
    
    @scala.inline
    def setNumTasksUndefined: Self = StObject.set(x, "numTasks", js.undefined)
    
    @scala.inline
    def setOther_count(value: Double): Self = StObject.set(x, "other_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther_countUndefined: Self = StObject.set(x, "other_count", js.undefined)
    
    @scala.inline
    def setOther_size(value: Double): Self = StObject.set(x, "other_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther_sizeUndefined: Self = StObject.set(x, "other_size", js.undefined)
    
    @scala.inline
    def setRequestsCount(value: Double): Self = StObject.set(x, "requestsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsCountUndefined: Self = StObject.set(x, "requestsCount", js.undefined)
    
    @scala.inline
    def setRequestsSize(value: Double): Self = StObject.set(x, "requestsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsSizeUndefined: Self = StObject.set(x, "requestsSize", js.undefined)
    
    @scala.inline
    def setRtt(value: Double): Self = StObject.set(x, "rtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRttUndefined: Self = StObject.set(x, "rtt", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setScript_count(value: Double): Self = StObject.set(x, "script_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript_countUndefined: Self = StObject.set(x, "script_count", js.undefined)
    
    @scala.inline
    def setScript_size(value: Double): Self = StObject.set(x, "script_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript_sizeUndefined: Self = StObject.set(x, "script_size", js.undefined)
    
    @scala.inline
    def setSpeedIndex(value: Double): Self = StObject.set(x, "speedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedIndexUndefined: Self = StObject.set(x, "speedIndex", js.undefined)
    
    @scala.inline
    def setStylesheet_count(value: Double): Self = StObject.set(x, "stylesheet_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheet_countUndefined: Self = StObject.set(x, "stylesheet_count", js.undefined)
    
    @scala.inline
    def setStylesheet_size(value: Double): Self = StObject.set(x, "stylesheet_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheet_sizeUndefined: Self = StObject.set(x, "stylesheet_size", js.undefined)
    
    @scala.inline
    def setThroughput(value: Double): Self = StObject.set(x, "throughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThroughputUndefined: Self = StObject.set(x, "throughput", js.undefined)
    
    @scala.inline
    def setTimeToFirstByte(value: Double): Self = StObject.set(x, "timeToFirstByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToFirstByteUndefined: Self = StObject.set(x, "timeToFirstByte", js.undefined)
    
    @scala.inline
    def setTotalByteWeight(value: Double): Self = StObject.set(x, "totalByteWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalByteWeightUndefined: Self = StObject.set(x, "totalByteWeight", js.undefined)
    
    @scala.inline
    def setTotalTaskTime(value: Double): Self = StObject.set(x, "totalTaskTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTaskTimeUndefined: Self = StObject.set(x, "totalTaskTime", js.undefined)
  }
}
