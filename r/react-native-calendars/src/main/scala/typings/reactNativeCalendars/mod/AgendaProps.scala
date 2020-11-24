package typings.reactNativeCalendars.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgendaProps[TItem] extends js.Object {
  
  /**
    *  Display loading indicator. Default = false
    */
  var displayLoadingIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    *  If firstDay = 1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
    */
  var firstDay: js.UndefOr[Double] = js.native
  
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[Double] = js.native
  
  /**
    *  Hide knob button. Default = false
    */
  var hideKnob: js.UndefOr[Boolean] = js.native
  
  /**
    *  The list of items that have to be displayed in agenda. If you want to render item as empty date
    *  the value of date key kas to be an empty array []. If there exists no value for date key it is
    *  considered that the date in question is not yet loaded
    */
  var items: js.UndefOr[AgendaItemsMap[TItem]] = js.native
  
  /**
    * callback that gets called when items for a certain month should be loaded (month became visible)
    */
  var loadItemsForMonth: js.UndefOr[js.Function1[/* date */ DateObject, Unit]] = js.native
  
  /**
    * Maximum date that can be selected, dates after maxDate will be grayed out. Default = undefined
    */
  var maxDate: js.UndefOr[TCalendarDate] = js.native
  
  /**
    * Minimum date that can be selected, dates before minDate will be grayed out. Default = undefined
    */
  var minDate: js.UndefOr[TCalendarDate] = js.native
  
  /**
    *  Month format in calendar title. Formatting values: http://arshaw.com/xdate/#Formatting
    */
  var monthFormat: js.UndefOr[String] = js.native
  
  /**
    *  Handler which gets executed when the calendar is opened or closed. Default = undefined
    */
  var onCalendarToggled: js.UndefOr[js.Function1[/* calendarOpened */ Boolean, Unit]] = js.native
  
  /**
    *  Handler that gets called when day changes while scrolling agenda list. Default = undefined
    */
  var onDayChange: js.UndefOr[DateCallbackHandler] = js.native
  
  /**
    *  Handler which gets executed on day press. Default = undefined
    */
  var onDayPress: js.UndefOr[DateCallbackHandler] = js.native
  
  /**
    *  If provided, a standard RefreshControl will be added for "Pull to Refresh" functionality.
    *  Make sure to also set the refreshing prop correctly. Default = undefined
    */
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[Double] = js.native
  
  /**
    *  A RefreshControl component, used to provide pull-to-refresh funtionality for the ScrollView.
    */
  var refreshControl: js.UndefOr[ReactNode] = js.native
  
  /**
    *  Set this true while waiting for new data from a refresh.
    */
  var refreshing: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specify how each day should be rendered.
    *  Date can be undefined if the item has not property date.
    */
  var renderDay: js.UndefOr[js.Function2[/* date */ js.UndefOr[DateObject], /* item */ TItem, ReactNode]] = js.native
  
  /**
    *  Specify what should be rendered instead of ActivityIndicator
    */
  var renderEmptyData: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  /**
    *  Specify how empty date content with no items should be rendered.
    */
  def renderEmptyDate(): ReactNode = js.native
  
  /**
    *  Specify how each item should be rendered in agenda.
    */
  def renderItem(item: TItem, firstDayInDay: Boolean): ReactNode = js.native
  
  /**
    *  Specify how agenda knob should look like.
    */
  var renderKnob: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  /**
    * specify your item comparison function for increased performance
    */
  def rowHasChanged(r1: TItem, r2: TItem): Boolean = js.native
  
  /**
    *  Initially visible month. Default = Date()
    */
  var selected: js.UndefOr[TCalendarDate] = js.native
  
  /**
    *  Agenda container style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    *  Specify theme properties to override specific styles for agenda parts. Default = {}
    */
  var theme: js.UndefOr[AgendaThemeStyle] = js.native
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
  implicit class AgendaPropsOps[Self <: AgendaProps[_], TItem] (val x: Self with AgendaProps[TItem]) extends AnyVal {
    
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
    def setRenderEmptyDate(value: () => ReactNode): Self = this.set("renderEmptyDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderItem(value: (TItem, Boolean) => ReactNode): Self = this.set("renderItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowHasChanged(value: (TItem, TItem) => Boolean): Self = this.set("rowHasChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisplayLoadingIndicator(value: Boolean): Self = this.set("displayLoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLoadingIndicator: Self = this.set("displayLoadingIndicator", js.undefined)
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    
    @scala.inline
    def setFutureScrollRange(value: Double): Self = this.set("futureScrollRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFutureScrollRange: Self = this.set("futureScrollRange", js.undefined)
    
    @scala.inline
    def setHideKnob(value: Boolean): Self = this.set("hideKnob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideKnob: Self = this.set("hideKnob", js.undefined)
    
    @scala.inline
    def setItems(value: AgendaItemsMap[TItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLoadItemsForMonth(value: /* date */ DateObject => Unit): Self = this.set("loadItemsForMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoadItemsForMonth: Self = this.set("loadItemsForMonth", js.undefined)
    
    @scala.inline
    def setMaxDate(value: TCalendarDate): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: TCalendarDate): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMonthFormat(value: String): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    
    @scala.inline
    def setOnCalendarToggled(value: /* calendarOpened */ Boolean => Unit): Self = this.set("onCalendarToggled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCalendarToggled: Self = this.set("onCalendarToggled", js.undefined)
    
    @scala.inline
    def setOnDayChange(value: /* date */ DateObject => Unit): Self = this.set("onDayChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDayChange: Self = this.set("onDayChange", js.undefined)
    
    @scala.inline
    def setOnDayPress(value: /* date */ DateObject => Unit): Self = this.set("onDayPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDayPress: Self = this.set("onDayPress", js.undefined)
    
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = this.set("onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRefresh: Self = this.set("onRefresh", js.undefined)
    
    @scala.inline
    def setPastScrollRange(value: Double): Self = this.set("pastScrollRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePastScrollRange: Self = this.set("pastScrollRange", js.undefined)
    
    @scala.inline
    def setRefreshControl(value: ReactNode): Self = this.set("refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshControl: Self = this.set("refreshControl", js.undefined)
    
    @scala.inline
    def setRefreshing(value: Boolean): Self = this.set("refreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshing: Self = this.set("refreshing", js.undefined)
    
    @scala.inline
    def setRenderDay(value: (/* date */ js.UndefOr[DateObject], /* item */ TItem) => ReactNode): Self = this.set("renderDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderDay: Self = this.set("renderDay", js.undefined)
    
    @scala.inline
    def setRenderEmptyData(value: () => ReactNode): Self = this.set("renderEmptyData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderEmptyData: Self = this.set("renderEmptyData", js.undefined)
    
    @scala.inline
    def setRenderKnob(value: () => ReactNode): Self = this.set("renderKnob", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderKnob: Self = this.set("renderKnob", js.undefined)
    
    @scala.inline
    def setSelected(value: TCalendarDate): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTheme(value: AgendaThemeStyle): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
