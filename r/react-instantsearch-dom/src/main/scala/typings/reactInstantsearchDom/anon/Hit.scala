package typings.reactInstantsearchDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hit[T] extends js.Object {
  
  var hit: typings.reactInstantsearchCore.mod.Hit[T] = js.native
}
object Hit {
  
  @scala.inline
  def apply[T](hit: typings.reactInstantsearchCore.mod.Hit[T]): Hit[T] = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit[T]]
  }
  
  @scala.inline
  implicit class HitOps[Self <: Hit[_], T] (val x: Self with Hit[T]) extends AnyVal {
    
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
    def setHit(value: typings.reactInstantsearchCore.mod.Hit[T]): Self = this.set("hit", value.asInstanceOf[js.Any])
  }
}
