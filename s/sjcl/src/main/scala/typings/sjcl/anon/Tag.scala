package typings.sjcl.anon

import typings.sjcl.mod.BitArray_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag extends js.Object {
  
  var key: BitArray_ = js.native
  
  var tag: BitArray_ = js.native
}
object Tag {
  
  @scala.inline
  def apply(key: BitArray_, tag: BitArray_): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
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
    def setKeyVarargs(value: Double*): Self = this.set("key", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: BitArray_): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagVarargs(value: Double*): Self = this.set("tag", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: BitArray_): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
