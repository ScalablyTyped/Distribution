package typings.reactMdMedia.mediaContainerMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContainerProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Boolean if any media element children should be updated to be responsive.
    */
  var auto: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the media container should have a `width: 100%;` applied.
    */
  var fullWidth: js.UndefOr[Boolean] = js.native
  /**
    * An optional aspect ratio height to enforce. This **must** be used alongside
    * the `width` prop.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * An optional aspect ratio width to enforce. This **must** be used alongside
    * the `height` prop.
    */
  var width: js.UndefOr[Double] = js.native
}

object MediaContainerProps {
  @scala.inline
  def apply(): MediaContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaContainerProps]
  }
  @scala.inline
  implicit class MediaContainerPropsOps[Self <: MediaContainerProps] (val x: Self) extends AnyVal {
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
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

