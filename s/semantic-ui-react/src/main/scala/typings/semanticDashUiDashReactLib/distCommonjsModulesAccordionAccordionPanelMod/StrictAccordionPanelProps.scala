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

object StrictAccordionPanelProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionContentMod.AccordionContentProps
    ] = null,
    index: scala.Double | java.lang.String = null,
    onTitleClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps, 
      scala.Unit
    ] = null,
    title: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps
    ] = null
  ): StrictAccordionPanelProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(onTitleClick)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAccordionPanelProps]
  }
}

