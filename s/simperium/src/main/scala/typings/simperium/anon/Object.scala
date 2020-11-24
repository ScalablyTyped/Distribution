package typings.simperium.anon

import typings.simperium.mod.Change
import typings.simperium.mod.LocalQueuedChange
import typings.simperium.simperiumStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object[T] extends LocalQueuedChange[T] {
  
  var `object`: T = js.native
  
  var originalChange: Change[T] = js.native
  
  var `type`: full = js.native
}
object Object {
  
  @scala.inline
  def apply[T](`object`: T, originalChange: Change[T], `type`: full): Object[T] = {
    val __obj = js.Dynamic.literal(originalChange = originalChange.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object[T]]
  }
  
  @scala.inline
  implicit class ObjectOps[Self <: Object[_], T] (val x: Self with Object[T]) extends AnyVal {
    
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
    def setObject(value: T): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalChange(value: Change[T]): Self = this.set("originalChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: full): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
