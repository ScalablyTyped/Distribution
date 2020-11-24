package typings.reactNativeRssParser.anon

import typings.reactNativeRssParser.mod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authors extends js.Object {
  
  var authors: Maybe[js.Array[Name]] = js.native
  
  var block: Maybe[String] = js.native
  
  var duration: String = js.native
  
  var explicit: String = js.native
  
  var image: Maybe[String] = js.native
  
  var isClosedCaptioned: Maybe[String] = js.native
  
  var order: Maybe[String] = js.native
  
  var subtitle: String = js.native
  
  var summary: Maybe[String] = js.native
}
object Authors {
  
  @scala.inline
  def apply(duration: String, explicit: String, subtitle: String): Authors = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authors]
  }
  
  @scala.inline
  implicit class AuthorsOps[Self <: Authors] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicit(value: String): Self = this.set("explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorsVarargs(value: Name*): Self = this.set("authors", js.Array(value :_*))
    
    @scala.inline
    def setAuthors(value: Maybe[js.Array[Name]]): Self = this.set("authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    
    @scala.inline
    def setBlock(value: Maybe[String]): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setImage(value: Maybe[String]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setIsClosedCaptioned(value: Maybe[String]): Self = this.set("isClosedCaptioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClosedCaptioned: Self = this.set("isClosedCaptioned", js.undefined)
    
    @scala.inline
    def setOrder(value: Maybe[String]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setSummary(value: Maybe[String]): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
