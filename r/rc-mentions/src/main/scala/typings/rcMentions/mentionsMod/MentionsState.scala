package typings.rcMentions.mentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MentionsState extends js.Object {
  
  var activeIndex: Double = js.native
  
  var isFocus: Boolean = js.native
  
  var measureLocation: Double = js.native
  
  var measurePrefix: String = js.native
  
  var measureText: String | Null = js.native
  
  var measuring: Boolean = js.native
  
  var value: String = js.native
}
object MentionsState {
  
  @scala.inline
  def apply(
    activeIndex: Double,
    isFocus: Boolean,
    measureLocation: Double,
    measurePrefix: String,
    measuring: Boolean,
    value: String
  ): MentionsState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], measureLocation = measureLocation.asInstanceOf[js.Any], measurePrefix = measurePrefix.asInstanceOf[js.Any], measuring = measuring.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionsState]
  }
  
  @scala.inline
  implicit class MentionsStateOps[Self <: MentionsState] (val x: Self) extends AnyVal {
    
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocus(value: Boolean): Self = this.set("isFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureLocation(value: Double): Self = this.set("measureLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurePrefix(value: String): Self = this.set("measurePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuring(value: Boolean): Self = this.set("measuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureText(value: String): Self = this.set("measureText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureTextNull: Self = this.set("measureText", null)
  }
}
