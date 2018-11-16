package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictFormFieldProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /**
     * A form control component (i.e. Dropdown) or HTML tagName (i.e. 'input').
     * Extra FormField props are passed to the control component.
     * Mutually exclusive with children.
     */
  var control: js.UndefOr[js.Any] = js.undefined
  /** Individual fields may be disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Individual fields may display an error state. */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /** A field can have its label next to instead of above it. */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** Mutually exclusive with children. */
  var label: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlLabelProps]
  ] = js.undefined
  /** A field can show that input is mandatory.  Requires a label. */
  var required: js.UndefOr[js.Any] = js.undefined
  /** Passed to the control component (i.e. <input type='password' />) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** A field can specify its width in grid columns */
  var width: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
}

