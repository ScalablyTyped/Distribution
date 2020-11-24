package typings.reactYoutubeEmbed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YouTubeEmbedProps extends js.Object {
  
  var appendSrc: js.UndefOr[String] = js.native
  
  var aspectRatio: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var prependSrc: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object YouTubeEmbedProps {
  
  @scala.inline
  def apply(id: String): YouTubeEmbedProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubeEmbedProps]
  }
  
  @scala.inline
  implicit class YouTubeEmbedPropsOps[Self <: YouTubeEmbedProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendSrc(value: String): Self = this.set("appendSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendSrc: Self = this.set("appendSrc", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: String): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setPrependSrc(value: String): Self = this.set("prependSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrependSrc: Self = this.set("prependSrc", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
