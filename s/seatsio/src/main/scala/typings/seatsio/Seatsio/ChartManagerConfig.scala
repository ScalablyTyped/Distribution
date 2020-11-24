package typings.seatsio.Seatsio

import org.scalablytyped.runtime.StringDictionary
import typings.seatsio.anon.Price
import typings.seatsio.seatsioStrings.manageRulesets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartManagerConfig extends js.Object {
  
  var chart: String = js.native
  
  var colorScheme: js.UndefOr[ColorScheme] = js.native
  
  var colors: js.UndefOr[Colors] = js.native
  
  var divId: String = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[StringDictionary[String]] = js.native
  
  var mode: manageRulesets = js.native
  
  var onChartRendered: js.UndefOr[js.Function1[/* chart */ ChartManager, Unit]] = js.native
  
  var onChartRenderingFailed: js.UndefOr[js.Function1[/* chart */ ChartManager, Unit]] = js.native
  
  var onFullScreenClosed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFullScreenOpened: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onObjectClicked: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.native
  
  var onObjectDeselected: js.UndefOr[
    js.Function2[/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price], Unit]
  ] = js.native
  
  var onObjectSelected: js.UndefOr[
    js.Function2[/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price], Unit]
  ] = js.native
  
  var secretKey: String = js.native
  
  var showFullScreenButton: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[Style] = js.native
  
  var stylePreset: js.UndefOr[StylePreset] = js.native
  
  var tooltipInfo: js.UndefOr[js.Function1[/* object */ BookableObject, String]] = js.native
}
object ChartManagerConfig {
  
  @scala.inline
  def apply(chart: String, divId: String, mode: manageRulesets, secretKey: String): ChartManagerConfig = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], divId = divId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartManagerConfig]
  }
  
  @scala.inline
  implicit class ChartManagerConfigOps[Self <: ChartManagerConfig] (val x: Self) extends AnyVal {
    
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
    def setChart(value: String): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivId(value: String): Self = this.set("divId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: manageRulesets): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScheme(value: ColorScheme): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScheme: Self = this.set("colorScheme", js.undefined)
    
    @scala.inline
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMessages(value: StringDictionary[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setOnChartRendered(value: /* chart */ ChartManager => Unit): Self = this.set("onChartRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChartRendered: Self = this.set("onChartRendered", js.undefined)
    
    @scala.inline
    def setOnChartRenderingFailed(value: /* chart */ ChartManager => Unit): Self = this.set("onChartRenderingFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChartRenderingFailed: Self = this.set("onChartRenderingFailed", js.undefined)
    
    @scala.inline
    def setOnFullScreenClosed(value: () => Unit): Self = this.set("onFullScreenClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFullScreenClosed: Self = this.set("onFullScreenClosed", js.undefined)
    
    @scala.inline
    def setOnFullScreenOpened(value: () => Unit): Self = this.set("onFullScreenOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFullScreenOpened: Self = this.set("onFullScreenOpened", js.undefined)
    
    @scala.inline
    def setOnObjectClicked(value: /* object */ BookableObject => Unit): Self = this.set("onObjectClicked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnObjectClicked: Self = this.set("onObjectClicked", js.undefined)
    
    @scala.inline
    def setOnObjectDeselected(value: (/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price]) => Unit): Self = this.set("onObjectDeselected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnObjectDeselected: Self = this.set("onObjectDeselected", js.undefined)
    
    @scala.inline
    def setOnObjectSelected(value: (/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price]) => Unit): Self = this.set("onObjectSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnObjectSelected: Self = this.set("onObjectSelected", js.undefined)
    
    @scala.inline
    def setShowFullScreenButton(value: Boolean): Self = this.set("showFullScreenButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFullScreenButton: Self = this.set("showFullScreenButton", js.undefined)
    
    @scala.inline
    def setStyle(value: Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStylePreset(value: StylePreset): Self = this.set("stylePreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylePreset: Self = this.set("stylePreset", js.undefined)
    
    @scala.inline
    def setTooltipInfo(value: /* object */ BookableObject => String): Self = this.set("tooltipInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTooltipInfo: Self = this.set("tooltipInfo", js.undefined)
  }
}
