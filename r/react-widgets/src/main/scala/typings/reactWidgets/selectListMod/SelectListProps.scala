package typings.reactWidgets.selectListMod

import typings.react.mod.ReactType
import typings.reactWidgets.commonPropsMod.AutoFocus
import typings.reactWidgets.commonPropsMod.ReactWidgetsCommonProps
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectListProps
  extends ReactWidgetsCommonProps
     with AutoFocus {
  
  /**
    * Mark whether the widget is in a busy or loading state. If true the widget will display a
    * spinner gif, useful when loading data via an ajax call.
    * @default false
    */
  var busy: js.UndefOr[Boolean] = js.native
  
  /**
    * Provide an array of possible values for the SelectList. If an array of objects is
    * provided you should use the valueField and textField props, to specify which object
    * properties comprise the value field (such as an id) and the field used to label the item.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Default Value.
    */
  var defaultValue: js.UndefOr[js.Any | js.Array[_]] = js.native
  
  /**
    * Delay
    * @default 250
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Determines how to group the SelectList dropdown list. Providing a string will group the
    * data array by that property. You can also provide a 'function' which should return the
    * group value.
    */
  var groupBy: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, _])] = js.native
  
  /**
    * This component is used to render each option group, when groupBy is specified. By default
    * the groupBy value will be used.
    */
  var groupComponent: js.UndefOr[ReactType[_]] = js.native
  
  /**
    * This component is used to render each item in the SelectList. The default component
    * renders the text of the selected item (specified by textfield)
    */
  var itemComponent: js.UndefOr[ReactType[_]] = js.native
  
  /**
    * @default List
    */
  var listComponent: js.UndefOr[ReactType[_] | String] = js.native
  
  /**
    * An object of props that is passed directly to the underlying List component.
    */
  var listProps: js.UndefOr[js.Object] = js.native
  
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[SelectListMessages] = js.native
  
  /**
    * Whether or not the SelectList allows multiple selection or not. when false the SelectList
    * will render as a list of radio buttons, and checkboxes when true.
    */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /**
    * The HTML name attribute used to group checkboxes and radio buttons together.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Change event handler that is called when the value is changed. values will be an array
    * when multiple prop is set.
    */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Any | js.Array[_], Unit]] = js.native
  
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  
  /**
    * A handler called when focus shifts on the SelectList. Internally this is used to ensure
    * the focused item is in view. If you want to define your own "scrollTo" behavior or just
    * disable the default one specify an onMove handler. The handler is called with the
    * relevant DOM nodes needed to implement scroll behavior: the list element, the element
    * that is currently focused, and a focused value.
    */
  var onMove: js.UndefOr[
    js.Function3[/* list */ HTMLElement, /* focusedNode */ HTMLElement, /* focusedItem */ js.Any, Unit]
  ] = js.native
  
  /**
    * The HTML tabindex attribute, controls the order in which focus moves via the TAB key
    */
  var tabIndex: js.UndefOr[Double] = js.native
  
  /**
    * Specify which data item field to display in the SelectList and selected item. The
    * textField prop may also also used as to find an item in the list as you type. Providing
    * an accessor function allows for computed text values.
    */
  var textField: js.UndefOr[String | (js.Function1[/* dataItem */ js.Any, String])] = js.native
  
  /**
    * The current value or values of the SelectList. This can be an object (such as a member of
    * the data array) or a primitive value, hinted to by the valueField. The widget value does
    * not need to be in the data array; widgets can have values that are not in their list.
    */
  var value: js.UndefOr[js.Any | js.Array[_]] = js.native
  
  /**
    * A dataItem field name for uniquely identifying items in the data list. A valueField is
    * required when the value prop is not itself a dataItem. A valueField is useful when
    * specifying the selected item, by its id instead of using the model as the value.
    * When a valueField is not provided, the SelectList will use strict equality checks (===)
    * to locate the value in the data list.
    */
  var valueField: js.UndefOr[String] = js.native
}
object SelectListProps {
  
  @scala.inline
  def apply(): SelectListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectListProps]
  }
  
  @scala.inline
  implicit class SelectListPropsOps[Self <: SelectListProps] (val x: Self) extends AnyVal {
    
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
    def setBusy(value: Boolean): Self = this.set("busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusy: Self = this.set("busy", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: js.Any*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: js.Any | js.Array[_]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setGroupByFunction1(value: /* dataItem */ js.Any => _): Self = this.set("groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupBy(value: String | (js.Function1[/* dataItem */ js.Any, _])): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setGroupComponent(value: ReactType[_]): Self = this.set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupComponent: Self = this.set("groupComponent", js.undefined)
    
    @scala.inline
    def setItemComponent(value: ReactType[_]): Self = this.set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemComponent: Self = this.set("itemComponent", js.undefined)
    
    @scala.inline
    def setListComponent(value: ReactType[_] | String): Self = this.set("listComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListComponent: Self = this.set("listComponent", js.undefined)
    
    @scala.inline
    def setListProps(value: js.Object): Self = this.set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListProps: Self = this.set("listProps", js.undefined)
    
    @scala.inline
    def setMessages(value: SelectListMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* values */ js.Any | js.Array[_] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: /* event */ KeyboardEvent => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnMove(value: (/* list */ HTMLElement, /* focusedNode */ HTMLElement, /* focusedItem */ js.Any) => Unit): Self = this.set("onMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnMove: Self = this.set("onMove", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTextFieldFunction1(value: /* dataItem */ js.Any => String): Self = this.set("textField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextField(value: String | (js.Function1[/* dataItem */ js.Any, String])): Self = this.set("textField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextField: Self = this.set("textField", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Any | js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
}
