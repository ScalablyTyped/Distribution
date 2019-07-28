package typings.semanticDashUiDashReact.distCommonjsElementsStepStepContentMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepDescriptionMod.StepDescriptionProps
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepTitleMod.StepTitleProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictStepContentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Shorthand for StepDescription. */
  var description: js.UndefOr[SemanticShorthandItem[StepDescriptionProps]] = js.undefined
  /** Shorthand for StepTitle. */
  var title: js.UndefOr[SemanticShorthandItem[StepTitleProps]] = js.undefined
}

object StrictStepContentProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[StepDescriptionProps] = null,
    title: SemanticShorthandItem[StepTitleProps] = null
  ): StrictStepContentProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictStepContentProps]
  }
}

