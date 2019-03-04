package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AXNode extends js.Object {
  /**
    * What kind of autocomplete is supported by a control.
    */
  var autocomplete: java.lang.String
  /**
    * Whether the checkbox is checked, or "mixed".
    */
  var checked: scala.Boolean | puppeteerLib.puppeteerLibStrings.mixed
  /**
    * Child nodes of this node, if any.
    */
  var children: js.Array[AXNode]
  /**
    * An additional human readable description of the node.
    */
  var description: java.lang.String
  /**
    * Whether the node is disabled.
    */
  var disabled: scala.Boolean
  /**
    * Whether the node is expanded or collapsed.
    */
  var expanded: scala.Boolean
  /**
    * Whether the node is focused.
    */
  var focused: scala.Boolean
  /**
    * What kind of popup is currently being shown for a node.
    */
  var haspopup: java.lang.String
  /**
    * Whether and in what way this node's value is invalid.
    */
  var invalid: java.lang.String
  /**
    * Keyboard shortcuts associated with this node.
    */
  var keyshortcuts: java.lang.String
  /**
    * The level of a heading.
    */
  var level: scala.Double
  /**
    * Whether the node is modal.
    */
  var modal: scala.Boolean
  /**
    * Whether the node text input supports multiline.
    */
  var multiline: scala.Boolean
  /**
    * Whether more than one child can be selected.
    */
  var multiselectable: scala.Boolean
  /**
    * A human readable name for the node.
    */
  var name: java.lang.String
  /**
    * Whether the node is oriented horizontally or vertically.
    */
  var orientation: java.lang.String
  /**
    * Whether the toggle button is checked, or "mixed".
    */
  var pressed: scala.Boolean | puppeteerLib.puppeteerLibStrings.mixed
  /**
    * Whether the node is read only.
    */
  var readonly: scala.Boolean
  /**
    * Whether the node is required.
    */
  var required: scala.Boolean
  /**
    * The role.
    */
  var role: java.lang.String
  /**
    * A human readable alternative to the role.
    */
  var roledescription: java.lang.String
  /**
    * Whether the node is selected in its parent node.
    */
  var selected: scala.Boolean
  /**
    * The current value of the node.
    */
  var value: java.lang.String | scala.Double
  /**
    * The maximum value in a node.
    */
  var valuemax: scala.Double
  /**
    * The minimum value in a node.
    */
  var valuemin: scala.Double
  /**
    * A description of the current value.
    */
  var valuetext: java.lang.String
}

object AXNode {
  @scala.inline
  def apply(
    autocomplete: java.lang.String,
    checked: scala.Boolean | puppeteerLib.puppeteerLibStrings.mixed,
    children: js.Array[AXNode],
    description: java.lang.String,
    disabled: scala.Boolean,
    expanded: scala.Boolean,
    focused: scala.Boolean,
    haspopup: java.lang.String,
    invalid: java.lang.String,
    keyshortcuts: java.lang.String,
    level: scala.Double,
    modal: scala.Boolean,
    multiline: scala.Boolean,
    multiselectable: scala.Boolean,
    name: java.lang.String,
    orientation: java.lang.String,
    pressed: scala.Boolean | puppeteerLib.puppeteerLibStrings.mixed,
    readonly: scala.Boolean,
    required: scala.Boolean,
    role: java.lang.String,
    roledescription: java.lang.String,
    selected: scala.Boolean,
    value: java.lang.String | scala.Double,
    valuemax: scala.Double,
    valuemin: scala.Double,
    valuetext: java.lang.String
  ): AXNode = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, checked = checked.asInstanceOf[js.Any], children = children, description = description, disabled = disabled, expanded = expanded, focused = focused, haspopup = haspopup, invalid = invalid, keyshortcuts = keyshortcuts, level = level, modal = modal, multiline = multiline, multiselectable = multiselectable, name = name, orientation = orientation, pressed = pressed.asInstanceOf[js.Any], readonly = readonly, required = required, role = role, roledescription = roledescription, selected = selected, value = value.asInstanceOf[js.Any], valuemax = valuemax, valuemin = valuemin, valuetext = valuetext)
  
    __obj.asInstanceOf[AXNode]
  }
}

