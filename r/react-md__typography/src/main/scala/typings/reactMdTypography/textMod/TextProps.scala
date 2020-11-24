package typings.reactMdTypography.textMod

import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdTypography.anon.ClassName
import typings.reactMdTypography.reactMdTypographyStrings.bottom
import typings.reactMdTypography.reactMdTypographyStrings.initial
import typings.reactMdTypography.reactMdTypographyStrings.none
import typings.reactMdTypography.reactMdTypographyStrings.top
import typings.reactMdUtils.typesTypesMod.ClassNameCloneableChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextProps extends HTMLAttributes[TextElement] {
  
  /**
    * An optional text alignment to apply.
    */
  var align: js.UndefOr[TextAlign] = js.native
  
  /**
    * Either a child render function or a react node. If this is not the child
    * render function, a different wrapper component can be provided using the
    * `component` prop.
    */
  @JSName("children")
  var children_TextProps: js.UndefOr[ReactNode | ClassNameCloneableChild[js.Object] | TextRenderFunction] = js.native
  
  /**
    * An optional text color to apply. Unline normal theme colors, these will
    * reflect the `text-secondary-on-background` and `text-hint-on-background`
    * instead of the primary or secondary theme colors.
    */
  @JSName("color")
  var color_TextProps: js.UndefOr[TextColor] = js.native
  
  /**
    * The component to render as when the children are not a render function. If
    * this prop is omitted, the component will be determined by the `type` prop
    * where:
    *
    * - `"headline-1" -> <h1>`
    * - `"headline-2" -> <h2>`
    * - `"headline-3" -> <h3>`
    * - `"headline-4" -> <h4>`
    * - `"headline-5" -> <h5>`
    * - `"headline-6" -> <h6>`
    * - `"subtitle-1" -> <h5>`
    * - `"subtitle-2" -> <h6>`
    * - `"body-1"     -> <p>`
    * - `"body-2"     -> <p>`
    * - `"caption"    -> <caption>`
    * - `"overline"   -> <span>`
    * - `"button"     -> <button>`
    *
    */
  var component: js.UndefOr[ElementType[_] | Null] = js.native
  
  /**
    * An optional text decoration to apply.
    */
  var decoration: js.UndefOr[TextDecoration] = js.native
  
  /**
    * An optional font-style to apply.
    */
  var fontStyle: js.UndefOr[FontStyle] = js.native
  
  /**
    * Since the typography within react-md tries to not modify base elements, the
    * default margin applied to heading tags (h1-h6) and paragraph (p) might have
    * large margin that you don't want applied when using this component. You can
    * disable:
    *
    * - only the top margin by setting this prop to `"bottom"`
    * - only the bottom margin by setting this prop to `"top"`
    * - top and bottom margin by setting this prop to `"none"`
    * - or keep the initial behavior: `"initial"`
    */
  var margin: js.UndefOr[initial | none | top | bottom] = js.native
  
  /**
    * An optional text transformation to apply.
    */
  var transform: js.UndefOr[TextTransform] = js.native
  
  /**
    * One of the material design typography text styles. This is used to generate
    * a className that can be applied to any element and have the correct
    * typography.
    */
  var `type`: js.UndefOr[TextTypes] = js.native
  
  /**
    * An optional font-weight to apply.
    */
  var weight: js.UndefOr[TextWeight] = js.native
}
object TextProps {
  
  @scala.inline
  def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  @scala.inline
  implicit class TextPropsOps[Self <: TextProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: TextAlign): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ ClassName => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactNode | ClassNameCloneableChild[js.Object] | TextRenderFunction): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setColor(value: TextColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComponent(value: ElementType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setComponentNull: Self = this.set("component", null)
    
    @scala.inline
    def setDecoration(value: TextDecoration): Self = this.set("decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoration: Self = this.set("decoration", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setMargin(value: initial | none | top | bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setTransform(value: TextTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setType(value: TextTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWeight(value: TextWeight): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
