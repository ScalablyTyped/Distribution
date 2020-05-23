package typings.semanticUiReact.accordionAccordionAccordionMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.accordionPanelMod.AccordionPanelProps
import typings.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictAccordionAccordionProps extends js.Object {
  /** Index of the currently active panel. */
  var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Initial activeIndex value. */
  var defaultActiveIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /** Only allow one panel open at a time. */
  var exclusive: js.UndefOr[Boolean] = js.undefined
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
  /** Shorthand array of props for Accordion. */
  var panels: js.UndefOr[SemanticShorthandCollection[AccordionPanelProps]] = js.undefined
}

object StrictAccordionAccordionProps {
  @scala.inline
  def apply(
    activeIndex: Double | js.Array[Double] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    defaultActiveIndex: Double | js.Array[Double] = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    onTitleClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit = null,
    panels: SemanticShorthandCollection[AccordionPanelProps] = null
  ): StrictAccordionAccordionProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction2(onTitleClick))
    if (panels != null) __obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAccordionAccordionProps]
  }
}

