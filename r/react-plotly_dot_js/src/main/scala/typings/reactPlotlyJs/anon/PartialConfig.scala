package typings.reactPlotlyJs.anon

import typings.plotlyJs.anon.PartialEdits
import typings.plotlyJs.anon.Partialfilenamestringscal
import typings.plotlyJs.mod.ModeBarButton
import typings.plotlyJs.mod.ModeBarDefaultButtons
import typings.reactPlotlyJs.reactPlotlyJsBooleans.`false`
import typings.reactPlotlyJs.reactPlotlyJsNumbers.`0`
import typings.reactPlotlyJs.reactPlotlyJsNumbers.`1`
import typings.reactPlotlyJs.reactPlotlyJsNumbers.`2`
import typings.reactPlotlyJs.reactPlotlyJsStrings.autosize
import typings.reactPlotlyJs.reactPlotlyJsStrings.hover
import typings.reactPlotlyJs.reactPlotlyJsStrings.opaque
import typings.reactPlotlyJs.reactPlotlyJsStrings.reset
import typings.reactPlotlyJs.reactPlotlyJsStrings.resetPlussignautosize
import typings.reactPlotlyJs.reactPlotlyJsStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Config> */
trait PartialConfig extends StObject {
  
  var autosizable: js.UndefOr[Boolean] = js.undefined
  
  var displayModeBar: js.UndefOr[hover | Boolean] = js.undefined
  
  var displaylogo: js.UndefOr[Boolean] = js.undefined
  
  var doubleClick: js.UndefOr[resetPlussignautosize | reset | autosize | `false`] = js.undefined
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var edits: js.UndefOr[PartialEdits] = js.undefined
  
  var fillFrame: js.UndefOr[Boolean] = js.undefined
  
  var frameMargins: js.UndefOr[Double] = js.undefined
  
  var globalTransforms: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var linkText: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var logging: js.UndefOr[Boolean | `0` | `1` | `2`] = js.undefined
  
  var mapboxAccessToken: js.UndefOr[String] = js.undefined
  
  var modeBarButtons: js.UndefOr[(js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`] = js.undefined
  
  var modeBarButtonsToAdd: js.UndefOr[js.Array[ModeBarButton | ModeBarDefaultButtons]] = js.undefined
  
  var modeBarButtonsToRemove: js.UndefOr[js.Array[ModeBarDefaultButtons]] = js.undefined
  
  var plotGlPixelRatio: js.UndefOr[Double] = js.undefined
  
  var plotlyServerURL: js.UndefOr[String] = js.undefined
  
  var queueLength: js.UndefOr[Double] = js.undefined
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  
  var sendData: js.UndefOr[Boolean] = js.undefined
  
  var setBackground: js.UndefOr[js.Function0[String | opaque | transparent]] = js.undefined
  
  var showAxisDragHandles: js.UndefOr[Boolean] = js.undefined
  
  var showAxisRangeEntryBoxes: js.UndefOr[Boolean] = js.undefined
  
  var showEditInChartStudio: js.UndefOr[Boolean] = js.undefined
  
  var showLink: js.UndefOr[Boolean] = js.undefined
  
  var showSendToCloud: js.UndefOr[Boolean] = js.undefined
  
  var showSources: js.UndefOr[Boolean] = js.undefined
  
  var showTips: js.UndefOr[Boolean] = js.undefined
  
  var staticPlot: js.UndefOr[Boolean] = js.undefined
  
  var toImageButtonOptions: js.UndefOr[Partialfilenamestringscal] = js.undefined
  
  var topojsonURL: js.UndefOr[String] = js.undefined
}
object PartialConfig {
  
  inline def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  
  extension [Self <: PartialConfig](x: Self) {
    
    inline def setAutosizable(value: Boolean): Self = StObject.set(x, "autosizable", value.asInstanceOf[js.Any])
    
    inline def setAutosizableUndefined: Self = StObject.set(x, "autosizable", js.undefined)
    
    inline def setDisplayModeBar(value: hover | Boolean): Self = StObject.set(x, "displayModeBar", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeBarUndefined: Self = StObject.set(x, "displayModeBar", js.undefined)
    
    inline def setDisplaylogo(value: Boolean): Self = StObject.set(x, "displaylogo", value.asInstanceOf[js.Any])
    
    inline def setDisplaylogoUndefined: Self = StObject.set(x, "displaylogo", js.undefined)
    
    inline def setDoubleClick(value: resetPlussignautosize | reset | autosize | `false`): Self = StObject.set(x, "doubleClick", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEdits(value: PartialEdits): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
    
    inline def setFillFrame(value: Boolean): Self = StObject.set(x, "fillFrame", value.asInstanceOf[js.Any])
    
    inline def setFillFrameUndefined: Self = StObject.set(x, "fillFrame", js.undefined)
    
    inline def setFrameMargins(value: Double): Self = StObject.set(x, "frameMargins", value.asInstanceOf[js.Any])
    
    inline def setFrameMarginsUndefined: Self = StObject.set(x, "frameMargins", js.undefined)
    
    inline def setGlobalTransforms(value: js.Array[js.Any]): Self = StObject.set(x, "globalTransforms", value.asInstanceOf[js.Any])
    
    inline def setGlobalTransformsUndefined: Self = StObject.set(x, "globalTransforms", js.undefined)
    
    inline def setGlobalTransformsVarargs(value: js.Any*): Self = StObject.set(x, "globalTransforms", js.Array(value :_*))
    
    inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLogging(value: Boolean | `0` | `1` | `2`): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMapboxAccessToken(value: String): Self = StObject.set(x, "mapboxAccessToken", value.asInstanceOf[js.Any])
    
    inline def setMapboxAccessTokenUndefined: Self = StObject.set(x, "mapboxAccessToken", js.undefined)
    
    inline def setModeBarButtons(value: (js.Array[js.Array[ModeBarButton | ModeBarDefaultButtons]]) | `false`): Self = StObject.set(x, "modeBarButtons", value.asInstanceOf[js.Any])
    
    inline def setModeBarButtonsToAdd(value: js.Array[ModeBarButton | ModeBarDefaultButtons]): Self = StObject.set(x, "modeBarButtonsToAdd", value.asInstanceOf[js.Any])
    
    inline def setModeBarButtonsToAddUndefined: Self = StObject.set(x, "modeBarButtonsToAdd", js.undefined)
    
    inline def setModeBarButtonsToAddVarargs(value: (ModeBarButton | ModeBarDefaultButtons)*): Self = StObject.set(x, "modeBarButtonsToAdd", js.Array(value :_*))
    
    inline def setModeBarButtonsToRemove(value: js.Array[ModeBarDefaultButtons]): Self = StObject.set(x, "modeBarButtonsToRemove", value.asInstanceOf[js.Any])
    
    inline def setModeBarButtonsToRemoveUndefined: Self = StObject.set(x, "modeBarButtonsToRemove", js.undefined)
    
    inline def setModeBarButtonsToRemoveVarargs(value: ModeBarDefaultButtons*): Self = StObject.set(x, "modeBarButtonsToRemove", js.Array(value :_*))
    
    inline def setModeBarButtonsUndefined: Self = StObject.set(x, "modeBarButtons", js.undefined)
    
    inline def setModeBarButtonsVarargs(value: (js.Array[ModeBarButton | ModeBarDefaultButtons])*): Self = StObject.set(x, "modeBarButtons", js.Array(value :_*))
    
    inline def setPlotGlPixelRatio(value: Double): Self = StObject.set(x, "plotGlPixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPlotGlPixelRatioUndefined: Self = StObject.set(x, "plotGlPixelRatio", js.undefined)
    
    inline def setPlotlyServerURL(value: String): Self = StObject.set(x, "plotlyServerURL", value.asInstanceOf[js.Any])
    
    inline def setPlotlyServerURLUndefined: Self = StObject.set(x, "plotlyServerURL", js.undefined)
    
    inline def setQueueLength(value: Double): Self = StObject.set(x, "queueLength", value.asInstanceOf[js.Any])
    
    inline def setQueueLengthUndefined: Self = StObject.set(x, "queueLength", js.undefined)
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    inline def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    inline def setSendData(value: Boolean): Self = StObject.set(x, "sendData", value.asInstanceOf[js.Any])
    
    inline def setSendDataUndefined: Self = StObject.set(x, "sendData", js.undefined)
    
    inline def setSetBackground(value: () => String | opaque | transparent): Self = StObject.set(x, "setBackground", js.Any.fromFunction0(value))
    
    inline def setSetBackgroundUndefined: Self = StObject.set(x, "setBackground", js.undefined)
    
    inline def setShowAxisDragHandles(value: Boolean): Self = StObject.set(x, "showAxisDragHandles", value.asInstanceOf[js.Any])
    
    inline def setShowAxisDragHandlesUndefined: Self = StObject.set(x, "showAxisDragHandles", js.undefined)
    
    inline def setShowAxisRangeEntryBoxes(value: Boolean): Self = StObject.set(x, "showAxisRangeEntryBoxes", value.asInstanceOf[js.Any])
    
    inline def setShowAxisRangeEntryBoxesUndefined: Self = StObject.set(x, "showAxisRangeEntryBoxes", js.undefined)
    
    inline def setShowEditInChartStudio(value: Boolean): Self = StObject.set(x, "showEditInChartStudio", value.asInstanceOf[js.Any])
    
    inline def setShowEditInChartStudioUndefined: Self = StObject.set(x, "showEditInChartStudio", js.undefined)
    
    inline def setShowLink(value: Boolean): Self = StObject.set(x, "showLink", value.asInstanceOf[js.Any])
    
    inline def setShowLinkUndefined: Self = StObject.set(x, "showLink", js.undefined)
    
    inline def setShowSendToCloud(value: Boolean): Self = StObject.set(x, "showSendToCloud", value.asInstanceOf[js.Any])
    
    inline def setShowSendToCloudUndefined: Self = StObject.set(x, "showSendToCloud", js.undefined)
    
    inline def setShowSources(value: Boolean): Self = StObject.set(x, "showSources", value.asInstanceOf[js.Any])
    
    inline def setShowSourcesUndefined: Self = StObject.set(x, "showSources", js.undefined)
    
    inline def setShowTips(value: Boolean): Self = StObject.set(x, "showTips", value.asInstanceOf[js.Any])
    
    inline def setShowTipsUndefined: Self = StObject.set(x, "showTips", js.undefined)
    
    inline def setStaticPlot(value: Boolean): Self = StObject.set(x, "staticPlot", value.asInstanceOf[js.Any])
    
    inline def setStaticPlotUndefined: Self = StObject.set(x, "staticPlot", js.undefined)
    
    inline def setToImageButtonOptions(value: Partialfilenamestringscal): Self = StObject.set(x, "toImageButtonOptions", value.asInstanceOf[js.Any])
    
    inline def setToImageButtonOptionsUndefined: Self = StObject.set(x, "toImageButtonOptions", js.undefined)
    
    inline def setTopojsonURL(value: String): Self = StObject.set(x, "topojsonURL", value.asInstanceOf[js.Any])
    
    inline def setTopojsonURLUndefined: Self = StObject.set(x, "topojsonURL", js.undefined)
  }
}
