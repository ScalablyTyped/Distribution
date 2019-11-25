package typings.semanticDashUiDashReact.distCommonjsModulesAccordionAccordionPanelMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsModulesAccordionAccordionContentMod.AccordionContentProps
import typings.semanticDashUiDashReact.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictAccordionPanelProps extends js.Object {
  /** Whether or not the title is in the open state. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** A shorthand for Accordion.Content. */
  var content: js.UndefOr[SemanticShorthandItem[AccordionContentProps]] = js.undefined
  /** A panel index. */
  var index: js.UndefOr[Double | String] = js.undefined
  /**
    * Called when a panel title is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {AccordionTitleProps} data - All item props.
    */
  var onTitleClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      /* data */ AccordionTitleProps, 
      Unit
    ]
  ] = js.undefined
  /** A shorthand for Accordion.Title. */
  var title: js.UndefOr[SemanticShorthandItem[AccordionTitleProps]] = js.undefined
}

object StrictAccordionPanelProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandItem[AccordionContentProps] = null,
    index: Double | String = null,
    onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit = null,
    title: SemanticShorthandItem[AccordionTitleProps] = null
  ): StrictAccordionPanelProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAccordionPanelProps]
  }
}

