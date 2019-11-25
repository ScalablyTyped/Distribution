package typings.puppeteer.puppeteerMod

import typings.puppeteer.puppeteerStrings.mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AXNode extends js.Object {
  /**
    * What kind of autocomplete is supported by a control.
    */
  var autocomplete: String
  /**
    * Whether the checkbox is checked, or "mixed".
    */
  var checked: Boolean | mixed
  /**
    * Child nodes of this node, if any.
    */
  var children: js.Array[AXNode]
  /**
    * An additional human readable description of the node.
    */
  var description: String
  /**
    * Whether the node is disabled.
    */
  var disabled: Boolean
  /**
    * Whether the node is expanded or collapsed.
    */
  var expanded: Boolean
  /**
    * Whether the node is focused.
    */
  var focused: Boolean
  /**
    * What kind of popup is currently being shown for a node.
    */
  var haspopup: String
  /**
    * Whether and in what way this node's value is invalid.
    */
  var invalid: String
  /**
    * Keyboard shortcuts associated with this node.
    */
  var keyshortcuts: String
  /**
    * The level of a heading.
    */
  var level: Double
  /**
    * Whether the node is modal.
    */
  var modal: Boolean
  /**
    * Whether the node text input supports multiline.
    */
  var multiline: Boolean
  /**
    * Whether more than one child can be selected.
    */
  var multiselectable: Boolean
  /**
    * A human readable name for the node.
    */
  var name: String
  /**
    * Whether the node is oriented horizontally or vertically.
    */
  var orientation: String
  /**
    * Whether the toggle button is checked, or "mixed".
    */
  var pressed: Boolean | mixed
  /**
    * Whether the node is read only.
    */
  var readonly: Boolean
  /**
    * Whether the node is required.
    */
  var required: Boolean
  /**
    * The role.
    */
  var role: String
  /**
    * A human readable alternative to the role.
    */
  var roledescription: String
  /**
    * Whether the node is selected in its parent node.
    */
  var selected: Boolean
  /**
    * The current value of the node.
    */
  var value: String | Double
  /**
    * The maximum value in a node.
    */
  var valuemax: Double
  /**
    * The minimum value in a node.
    */
  var valuemin: Double
  /**
    * A description of the current value.
    */
  var valuetext: String
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
}

