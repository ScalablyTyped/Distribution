package typings.rcMotion.cssmotionlistMod

import typings.rcMotion.diffMod.KeyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSMotionListState extends js.Object {
  
  var keyEntities: js.Array[KeyObject] = js.native
}
object CSSMotionListState {
  
  @scala.inline
  def apply(keyEntities: js.Array[KeyObject]): CSSMotionListState = {
    val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSMotionListState]
  }
  
  @scala.inline
  implicit class CSSMotionListStateOps[Self <: CSSMotionListState] (val x: Self) extends AnyVal {
    
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
    def setKeyEntitiesVarargs(value: KeyObject*): Self = this.set("keyEntities", js.Array(value :_*))
    
    @scala.inline
    def setKeyEntities(value: js.Array[KeyObject]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
  }
}
