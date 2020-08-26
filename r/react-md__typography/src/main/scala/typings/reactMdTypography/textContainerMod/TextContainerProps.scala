package typings.reactMdTypography.textContainerMod

import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdTypography.anon.ClassName
import typings.reactMdUtils.typesTypesMod.ClassNameCloneableChild
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextContainerProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Either a child render function or a react node. If this is not the child
    * render function, a different wrapper component can be provided using the
    * `component` prop.
    */
  @JSName("children")
  var children_TextContainerProps: js.UndefOr[ReactNode | ClassNameCloneableChild[js.Object] | TextContainerRenderFunction] = js.native
  /**
    * Boolean if the `className` should be cloned into the `children` for this
    * component.
    *
    * Note: This will only work if the child component passed the `className`
    * down to to the DOM element.
    */
  @JSName("clone")
  var clone_FTextContainerProps: js.UndefOr[Boolean] = js.native
  /**
    * The component to render as. By default this will just be a div, but
    * anything can be provided.
    */
  var component: js.UndefOr[ElementType[_]] = js.native
  /**
    * The size for the text container. This can usually just be left at the
    * default of `"auto"` since it will automatically transition between
    * `"mobile"` and `"desktop"` based on media queries.  However, you can also
    * manually specify `"mobile"` or `"desktop"` if needed.
    */
  var size: js.UndefOr[TextContainerSize] = js.native
}

object TextContainerProps {
  @scala.inline
  def apply(): TextContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextContainerProps]
  }
  @scala.inline
  implicit class TextContainerPropsOps[Self <: TextContainerProps] (val x: Self) extends AnyVal {
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
    def setChildrenFunction1(value: /* props */ ClassName => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ReactNode | ClassNameCloneableChild[js.Object] | TextContainerRenderFunction): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setComponent(value: ElementType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setSize(value: TextContainerSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

