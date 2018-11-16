package typings
package semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictAccordionAccordionProps extends js.Object {
  /** Index of the currently active panel. */
  var activeIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Initial activeIndex value. */
  var defaultActiveIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /** Only allow one panel open at a time. */
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Called when a panel title is clicked.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {AccordionTitleProps} data - All item props.
     */
  var onTitleClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Shorthand array of props for Accordion. */
  var panels: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionPanelMod.AccordionPanelProps
    ]
  ] = js.undefined
}

