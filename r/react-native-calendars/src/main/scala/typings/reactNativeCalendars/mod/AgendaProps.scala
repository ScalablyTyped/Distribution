package typings.reactNativeCalendars.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgendaProps[TItem] extends StObject {
  
  /**
    *  Display loading indicator. Default = false
    */
  var displayLoadingIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  If firstDay = 1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
    */
  var firstDay: js.UndefOr[Double] = js.undefined
  
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[Double] = js.undefined
  
  /**
    *  Hide knob button. Default = false
    */
  var hideKnob: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The list of items that have to be displayed in agenda. If you want to render item as empty date
    *  the value of date key kas to be an empty array []. If there exists no value for date key it is
    *  considered that the date in question is not yet loaded
    */
  var items: js.UndefOr[AgendaItemsMap[TItem]] = js.undefined
  
  /**
    * callback that gets called when items for a certain month should be loaded (month became visible)
    */
  var loadItemsForMonth: js.UndefOr[js.Function1[/* date */ DateObject, Unit]] = js.undefined
  
  /**
    * Maximum date that can be selected, dates after maxDate will be grayed out. Default = undefined
    */
  var maxDate: js.UndefOr[TCalendarDate] = js.undefined
  
  /**
    * Minimum date that can be selected, dates before minDate will be grayed out. Default = undefined
    */
  var minDate: js.UndefOr[TCalendarDate] = js.undefined
  
  /**
    *  Month format in calendar title. Formatting values: http://arshaw.com/xdate/#Formatting
    */
  var monthFormat: js.UndefOr[String] = js.undefined
  
  /**
    *  Handler which gets executed when the calendar is opened or closed. Default = undefined
    */
  var onCalendarToggled: js.UndefOr[js.Function1[/* calendarOpened */ Boolean, Unit]] = js.undefined
  
  /**
    *  Handler that gets called when day changes while scrolling agenda list. Default = undefined
    */
  var onDayChange: js.UndefOr[DateCallbackHandler] = js.undefined
  
  /**
    *  Handler which gets executed on day press. Default = undefined
    */
  var onDayPress: js.UndefOr[DateCallbackHandler] = js.undefined
  
  /**
    *  If provided, a standard RefreshControl will be added for "Pull to Refresh" functionality.
    *  Make sure to also set the refreshing prop correctly. Default = undefined
    */
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[Double] = js.undefined
  
  /**
    *  A RefreshControl component, used to provide pull-to-refresh funtionality for the ScrollView.
    */
  var refreshControl: js.UndefOr[ReactNode] = js.undefined
  
  /**
    *  Set this true while waiting for new data from a refresh.
    */
  var refreshing: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Specify how each day should be rendered.
    *  Date can be undefined if the item has not property date.
    */
  var renderDay: js.UndefOr[js.Function2[/* date */ js.UndefOr[DateObject], /* item */ TItem, ReactNode]] = js.undefined
  
  /**
    *  Specify what should be rendered instead of ActivityIndicator
    */
  var renderEmptyData: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  /**
    *  Specify how empty date content with no items should be rendered.
    */
  def renderEmptyDate(): ReactNode
  
  /**
    *  Specify how each item should be rendered in agenda.
    */
  def renderItem(item: TItem, firstDayInDay: Boolean): ReactNode
  
  /**
    *  Specify how agenda knob should look like.
    */
  var renderKnob: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  /**
    * specify your item comparison function for increased performance
    */
  def rowHasChanged(r1: TItem, r2: TItem): Boolean
  
  /**
    *  Initially visible month. Default = Date()
    */
  var selected: js.UndefOr[TCalendarDate] = js.undefined
  
  /**
    *  Agenda container style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    *  Specify theme properties to override specific styles for agenda parts. Default = {}
    */
  var theme: js.UndefOr[AgendaThemeStyle] = js.undefined
}
object AgendaProps {
  
  @scala.inline
  def apply[TItem](
    renderEmptyDate: () => ReactNode,
    renderItem: (TItem, Boolean) => ReactNode,
    rowHasChanged: (TItem, TItem) => Boolean
  ): AgendaProps[TItem] = {
    val __obj = js.Dynamic.literal(renderEmptyDate = js.Any.fromFunction0(renderEmptyDate), renderItem = js.Any.fromFunction2(renderItem), rowHasChanged = js.Any.fromFunction2(rowHasChanged))
    __obj.asInstanceOf[AgendaProps[TItem]]
  }
  
  @scala.inline
  implicit class AgendaPropsMutableBuilder[Self <: AgendaProps[?], TItem] (val x: Self & AgendaProps[TItem]) extends AnyVal {
    
    @scala.inline
    def setDisplayLoadingIndicator(value: Boolean): Self = StObject.set(x, "displayLoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLoadingIndicatorUndefined: Self = StObject.set(x, "displayLoadingIndicator", js.undefined)
    
    @scala.inline
    def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    @scala.inline
    def setFutureScrollRange(value: Double): Self = StObject.set(x, "futureScrollRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFutureScrollRangeUndefined: Self = StObject.set(x, "futureScrollRange", js.undefined)
    
    @scala.inline
    def setHideKnob(value: Boolean): Self = StObject.set(x, "hideKnob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideKnobUndefined: Self = StObject.set(x, "hideKnob", js.undefined)
    
    @scala.inline
    def setItems(value: AgendaItemsMap[TItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setLoadItemsForMonth(value: /* date */ DateObject => Unit): Self = StObject.set(x, "loadItemsForMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadItemsForMonthUndefined: Self = StObject.set(x, "loadItemsForMonth", js.undefined)
    
    @scala.inline
    def setMaxDate(value: TCalendarDate): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: TCalendarDate): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
    
    @scala.inline
    def setOnCalendarToggled(value: /* calendarOpened */ Boolean => Unit): Self = StObject.set(x, "onCalendarToggled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCalendarToggledUndefined: Self = StObject.set(x, "onCalendarToggled", js.undefined)
    
    @scala.inline
    def setOnDayChange(value: /* date */ DateObject => Unit): Self = StObject.set(x, "onDayChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayChangeUndefined: Self = StObject.set(x, "onDayChange", js.undefined)
    
    @scala.inline
    def setOnDayPress(value: /* date */ DateObject => Unit): Self = StObject.set(x, "onDayPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayPressUndefined: Self = StObject.set(x, "onDayPress", js.undefined)
    
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    @scala.inline
    def setPastScrollRange(value: Double): Self = StObject.set(x, "pastScrollRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastScrollRangeUndefined: Self = StObject.set(x, "pastScrollRange", js.undefined)
    
    @scala.inline
    def setRefreshControl(value: ReactNode): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
    
    @scala.inline
    def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    @scala.inline
    def setRenderDay(value: (/* date */ js.UndefOr[DateObject], /* item */ TItem) => ReactNode): Self = StObject.set(x, "renderDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderDayUndefined: Self = StObject.set(x, "renderDay", js.undefined)
    
    @scala.inline
    def setRenderEmptyData(value: () => ReactNode): Self = StObject.set(x, "renderEmptyData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderEmptyDataUndefined: Self = StObject.set(x, "renderEmptyData", js.undefined)
    
    @scala.inline
    def setRenderEmptyDate(value: () => ReactNode): Self = StObject.set(x, "renderEmptyDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderItem(value: (TItem, Boolean) => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderKnob(value: () => ReactNode): Self = StObject.set(x, "renderKnob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderKnobUndefined: Self = StObject.set(x, "renderKnob", js.undefined)
    
    @scala.inline
    def setRowHasChanged(value: (TItem, TItem) => Boolean): Self = StObject.set(x, "rowHasChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelected(value: TCalendarDate): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTheme(value: AgendaThemeStyle): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
