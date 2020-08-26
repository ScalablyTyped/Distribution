package typings.reactToolbox.cardMediaMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.square
import typings.reactToolbox.reactToolboxStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardMediaProps
  extends Props
     with /**
  * Additional properties passed to inner input element.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Forces a 16:9 or 1:1 aspect ratio respectively. Unset, the media area will have a flexible height.
    */
  var aspectRatio: js.UndefOr[wide | square] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Sets the background color.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Creates a dark overlay underneath the child components.
    */
  var contentOverlay: js.UndefOr[Boolean] = js.native
  /**
    * Can be used instead of children. Accepts an element or a URL string.
    */
  var image: js.UndefOr[ReactNode] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[CardMediaTheme] = js.native
}

object CardMediaProps {
  @scala.inline
  def apply(): CardMediaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardMediaProps]
  }
  @scala.inline
  implicit class CardMediaPropsOps[Self <: CardMediaProps] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: wide | square): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContentOverlay(value: Boolean): Self = this.set("contentOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentOverlay: Self = this.set("contentOverlay", js.undefined)
    @scala.inline
    def setImage(value: ReactNode): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setTheme(value: CardMediaTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

