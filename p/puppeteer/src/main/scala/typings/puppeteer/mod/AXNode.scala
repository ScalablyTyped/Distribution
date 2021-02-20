package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.mixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AXNode extends StObject {
  
  /**
    * What kind of autocomplete is supported by a control.
    */
  var autocomplete: String = js.native
  
  /**
    * Whether the checkbox is checked, or "mixed".
    */
  var checked: Boolean | mixed = js.native
  
  /**
    * Child nodes of this node, if any.
    */
  var children: js.Array[AXNode] = js.native
  
  /**
    * An additional human readable description of the node.
    */
  var description: String = js.native
  
  /**
    * Whether the node is disabled.
    */
  var disabled: Boolean = js.native
  
  /**
    * Whether the node is expanded or collapsed.
    */
  var expanded: Boolean = js.native
  
  /**
    * Whether the node is focused.
    */
  var focused: Boolean = js.native
  
  /**
    * What kind of popup is currently being shown for a node.
    */
  var haspopup: String = js.native
  
  /**
    * Whether and in what way this node's value is invalid.
    */
  var invalid: String = js.native
  
  /**
    * Keyboard shortcuts associated with this node.
    */
  var keyshortcuts: String = js.native
  
  /**
    * The level of a heading.
    */
  var level: Double = js.native
  
  /**
    * Whether the node is modal.
    */
  var modal: Boolean = js.native
  
  /**
    * Whether the node text input supports multiline.
    */
  var multiline: Boolean = js.native
  
  /**
    * Whether more than one child can be selected.
    */
  var multiselectable: Boolean = js.native
  
  /**
    * A human readable name for the node.
    */
  var name: String = js.native
  
  /**
    * Whether the node is oriented horizontally or vertically.
    */
  var orientation: String = js.native
  
  /**
    * Whether the toggle button is checked, or "mixed".
    */
  var pressed: Boolean | mixed = js.native
  
  /**
    * Whether the node is read only.
    */
  var readonly: Boolean = js.native
  
  /**
    * Whether the node is required.
    */
  var required: Boolean = js.native
  
  /**
    * The role.
    */
  var role: String = js.native
  
  /**
    * A human readable alternative to the role.
    */
  var roledescription: String = js.native
  
  /**
    * Whether the node is selected in its parent node.
    */
  var selected: Boolean = js.native
  
  /**
    * The current value of the node.
    */
  var value: String | Double = js.native
  
  /**
    * The maximum value in a node.
    */
  var valuemax: Double = js.native
  
  /**
    * The minimum value in a node.
    */
  var valuemin: Double = js.native
  
  /**
    * A description of the current value.
    */
  var valuetext: String = js.native
}
object AXNode {
  
  @scala.inline
  def apply(
    autocomplete: String,
    checked: Boolean | mixed,
    children: js.Array[AXNode],
    description: String,
    disabled: Boolean,
    expanded: Boolean,
    focused: Boolean,
    haspopup: String,
    invalid: String,
    keyshortcuts: String,
    level: Double,
    modal: Boolean,
    multiline: Boolean,
    multiselectable: Boolean,
    name: String,
    orientation: String,
    pressed: Boolean | mixed,
    readonly: Boolean,
    required: Boolean,
    role: String,
    roledescription: String,
    selected: Boolean,
    value: String | Double,
    valuemax: Double,
    valuemin: Double,
    valuetext: String
  ): AXNode = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], haspopup = haspopup.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keyshortcuts = keyshortcuts.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], multiselectable = multiselectable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], roledescription = roledescription.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valuemax = valuemax.asInstanceOf[js.Any], valuemin = valuemin.asInstanceOf[js.Any], valuetext = valuetext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXNode]
  }
  
  @scala.inline
  implicit class AXNodeMutableBuilder[Self <: AXNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecked(value: Boolean | mixed): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[AXNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: AXNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaspopup(value: String): Self = StObject.set(x, "haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyshortcuts(value: String): Self = StObject.set(x, "keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselectable(value: Boolean): Self = StObject.set(x, "multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressed(value: Boolean | mixed): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoledescription(value: String): Self = StObject.set(x, "roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuemax(value: Double): Self = StObject.set(x, "valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuemin(value: Double): Self = StObject.set(x, "valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuetext(value: String): Self = StObject.set(x, "valuetext", value.asInstanceOf[js.Any])
  }
}
