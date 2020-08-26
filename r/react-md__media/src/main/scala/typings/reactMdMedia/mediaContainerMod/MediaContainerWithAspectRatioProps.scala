package typings.reactMdMedia.mediaContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaContainerWithAspectRatioProps extends MediaContainerProps {
  @JSName("height")
  var height_MediaContainerWithAspectRatioProps: Double = js.native
  @JSName("width")
  var width_MediaContainerWithAspectRatioProps: Double = js.native
}

object MediaContainerWithAspectRatioProps {
  @scala.inline
  def apply(height: Double, width: Double): MediaContainerWithAspectRatioProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaContainerWithAspectRatioProps]
  }
  @scala.inline
  implicit class MediaContainerWithAspectRatioPropsOps[Self <: MediaContainerWithAspectRatioProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

