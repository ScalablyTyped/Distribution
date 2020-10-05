package typings.reactNative.mod

import typings.reactNative.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageLoadEventData extends ImageLoadEventDataAndroid {
  var source: Url = js.native
}

object ImageLoadEventData {
  @scala.inline
  def apply(source: Url): ImageLoadEventData = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoadEventData]
  }
  @scala.inline
  implicit class ImageLoadEventDataOps[Self <: ImageLoadEventData] (val x: Self) extends AnyVal {
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
    def setSource(value: Url): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

