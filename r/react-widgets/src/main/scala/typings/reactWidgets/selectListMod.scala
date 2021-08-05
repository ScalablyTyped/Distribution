package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactType
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonProps
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectListMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-widgets/lib/SelectList", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[SelectListProps, ComponentState, js.Any] {
    def this(props: SelectListProps) = this()
    def this(props: SelectListProps, context: js.Any) = this()
  }
  @JSImport("react-widgets/lib/SelectList", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SelectListClass = js.native
  
  type SelectListClass = ComponentClass[SelectListProps, ComponentState]
  
  trait SelectListMessages extends StObject {
    
    /**
      * @default: "There are no items in this list"
      */
    var emptyList: js.UndefOr[String | (js.Function1[/* props */ SelectListProps, String])] = js.undefined
  }
  object SelectListMessages {
    
    inline def apply(): SelectListMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectListMessages]
    }
    
    extension [Self <: SelectListMessages](x: Self) {
      
      inline def setEmptyList(value: String | (js.Function1[/* props */ SelectListProps, String])): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      inline def setEmptyListFunction1(value: /* props */ SelectListProps => String): Self = StObject.set(x, "emptyList", js.Any.fromFunction1(value))
      
      inline def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
    }
  }
  
  trait SelectListProps
    extends StObject
       with ReactWidgetsCommonProps
       with AutoFocus {
    
    /**
      * Mark whether the widget is in a busy or loading state. If true the widget will display a
      * spinner gif, useful when loading data via an ajax call.
      * @default false
      */
    var busy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide an array of possible values for the SelectList. If an array of objects is
      * provided you should use the valueField and textField props, to specify which object
      * properties comprise the value field (such as an id) and the field used to label the item.
      */
    var data: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Default Value.
      */
    var defaultValue: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined
    
    /**
      * Delay
      * @default 250
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines how to group the SelectList dropdown list. Providing a string will group the
      * data array by that property. You can also provide a 'function' which should return the
      * group value.
      */
    var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, js.Any])] = js.undefined
    
    /**
      * This component is used to render each option group, when groupBy is specified. By default
      * the groupBy value will be used.
      */
    var groupComponent: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    /**
      * This component is used to render each item in the SelectList. The default component
      * renders the text of the selected item (specified by textfield)
      */
    var itemComponent: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    /**
      * @default List
      */
    var listComponent: js.UndefOr[ReactType[js.Any] | String] = js.undefined
    
    /**
      * An object of props that is passed directly to the underlying List component.
      */
    var listProps: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Object hash containing display text and/or text for screen readers. Use the messages
      * object to localize widget text and increase accessibility.
      */
    var messages: js.UndefOr[SelectListMessages] = js.undefined
    
    /**
      * Whether or not the SelectList allows multiple selection or not. when false the SelectList
      * will render as a list of radio buttons, and checkboxes when true.
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML name attribute used to group checkboxes and radio buttons together.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Change event handler that is called when the value is changed. values will be an array
      * when multiple prop is set.
      */
    var onChange: js.UndefOr[js.Function1[/* values */ js.Any | js.Array[js.Any], Unit]] = js.undefined
    
    /**
      * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
      */
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
    
    /**
      * The native onKeyPress event, called preventDefault will stop any custom behavior.
      */
    var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
    
    /**
      * A handler called when focus shifts on the SelectList. Internally this is used to ensure
      * the focused item is in view. If you want to define your own "scrollTo" behavior or just
      * disable the default one specify an onMove handler. The handler is called with the
      * relevant DOM nodes needed to implement scroll behavior: the list element, the element
      * that is currently focused, and a focused value.
      */
    var onMove: js.UndefOr[
        js.Function3[/* list */ HTMLElement, /* focusedNode */ HTMLElement, /* focusedItem */ js.Any, Unit]
      ] = js.undefined
    
    /**
      * The HTML tabindex attribute, controls the order in which focus moves via the TAB key
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify which data item field to display in the SelectList and selected item. The
      * textField prop may also also used as to find an item in the list as you type. Providing
      * an accessor function allows for computed text values.
      */
    var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.undefined
    
    /**
      * The current value or values of the SelectList. This can be an object (such as a member of
      * the data array) or a primitive value, hinted to by the valueField. The widget value does
      * not need to be in the data array; widgets can have values that are not in their list.
      */
    var value: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined
    
    /**
      * A dataItem field name for uniquely identifying items in the data list. A valueField is
      * required when the value prop is not itself a dataItem. A valueField is useful when
      * specifying the selected item, by its id instead of using the model as the value.
      * When a valueField is not provided, the SelectList will use strict equality checks (===)
      * to locate the value in the data list.
      */
    var valueField: js.UndefOr[String] = js.undefined
  }
  object SelectListProps {
    
    inline def apply(): SelectListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectListProps]
    }
    
    extension [Self <: SelectListProps](x: Self) {
      
      inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setDefaultValue(value: js.Any | js.Array[js.Any]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: js.Any*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setGroupBy(value: String | (js.Function1[/* dataItem */ js.Any, js.Any])): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByFunction1(value: /* dataItem */ js.Any => js.Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setGroupComponent(value: ReactType[js.Any]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setItemComponent(value: ReactType[js.Any]): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      inline def setItemComponentUndefined: Self = StObject.set(x, "itemComponent", js.undefined)
      
      inline def setListComponent(value: ReactType[js.Any] | String): Self = StObject.set(x, "listComponent", value.asInstanceOf[js.Any])
      
      inline def setListComponentUndefined: Self = StObject.set(x, "listComponent", js.undefined)
      
      inline def setListProps(value: js.Object): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      inline def setMessages(value: SelectListMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* values */ js.Any | js.Array[js.Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnMove(value: (/* list */ HTMLElement, /* focusedNode */ HTMLElement, /* focusedItem */ js.Any) => Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction3(value))
      
      inline def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTextField(value: String | (js.Function1[/* dataItem */ js.Any, String])): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
      
      inline def setTextFieldFunction1(value: /* dataItem */ js.Any => String): Self = StObject.set(x, "textField", js.Any.fromFunction1(value))
      
      inline def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
      
      inline def setValue(value: js.Any | js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type _To = js.Object & SelectListClass
  
  /* This means you don't have to write `^`, but can instead just say `selectListMod.foo` */
  override def _to: js.Object & SelectListClass = ^
}
