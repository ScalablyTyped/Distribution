package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait ImageToken extends ContentToken {
  /**
    * Image alt.
    */
  var alt: String = js.native
  /**
    * Image url.
    */
  var src: String = js.native
  /**
    * Image title.
    */
  var title: String = js.native
  @JSName("type")
  var type_ImageToken: image = js.native
}

object ImageToken {
  @scala.inline
  def apply(alt: String, level: Double, src: String, title: String, `type`: image): ImageToken = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageToken]
  }
  @scala.inline
  implicit class ImageTokenOps[Self <: ImageToken] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: image): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

