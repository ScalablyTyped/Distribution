package typings.reactNativeTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderTag extends js.Object {
  
  def deleteTagOnPress(): Unit = js.native
  
  var index: Double = js.native
  
  def onPress(): Unit = js.native
  
  var readonly: Boolean = js.native
  
  var tag: String = js.native
}
object RenderTag {
  
  @scala.inline
  def apply(deleteTagOnPress: () => Unit, index: Double, onPress: () => Unit, readonly: Boolean, tag: String): RenderTag = {
    val __obj = js.Dynamic.literal(deleteTagOnPress = js.Any.fromFunction0(deleteTagOnPress), index = index.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress), readonly = readonly.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTag]
  }
  
  @scala.inline
  implicit class RenderTagOps[Self <: RenderTag] (val x: Self) extends AnyVal {
    
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
    def setDeleteTagOnPress(value: () => Unit): Self = this.set("deleteTagOnPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
