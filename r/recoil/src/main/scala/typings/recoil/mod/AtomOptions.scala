package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtomOptions[T] extends js.Object {
  
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.native
  
  var default: RecoilValue[T] | js.Promise[T] | T = js.native
  
  var key: NodeKey = js.native
}
object AtomOptions {
  
  @scala.inline
  def apply[T](default: RecoilValue[T] | js.Promise[T] | T, key: NodeKey): AtomOptions[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomOptions[T]]
  }
  
  @scala.inline
  implicit class AtomOptionsOps[Self <: AtomOptions[_], T] (val x: Self with AtomOptions[T]) extends AnyVal {
    
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
    def setDefault(value: RecoilValue[T] | js.Promise[T] | T): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: NodeKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslyAllowMutability(value: Boolean): Self = this.set("dangerouslyAllowMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslyAllowMutability: Self = this.set("dangerouslyAllowMutability", js.undefined)
  }
}
