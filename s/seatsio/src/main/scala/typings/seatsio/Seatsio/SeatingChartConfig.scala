package typings.seatsio.Seatsio

import org.scalablytyped.runtime.StringDictionary
import typings.seatsio.anon.ConfirmSelectionOnMobile
import typings.seatsio.anon.Enabled
import typings.seatsio.anon.HideNonSelectableCategories
import typings.seatsio.anon.Label
import typings.seatsio.anon.Price
import typings.seatsio.anon.TicketType
import typings.seatsio.seatsioStrings.continue
import typings.seatsio.seatsioStrings.manual
import typings.seatsio.seatsioStrings.none
import typings.seatsio.seatsioStrings.normal
import typings.seatsio.seatsioStrings.print
import typings.seatsio.seatsioStrings.start
import typings.seatsio.seatsioStrings.static
import typings.seatsio.seatsioStrings.width
import typings.seatsio.seatsioStrings.widthAndHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeatingChartConfig extends ChangeableSeatingChartConfig {
  
  var alwaysShowSectionContents: js.UndefOr[Boolean] = js.native
  
  var canGASelectionBeIncreased: js.UndefOr[
    js.Function4[
      /* gaArea */ GeneralAdmissionArea, 
      /* defaultValue */ Boolean, 
      /* extraConfig */ ExtraConfig, 
      /* ticketType */ String, 
      Boolean
    ]
  ] = js.native
  
  var categories: js.UndefOr[js.Array[CategoryConfig]] = js.native
  
  var categoryFilter: js.UndefOr[Enabled] = js.native
  
  var channels: js.UndefOr[js.Array[String]] = js.native
  
  var chart: js.UndefOr[String] = js.native
  
  var colorScheme: js.UndefOr[ColorScheme] = js.native
  
  var colors: js.UndefOr[Colors] = js.native
  
  var divId: String = js.native
  
  var event: js.UndefOr[String] = js.native
  
  var events: js.UndefOr[js.Array[String]] = js.native
  
  var fitTo: js.UndefOr[widthAndHeight | width] = js.native
  
  var holdOnSelectForGAs: js.UndefOr[Boolean] = js.native
  
  var holdToken: js.UndefOr[String] = js.native
  
  var holdTokenInputName: js.UndefOr[String] = js.native
  
  var isObjectVisible: js.UndefOr[js.Function2[/* object */ BookableObject, /* extraConfig */ ExtraConfig, String]] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var legend: js.UndefOr[HideNonSelectableCategories] = js.native
  
  var loading: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[StringDictionary[String]] = js.native
  
  var mode: js.UndefOr[normal | static | print] = js.native
  
  var multiSelectEnabled: js.UndefOr[Boolean] = js.native
  
  var objectCategories: js.UndefOr[StringDictionary[String]] = js.native
  
  var objectCategory: js.UndefOr[
    js.Function4[
      /* object */ BookableObject, 
      /* categories */ CategoryList, 
      /* defaultCategory */ Category, 
      /* extraConfig */ ExtraConfig, 
      Category
    ]
  ] = js.native
  
  var objectIcon: js.UndefOr[
    js.Function3[
      /* object */ BookableObject, 
      /* defaultIcon */ String, 
      /* extraConfig */ ExtraConfig, 
      String
    ]
  ] = js.native
  
  var objectTooltip: js.UndefOr[ConfirmSelectionOnMobile] = js.native
  
  var objectWithoutCategorySelectable: js.UndefOr[Boolean] = js.native
  
  var objectWithoutPricingSelectable: js.UndefOr[Boolean] = js.native
  
  var onBestAvailableSelected: js.UndefOr[
    js.Function2[/* objects */ js.Array[BookableObject], /* nextToEachOther */ Boolean | Null, Unit]
  ] = js.native
  
  var onBestAvailableSelectionFailed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onChartRendered: js.UndefOr[js.Function1[/* chart */ SeatingChart, Unit]] = js.native
  
  var onChartRenderingFailed: js.UndefOr[js.Function1[/* chart */ SeatingChart, Unit]] = js.native
  
  var onFullScreenClosed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFullScreenOpened: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onHoldFailed: js.UndefOr[
    js.Function2[
      /* objects */ js.Array[BookableObject], 
      /* ticketTypes */ js.UndefOr[js.Array[TicketType]], 
      Unit
    ]
  ] = js.native
  
  var onHoldSucceeded: js.UndefOr[
    js.Function2[
      /* objects */ js.Array[BookableObject], 
      /* ticketTypes */ js.UndefOr[js.Array[TicketType]], 
      Unit
    ]
  ] = js.native
  
  var onHoldTokenExpired: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onObjectClicked: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.native
  
  var onObjectDeselected: js.UndefOr[
    js.Function2[/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price], Unit]
  ] = js.native
  
  var onObjectMouseOut: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.native
  
  var onObjectMouseOver: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.native
  
  var onObjectSelected: js.UndefOr[
    js.Function2[/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price], Unit]
  ] = js.native
  
  var onReleaseHoldFailed: js.UndefOr[
    js.Function2[
      /* objects */ js.Array[BookableObject], 
      /* ticketTypes */ js.UndefOr[js.Array[TicketType]], 
      Unit
    ]
  ] = js.native
  
  var onReleaseHoldSucceeded: js.UndefOr[
    js.Function2[
      /* objects */ js.Array[BookableObject], 
      /* ticketTypes */ js.UndefOr[js.Array[TicketType]], 
      Unit
    ]
  ] = js.native
  
  var onSelectedObjectBooked: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.native
  
  var onSelectionInvalid: js.UndefOr[js.Function1[/* violations */ js.Array[Violations], Unit]] = js.native
  
  var onSelectionValid: js.UndefOr[js.Function0[Unit]] = js.native
  
  var priceFormatter: js.UndefOr[js.Function1[/* price */ Double, String]] = js.native
  
  var priceLevelsTooltipMessage: js.UndefOr[String] = js.native
  
  var sectionColor: js.UndefOr[
    js.Function3[
      /* section */ Section, 
      /* defaultColor */ String, 
      /* extraConfig */ ExtraConfig, 
      String
    ]
  ] = js.native
  
  var selectBestAvailable: js.UndefOr[BestAvailable] = js.native
  
  var selectedObjects: js.UndefOr[js.Array[String | Label]] = js.native
  
  var selectedObjectsInputName: js.UndefOr[String] = js.native
  
  var selectionValidators: js.UndefOr[js.Array[SelectionValidator]] = js.native
  
  var session: js.UndefOr[continue | start | manual | none] = js.native
  
  var showActiveSectionTooltipOnMobile: js.UndefOr[Boolean] = js.native
  
  var showFullScreenButton: js.UndefOr[Boolean] = js.native
  
  var showLegend: js.UndefOr[Boolean] = js.native
  
  var showMinimap: js.UndefOr[Boolean] = js.native
  
  var showRowLines: js.UndefOr[Boolean] = js.native
  
  var showViewFromYourSeatOnDesktop: js.UndefOr[Boolean] = js.native
  
  var showViewFromYourSeatOnMobile: js.UndefOr[Boolean] = js.native
  
  var showZoomOutButtonOnMobile: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[Style] = js.native
  
  var stylePreset: js.UndefOr[StylePreset] = js.native
  
  var tooltipInfo: js.UndefOr[js.Function1[/* object */ BookableObject, String]] = js.native
  
  var unifiedObjectPropertiesInCallbacks: js.UndefOr[Boolean] = js.native
  
  var workspaceKey: String = js.native
}
object SeatingChartConfig {
  
  @scala.inline
  def apply(divId: String, workspaceKey: String): SeatingChartConfig = {
    val __obj = js.Dynamic.literal(divId = divId.asInstanceOf[js.Any], workspaceKey = workspaceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeatingChartConfig]
  }
  
  @scala.inline
  implicit class SeatingChartConfigOps[Self <: SeatingChartConfig] (val x: Self) extends AnyVal {
    
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
    def setDivId(value: String): Self = this.set("divId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceKey(value: String): Self = this.set("workspaceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysShowSectionContents(value: Boolean): Self = this.set("alwaysShowSectionContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysShowSectionContents: Self = this.set("alwaysShowSectionContents", js.undefined)
    
    @scala.inline
    def setCanGASelectionBeIncreased(
      value: (/* gaArea */ GeneralAdmissionArea, /* defaultValue */ Boolean, /* extraConfig */ ExtraConfig, /* ticketType */ String) => Boolean
    ): Self = this.set("canGASelectionBeIncreased", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteCanGASelectionBeIncreased: Self = this.set("canGASelectionBeIncreased", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: CategoryConfig*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[CategoryConfig]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setCategoryFilter(value: Enabled): Self = this.set("categoryFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryFilter: Self = this.set("categoryFilter", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setChart(value: String): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    
    @scala.inline
    def setColorScheme(value: ColorScheme): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScheme: Self = this.set("colorScheme", js.undefined)
    
    @scala.inline
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFitTo(value: widthAndHeight | width): Self = this.set("fitTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitTo: Self = this.set("fitTo", js.undefined)
    
    @scala.inline
    def setHoldOnSelectForGAs(value: Boolean): Self = this.set("holdOnSelectForGAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldOnSelectForGAs: Self = this.set("holdOnSelectForGAs", js.undefined)
    
    @scala.inline
    def setHoldToken(value: String): Self = this.set("holdToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldToken: Self = this.set("holdToken", js.undefined)
    
    @scala.inline
    def setHoldTokenInputName(value: String): Self = this.set("holdTokenInputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldTokenInputName: Self = this.set("holdTokenInputName", js.undefined)
    
    @scala.inline
    def setIsObjectVisible(value: (/* object */ BookableObject, /* extraConfig */ ExtraConfig) => String): Self = this.set("isObjectVisible", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsObjectVisible: Self = this.set("isObjectVisible", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLegend(value: HideNonSelectableCategories): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setMessages(value: StringDictionary[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMode(value: normal | static | print): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMultiSelectEnabled(value: Boolean): Self = this.set("multiSelectEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelectEnabled: Self = this.set("multiSelectEnabled", js.undefined)
    
    @scala.inline
    def setObjectCategories(value: StringDictionary[String]): Self = this.set("objectCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectCategories: Self = this.set("objectCategories", js.undefined)
    
    @scala.inline
    def setObjectCategory(
      value: (/* object */ BookableObject, /* categories */ CategoryList, /* defaultCategory */ Category, /* extraConfig */ ExtraConfig) => Category
    ): Self = this.set("objectCategory", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteObjectCategory: Self = this.set("objectCategory", js.undefined)
    
    @scala.inline
    def setObjectIcon(
      value: (/* object */ BookableObject, /* defaultIcon */ String, /* extraConfig */ ExtraConfig) => String
    ): Self = this.set("objectIcon", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectIcon: Self = this.set("objectIcon", js.undefined)
    
    @scala.inline
    def setObjectTooltip(value: ConfirmSelectionOnMobile): Self = this.set("objectTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectTooltip: Self = this.set("objectTooltip", js.undefined)
    
    @scala.inline
    def setObjectWithoutCategorySelectable(value: Boolean): Self = this.set("objectWithoutCategorySelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectWithoutCategorySelectable: Self = this.set("objectWithoutCategorySelectable", js.undefined)
    
    @scala.inline
    def setObjectWithoutPricingSelectable(value: Boolean): Self = this.set("objectWithoutPricingSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectWithoutPricingSelectable: Self = this.set("objectWithoutPricingSelectable", js.undefined)
    
    @scala.inline
    def setOnBestAvailableSelected(value: (/* objects */ js.Array[BookableObject], /* nextToEachOther */ Boolean | Null) => Unit): Self = this.set("onBestAvailableSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBestAvailableSelected: Self = this.set("onBestAvailableSelected", js.undefined)
    
    @scala.inline
    def setOnBestAvailableSelectionFailed(value: () => Unit): Self = this.set("onBestAvailableSelectionFailed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBestAvailableSelectionFailed: Self = this.set("onBestAvailableSelectionFailed", js.undefined)
    
    @scala.inline
    def setOnChartRendered(value: /* chart */ SeatingChart => Unit): Self = this.set("onChartRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChartRendered: Self = this.set("onChartRendered", js.undefined)
    
    @scala.inline
    def setOnChartRenderingFailed(value: /* chart */ SeatingChart => Unit): Self = this.set("onChartRenderingFailed", js.Any.fromFunction1(value))
    
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
    def setOnHoldFailed(
      value: (/* objects */ js.Array[BookableObject], /* ticketTypes */ js.UndefOr[js.Array[TicketType]]) => Unit
    ): Self = this.set("onHoldFailed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHoldFailed: Self = this.set("onHoldFailed", js.undefined)
    
    @scala.inline
    def setOnHoldSucceeded(
      value: (/* objects */ js.Array[BookableObject], /* ticketTypes */ js.UndefOr[js.Array[TicketType]]) => Unit
    ): Self = this.set("onHoldSucceeded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHoldSucceeded: Self = this.set("onHoldSucceeded", js.undefined)
    
    @scala.inline
    def setOnHoldTokenExpired(value: () => Unit): Self = this.set("onHoldTokenExpired", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHoldTokenExpired: Self = this.set("onHoldTokenExpired", js.undefined)
    
    @scala.inline
    def setOnObjectClicked(value: /* object */ BookableObject => Unit): Self = this.set("onObjectClicked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnObjectClicked: Self = this.set("onObjectClicked", js.undefined)
    
    @scala.inline
    def setOnObjectDeselected(value: (/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price]) => Unit): Self = this.set("onObjectDeselected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnObjectDeselected: Self = this.set("onObjectDeselected", js.undefined)
    
    @scala.inline
    def setOnObjectMouseOut(value: /* object */ BookableObject => Unit): Self = this.set("onObjectMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnObjectMouseOut: Self = this.set("onObjectMouseOut", js.undefined)
    
    @scala.inline
    def setOnObjectMouseOver(value: /* object */ BookableObject => Unit): Self = this.set("onObjectMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnObjectMouseOver: Self = this.set("onObjectMouseOver", js.undefined)
    
    @scala.inline
    def setOnObjectSelected(value: (/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price]) => Unit): Self = this.set("onObjectSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnObjectSelected: Self = this.set("onObjectSelected", js.undefined)
    
    @scala.inline
    def setOnReleaseHoldFailed(
      value: (/* objects */ js.Array[BookableObject], /* ticketTypes */ js.UndefOr[js.Array[TicketType]]) => Unit
    ): Self = this.set("onReleaseHoldFailed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnReleaseHoldFailed: Self = this.set("onReleaseHoldFailed", js.undefined)
    
    @scala.inline
    def setOnReleaseHoldSucceeded(
      value: (/* objects */ js.Array[BookableObject], /* ticketTypes */ js.UndefOr[js.Array[TicketType]]) => Unit
    ): Self = this.set("onReleaseHoldSucceeded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnReleaseHoldSucceeded: Self = this.set("onReleaseHoldSucceeded", js.undefined)
    
    @scala.inline
    def setOnSelectedObjectBooked(value: /* object */ BookableObject => Unit): Self = this.set("onSelectedObjectBooked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectedObjectBooked: Self = this.set("onSelectedObjectBooked", js.undefined)
    
    @scala.inline
    def setOnSelectionInvalid(value: /* violations */ js.Array[Violations] => Unit): Self = this.set("onSelectionInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionInvalid: Self = this.set("onSelectionInvalid", js.undefined)
    
    @scala.inline
    def setOnSelectionValid(value: () => Unit): Self = this.set("onSelectionValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSelectionValid: Self = this.set("onSelectionValid", js.undefined)
    
    @scala.inline
    def setPriceFormatter(value: /* price */ Double => String): Self = this.set("priceFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePriceFormatter: Self = this.set("priceFormatter", js.undefined)
    
    @scala.inline
    def setPriceLevelsTooltipMessage(value: String): Self = this.set("priceLevelsTooltipMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceLevelsTooltipMessage: Self = this.set("priceLevelsTooltipMessage", js.undefined)
    
    @scala.inline
    def setSectionColor(value: (/* section */ Section, /* defaultColor */ String, /* extraConfig */ ExtraConfig) => String): Self = this.set("sectionColor", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSectionColor: Self = this.set("sectionColor", js.undefined)
    
    @scala.inline
    def setSelectBestAvailable(value: BestAvailable): Self = this.set("selectBestAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectBestAvailable: Self = this.set("selectBestAvailable", js.undefined)
    
    @scala.inline
    def setSelectedObjectsVarargs(value: (String | Label)*): Self = this.set("selectedObjects", js.Array(value :_*))
    
    @scala.inline
    def setSelectedObjects(value: js.Array[String | Label]): Self = this.set("selectedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedObjects: Self = this.set("selectedObjects", js.undefined)
    
    @scala.inline
    def setSelectedObjectsInputName(value: String): Self = this.set("selectedObjectsInputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedObjectsInputName: Self = this.set("selectedObjectsInputName", js.undefined)
    
    @scala.inline
    def setSelectionValidatorsVarargs(value: SelectionValidator*): Self = this.set("selectionValidators", js.Array(value :_*))
    
    @scala.inline
    def setSelectionValidators(value: js.Array[SelectionValidator]): Self = this.set("selectionValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionValidators: Self = this.set("selectionValidators", js.undefined)
    
    @scala.inline
    def setSession(value: continue | start | manual | none): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setShowActiveSectionTooltipOnMobile(value: Boolean): Self = this.set("showActiveSectionTooltipOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowActiveSectionTooltipOnMobile: Self = this.set("showActiveSectionTooltipOnMobile", js.undefined)
    
    @scala.inline
    def setShowFullScreenButton(value: Boolean): Self = this.set("showFullScreenButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFullScreenButton: Self = this.set("showFullScreenButton", js.undefined)
    
    @scala.inline
    def setShowLegend(value: Boolean): Self = this.set("showLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLegend: Self = this.set("showLegend", js.undefined)
    
    @scala.inline
    def setShowMinimap(value: Boolean): Self = this.set("showMinimap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinimap: Self = this.set("showMinimap", js.undefined)
    
    @scala.inline
    def setShowRowLines(value: Boolean): Self = this.set("showRowLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowLines: Self = this.set("showRowLines", js.undefined)
    
    @scala.inline
    def setShowViewFromYourSeatOnDesktop(value: Boolean): Self = this.set("showViewFromYourSeatOnDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowViewFromYourSeatOnDesktop: Self = this.set("showViewFromYourSeatOnDesktop", js.undefined)
    
    @scala.inline
    def setShowViewFromYourSeatOnMobile(value: Boolean): Self = this.set("showViewFromYourSeatOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowViewFromYourSeatOnMobile: Self = this.set("showViewFromYourSeatOnMobile", js.undefined)
    
    @scala.inline
    def setShowZoomOutButtonOnMobile(value: Boolean): Self = this.set("showZoomOutButtonOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowZoomOutButtonOnMobile: Self = this.set("showZoomOutButtonOnMobile", js.undefined)
    
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
    
    @scala.inline
    def setUnifiedObjectPropertiesInCallbacks(value: Boolean): Self = this.set("unifiedObjectPropertiesInCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnifiedObjectPropertiesInCallbacks: Self = this.set("unifiedObjectPropertiesInCallbacks", js.undefined)
  }
}
