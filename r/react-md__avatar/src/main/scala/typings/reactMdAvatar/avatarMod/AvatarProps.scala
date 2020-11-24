package typings.reactMdAvatar.avatarMod

import typings.react.mod.HTMLAttributeReferrerPolicy
import typings.react.mod.HTMLAttributes
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.std.HTMLImageElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarProps extends HTMLAttributes[HTMLSpanElement] {
  
  /**
    * An optional alt tag to display on the `<img>` when the `src` prop is also
    * applied.
    *
    * For accessibility and screen readers, you normally do not want to actually
    * provide this prop. This should only be used if the `Avatar` is not
    * accompanied by some other component or main content as it will be extra
    * noise for screen readers.
    */
  var alt: js.UndefOr[String] = js.native
  
  /**
    * An optional object of image props and ref that can be used to create an
    * image within the `Avatar`. This can be useful to add a custom `style`
    * or`className` to the `<img>` element if that additional customization is
    * needed.
    *
    * Note: The values in this object will override the `src`, `alt`, and
    * `referrerPolicy` root level avatar props if they exist on this object.
    *
    * @since 2.2.0
    */
  var imgProps: js.UndefOr[PropsWithRef[ImgAttributes, HTMLImageElement]] = js.native
  
  /**
    * An optional `referrerPolicy` to provide to the `<img>` element if the `src`
    * or `imgProps` props are provided.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#attr-referrerpolicy
    *
    * @since 2.2.0
    */
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.native
  
  /**
    * This should be an image `src` attribute to create an avatar from. When this
    * prop is defined, you should not add any children to the avatar as the
    * positioning will break.
    */
  var src: js.UndefOr[String] = js.native
}
object AvatarProps {
  
  @scala.inline
  def apply(): AvatarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarProps]
  }
  
  @scala.inline
  implicit class AvatarPropsOps[Self <: AvatarProps] (val x: Self) extends AnyVal {
    
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setImgProps(value: PropsWithRef[ImgAttributes, HTMLImageElement]): Self = this.set("imgProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgProps: Self = this.set("imgProps", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
}
