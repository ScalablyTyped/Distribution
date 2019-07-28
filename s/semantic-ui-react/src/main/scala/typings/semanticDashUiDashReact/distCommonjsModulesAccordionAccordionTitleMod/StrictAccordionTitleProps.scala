package typings.semanticDashUiDashReact.distCommonjsModulesAccordionAccordionTitleMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictAccordionTitleProps extends js.Object {
  /** Whether or not the title is in the open state. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Shorthand for Icon. */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
  /** AccordionTitle index inside Accordion. */
  var index: js.UndefOr[Double | String] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      /* data */ AccordionTitleProps, 
      Unit
    ]
  ] = js.undefined
}

object StrictAccordionTitleProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    icon: SemanticShorthandItem[IconProps] = null,
    index: Double | String = null,
    onClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit = null
  ): StrictAccordionTitleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    __obj.asInstanceOf[StrictAccordionTitleProps]
  }
}

