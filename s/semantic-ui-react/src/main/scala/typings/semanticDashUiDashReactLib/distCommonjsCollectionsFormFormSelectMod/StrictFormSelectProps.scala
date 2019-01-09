package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- semanticDashUiDashReactLib.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps because var conflicts: as, children, className, disabled, error, `inline`. Inlined content, control, label, required, `type`, width */ trait StrictFormSelectProps
  extends semanticDashUiDashReactLib.distCommonjsAddonsSelectSelectMod.StrictSelectProps {
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A FormField control prop. */
  var control: js.UndefOr[js.Any] = js.undefined
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

