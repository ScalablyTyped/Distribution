package typings.stringStripHtml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag extends js.Object {
  
  var attributes: js.Array[TagAttribute] = js.native
  
  var lastClosingBracketAt: Double = js.native
  
  var lastOpeningBracketAt: Double = js.native
  
  var leftOuterWhitespace: Double = js.native
  
  var name: String = js.native
  
  var nameContainsLetters: Boolean = js.native
  
  var nameEnds: Double = js.native
  
  var nameStarts: Double = js.native
  
  var onlyPlausible: Boolean = js.native
  
  var slashPresent: Boolean = js.native
}
object Tag {
  
  @scala.inline
  def apply(
    attributes: js.Array[TagAttribute],
    lastClosingBracketAt: Double,
    lastOpeningBracketAt: Double,
    leftOuterWhitespace: Double,
    name: String,
    nameContainsLetters: Boolean,
    nameEnds: Double,
    nameStarts: Double,
    onlyPlausible: Boolean,
    slashPresent: Boolean
  ): Tag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], lastClosingBracketAt = lastClosingBracketAt.asInstanceOf[js.Any], lastOpeningBracketAt = lastOpeningBracketAt.asInstanceOf[js.Any], leftOuterWhitespace = leftOuterWhitespace.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameContainsLetters = nameContainsLetters.asInstanceOf[js.Any], nameEnds = nameEnds.asInstanceOf[js.Any], nameStarts = nameStarts.asInstanceOf[js.Any], onlyPlausible = onlyPlausible.asInstanceOf[js.Any], slashPresent = slashPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: TagAttribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[TagAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastClosingBracketAt(value: Double): Self = this.set("lastClosingBracketAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastOpeningBracketAt(value: Double): Self = this.set("lastOpeningBracketAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftOuterWhitespace(value: Double): Self = this.set("leftOuterWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsLetters(value: Boolean): Self = this.set("nameContainsLetters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameEnds(value: Double): Self = this.set("nameEnds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameStarts(value: Double): Self = this.set("nameStarts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyPlausible(value: Boolean): Self = this.set("onlyPlausible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlashPresent(value: Boolean): Self = this.set("slashPresent", value.asInstanceOf[js.Any])
  }
}
