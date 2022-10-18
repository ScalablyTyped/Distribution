package typings.primereact

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
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickListProps, context: Any) = this()
    
    def getElement(): HTMLDivElement = js.native
  }
  
  trait PickListChangeParams extends StObject {
    
    var originalEvent: SyntheticEvent[Element, Event]
    
    var source: Any
    
    var target: Any
  }
  object PickListChangeParams {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], source: Any, target: Any): PickListChangeParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickListChangeParams]
    }
    
    extension [Self <: PickListChangeParams](x: Self) {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickListEventParams extends StObject {
    
    var originalEvent: SyntheticEvent[Element, Event]
    
    var value: Any
  }
  object PickListEventParams {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], value: Any): PickListEventParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickListEventParams]
    }
    
    extension [Self <: PickListEventParams](x: Self) {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickListFilterInputProps extends StObject {
    
    var className: String
    
    def onChange(event: SyntheticEvent[Element, Event]): Unit
    
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
    
    extension [Self <: PickListFilterInputProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    }
  }
  
  trait PickListFilterTemplateOptions extends StObject {
    
    var className: String
    
    var element: ReactNode
    
    var iconClassName: String
    
    var inputProps: PickListFilterInputProps
    
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
    
    extension [Self <: PickListFilterTemplateOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setInputProps(value: PickListFilterInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setProps(value: PickListProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type PickListFilterTemplateType = ReactNode | (js.Function1[/* options */ PickListFilterTemplateOptions, ReactNode])
  
  type PickListItemTemplateType = ReactNode | (js.Function1[/* item */ Any, ReactNode])
  
  trait PickListProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataKey: js.UndefOr[String] = js.undefined
    
    var filterBy: js.UndefOr[String] = js.undefined
    
    var filterLocale: js.UndefOr[String] = js.undefined
    
    var filterMatchMode: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var itemTemplate: js.UndefOr[PickListItemTemplateType] = js.undefined
    
    var metaKeySelection: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ PickListChangeParams, Unit]] = js.undefined
    
    var onMoveAllToSource: js.UndefOr[js.Function1[/* e */ PickListEventParams, Unit]] = js.undefined
    
    var onMoveAllToTarget: js.UndefOr[js.Function1[/* e */ PickListEventParams, Unit]] = js.undefined
    
    var onMoveToSource: js.UndefOr[js.Function1[/* e */ PickListEventParams, Unit]] = js.undefined
    
    var onMoveToTarget: js.UndefOr[js.Function1[/* e */ PickListEventParams, Unit]] = js.undefined
    
    var onSourceFilterChange: js.UndefOr[js.Function1[/* e */ PickListEventParams, Unit]] = js.undefined
    
    var onSourceSelectionChange: js.UndefOr[js.Function1[/* e */ PickListEventParams, Unit]] = js.undefined
    
    var onTargetFilterChange: js.UndefOr[js.Function1[/* e */ PickListEventParams, Unit]] = js.undefined
    
    var onTargetSelectionChange: js.UndefOr[js.Function1[/* e */ PickListEventParams, Unit]] = js.undefined
    
    var showSourceControls: js.UndefOr[Boolean] = js.undefined
    
    var showSourceFilter: js.UndefOr[Boolean] = js.undefined
    
    var showTargetControls: js.UndefOr[Boolean] = js.undefined
    
    var showTargetFilter: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[js.Array[Any]] = js.undefined
    
    var sourceFilterPlaceholder: js.UndefOr[String] = js.undefined
    
    var sourceFilterTemplate: js.UndefOr[PickListFilterTemplateType] = js.undefined
    
    var sourceFilterValue: js.UndefOr[String] = js.undefined
    
    var sourceHeader: js.UndefOr[ReactNode] = js.undefined
    
    var sourceItemTemplate: js.UndefOr[PickListItemTemplateType] = js.undefined
    
    var sourceSelection: js.UndefOr[Any] = js.undefined
    
    var sourceStyle: js.UndefOr[js.Object] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[js.Array[Any]] = js.undefined
    
    var targetFilterPlaceholder: js.UndefOr[String] = js.undefined
    
    var targetFilterTemplate: js.UndefOr[PickListFilterTemplateType] = js.undefined
    
    var targetFilterValue: js.UndefOr[String] = js.undefined
    
    var targetHeader: js.UndefOr[ReactNode] = js.undefined
    
    var targetItemTemplate: js.UndefOr[PickListItemTemplateType] = js.undefined
    
    var targetSelection: js.UndefOr[Any] = js.undefined
    
    var targetStyle: js.UndefOr[js.Object] = js.undefined
  }
  object PickListProps {
    
    inline def apply(): PickListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickListProps]
    }
    
    extension [Self <: PickListProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      inline def setFilterBy(value: String): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      inline def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      inline def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      inline def setFilterMatchMode(value: String): Self = StObject.set(x, "filterMatchMode", value.asInstanceOf[js.Any])
      
      inline def setFilterMatchModeUndefined: Self = StObject.set(x, "filterMatchMode", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemTemplate(value: PickListItemTemplateType): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      inline def setItemTemplateFunction1(value: /* item */ Any => ReactNode): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      inline def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      inline def setOnChange(value: /* e */ PickListChangeParams => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnMoveAllToSource(value: /* e */ PickListEventParams => Unit): Self = StObject.set(x, "onMoveAllToSource", js.Any.fromFunction1(value))
      
      inline def setOnMoveAllToSourceUndefined: Self = StObject.set(x, "onMoveAllToSource", js.undefined)
      
      inline def setOnMoveAllToTarget(value: /* e */ PickListEventParams => Unit): Self = StObject.set(x, "onMoveAllToTarget", js.Any.fromFunction1(value))
      
      inline def setOnMoveAllToTargetUndefined: Self = StObject.set(x, "onMoveAllToTarget", js.undefined)
      
      inline def setOnMoveToSource(value: /* e */ PickListEventParams => Unit): Self = StObject.set(x, "onMoveToSource", js.Any.fromFunction1(value))
      
      inline def setOnMoveToSourceUndefined: Self = StObject.set(x, "onMoveToSource", js.undefined)
      
      inline def setOnMoveToTarget(value: /* e */ PickListEventParams => Unit): Self = StObject.set(x, "onMoveToTarget", js.Any.fromFunction1(value))
      
      inline def setOnMoveToTargetUndefined: Self = StObject.set(x, "onMoveToTarget", js.undefined)
      
      inline def setOnSourceFilterChange(value: /* e */ PickListEventParams => Unit): Self = StObject.set(x, "onSourceFilterChange", js.Any.fromFunction1(value))
      
      inline def setOnSourceFilterChangeUndefined: Self = StObject.set(x, "onSourceFilterChange", js.undefined)
      
      inline def setOnSourceSelectionChange(value: /* e */ PickListEventParams => Unit): Self = StObject.set(x, "onSourceSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSourceSelectionChangeUndefined: Self = StObject.set(x, "onSourceSelectionChange", js.undefined)
      
      inline def setOnTargetFilterChange(value: /* e */ PickListEventParams => Unit): Self = StObject.set(x, "onTargetFilterChange", js.Any.fromFunction1(value))
      
      inline def setOnTargetFilterChangeUndefined: Self = StObject.set(x, "onTargetFilterChange", js.undefined)
      
      inline def setOnTargetSelectionChange(value: /* e */ PickListEventParams => Unit): Self = StObject.set(x, "onTargetSelectionChange", js.Any.fromFunction1(value))
      
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
      
      inline def setSourceFilterPlaceholder(value: String): Self = StObject.set(x, "sourceFilterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSourceFilterPlaceholderUndefined: Self = StObject.set(x, "sourceFilterPlaceholder", js.undefined)
      
      inline def setSourceFilterTemplate(value: PickListFilterTemplateType): Self = StObject.set(x, "sourceFilterTemplate", value.asInstanceOf[js.Any])
      
      inline def setSourceFilterTemplateFunction1(value: /* options */ PickListFilterTemplateOptions => ReactNode): Self = StObject.set(x, "sourceFilterTemplate", js.Any.fromFunction1(value))
      
      inline def setSourceFilterTemplateUndefined: Self = StObject.set(x, "sourceFilterTemplate", js.undefined)
      
      inline def setSourceFilterValue(value: String): Self = StObject.set(x, "sourceFilterValue", value.asInstanceOf[js.Any])
      
      inline def setSourceFilterValueUndefined: Self = StObject.set(x, "sourceFilterValue", js.undefined)
      
      inline def setSourceHeader(value: ReactNode): Self = StObject.set(x, "sourceHeader", value.asInstanceOf[js.Any])
      
      inline def setSourceHeaderUndefined: Self = StObject.set(x, "sourceHeader", js.undefined)
      
      inline def setSourceItemTemplate(value: PickListItemTemplateType): Self = StObject.set(x, "sourceItemTemplate", value.asInstanceOf[js.Any])
      
      inline def setSourceItemTemplateFunction1(value: /* item */ Any => ReactNode): Self = StObject.set(x, "sourceItemTemplate", js.Any.fromFunction1(value))
      
      inline def setSourceItemTemplateUndefined: Self = StObject.set(x, "sourceItemTemplate", js.undefined)
      
      inline def setSourceSelection(value: Any): Self = StObject.set(x, "sourceSelection", value.asInstanceOf[js.Any])
      
      inline def setSourceSelectionUndefined: Self = StObject.set(x, "sourceSelection", js.undefined)
      
      inline def setSourceStyle(value: js.Object): Self = StObject.set(x, "sourceStyle", value.asInstanceOf[js.Any])
      
      inline def setSourceStyleUndefined: Self = StObject.set(x, "sourceStyle", js.undefined)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVarargs(value: Any*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTarget(value: js.Array[Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFilterPlaceholder(value: String): Self = StObject.set(x, "targetFilterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setTargetFilterPlaceholderUndefined: Self = StObject.set(x, "targetFilterPlaceholder", js.undefined)
      
      inline def setTargetFilterTemplate(value: PickListFilterTemplateType): Self = StObject.set(x, "targetFilterTemplate", value.asInstanceOf[js.Any])
      
      inline def setTargetFilterTemplateFunction1(value: /* options */ PickListFilterTemplateOptions => ReactNode): Self = StObject.set(x, "targetFilterTemplate", js.Any.fromFunction1(value))
      
      inline def setTargetFilterTemplateUndefined: Self = StObject.set(x, "targetFilterTemplate", js.undefined)
      
      inline def setTargetFilterValue(value: String): Self = StObject.set(x, "targetFilterValue", value.asInstanceOf[js.Any])
      
      inline def setTargetFilterValueUndefined: Self = StObject.set(x, "targetFilterValue", js.undefined)
      
      inline def setTargetHeader(value: ReactNode): Self = StObject.set(x, "targetHeader", value.asInstanceOf[js.Any])
      
      inline def setTargetHeaderUndefined: Self = StObject.set(x, "targetHeader", js.undefined)
      
      inline def setTargetItemTemplate(value: PickListItemTemplateType): Self = StObject.set(x, "targetItemTemplate", value.asInstanceOf[js.Any])
      
      inline def setTargetItemTemplateFunction1(value: /* item */ Any => ReactNode): Self = StObject.set(x, "targetItemTemplate", js.Any.fromFunction1(value))
      
      inline def setTargetItemTemplateUndefined: Self = StObject.set(x, "targetItemTemplate", js.undefined)
      
      inline def setTargetSelection(value: Any): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
      
      inline def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
      
      inline def setTargetStyle(value: js.Object): Self = StObject.set(x, "targetStyle", value.asInstanceOf[js.Any])
      
      inline def setTargetStyleUndefined: Self = StObject.set(x, "targetStyle", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: Any*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
}
