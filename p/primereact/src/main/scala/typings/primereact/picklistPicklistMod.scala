package typings.primereact

import typings.primereact.utilsUtilsMod.IconOptions
import typings.primereact.utilsUtilsMod.IconType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object picklistPicklistMod {
  
  @JSImport("primereact/picklist/picklist", "PickList")
  @js.native
  open class PickList protected () extends Component[PickListProps, Any, Any] {
    def this(props: PickListProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: PickListProps, context: Any) = this()
    
    /**
      * Used to get container element.
      * @return {HTMLDivElement} Container element
      */
    def getElement(): HTMLDivElement = js.native
  }
  
  /**
    * Custom picklist event.
    * @see {@link PickListProps.onChange}
    * @event
    */
  trait PickListChangeEvent extends StObject {
    
    /**
      * Browser event.
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * Source list
      */
    var source: Any
    
    /**
      * Target list
      */
    var target: Any
  }
  object PickListChangeEvent {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], source: Any, target: Any): PickListChangeEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickListChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickListChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom picklist event.
    * @see {@link PickListProps.onMoveToSource},
    *  {@link PickListProps.onMoveAllToSource},
    *  {@link PickListProps.onMoveToTarget},
    *  {@link PickListProps.onMoveAllToTarget},
    *  {@link PickListProps.onSourceSelectionChange},
    *  {@link PickListProps.onTargetSelectionChange}
    *  {@link PickListProps.onSourceFilterChange},
    *  {@link PickListProps.onTargetFilterChange},
    * @event
    */
  trait PickListEvent extends StObject {
    
    /**
      * Browser event.
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * Moved items
      */
    var value: Any
  }
  object PickListEvent {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], value: Any): PickListEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickListEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickListEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom filter input props.
    */
  trait PickListFilterInputProps extends StObject {
    
    /**
      * Style class of the filter input.
      */
    var className: String
    
    /**
      * Filter change callback.
      * @param {React.SyntheticEvent} event - Browser event.
      */
    def onChange(event: SyntheticEvent[Element, Event]): Unit
    
    /**
      * Callback function to be invoked when the keydown event.
      * @param {React.SyntheticEvent} event - Browser event.
      */
    def onKeyDown(event: SyntheticEvent[Element, Event]): Unit
  }
  object PickListFilterInputProps {
    
    inline def apply(
      className: String,
      onChange: SyntheticEvent[Element, Event] => Unit,
      onKeyDown: SyntheticEvent[Element, Event] => Unit
    ): PickListFilterInputProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onKeyDown = js.Any.fromFunction1(onKeyDown))
      __obj.asInstanceOf[PickListFilterInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickListFilterInputProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Custom filter template options.
    */
  trait PickListFilterTemplateOptions extends StObject {
    
    /**
      * Style class of the filter.
      */
    var className: String
    
    /**
      * The JSX element that represents the picklist filter.
      */
    var element: ReactNode
    
    /**
      * Style class of the filter icon.
      */
    var iconClassName: String
    
    /**
      * Props of the filter input.
      */
    var inputProps: PickListFilterInputProps
    
    /**
      * The props of the PickList component.
      */
    var props: PickListProps
  }
  object PickListFilterTemplateOptions {
    
    inline def apply(
      className: String,
      iconClassName: String,
      inputProps: PickListFilterInputProps,
      props: PickListProps
    ): PickListFilterTemplateOptions = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], iconClassName = iconClassName.asInstanceOf[js.Any], inputProps = inputProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickListFilterTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickListFilterTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setInputProps(value: PickListFilterInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setProps(value: PickListProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickListProps extends StObject {
    
    /**
      * The breakpoint to define the maximum width boundary when responsiveness is enabled.
      * @defaultValue '960px'.
      */
    var breakpoint: js.UndefOr[String] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class of the element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the field that uniquely identifies the a record in the data.
      */
    var dataKey: js.UndefOr[String] = js.undefined
    
    /**
      * When specified, displays an input field to filter the items on keyup.
      * @defaultValue false
      */
    var filter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When specified displays an input field to filter the items on keyup and decides which field to search (Accepts multiple fields with a comma).
      */
    var filterBy: js.UndefOr[String] = js.undefined
    
    /**
      * Locale to use in filtering. The default locale is the host environment's current locale.
      * @defaultValue undefined
      */
    var filterLocale: js.UndefOr[String] = js.undefined
    
    /**
      * 	Defines how the items are filtered, valid values are "contains" (default) "startsWith", "endsWith", "equals", "notEquals", "in", "lt", "lte", "gt" and "gte".
      * @defaultValue contains
      */
    var filterMatchMode: js.UndefOr[String] = js.undefined
    
    /**
      * Unique identifier of the element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Template that gets the options for both source and target items and returns the content for it. Useful if you want the same template for both lists else use the custom sourceItemTemplate or targetItemTemplate properties.
      */
    var itemTemplate: js.UndefOr[ReactNode | (js.Function1[/* item */ Any, ReactNode])] = js.undefined
    
    /**
      * Defines how multiple items can be selected, when true metaKey needs to be pressed to select or unselect an item and when set to false selection of each item can be toggled individually. On touch enabled devices, metaKeySelection is turned off automatically.
      * @defaultValue true
      */
    var metaKeySelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon for moving all items to the source list.
      */
    var moveAllToSourceIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Icon for moving all items to the target list.
      */
    var moveAllToTargetIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Icon of the move bottom icon.
      */
    var moveBottomIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Icon of the move down icon.
      */
    var moveDownIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Icon for moving an item to the source list.
      */
    var moveToSourceIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Icon for moving an item to the target list.
      */
    var moveToTargetIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Icon of the move top icon.
      */
    var moveTopIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Icon of the move up icon.
      */
    var moveUpIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Callback to invoke when items are moved from source to target.
      * @param {PickListChangeEvent} event - Custom change event.
      */
    var onChange: js.UndefOr[js.Function1[/* event */ PickListChangeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when all items are moved from target to source.
      * @param {PickListEvent} event - Custom picklist event.
      */
    var onMoveAllToSource: js.UndefOr[js.Function1[/* event */ PickListEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when all items are moved from source to target.
      * @param {PickListEvent} event - Custom picklist event.
      */
    var onMoveAllToTarget: js.UndefOr[js.Function1[/* event */ PickListEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when items are moved from target to source.
      * @param {PickListEvent} event - Custom picklist event.
      */
    var onMoveToSource: js.UndefOr[js.Function1[/* event */ PickListEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when items are moved from source to target.
      * @param {PickListEvent} event - Custom picklist event.
      */
    var onMoveToTarget: js.UndefOr[js.Function1[/* event */ PickListEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when items are filtered within source list.
      * @param {PickListEvent} event - Custom picklist event.
      */
    var onSourceFilterChange: js.UndefOr[js.Function1[/* event */ PickListEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when items are selected within source list.
      * @param {PickListEvent} event - Custom picklist event.
      */
    var onSourceSelectionChange: js.UndefOr[js.Function1[/* event */ PickListEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when items are filtered within target list.
      * @param {PickListEvent} event - Custom picklist event.
      */
    var onTargetFilterChange: js.UndefOr[js.Function1[/* event */ PickListEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when items are selected within target list.
      * @param {PickListEvent} event - Custom picklist event.
      */
    var onTargetSelectionChange: js.UndefOr[js.Function1[/* event */ PickListEvent, Unit]] = js.undefined
    
    /**
      * Whether to show buttons of source list.
      * @defaultValue true
      */
    var showSourceControls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show filter input for source list when filterBy is enabled.
      * @defaultValue true
      */
    var showSourceFilter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show buttons of target list.
      * @defaultValue true
      */
    var showTargetControls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show filter input for target list when filterBy is enabled.
      * @defaultValue true
      */
    var showTargetFilter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array of objects for the source list.
      */
    var source: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Icon of the source list filter.
      */
    var sourceFilterIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Placeholder text on source filter input.
      */
    var sourceFilterPlaceholder: js.UndefOr[String] = js.undefined
    
    /**
      * Template for the source filter content.
      */
    var sourceFilterTemplate: js.UndefOr[
        ReactNode | (js.Function1[/* options */ PickListFilterTemplateOptions, ReactNode])
      ] = js.undefined
    
    /**
      * Filter value in the target list.
      */
    var sourceFilterValue: js.UndefOr[String] = js.undefined
    
    /**
      * Template for the source list caption.
      */
    var sourceHeader: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Template that gets the options for the source items and returns the content for it.
      */
    var sourceItemTemplate: js.UndefOr[ReactNode | (js.Function1[/* item */ Any, ReactNode])] = js.undefined
    
    /**
      * Selected item in the source list.
      */
    var sourceSelection: js.UndefOr[Any] = js.undefined
    
    /**
      * Inline style of the source list element.
      */
    var sourceStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Inline style of the element.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Index of the element in tabbing order.
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of objects for the target list.
      */
    var target: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Icon of the target list filter.
      */
    var targetFilterIcon: js.UndefOr[IconType[PickListProps]] = js.undefined
    
    /**
      * Placeholder text on target filter input.
      */
    var targetFilterPlaceholder: js.UndefOr[String] = js.undefined
    
    /**
      * Placeholder text on target filter input.
      */
    var targetFilterTemplate: js.UndefOr[
        ReactNode | (js.Function1[/* options */ PickListFilterTemplateOptions, ReactNode])
      ] = js.undefined
    
    /**
      * Filter value in the source list.
      */
    var targetFilterValue: js.UndefOr[String] = js.undefined
    
    /**
      * Template for the target list caption.
      */
    var targetHeader: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Template that gets the options for the target items and returns the content for it.
      */
    var targetItemTemplate: js.UndefOr[ReactNode | (js.Function1[/* item */ Any, ReactNode])] = js.undefined
    
    /**
      * Selected items in the target list.
      */
    var targetSelection: js.UndefOr[Any] = js.undefined
    
    /**
      * Inline style of the target list element.
      */
    var targetStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object PickListProps {
    
    inline def apply(): PickListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickListProps] (val x: Self) extends AnyVal {
      
      inline def setBreakpoint(value: String): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterBy(value: String): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      inline def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      inline def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      inline def setFilterMatchMode(value: String): Self = StObject.set(x, "filterMatchMode", value.asInstanceOf[js.Any])
      
      inline def setFilterMatchModeUndefined: Self = StObject.set(x, "filterMatchMode", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemTemplate(value: ReactNode | (js.Function1[/* item */ Any, ReactNode])): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      inline def setItemTemplateFunction1(value: /* item */ Any => ReactNode): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      inline def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      inline def setMoveAllToSourceIcon(value: IconType[PickListProps]): Self = StObject.set(x, "moveAllToSourceIcon", value.asInstanceOf[js.Any])
      
      inline def setMoveAllToSourceIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "moveAllToSourceIcon", js.Any.fromFunction1(value))
      
      inline def setMoveAllToSourceIconUndefined: Self = StObject.set(x, "moveAllToSourceIcon", js.undefined)
      
      inline def setMoveAllToTargetIcon(value: IconType[PickListProps]): Self = StObject.set(x, "moveAllToTargetIcon", value.asInstanceOf[js.Any])
      
      inline def setMoveAllToTargetIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "moveAllToTargetIcon", js.Any.fromFunction1(value))
      
      inline def setMoveAllToTargetIconUndefined: Self = StObject.set(x, "moveAllToTargetIcon", js.undefined)
      
      inline def setMoveBottomIcon(value: IconType[PickListProps]): Self = StObject.set(x, "moveBottomIcon", value.asInstanceOf[js.Any])
      
      inline def setMoveBottomIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "moveBottomIcon", js.Any.fromFunction1(value))
      
      inline def setMoveBottomIconUndefined: Self = StObject.set(x, "moveBottomIcon", js.undefined)
      
      inline def setMoveDownIcon(value: IconType[PickListProps]): Self = StObject.set(x, "moveDownIcon", value.asInstanceOf[js.Any])
      
      inline def setMoveDownIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "moveDownIcon", js.Any.fromFunction1(value))
      
      inline def setMoveDownIconUndefined: Self = StObject.set(x, "moveDownIcon", js.undefined)
      
      inline def setMoveToSourceIcon(value: IconType[PickListProps]): Self = StObject.set(x, "moveToSourceIcon", value.asInstanceOf[js.Any])
      
      inline def setMoveToSourceIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "moveToSourceIcon", js.Any.fromFunction1(value))
      
      inline def setMoveToSourceIconUndefined: Self = StObject.set(x, "moveToSourceIcon", js.undefined)
      
      inline def setMoveToTargetIcon(value: IconType[PickListProps]): Self = StObject.set(x, "moveToTargetIcon", value.asInstanceOf[js.Any])
      
      inline def setMoveToTargetIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "moveToTargetIcon", js.Any.fromFunction1(value))
      
      inline def setMoveToTargetIconUndefined: Self = StObject.set(x, "moveToTargetIcon", js.undefined)
      
      inline def setMoveTopIcon(value: IconType[PickListProps]): Self = StObject.set(x, "moveTopIcon", value.asInstanceOf[js.Any])
      
      inline def setMoveTopIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "moveTopIcon", js.Any.fromFunction1(value))
      
      inline def setMoveTopIconUndefined: Self = StObject.set(x, "moveTopIcon", js.undefined)
      
      inline def setMoveUpIcon(value: IconType[PickListProps]): Self = StObject.set(x, "moveUpIcon", value.asInstanceOf[js.Any])
      
      inline def setMoveUpIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "moveUpIcon", js.Any.fromFunction1(value))
      
      inline def setMoveUpIconUndefined: Self = StObject.set(x, "moveUpIcon", js.undefined)
      
      inline def setOnChange(value: /* event */ PickListChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnMoveAllToSource(value: /* event */ PickListEvent => Unit): Self = StObject.set(x, "onMoveAllToSource", js.Any.fromFunction1(value))
      
      inline def setOnMoveAllToSourceUndefined: Self = StObject.set(x, "onMoveAllToSource", js.undefined)
      
      inline def setOnMoveAllToTarget(value: /* event */ PickListEvent => Unit): Self = StObject.set(x, "onMoveAllToTarget", js.Any.fromFunction1(value))
      
      inline def setOnMoveAllToTargetUndefined: Self = StObject.set(x, "onMoveAllToTarget", js.undefined)
      
      inline def setOnMoveToSource(value: /* event */ PickListEvent => Unit): Self = StObject.set(x, "onMoveToSource", js.Any.fromFunction1(value))
      
      inline def setOnMoveToSourceUndefined: Self = StObject.set(x, "onMoveToSource", js.undefined)
      
      inline def setOnMoveToTarget(value: /* event */ PickListEvent => Unit): Self = StObject.set(x, "onMoveToTarget", js.Any.fromFunction1(value))
      
      inline def setOnMoveToTargetUndefined: Self = StObject.set(x, "onMoveToTarget", js.undefined)
      
      inline def setOnSourceFilterChange(value: /* event */ PickListEvent => Unit): Self = StObject.set(x, "onSourceFilterChange", js.Any.fromFunction1(value))
      
      inline def setOnSourceFilterChangeUndefined: Self = StObject.set(x, "onSourceFilterChange", js.undefined)
      
      inline def setOnSourceSelectionChange(value: /* event */ PickListEvent => Unit): Self = StObject.set(x, "onSourceSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSourceSelectionChangeUndefined: Self = StObject.set(x, "onSourceSelectionChange", js.undefined)
      
      inline def setOnTargetFilterChange(value: /* event */ PickListEvent => Unit): Self = StObject.set(x, "onTargetFilterChange", js.Any.fromFunction1(value))
      
      inline def setOnTargetFilterChangeUndefined: Self = StObject.set(x, "onTargetFilterChange", js.undefined)
      
      inline def setOnTargetSelectionChange(value: /* event */ PickListEvent => Unit): Self = StObject.set(x, "onTargetSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnTargetSelectionChangeUndefined: Self = StObject.set(x, "onTargetSelectionChange", js.undefined)
      
      inline def setShowSourceControls(value: Boolean): Self = StObject.set(x, "showSourceControls", value.asInstanceOf[js.Any])
      
      inline def setShowSourceControlsUndefined: Self = StObject.set(x, "showSourceControls", js.undefined)
      
      inline def setShowSourceFilter(value: Boolean): Self = StObject.set(x, "showSourceFilter", value.asInstanceOf[js.Any])
      
      inline def setShowSourceFilterUndefined: Self = StObject.set(x, "showSourceFilter", js.undefined)
      
      inline def setShowTargetControls(value: Boolean): Self = StObject.set(x, "showTargetControls", value.asInstanceOf[js.Any])
      
      inline def setShowTargetControlsUndefined: Self = StObject.set(x, "showTargetControls", js.undefined)
      
      inline def setShowTargetFilter(value: Boolean): Self = StObject.set(x, "showTargetFilter", value.asInstanceOf[js.Any])
      
      inline def setShowTargetFilterUndefined: Self = StObject.set(x, "showTargetFilter", js.undefined)
      
      inline def setSource(value: js.Array[Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceFilterIcon(value: IconType[PickListProps]): Self = StObject.set(x, "sourceFilterIcon", value.asInstanceOf[js.Any])
      
      inline def setSourceFilterIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "sourceFilterIcon", js.Any.fromFunction1(value))
      
      inline def setSourceFilterIconUndefined: Self = StObject.set(x, "sourceFilterIcon", js.undefined)
      
      inline def setSourceFilterPlaceholder(value: String): Self = StObject.set(x, "sourceFilterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSourceFilterPlaceholderUndefined: Self = StObject.set(x, "sourceFilterPlaceholder", js.undefined)
      
      inline def setSourceFilterTemplate(value: ReactNode | (js.Function1[/* options */ PickListFilterTemplateOptions, ReactNode])): Self = StObject.set(x, "sourceFilterTemplate", value.asInstanceOf[js.Any])
      
      inline def setSourceFilterTemplateFunction1(value: /* options */ PickListFilterTemplateOptions => ReactNode): Self = StObject.set(x, "sourceFilterTemplate", js.Any.fromFunction1(value))
      
      inline def setSourceFilterTemplateUndefined: Self = StObject.set(x, "sourceFilterTemplate", js.undefined)
      
      inline def setSourceFilterValue(value: String): Self = StObject.set(x, "sourceFilterValue", value.asInstanceOf[js.Any])
      
      inline def setSourceFilterValueUndefined: Self = StObject.set(x, "sourceFilterValue", js.undefined)
      
      inline def setSourceHeader(value: ReactNode): Self = StObject.set(x, "sourceHeader", value.asInstanceOf[js.Any])
      
      inline def setSourceHeaderUndefined: Self = StObject.set(x, "sourceHeader", js.undefined)
      
      inline def setSourceItemTemplate(value: ReactNode | (js.Function1[/* item */ Any, ReactNode])): Self = StObject.set(x, "sourceItemTemplate", value.asInstanceOf[js.Any])
      
      inline def setSourceItemTemplateFunction1(value: /* item */ Any => ReactNode): Self = StObject.set(x, "sourceItemTemplate", js.Any.fromFunction1(value))
      
      inline def setSourceItemTemplateUndefined: Self = StObject.set(x, "sourceItemTemplate", js.undefined)
      
      inline def setSourceSelection(value: Any): Self = StObject.set(x, "sourceSelection", value.asInstanceOf[js.Any])
      
      inline def setSourceSelectionUndefined: Self = StObject.set(x, "sourceSelection", js.undefined)
      
      inline def setSourceStyle(value: CSSProperties): Self = StObject.set(x, "sourceStyle", value.asInstanceOf[js.Any])
      
      inline def setSourceStyleUndefined: Self = StObject.set(x, "sourceStyle", js.undefined)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVarargs(value: Any*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTarget(value: js.Array[Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFilterIcon(value: IconType[PickListProps]): Self = StObject.set(x, "targetFilterIcon", value.asInstanceOf[js.Any])
      
      inline def setTargetFilterIconFunction1(value: /* options */ IconOptions[PickListProps] => ReactNode): Self = StObject.set(x, "targetFilterIcon", js.Any.fromFunction1(value))
      
      inline def setTargetFilterIconUndefined: Self = StObject.set(x, "targetFilterIcon", js.undefined)
      
      inline def setTargetFilterPlaceholder(value: String): Self = StObject.set(x, "targetFilterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setTargetFilterPlaceholderUndefined: Self = StObject.set(x, "targetFilterPlaceholder", js.undefined)
      
      inline def setTargetFilterTemplate(value: ReactNode | (js.Function1[/* options */ PickListFilterTemplateOptions, ReactNode])): Self = StObject.set(x, "targetFilterTemplate", value.asInstanceOf[js.Any])
      
      inline def setTargetFilterTemplateFunction1(value: /* options */ PickListFilterTemplateOptions => ReactNode): Self = StObject.set(x, "targetFilterTemplate", js.Any.fromFunction1(value))
      
      inline def setTargetFilterTemplateUndefined: Self = StObject.set(x, "targetFilterTemplate", js.undefined)
      
      inline def setTargetFilterValue(value: String): Self = StObject.set(x, "targetFilterValue", value.asInstanceOf[js.Any])
      
      inline def setTargetFilterValueUndefined: Self = StObject.set(x, "targetFilterValue", js.undefined)
      
      inline def setTargetHeader(value: ReactNode): Self = StObject.set(x, "targetHeader", value.asInstanceOf[js.Any])
      
      inline def setTargetHeaderUndefined: Self = StObject.set(x, "targetHeader", js.undefined)
      
      inline def setTargetItemTemplate(value: ReactNode | (js.Function1[/* item */ Any, ReactNode])): Self = StObject.set(x, "targetItemTemplate", value.asInstanceOf[js.Any])
      
      inline def setTargetItemTemplateFunction1(value: /* item */ Any => ReactNode): Self = StObject.set(x, "targetItemTemplate", js.Any.fromFunction1(value))
      
      inline def setTargetItemTemplateUndefined: Self = StObject.set(x, "targetItemTemplate", js.undefined)
      
      inline def setTargetSelection(value: Any): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
      
      inline def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
      
      inline def setTargetStyle(value: CSSProperties): Self = StObject.set(x, "targetStyle", value.asInstanceOf[js.Any])
      
      inline def setTargetStyleUndefined: Self = StObject.set(x, "targetStyle", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: Any*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
}
