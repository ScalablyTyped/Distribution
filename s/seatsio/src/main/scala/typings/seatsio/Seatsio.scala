package typings.seatsio

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.seatsio.Seatsio.ChartManager
import typings.seatsio.Seatsio.EventManager
import typings.seatsio.Seatsio.SeatingChart
import typings.seatsio.Seatsio.SeatingChartDesigner
import typings.seatsio.anon.Amount
import typings.seatsio.anon.ConfirmSelectionOnMobile
import typings.seatsio.anon.DictticketType
import typings.seatsio.anon.Disabled
import typings.seatsio.anon.Enabled
import typings.seatsio.anon.HideNonSelectableCategories
import typings.seatsio.anon.Label
import typings.seatsio.anon.LabelPrice
import typings.seatsio.anon.Own
import typings.seatsio.anon.Price
import typings.seatsio.anon.TicketType
import typings.seatsio.anon.Type
import typings.seatsio.anon.X
import typings.seatsio.seatsioNumbers.`5`
import typings.seatsio.seatsioStrings.Lato
import typings.seatsio.seatsioStrings.Montserrat
import typings.seatsio.seatsioStrings.NotoSansHK
import typings.seatsio.seatsioStrings.Roboto
import typings.seatsio.seatsioStrings.WorkSans
import typings.seatsio.seatsioStrings.`3d`
import typings.seatsio.seatsioStrings.asymmetrical
import typings.seatsio.seatsioStrings.bolder
import typings.seatsio.seatsioStrings.continue
import typings.seatsio.seatsioStrings.fillEnabled
import typings.seatsio.seatsioStrings.fillHighlightedOption
import typings.seatsio.seatsioStrings.manageChannels
import typings.seatsio.seatsioStrings.manageForSaleConfig
import typings.seatsio.seatsioStrings.manageObjectStatuses
import typings.seatsio.seatsioStrings.manageRulesets
import typings.seatsio.seatsioStrings.manageTableBooking
import typings.seatsio.seatsioStrings.manual
import typings.seatsio.seatsioStrings.max
import typings.seatsio.seatsioStrings.minMax
import typings.seatsio.seatsioStrings.none
import typings.seatsio.seatsioStrings.normal
import typings.seatsio.seatsioStrings.print
import typings.seatsio.seatsioStrings.spacious
import typings.seatsio.seatsioStrings.start
import typings.seatsio.seatsioStrings.static
import typings.seatsio.seatsioStrings.thick
import typings.seatsio.seatsioStrings.width
import typings.seatsio.seatsioStrings.widthAndHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seatsio extends StObject {
  
  var ChartManager: ChartManager
  
  var EventManager: EventManager
  
  var SeatingChart: SeatingChart
  
  var SeatingChartDesigner: SeatingChartDesigner
}
object Seatsio {
  
  @scala.inline
  def apply(
    ChartManager: ChartManager,
    EventManager: EventManager,
    SeatingChart: SeatingChart,
    SeatingChartDesigner: SeatingChartDesigner
  ): Seatsio = {
    val __obj = js.Dynamic.literal(ChartManager = ChartManager.asInstanceOf[js.Any], EventManager = EventManager.asInstanceOf[js.Any], SeatingChart = SeatingChart.asInstanceOf[js.Any], SeatingChartDesigner = SeatingChartDesigner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seatsio]
  }
  
  @js.native
  trait BaseObject extends StObject {
    
    var accessible: Boolean = js.native
    
    var category: js.UndefOr[Category] = js.native
    
    var center: js.UndefOr[X] = js.native
    
    var dataPerEvent: StringDictionary[DataPerEvent] = js.native
    
    def deselect(): Unit = js.native
    def deselect(ticketType: String): Unit = js.native
    
    var displayObjectType: js.UndefOr[String] = js.native
    
    var extraData: js.Any = js.native
    
    var forSale: Boolean = js.native
    
    var inSelectableChannel: Boolean = js.native
    
    var label: String = js.native
    
    var labels: Own = js.native
    
    var objectType: String = js.native
    
    var pricing: js.UndefOr[js.Array[Pricing] | Pricing] = js.native
    
    def pulse(): Unit = js.native
    
    def select(): Unit = js.native
    def select(ticketType: String): Unit = js.native
    
    var selectable: Boolean = js.native
    
    var selected: Boolean = js.native
    
    var selectedTicketType: js.UndefOr[String] = js.native
    
    var status: String = js.native
    
    def unpulse(): Unit = js.native
  }
  
  trait BestAvailable extends StObject {
    
    var category: String | js.Array[String]
    
    var clearSelection: Boolean
    
    var number: js.UndefOr[Double] = js.undefined
    
    var ticketTypes: StringDictionary[Double]
  }
  object BestAvailable {
    
    @scala.inline
    def apply(
      category: String | js.Array[String],
      clearSelection: Boolean,
      ticketTypes: StringDictionary[Double]
    ): BestAvailable = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], clearSelection = clearSelection.asInstanceOf[js.Any], ticketTypes = ticketTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BestAvailable]
    }
    
    @scala.inline
    implicit class BestAvailableMutableBuilder[Self <: BestAvailable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String | js.Array[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryVarargs(value: String*): Self = StObject.set(x, "category", js.Array(value :_*))
      
      @scala.inline
      def setClearSelection(value: Boolean): Self = StObject.set(x, "clearSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setTicketTypes(value: StringDictionary[Double]): Self = StObject.set(x, "ticketTypes", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.seatsio.Seatsio.Seat
    - typings.seatsio.Seatsio.GeneralAdmissionArea
    - typings.seatsio.Seatsio.Section
  */
  trait BookableObject extends StObject
  
  trait Category extends StObject {
    
    var accessible: Boolean
    
    var color: String
    
    var key: Double
    
    var label: String
    
    var pricing: Pricing
  }
  object Category {
    
    @scala.inline
    def apply(accessible: Boolean, color: String, key: Double, label: String, pricing: Pricing): Category = {
      val __obj = js.Dynamic.literal(accessible = accessible.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], pricing = pricing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPricing(value: Pricing): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    }
  }
  
  trait CategoryConfig extends StObject {
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var color: String
    
    var key: Double
    
    var label: String
  }
  object CategoryConfig {
    
    @scala.inline
    def apply(color: String, key: Double, label: String): CategoryConfig = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryConfig]
    }
    
    @scala.inline
    implicit class CategoryConfigMutableBuilder[Self <: CategoryConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait CategoryList extends StObject {
    
    def get(key: String): Category
  }
  object CategoryList {
    
    @scala.inline
    def apply(get: String => Category): CategoryList = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[CategoryList]
    }
    
    @scala.inline
    implicit class CategoryListMutableBuilder[Self <: CategoryList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: String => Category): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  trait ChangeableSeatingChartConfig extends StObject {
    
    var availableCategories: js.UndefOr[js.Array[String]] = js.undefined
    
    var extraConfig: js.UndefOr[ExtraConfig] = js.undefined
    
    var filteredCategories: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxSelectedObjects: js.UndefOr[Double | js.Array[typings.seatsio.anon.Category]] = js.undefined
    
    var numberOfPlacesToSelect: js.UndefOr[Double] = js.undefined
    
    var objectColor: js.UndefOr[
        js.Function3[
          /* object */ BookableObject, 
          /* defaultColor */ String, 
          /* extraConfig */ ExtraConfig, 
          String
        ]
      ] = js.undefined
    
    var objectLabel: js.UndefOr[
        js.Function3[
          /* object */ BookableObject, 
          /* defaultLabel */ String, 
          /* extraConfig */ ExtraConfig, 
          String
        ]
      ] = js.undefined
    
    var pricing: js.UndefOr[js.Array[PricingConfig]] = js.undefined
    
    var ticketListings: js.UndefOr[js.Array[TicketListing]] = js.undefined
    
    var unavailableCategories: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ChangeableSeatingChartConfig {
    
    @scala.inline
    def apply(): ChangeableSeatingChartConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeableSeatingChartConfig]
    }
    
    @scala.inline
    implicit class ChangeableSeatingChartConfigMutableBuilder[Self <: ChangeableSeatingChartConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailableCategories(value: js.Array[String]): Self = StObject.set(x, "availableCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableCategoriesUndefined: Self = StObject.set(x, "availableCategories", js.undefined)
      
      @scala.inline
      def setAvailableCategoriesVarargs(value: String*): Self = StObject.set(x, "availableCategories", js.Array(value :_*))
      
      @scala.inline
      def setExtraConfig(value: ExtraConfig): Self = StObject.set(x, "extraConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraConfigUndefined: Self = StObject.set(x, "extraConfig", js.undefined)
      
      @scala.inline
      def setFilteredCategories(value: js.Array[String]): Self = StObject.set(x, "filteredCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredCategoriesUndefined: Self = StObject.set(x, "filteredCategories", js.undefined)
      
      @scala.inline
      def setFilteredCategoriesVarargs(value: String*): Self = StObject.set(x, "filteredCategories", js.Array(value :_*))
      
      @scala.inline
      def setMaxSelectedObjects(value: Double | js.Array[typings.seatsio.anon.Category]): Self = StObject.set(x, "maxSelectedObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSelectedObjectsUndefined: Self = StObject.set(x, "maxSelectedObjects", js.undefined)
      
      @scala.inline
      def setMaxSelectedObjectsVarargs(value: typings.seatsio.anon.Category*): Self = StObject.set(x, "maxSelectedObjects", js.Array(value :_*))
      
      @scala.inline
      def setNumberOfPlacesToSelect(value: Double): Self = StObject.set(x, "numberOfPlacesToSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfPlacesToSelectUndefined: Self = StObject.set(x, "numberOfPlacesToSelect", js.undefined)
      
      @scala.inline
      def setObjectColor(
        value: (/* object */ BookableObject, /* defaultColor */ String, /* extraConfig */ ExtraConfig) => String
      ): Self = StObject.set(x, "objectColor", js.Any.fromFunction3(value))
      
      @scala.inline
      def setObjectColorUndefined: Self = StObject.set(x, "objectColor", js.undefined)
      
      @scala.inline
      def setObjectLabel(
        value: (/* object */ BookableObject, /* defaultLabel */ String, /* extraConfig */ ExtraConfig) => String
      ): Self = StObject.set(x, "objectLabel", js.Any.fromFunction3(value))
      
      @scala.inline
      def setObjectLabelUndefined: Self = StObject.set(x, "objectLabel", js.undefined)
      
      @scala.inline
      def setPricing(value: js.Array[PricingConfig]): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPricingUndefined: Self = StObject.set(x, "pricing", js.undefined)
      
      @scala.inline
      def setPricingVarargs(value: PricingConfig*): Self = StObject.set(x, "pricing", js.Array(value :_*))
      
      @scala.inline
      def setTicketListings(value: js.Array[TicketListing]): Self = StObject.set(x, "ticketListings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketListingsUndefined: Self = StObject.set(x, "ticketListings", js.undefined)
      
      @scala.inline
      def setTicketListingsVarargs(value: TicketListing*): Self = StObject.set(x, "ticketListings", js.Array(value :_*))
      
      @scala.inline
      def setUnavailableCategories(value: js.Array[String]): Self = StObject.set(x, "unavailableCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnavailableCategoriesUndefined: Self = StObject.set(x, "unavailableCategories", js.undefined)
      
      @scala.inline
      def setUnavailableCategoriesVarargs(value: String*): Self = StObject.set(x, "unavailableCategories", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ChartManager
    extends StObject
       with // tslint:disable-next-line:no-misused-new
  Instantiable1[/* config */ ChartManagerConfig, ChartManager] {
    
    def destroy(): Unit = js.native
    
    def render(): ChartManager = js.native
  }
  
  trait ChartManagerConfig extends StObject {
    
    var chart: String
    
    var colorScheme: js.UndefOr[ColorScheme] = js.undefined
    
    var colors: js.UndefOr[Colors] = js.undefined
    
    var divId: String
    
    var language: js.UndefOr[String] = js.undefined
    
    var messages: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var mode: manageRulesets
    
    var onChartRendered: js.UndefOr[js.Function1[/* chart */ ChartManager, Unit]] = js.undefined
    
    var onChartRenderingFailed: js.UndefOr[js.Function1[/* chart */ ChartManager, Unit]] = js.undefined
    
    var onFullScreenClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFullScreenOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onObjectClicked: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.undefined
    
    var onObjectDeselected: js.UndefOr[
        js.Function2[/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price], Unit]
      ] = js.undefined
    
    var onObjectSelected: js.UndefOr[
        js.Function2[/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price], Unit]
      ] = js.undefined
    
    var secretKey: String
    
    var showFullScreenButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Style] = js.undefined
    
    var stylePreset: js.UndefOr[StylePreset] = js.undefined
    
    var tooltipInfo: js.UndefOr[js.Function1[/* object */ BookableObject, String]] = js.undefined
  }
  object ChartManagerConfig {
    
    @scala.inline
    def apply(chart: String, divId: String, secretKey: String): ChartManagerConfig = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], divId = divId.asInstanceOf[js.Any], mode = "manageRulesets", secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartManagerConfig]
    }
    
    @scala.inline
    implicit class ChartManagerConfigMutableBuilder[Self <: ChartManagerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: String): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      @scala.inline
      def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setDivId(value: String): Self = StObject.set(x, "divId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMode(value: manageRulesets): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChartRendered(value: /* chart */ ChartManager => Unit): Self = StObject.set(x, "onChartRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChartRenderedUndefined: Self = StObject.set(x, "onChartRendered", js.undefined)
      
      @scala.inline
      def setOnChartRenderingFailed(value: /* chart */ ChartManager => Unit): Self = StObject.set(x, "onChartRenderingFailed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChartRenderingFailedUndefined: Self = StObject.set(x, "onChartRenderingFailed", js.undefined)
      
      @scala.inline
      def setOnFullScreenClosed(value: () => Unit): Self = StObject.set(x, "onFullScreenClosed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFullScreenClosedUndefined: Self = StObject.set(x, "onFullScreenClosed", js.undefined)
      
      @scala.inline
      def setOnFullScreenOpened(value: () => Unit): Self = StObject.set(x, "onFullScreenOpened", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFullScreenOpenedUndefined: Self = StObject.set(x, "onFullScreenOpened", js.undefined)
      
      @scala.inline
      def setOnObjectClicked(value: /* object */ BookableObject => Unit): Self = StObject.set(x, "onObjectClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnObjectClickedUndefined: Self = StObject.set(x, "onObjectClicked", js.undefined)
      
      @scala.inline
      def setOnObjectDeselected(value: (/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price]) => Unit): Self = StObject.set(x, "onObjectDeselected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnObjectDeselectedUndefined: Self = StObject.set(x, "onObjectDeselected", js.undefined)
      
      @scala.inline
      def setOnObjectSelected(value: (/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price]) => Unit): Self = StObject.set(x, "onObjectSelected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnObjectSelectedUndefined: Self = StObject.set(x, "onObjectSelected", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFullScreenButton(value: Boolean): Self = StObject.set(x, "showFullScreenButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFullScreenButtonUndefined: Self = StObject.set(x, "showFullScreenButton", js.undefined)
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylePreset(value: StylePreset): Self = StObject.set(x, "stylePreset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylePresetUndefined: Self = StObject.set(x, "stylePreset", js.undefined)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltipInfo(value: /* object */ BookableObject => String): Self = StObject.set(x, "tooltipInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipInfoUndefined: Self = StObject.set(x, "tooltipInfo", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.seatsio.seatsioStrings.light
    - typings.seatsio.seatsioStrings.dark
  */
  trait ColorScheme extends StObject
  object ColorScheme {
    
    @scala.inline
    def dark: typings.seatsio.seatsioStrings.dark = "dark".asInstanceOf[typings.seatsio.seatsioStrings.dark]
    
    @scala.inline
    def light: typings.seatsio.seatsioStrings.light = "light".asInstanceOf[typings.seatsio.seatsioStrings.light]
  }
  
  trait Colors extends StObject {
    
    var colorSelected: js.UndefOr[String] = js.undefined
    
    var colorTitle: js.UndefOr[String] = js.undefined
    
    var cursorTooltipBackgroundColor: js.UndefOr[String] = js.undefined
  }
  object Colors {
    
    @scala.inline
    def apply(): Colors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorSelected(value: String): Self = StObject.set(x, "colorSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSelectedUndefined: Self = StObject.set(x, "colorSelected", js.undefined)
      
      @scala.inline
      def setColorTitle(value: String): Self = StObject.set(x, "colorTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorTitleUndefined: Self = StObject.set(x, "colorTitle", js.undefined)
      
      @scala.inline
      def setCursorTooltipBackgroundColor(value: String): Self = StObject.set(x, "cursorTooltipBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorTooltipBackgroundColorUndefined: Self = StObject.set(x, "cursorTooltipBackgroundColor", js.undefined)
    }
  }
  
  trait DataPerEvent extends StObject {
    
    var extraData: js.UndefOr[js.Any] = js.undefined
    
    var status: String
  }
  object DataPerEvent {
    
    @scala.inline
    def apply(status: String): DataPerEvent = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataPerEvent]
    }
    
    @scala.inline
    implicit class DataPerEventMutableBuilder[Self <: DataPerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventManager
    extends StObject
       with // tslint:disable-next-line:no-misused-new
  Instantiable1[/* config */ EventManagerConfig, EventManager] {
    
    def destroy(): Unit = js.native
    
    def render(): EventManager = js.native
  }
  
  trait EventManagerConfig extends StObject {
    
    var colorScheme: js.UndefOr[ColorScheme] = js.undefined
    
    var colors: js.UndefOr[Colors] = js.undefined
    
    var divId: String
    
    var event: String
    
    var language: js.UndefOr[String] = js.undefined
    
    var messages: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var mode: manageObjectStatuses | manageForSaleConfig | manageTableBooking | manageChannels
    
    var onChartRendered: js.UndefOr[js.Function1[/* chart */ EventManager, Unit]] = js.undefined
    
    var onChartRenderingFailed: js.UndefOr[js.Function1[/* chart */ EventManager, Unit]] = js.undefined
    
    var onFullScreenClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFullScreenOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onObjectClicked: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.undefined
    
    var onObjectDeselected: js.UndefOr[
        js.Function2[/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price], Unit]
      ] = js.undefined
    
    var onObjectSelected: js.UndefOr[
        js.Function2[/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price], Unit]
      ] = js.undefined
    
    var secretKey: String
    
    var showFullScreenButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Style] = js.undefined
    
    var stylePreset: js.UndefOr[StylePreset] = js.undefined
    
    var tooltipInfo: js.UndefOr[js.Function1[/* object */ BookableObject, String]] = js.undefined
  }
  object EventManagerConfig {
    
    @scala.inline
    def apply(
      divId: String,
      event: String,
      mode: manageObjectStatuses | manageForSaleConfig | manageTableBooking | manageChannels,
      secretKey: String
    ): EventManagerConfig = {
      val __obj = js.Dynamic.literal(divId = divId.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventManagerConfig]
    }
    
    @scala.inline
    implicit class EventManagerConfigMutableBuilder[Self <: EventManagerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      @scala.inline
      def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setDivId(value: String): Self = StObject.set(x, "divId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMode(value: manageObjectStatuses | manageForSaleConfig | manageTableBooking | manageChannels): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChartRendered(value: /* chart */ EventManager => Unit): Self = StObject.set(x, "onChartRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChartRenderedUndefined: Self = StObject.set(x, "onChartRendered", js.undefined)
      
      @scala.inline
      def setOnChartRenderingFailed(value: /* chart */ EventManager => Unit): Self = StObject.set(x, "onChartRenderingFailed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChartRenderingFailedUndefined: Self = StObject.set(x, "onChartRenderingFailed", js.undefined)
      
      @scala.inline
      def setOnFullScreenClosed(value: () => Unit): Self = StObject.set(x, "onFullScreenClosed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFullScreenClosedUndefined: Self = StObject.set(x, "onFullScreenClosed", js.undefined)
      
      @scala.inline
      def setOnFullScreenOpened(value: () => Unit): Self = StObject.set(x, "onFullScreenOpened", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFullScreenOpenedUndefined: Self = StObject.set(x, "onFullScreenOpened", js.undefined)
      
      @scala.inline
      def setOnObjectClicked(value: /* object */ BookableObject => Unit): Self = StObject.set(x, "onObjectClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnObjectClickedUndefined: Self = StObject.set(x, "onObjectClicked", js.undefined)
      
      @scala.inline
      def setOnObjectDeselected(value: (/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price]) => Unit): Self = StObject.set(x, "onObjectDeselected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnObjectDeselectedUndefined: Self = StObject.set(x, "onObjectDeselected", js.undefined)
      
      @scala.inline
      def setOnObjectSelected(value: (/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price]) => Unit): Self = StObject.set(x, "onObjectSelected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnObjectSelectedUndefined: Self = StObject.set(x, "onObjectSelected", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFullScreenButton(value: Boolean): Self = StObject.set(x, "showFullScreenButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFullScreenButtonUndefined: Self = StObject.set(x, "showFullScreenButton", js.undefined)
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylePreset(value: StylePreset): Self = StObject.set(x, "stylePreset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylePresetUndefined: Self = StObject.set(x, "stylePreset", js.undefined)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltipInfo(value: /* object */ BookableObject => String): Self = StObject.set(x, "tooltipInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipInfoUndefined: Self = StObject.set(x, "tooltipInfo", js.undefined)
    }
  }
  
  type ExtraConfig = StringDictionary[js.Any]
  
  @js.native
  trait GeneralAdmissionArea
    extends StObject
       with BaseObject
       with BookableObject {
    
    var capacity: Double = js.native
    
    @JSName("dataPerEvent")
    var dataPerEvent_GeneralAdmissionArea: StringDictionary[GeneralAdmissionDataPerEvent] = js.native
    
    var numBooked: Double = js.native
    
    var numFree: Double = js.native
    
    var numSelected: Double = js.native
    
    var selectionPerTicketType: StringDictionary[Double] = js.native
  }
  
  trait GeneralAdmissionDataPerEvent
    extends StObject
       with DataPerEvent {
    
    var holds: StringDictionary[DictticketType]
    
    var numBooked: `5`
  }
  object GeneralAdmissionDataPerEvent {
    
    @scala.inline
    def apply(holds: StringDictionary[DictticketType], status: String): GeneralAdmissionDataPerEvent = {
      val __obj = js.Dynamic.literal(holds = holds.asInstanceOf[js.Any], numBooked = 5, status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneralAdmissionDataPerEvent]
    }
    
    @scala.inline
    implicit class GeneralAdmissionDataPerEventMutableBuilder[Self <: GeneralAdmissionDataPerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHolds(value: StringDictionary[DictticketType]): Self = StObject.set(x, "holds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumBooked(value: `5`): Self = StObject.set(x, "numBooked", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pricing extends StObject {
    
    var formattedPrice: String
    
    var price: Double
    
    var ticketType: js.UndefOr[String] = js.undefined
  }
  object Pricing {
    
    @scala.inline
    def apply(formattedPrice: String, price: Double): Pricing = {
      val __obj = js.Dynamic.literal(formattedPrice = formattedPrice.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pricing]
    }
    
    @scala.inline
    implicit class PricingMutableBuilder[Self <: Pricing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormattedPrice(value: String): Self = StObject.set(x, "formattedPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketType(value: String): Self = StObject.set(x, "ticketType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketTypeUndefined: Self = StObject.set(x, "ticketType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.seatsio.Seatsio.PricingConfigSimple
    - typings.seatsio.Seatsio.PricingConfigMulti
  */
  trait PricingConfig extends StObject
  object PricingConfig {
    
    @scala.inline
    def PricingConfigMulti(category: String, ticketTypes: js.Array[LabelPrice]): typings.seatsio.Seatsio.PricingConfigMulti = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], ticketTypes = ticketTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seatsio.Seatsio.PricingConfigMulti]
    }
    
    @scala.inline
    def PricingConfigSimple(category: String, price: Double): typings.seatsio.Seatsio.PricingConfigSimple = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seatsio.Seatsio.PricingConfigSimple]
    }
  }
  
  trait PricingConfigMulti
    extends StObject
       with PricingConfig {
    
    var category: String
    
    var ticketTypes: js.Array[LabelPrice]
  }
  object PricingConfigMulti {
    
    @scala.inline
    def apply(category: String, ticketTypes: js.Array[LabelPrice]): PricingConfigMulti = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], ticketTypes = ticketTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PricingConfigMulti]
    }
    
    @scala.inline
    implicit class PricingConfigMultiMutableBuilder[Self <: PricingConfigMulti] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketTypes(value: js.Array[LabelPrice]): Self = StObject.set(x, "ticketTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketTypesVarargs(value: LabelPrice*): Self = StObject.set(x, "ticketTypes", js.Array(value :_*))
    }
  }
  
  trait PricingConfigSimple
    extends StObject
       with PricingConfig {
    
    var category: String
    
    var price: Double
  }
  object PricingConfigSimple {
    
    @scala.inline
    def apply(category: String, price: Double): PricingConfigSimple = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[PricingConfigSimple]
    }
    
    @scala.inline
    implicit class PricingConfigSimpleMutableBuilder[Self <: PricingConfigSimple] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Seat
    extends StObject
       with BaseObject
       with BookableObject {
    
    var companionSeat: Boolean = js.native
    
    var disabledBySocialDistancingRules: Boolean = js.native
    
    var parent: Type = js.native
    
    var restrictedView: Boolean = js.native
    
    var viewFromSeatUrl: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait SeatingChart
    extends StObject
       with // tslint:disable-next-line:no-misused-new
  Instantiable1[/* config */ SeatingChartConfig, SeatingChart] {
    
    def changeConfig(config: ChangeableSeatingChartConfig): Unit = js.native
    
    def clearSelection(): Unit = js.native
    def clearSelection(successCallback: js.Function0[Unit]): Unit = js.native
    def clearSelection(successCallback: js.Function0[Unit], failureCallback: js.Function0[Unit]): Unit = js.native
    def clearSelection(successCallback: Unit, failureCallback: js.Function0[Unit]): Unit = js.native
    
    var config: SeatingChartConfig = js.native
    
    def deselectCategories(categoryIds: js.Array[String]): Unit = js.native
    def deselectCategories(categoryIds: js.Array[String], successCallback: js.Function0[Unit]): Unit = js.native
    def deselectCategories(
      categoryIds: js.Array[String],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function0[Unit]
    ): Unit = js.native
    def deselectCategories(categoryIds: js.Array[String], successCallback: Unit, failureCallback: js.Function0[Unit]): Unit = js.native
    
    def deselectObjects(objects: js.Array[Amount | String]): Unit = js.native
    def deselectObjects(objects: js.Array[Amount | String], successCallback: js.Function0[Unit]): Unit = js.native
    def deselectObjects(
      objects: js.Array[Amount | String],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function0[Unit]
    ): Unit = js.native
    def deselectObjects(objects: js.Array[Amount | String], successCallback: Unit, failureCallback: js.Function0[Unit]): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def findObject(label: String): Unit = js.native
    def findObject(label: String, successCallback: js.Function1[/* object */ BookableObject, Unit]): Unit = js.native
    def findObject(
      label: String,
      successCallback: js.Function1[/* object */ BookableObject, Unit],
      objectNotFoundCallback: js.Function0[Unit]
    ): Unit = js.native
    def findObject(label: String, successCallback: Unit, objectNotFoundCallback: js.Function0[Unit]): Unit = js.native
    
    var holdToken: String | Null = js.native
    
    def listCategories(callback: js.Function1[/* object */ js.Array[Category], Unit]): Unit = js.native
    
    def listSelectedObjects(selectedObjectsCallback: js.Function1[/* selectedObject */ BookableObject, Unit]): Unit = js.native
    
    def render(): SeatingChart = js.native
    
    def rerender(): Unit = js.native
    
    def resetView(): Unit = js.native
    
    def selectBestAvailable(config: BestAvailable): Unit = js.native
    
    def selectCategories(categoryIds: js.Array[String]): Unit = js.native
    def selectCategories(categoryIds: js.Array[String], successCallback: js.Function0[Unit]): Unit = js.native
    def selectCategories(
      categoryIds: js.Array[String],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function0[Unit]
    ): Unit = js.native
    def selectCategories(categoryIds: js.Array[String], successCallback: Unit, failureCallback: js.Function0[Unit]): Unit = js.native
    
    def selectObjects(objects: js.Array[Amount | String]): Unit = js.native
    def selectObjects(objects: js.Array[Amount | String], successCallback: js.Function0[Unit]): Unit = js.native
    def selectObjects(
      objects: js.Array[Amount | String],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function0[Unit]
    ): Unit = js.native
    def selectObjects(objects: js.Array[Amount | String], successCallback: Unit, failureCallback: js.Function0[Unit]): Unit = js.native
    
    var selectedObjects: js.Array[String] = js.native
    
    def startNewSession(): Unit = js.native
    def startNewSession(successCallback: js.Function0[Unit]): Unit = js.native
    def startNewSession(successCallback: js.Function0[Unit], failureCallback: js.Function0[Unit]): Unit = js.native
    def startNewSession(successCallback: Unit, failureCallback: js.Function0[Unit]): Unit = js.native
    
    def zoomToSelectedObjects(): Unit = js.native
  }
  
  trait SeatingChartConfig
    extends StObject
       with ChangeableSeatingChartConfig {
    
    var alwaysShowSectionContents: js.UndefOr[Boolean] = js.undefined
    
    var canGASelectionBeIncreased: js.UndefOr[
        js.Function4[
          /* gaArea */ GeneralAdmissionArea, 
          /* defaultValue */ Boolean, 
          /* extraConfig */ ExtraConfig, 
          /* ticketType */ String, 
          Boolean
        ]
      ] = js.undefined
    
    var categories: js.UndefOr[js.Array[CategoryConfig]] = js.undefined
    
    var categoryFilter: js.UndefOr[Enabled] = js.undefined
    
    var channels: js.UndefOr[js.Array[String]] = js.undefined
    
    var chart: js.UndefOr[String] = js.undefined
    
    var colorScheme: js.UndefOr[ColorScheme] = js.undefined
    
    var colors: js.UndefOr[Colors] = js.undefined
    
    var divId: String
    
    var event: js.UndefOr[String] = js.undefined
    
    var events: js.UndefOr[js.Array[String]] = js.undefined
    
    var fitTo: js.UndefOr[widthAndHeight | width] = js.undefined
    
    var holdOnSelectForGAs: js.UndefOr[Boolean] = js.undefined
    
    var holdToken: js.UndefOr[String] = js.undefined
    
    var holdTokenInputName: js.UndefOr[String] = js.undefined
    
    var isObjectVisible: js.UndefOr[js.Function2[/* object */ BookableObject, /* extraConfig */ ExtraConfig, String]] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var legend: js.UndefOr[HideNonSelectableCategories] = js.undefined
    
    var loading: js.UndefOr[String] = js.undefined
    
    var messages: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var mode: js.UndefOr[normal | static | print] = js.undefined
    
    var multiSelectEnabled: js.UndefOr[Boolean] = js.undefined
    
    var objectCategories: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var objectCategory: js.UndefOr[
        js.Function4[
          /* object */ BookableObject, 
          /* categories */ CategoryList, 
          /* defaultCategory */ Category, 
          /* extraConfig */ ExtraConfig, 
          Category
        ]
      ] = js.undefined
    
    var objectIcon: js.UndefOr[
        js.Function3[
          /* object */ BookableObject, 
          /* defaultIcon */ String, 
          /* extraConfig */ ExtraConfig, 
          String
        ]
      ] = js.undefined
    
    var objectTooltip: js.UndefOr[ConfirmSelectionOnMobile] = js.undefined
    
    var objectWithoutCategorySelectable: js.UndefOr[Boolean] = js.undefined
    
    var objectWithoutPricingSelectable: js.UndefOr[Boolean] = js.undefined
    
    var onBestAvailableSelected: js.UndefOr[
        js.Function2[/* objects */ js.Array[BookableObject], /* nextToEachOther */ Boolean | Null, Unit]
      ] = js.undefined
    
    var onBestAvailableSelectionFailed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChartRendered: js.UndefOr[js.Function1[/* chart */ SeatingChart, Unit]] = js.undefined
    
    var onChartRenderingFailed: js.UndefOr[js.Function1[/* chart */ SeatingChart, Unit]] = js.undefined
    
    var onFullScreenClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFullScreenOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHoldFailed: js.UndefOr[
        js.Function2[
          /* objects */ js.Array[BookableObject], 
          /* ticketTypes */ js.UndefOr[js.Array[TicketType]], 
          Unit
        ]
      ] = js.undefined
    
    var onHoldSucceeded: js.UndefOr[
        js.Function2[
          /* objects */ js.Array[BookableObject], 
          /* ticketTypes */ js.UndefOr[js.Array[TicketType]], 
          Unit
        ]
      ] = js.undefined
    
    var onHoldTokenExpired: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onObjectClicked: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.undefined
    
    var onObjectDeselected: js.UndefOr[
        js.Function2[/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price], Unit]
      ] = js.undefined
    
    var onObjectMouseOut: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.undefined
    
    var onObjectMouseOver: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.undefined
    
    var onObjectSelected: js.UndefOr[
        js.Function2[/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price], Unit]
      ] = js.undefined
    
    var onReleaseHoldFailed: js.UndefOr[
        js.Function2[
          /* objects */ js.Array[BookableObject], 
          /* ticketTypes */ js.UndefOr[js.Array[TicketType]], 
          Unit
        ]
      ] = js.undefined
    
    var onReleaseHoldSucceeded: js.UndefOr[
        js.Function2[
          /* objects */ js.Array[BookableObject], 
          /* ticketTypes */ js.UndefOr[js.Array[TicketType]], 
          Unit
        ]
      ] = js.undefined
    
    var onSelectedObjectBooked: js.UndefOr[js.Function1[/* object */ BookableObject, Unit]] = js.undefined
    
    var onSelectionInvalid: js.UndefOr[js.Function1[/* violations */ js.Array[Violations], Unit]] = js.undefined
    
    var onSelectionValid: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var priceFormatter: js.UndefOr[js.Function1[/* price */ Double, String]] = js.undefined
    
    var priceLevelsTooltipMessage: js.UndefOr[String] = js.undefined
    
    var sectionColor: js.UndefOr[
        js.Function3[
          /* section */ Section, 
          /* defaultColor */ String, 
          /* extraConfig */ ExtraConfig, 
          String
        ]
      ] = js.undefined
    
    var selectBestAvailable: js.UndefOr[BestAvailable] = js.undefined
    
    var selectedObjects: js.UndefOr[js.Array[String | Label]] = js.undefined
    
    var selectedObjectsInputName: js.UndefOr[String] = js.undefined
    
    var selectionValidators: js.UndefOr[js.Array[SelectionValidator]] = js.undefined
    
    var session: js.UndefOr[continue | start | manual | none] = js.undefined
    
    var showActiveSectionTooltipOnMobile: js.UndefOr[Boolean] = js.undefined
    
    var showFullScreenButton: js.UndefOr[Boolean] = js.undefined
    
    var showLegend: js.UndefOr[Boolean] = js.undefined
    
    var showMinimap: js.UndefOr[Boolean] = js.undefined
    
    var showRowLines: js.UndefOr[Boolean] = js.undefined
    
    var showViewFromYourSeatOnDesktop: js.UndefOr[Boolean] = js.undefined
    
    var showViewFromYourSeatOnMobile: js.UndefOr[Boolean] = js.undefined
    
    var showZoomOutButtonOnMobile: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Style] = js.undefined
    
    var stylePreset: js.UndefOr[StylePreset] = js.undefined
    
    var tooltipInfo: js.UndefOr[js.Function1[/* object */ BookableObject, String]] = js.undefined
    
    var unifiedObjectPropertiesInCallbacks: js.UndefOr[Boolean] = js.undefined
    
    var workspaceKey: String
  }
  object SeatingChartConfig {
    
    @scala.inline
    def apply(divId: String, workspaceKey: String): SeatingChartConfig = {
      val __obj = js.Dynamic.literal(divId = divId.asInstanceOf[js.Any], workspaceKey = workspaceKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeatingChartConfig]
    }
    
    @scala.inline
    implicit class SeatingChartConfigMutableBuilder[Self <: SeatingChartConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowSectionContents(value: Boolean): Self = StObject.set(x, "alwaysShowSectionContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowSectionContentsUndefined: Self = StObject.set(x, "alwaysShowSectionContents", js.undefined)
      
      @scala.inline
      def setCanGASelectionBeIncreased(
        value: (/* gaArea */ GeneralAdmissionArea, /* defaultValue */ Boolean, /* extraConfig */ ExtraConfig, /* ticketType */ String) => Boolean
      ): Self = StObject.set(x, "canGASelectionBeIncreased", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCanGASelectionBeIncreasedUndefined: Self = StObject.set(x, "canGASelectionBeIncreased", js.undefined)
      
      @scala.inline
      def setCategories(value: js.Array[CategoryConfig]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      @scala.inline
      def setCategoriesVarargs(value: CategoryConfig*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setCategoryFilter(value: Enabled): Self = StObject.set(x, "categoryFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryFilterUndefined: Self = StObject.set(x, "categoryFilter", js.undefined)
      
      @scala.inline
      def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
      
      @scala.inline
      def setChart(value: String): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      
      @scala.inline
      def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      @scala.inline
      def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setDivId(value: String): Self = StObject.set(x, "divId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setFitTo(value: widthAndHeight | width): Self = StObject.set(x, "fitTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitToUndefined: Self = StObject.set(x, "fitTo", js.undefined)
      
      @scala.inline
      def setHoldOnSelectForGAs(value: Boolean): Self = StObject.set(x, "holdOnSelectForGAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldOnSelectForGAsUndefined: Self = StObject.set(x, "holdOnSelectForGAs", js.undefined)
      
      @scala.inline
      def setHoldToken(value: String): Self = StObject.set(x, "holdToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldTokenInputName(value: String): Self = StObject.set(x, "holdTokenInputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldTokenInputNameUndefined: Self = StObject.set(x, "holdTokenInputName", js.undefined)
      
      @scala.inline
      def setHoldTokenUndefined: Self = StObject.set(x, "holdToken", js.undefined)
      
      @scala.inline
      def setIsObjectVisible(value: (/* object */ BookableObject, /* extraConfig */ ExtraConfig) => String): Self = StObject.set(x, "isObjectVisible", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsObjectVisibleUndefined: Self = StObject.set(x, "isObjectVisible", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLegend(value: HideNonSelectableCategories): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMode(value: normal | static | print): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMultiSelectEnabled(value: Boolean): Self = StObject.set(x, "multiSelectEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectEnabledUndefined: Self = StObject.set(x, "multiSelectEnabled", js.undefined)
      
      @scala.inline
      def setObjectCategories(value: StringDictionary[String]): Self = StObject.set(x, "objectCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectCategoriesUndefined: Self = StObject.set(x, "objectCategories", js.undefined)
      
      @scala.inline
      def setObjectCategory(
        value: (/* object */ BookableObject, /* categories */ CategoryList, /* defaultCategory */ Category, /* extraConfig */ ExtraConfig) => Category
      ): Self = StObject.set(x, "objectCategory", js.Any.fromFunction4(value))
      
      @scala.inline
      def setObjectCategoryUndefined: Self = StObject.set(x, "objectCategory", js.undefined)
      
      @scala.inline
      def setObjectIcon(
        value: (/* object */ BookableObject, /* defaultIcon */ String, /* extraConfig */ ExtraConfig) => String
      ): Self = StObject.set(x, "objectIcon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setObjectIconUndefined: Self = StObject.set(x, "objectIcon", js.undefined)
      
      @scala.inline
      def setObjectTooltip(value: ConfirmSelectionOnMobile): Self = StObject.set(x, "objectTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectTooltipUndefined: Self = StObject.set(x, "objectTooltip", js.undefined)
      
      @scala.inline
      def setObjectWithoutCategorySelectable(value: Boolean): Self = StObject.set(x, "objectWithoutCategorySelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectWithoutCategorySelectableUndefined: Self = StObject.set(x, "objectWithoutCategorySelectable", js.undefined)
      
      @scala.inline
      def setObjectWithoutPricingSelectable(value: Boolean): Self = StObject.set(x, "objectWithoutPricingSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectWithoutPricingSelectableUndefined: Self = StObject.set(x, "objectWithoutPricingSelectable", js.undefined)
      
      @scala.inline
      def setOnBestAvailableSelected(value: (/* objects */ js.Array[BookableObject], /* nextToEachOther */ Boolean | Null) => Unit): Self = StObject.set(x, "onBestAvailableSelected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBestAvailableSelectedUndefined: Self = StObject.set(x, "onBestAvailableSelected", js.undefined)
      
      @scala.inline
      def setOnBestAvailableSelectionFailed(value: () => Unit): Self = StObject.set(x, "onBestAvailableSelectionFailed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBestAvailableSelectionFailedUndefined: Self = StObject.set(x, "onBestAvailableSelectionFailed", js.undefined)
      
      @scala.inline
      def setOnChartRendered(value: /* chart */ SeatingChart => Unit): Self = StObject.set(x, "onChartRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChartRenderedUndefined: Self = StObject.set(x, "onChartRendered", js.undefined)
      
      @scala.inline
      def setOnChartRenderingFailed(value: /* chart */ SeatingChart => Unit): Self = StObject.set(x, "onChartRenderingFailed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChartRenderingFailedUndefined: Self = StObject.set(x, "onChartRenderingFailed", js.undefined)
      
      @scala.inline
      def setOnFullScreenClosed(value: () => Unit): Self = StObject.set(x, "onFullScreenClosed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFullScreenClosedUndefined: Self = StObject.set(x, "onFullScreenClosed", js.undefined)
      
      @scala.inline
      def setOnFullScreenOpened(value: () => Unit): Self = StObject.set(x, "onFullScreenOpened", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFullScreenOpenedUndefined: Self = StObject.set(x, "onFullScreenOpened", js.undefined)
      
      @scala.inline
      def setOnHoldFailed(
        value: (/* objects */ js.Array[BookableObject], /* ticketTypes */ js.UndefOr[js.Array[TicketType]]) => Unit
      ): Self = StObject.set(x, "onHoldFailed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHoldFailedUndefined: Self = StObject.set(x, "onHoldFailed", js.undefined)
      
      @scala.inline
      def setOnHoldSucceeded(
        value: (/* objects */ js.Array[BookableObject], /* ticketTypes */ js.UndefOr[js.Array[TicketType]]) => Unit
      ): Self = StObject.set(x, "onHoldSucceeded", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHoldSucceededUndefined: Self = StObject.set(x, "onHoldSucceeded", js.undefined)
      
      @scala.inline
      def setOnHoldTokenExpired(value: () => Unit): Self = StObject.set(x, "onHoldTokenExpired", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHoldTokenExpiredUndefined: Self = StObject.set(x, "onHoldTokenExpired", js.undefined)
      
      @scala.inline
      def setOnObjectClicked(value: /* object */ BookableObject => Unit): Self = StObject.set(x, "onObjectClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnObjectClickedUndefined: Self = StObject.set(x, "onObjectClicked", js.undefined)
      
      @scala.inline
      def setOnObjectDeselected(value: (/* object */ BookableObject, /* deselectedTicketType */ js.UndefOr[Price]) => Unit): Self = StObject.set(x, "onObjectDeselected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnObjectDeselectedUndefined: Self = StObject.set(x, "onObjectDeselected", js.undefined)
      
      @scala.inline
      def setOnObjectMouseOut(value: /* object */ BookableObject => Unit): Self = StObject.set(x, "onObjectMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnObjectMouseOutUndefined: Self = StObject.set(x, "onObjectMouseOut", js.undefined)
      
      @scala.inline
      def setOnObjectMouseOver(value: /* object */ BookableObject => Unit): Self = StObject.set(x, "onObjectMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnObjectMouseOverUndefined: Self = StObject.set(x, "onObjectMouseOver", js.undefined)
      
      @scala.inline
      def setOnObjectSelected(value: (/* object */ BookableObject, /* selectedTicketType */ js.UndefOr[Price]) => Unit): Self = StObject.set(x, "onObjectSelected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnObjectSelectedUndefined: Self = StObject.set(x, "onObjectSelected", js.undefined)
      
      @scala.inline
      def setOnReleaseHoldFailed(
        value: (/* objects */ js.Array[BookableObject], /* ticketTypes */ js.UndefOr[js.Array[TicketType]]) => Unit
      ): Self = StObject.set(x, "onReleaseHoldFailed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReleaseHoldFailedUndefined: Self = StObject.set(x, "onReleaseHoldFailed", js.undefined)
      
      @scala.inline
      def setOnReleaseHoldSucceeded(
        value: (/* objects */ js.Array[BookableObject], /* ticketTypes */ js.UndefOr[js.Array[TicketType]]) => Unit
      ): Self = StObject.set(x, "onReleaseHoldSucceeded", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReleaseHoldSucceededUndefined: Self = StObject.set(x, "onReleaseHoldSucceeded", js.undefined)
      
      @scala.inline
      def setOnSelectedObjectBooked(value: /* object */ BookableObject => Unit): Self = StObject.set(x, "onSelectedObjectBooked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectedObjectBookedUndefined: Self = StObject.set(x, "onSelectedObjectBooked", js.undefined)
      
      @scala.inline
      def setOnSelectionInvalid(value: /* violations */ js.Array[Violations] => Unit): Self = StObject.set(x, "onSelectionInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionInvalidUndefined: Self = StObject.set(x, "onSelectionInvalid", js.undefined)
      
      @scala.inline
      def setOnSelectionValid(value: () => Unit): Self = StObject.set(x, "onSelectionValid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelectionValidUndefined: Self = StObject.set(x, "onSelectionValid", js.undefined)
      
      @scala.inline
      def setPriceFormatter(value: /* price */ Double => String): Self = StObject.set(x, "priceFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPriceFormatterUndefined: Self = StObject.set(x, "priceFormatter", js.undefined)
      
      @scala.inline
      def setPriceLevelsTooltipMessage(value: String): Self = StObject.set(x, "priceLevelsTooltipMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceLevelsTooltipMessageUndefined: Self = StObject.set(x, "priceLevelsTooltipMessage", js.undefined)
      
      @scala.inline
      def setSectionColor(value: (/* section */ Section, /* defaultColor */ String, /* extraConfig */ ExtraConfig) => String): Self = StObject.set(x, "sectionColor", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSectionColorUndefined: Self = StObject.set(x, "sectionColor", js.undefined)
      
      @scala.inline
      def setSelectBestAvailable(value: BestAvailable): Self = StObject.set(x, "selectBestAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectBestAvailableUndefined: Self = StObject.set(x, "selectBestAvailable", js.undefined)
      
      @scala.inline
      def setSelectedObjects(value: js.Array[String | Label]): Self = StObject.set(x, "selectedObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedObjectsInputName(value: String): Self = StObject.set(x, "selectedObjectsInputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedObjectsInputNameUndefined: Self = StObject.set(x, "selectedObjectsInputName", js.undefined)
      
      @scala.inline
      def setSelectedObjectsUndefined: Self = StObject.set(x, "selectedObjects", js.undefined)
      
      @scala.inline
      def setSelectedObjectsVarargs(value: (String | Label)*): Self = StObject.set(x, "selectedObjects", js.Array(value :_*))
      
      @scala.inline
      def setSelectionValidators(value: js.Array[SelectionValidator]): Self = StObject.set(x, "selectionValidators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionValidatorsUndefined: Self = StObject.set(x, "selectionValidators", js.undefined)
      
      @scala.inline
      def setSelectionValidatorsVarargs(value: SelectionValidator*): Self = StObject.set(x, "selectionValidators", js.Array(value :_*))
      
      @scala.inline
      def setSession(value: continue | start | manual | none): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setShowActiveSectionTooltipOnMobile(value: Boolean): Self = StObject.set(x, "showActiveSectionTooltipOnMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowActiveSectionTooltipOnMobileUndefined: Self = StObject.set(x, "showActiveSectionTooltipOnMobile", js.undefined)
      
      @scala.inline
      def setShowFullScreenButton(value: Boolean): Self = StObject.set(x, "showFullScreenButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFullScreenButtonUndefined: Self = StObject.set(x, "showFullScreenButton", js.undefined)
      
      @scala.inline
      def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
      
      @scala.inline
      def setShowMinimap(value: Boolean): Self = StObject.set(x, "showMinimap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMinimapUndefined: Self = StObject.set(x, "showMinimap", js.undefined)
      
      @scala.inline
      def setShowRowLines(value: Boolean): Self = StObject.set(x, "showRowLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRowLinesUndefined: Self = StObject.set(x, "showRowLines", js.undefined)
      
      @scala.inline
      def setShowViewFromYourSeatOnDesktop(value: Boolean): Self = StObject.set(x, "showViewFromYourSeatOnDesktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowViewFromYourSeatOnDesktopUndefined: Self = StObject.set(x, "showViewFromYourSeatOnDesktop", js.undefined)
      
      @scala.inline
      def setShowViewFromYourSeatOnMobile(value: Boolean): Self = StObject.set(x, "showViewFromYourSeatOnMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowViewFromYourSeatOnMobileUndefined: Self = StObject.set(x, "showViewFromYourSeatOnMobile", js.undefined)
      
      @scala.inline
      def setShowZoomOutButtonOnMobile(value: Boolean): Self = StObject.set(x, "showZoomOutButtonOnMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowZoomOutButtonOnMobileUndefined: Self = StObject.set(x, "showZoomOutButtonOnMobile", js.undefined)
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylePreset(value: StylePreset): Self = StObject.set(x, "stylePreset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylePresetUndefined: Self = StObject.set(x, "stylePreset", js.undefined)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltipInfo(value: /* object */ BookableObject => String): Self = StObject.set(x, "tooltipInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipInfoUndefined: Self = StObject.set(x, "tooltipInfo", js.undefined)
      
      @scala.inline
      def setUnifiedObjectPropertiesInCallbacks(value: Boolean): Self = StObject.set(x, "unifiedObjectPropertiesInCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnifiedObjectPropertiesInCallbacksUndefined: Self = StObject.set(x, "unifiedObjectPropertiesInCallbacks", js.undefined)
      
      @scala.inline
      def setWorkspaceKey(value: String): Self = StObject.set(x, "workspaceKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SeatingChartDesigner
    extends StObject
       with // tslint:disable-next-line:no-misused-new
  Instantiable1[/* config */ SeatingChartDesignerConfig, SeatingChartDesigner] {
    
    def destroy(): Unit = js.native
    
    def render(): SeatingChartDesigner = js.native
  }
  
  trait SeatingChartDesignerConfig extends StObject {
    
    var chartKey: String
    
    var divId: String
    
    var features: js.UndefOr[Disabled] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var onChartCreated: js.UndefOr[js.Function1[/* chartKey */ String, Unit]] = js.undefined
    
    var onChartPublished: js.UndefOr[js.Function1[/* chartKey */ String, Unit]] = js.undefined
    
    var onChartUpdated: js.UndefOr[js.Function1[/* chartKey */ String, Unit]] = js.undefined
    
    var onDesignerRendered: js.UndefOr[js.Function1[/* designer */ SeatingChartDesigner, Unit]] = js.undefined
    
    var onDesignerRenderingFailed: js.UndefOr[js.Function1[/* designer */ SeatingChartDesigner, Unit]] = js.undefined
    
    var onExitRequested: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var openDraftDrawing: js.UndefOr[Boolean] = js.undefined
    
    var openLatestDrawing: js.UndefOr[Boolean] = js.undefined
    
    var secretKey: String
  }
  object SeatingChartDesignerConfig {
    
    @scala.inline
    def apply(chartKey: String, divId: String, secretKey: String): SeatingChartDesignerConfig = {
      val __obj = js.Dynamic.literal(chartKey = chartKey.asInstanceOf[js.Any], divId = divId.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeatingChartDesignerConfig]
    }
    
    @scala.inline
    implicit class SeatingChartDesignerConfigMutableBuilder[Self <: SeatingChartDesignerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChartKey(value: String): Self = StObject.set(x, "chartKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivId(value: String): Self = StObject.set(x, "divId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatures(value: Disabled): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setOnChartCreated(value: /* chartKey */ String => Unit): Self = StObject.set(x, "onChartCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChartCreatedUndefined: Self = StObject.set(x, "onChartCreated", js.undefined)
      
      @scala.inline
      def setOnChartPublished(value: /* chartKey */ String => Unit): Self = StObject.set(x, "onChartPublished", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChartPublishedUndefined: Self = StObject.set(x, "onChartPublished", js.undefined)
      
      @scala.inline
      def setOnChartUpdated(value: /* chartKey */ String => Unit): Self = StObject.set(x, "onChartUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChartUpdatedUndefined: Self = StObject.set(x, "onChartUpdated", js.undefined)
      
      @scala.inline
      def setOnDesignerRendered(value: /* designer */ SeatingChartDesigner => Unit): Self = StObject.set(x, "onDesignerRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDesignerRenderedUndefined: Self = StObject.set(x, "onDesignerRendered", js.undefined)
      
      @scala.inline
      def setOnDesignerRenderingFailed(value: /* designer */ SeatingChartDesigner => Unit): Self = StObject.set(x, "onDesignerRenderingFailed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDesignerRenderingFailedUndefined: Self = StObject.set(x, "onDesignerRenderingFailed", js.undefined)
      
      @scala.inline
      def setOnExitRequested(value: () => Unit): Self = StObject.set(x, "onExitRequested", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExitRequestedUndefined: Self = StObject.set(x, "onExitRequested", js.undefined)
      
      @scala.inline
      def setOpenDraftDrawing(value: Boolean): Self = StObject.set(x, "openDraftDrawing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDraftDrawingUndefined: Self = StObject.set(x, "openDraftDrawing", js.undefined)
      
      @scala.inline
      def setOpenLatestDrawing(value: Boolean): Self = StObject.set(x, "openLatestDrawing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenLatestDrawingUndefined: Self = StObject.set(x, "openLatestDrawing", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  implicit class SeatsioMutableBuilder[Self <: Seatsio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartManager(value: ChartManager): Self = StObject.set(x, "ChartManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManager(value: EventManager): Self = StObject.set(x, "EventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeatingChart(value: SeatingChart): Self = StObject.set(x, "SeatingChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeatingChartDesigner(value: SeatingChartDesigner): Self = StObject.set(x, "SeatingChartDesigner", value.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Section
    extends StObject
       with BaseObject
       with BookableObject {
    
    var isInteractive: Boolean = js.native
    
    var numberOfSelectableObjects: Double = js.native
    
    var numberOfSelectedObjects: Double = js.native
    
    var sectionCategory: Category = js.native
    
    var selectableCategories: js.Array[Category] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.seatsio.anon.Highlight
    - typings.seatsio.anon.`0`
  */
  trait SelectionValidator extends StObject
  object SelectionValidator {
    
    @scala.inline
    def `0`(): typings.seatsio.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("consecutiveSeats")
      __obj.asInstanceOf[typings.seatsio.anon.`0`]
    }
    
    @scala.inline
    def Highlight(): typings.seatsio.anon.Highlight = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("noOrphanSeats")
      __obj.asInstanceOf[typings.seatsio.anon.Highlight]
    }
  }
  
  trait Style extends StObject {
    
    var border: js.UndefOr[thick | `3d`] = js.undefined
    
    var borderRadius: js.UndefOr[none | max | asymmetrical] = js.undefined
    
    var buttonFace: js.UndefOr[fillEnabled | fillHighlightedOption] = js.undefined
    
    var font: js.UndefOr[Roboto | Montserrat | WorkSans | NotoSansHK | Lato] = js.undefined
    
    var fontWeight: js.UndefOr[bolder | minMax] = js.undefined
    
    var padding: js.UndefOr[spacious] = js.undefined
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: thick | `3d`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadius(value: none | max | asymmetrical): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setButtonFace(value: fillEnabled | fillHighlightedOption): Self = StObject.set(x, "buttonFace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonFaceUndefined: Self = StObject.set(x, "buttonFace", js.undefined)
      
      @scala.inline
      def setFont(value: Roboto | Montserrat | WorkSans | NotoSansHK | Lato): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontWeight(value: bolder | minMax): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setPadding(value: spacious): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.seatsio.seatsioStrings.balance
    - typings.seatsio.seatsioStrings.bubblegum
    - typings.seatsio.seatsioStrings.flathead
    - typings.seatsio.seatsioStrings.bezels
    - typings.seatsio.seatsioStrings.leaf
  */
  trait StylePreset extends StObject
  object StylePreset {
    
    @scala.inline
    def balance: typings.seatsio.seatsioStrings.balance = "balance".asInstanceOf[typings.seatsio.seatsioStrings.balance]
    
    @scala.inline
    def bezels: typings.seatsio.seatsioStrings.bezels = "bezels".asInstanceOf[typings.seatsio.seatsioStrings.bezels]
    
    @scala.inline
    def bubblegum: typings.seatsio.seatsioStrings.bubblegum = "bubblegum".asInstanceOf[typings.seatsio.seatsioStrings.bubblegum]
    
    @scala.inline
    def flathead: typings.seatsio.seatsioStrings.flathead = "flathead".asInstanceOf[typings.seatsio.seatsioStrings.flathead]
    
    @scala.inline
    def leaf: typings.seatsio.seatsioStrings.leaf = "leaf".asInstanceOf[typings.seatsio.seatsioStrings.leaf]
  }
  
  trait TicketListing extends StObject {
    
    var price: Double
    
    var quantity: Double
    
    var section: String
  }
  object TicketListing {
    
    @scala.inline
    def apply(price: Double, quantity: Double, section: String): TicketListing = {
      val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any])
      __obj.asInstanceOf[TicketListing]
    }
    
    @scala.inline
    implicit class TicketListingMutableBuilder[Self <: TicketListing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.seatsio.seatsioStrings.noOrphanSeats
    - typings.seatsio.seatsioStrings.consecutiveSeats
  */
  trait Violations extends StObject
  object Violations {
    
    @scala.inline
    def consecutiveSeats: typings.seatsio.seatsioStrings.consecutiveSeats = "consecutiveSeats".asInstanceOf[typings.seatsio.seatsioStrings.consecutiveSeats]
    
    @scala.inline
    def noOrphanSeats: typings.seatsio.seatsioStrings.noOrphanSeats = "noOrphanSeats".asInstanceOf[typings.seatsio.seatsioStrings.noOrphanSeats]
  }
}
