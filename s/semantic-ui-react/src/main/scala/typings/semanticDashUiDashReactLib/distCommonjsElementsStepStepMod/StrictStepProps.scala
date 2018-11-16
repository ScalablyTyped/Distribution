package typings
package semanticDashUiDashReactLib.distCommonjsElementsStepStepMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictStepProps extends js.Object {
  /** A step can be highlighted as active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A step can show that a user has completed it. */
  var completed: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Shorthand for StepDescription. */
  var description: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsElementsStepStepDescriptionMod.StepDescriptionProps
    ]
  ] = js.undefined
  /** Show that the Loader is inactive. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Render as an `a` tag instead of a `div` and adds the href attribute. */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for Icon. */
  var icon: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps]
  ] = js.undefined
  /** A step can be link. */
  var link: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Called on click. When passed, the component will render as an `a`.
     * tag by default instead of a `div`.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement], 
      /* data */ StepProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A step can show a ordered sequence of steps. Passed from StepGroup. */
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for StepTitle. */
  var title: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsStepStepTitleMod.StepTitleProps]
  ] = js.undefined
}

