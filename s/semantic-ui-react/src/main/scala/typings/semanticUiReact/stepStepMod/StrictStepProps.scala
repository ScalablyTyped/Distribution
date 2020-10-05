package typings.semanticUiReact.stepStepMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.stepDescriptionMod.StepDescriptionProps
import typings.semanticUiReact.stepTitleMod.StepTitleProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictStepProps extends js.Object {
  /** A step can be highlighted as active. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A step can show that a user has completed it. */
  var completed: js.UndefOr[Boolean] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Shorthand for StepDescription. */
  var description: js.UndefOr[SemanticShorthandItem[StepDescriptionProps]] = js.native
  /** Show that the Loader is inactive. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Render as an `a` tag instead of a `div` and adds the href attribute. */
  var href: js.UndefOr[String] = js.native
  /** Shorthand for Icon. */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
  /** A step can be link. */
  var link: js.UndefOr[Boolean] = js.native
  /**
    * Called on click. When passed, the component will render as an `a`.
    * tag by default instead of a `div`.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ StepProps, 
      Unit
    ]
  ] = js.native
  /** A step can show a ordered sequence of steps. Passed from StepGroup. */
  var ordered: js.UndefOr[Boolean] = js.native
  /** Shorthand for StepTitle. */
  var title: js.UndefOr[SemanticShorthandItem[StepTitleProps]] = js.native
}

object StrictStepProps {
  @scala.inline
  def apply(): StrictStepProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictStepProps]
  }
  @scala.inline
  implicit class StrictStepPropsOps[Self <: StrictStepProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCompleted(value: Boolean): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDescriptionFunction3(
      value: (/* component */ ReactType[StepDescriptionProps], StepDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("description", js.Any.fromFunction3(value))
    @scala.inline
    def setDescription(value: SemanticShorthandItem[StepDescriptionProps]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setIconFunction3(
      value: (/* component */ ReactType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def setIcon(value: SemanticShorthandItem[IconProps]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLink(value: Boolean): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setOnClick(value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ StepProps) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
    @scala.inline
    def setTitleFunction3(
      value: (/* component */ ReactType[StepTitleProps], StepTitleProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("title", js.Any.fromFunction3(value))
    @scala.inline
    def setTitle(value: SemanticShorthandItem[StepTitleProps]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

