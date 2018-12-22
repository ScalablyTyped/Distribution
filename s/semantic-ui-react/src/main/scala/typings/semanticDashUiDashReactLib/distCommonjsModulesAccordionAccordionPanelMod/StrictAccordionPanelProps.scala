package typings
package semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictAccordionPanelProps extends js.Object {
  /** Whether or not the title is in the open state. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** A shorthand for Accordion.Content. */
  var content: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionContentMod.AccordionContentProps
    ]
  ] = js.undefined
  /** A panel index. */
  var index: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
     * Called when a panel title is clicked.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {AccordionTitleProps} data - All item props.
     */
  var onTitleClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A shorthand for Accordion.Title. */
  var title: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps
    ]
  ] = js.undefined
}

