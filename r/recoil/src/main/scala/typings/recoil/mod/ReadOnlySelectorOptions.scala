package typings.recoil.mod

import typings.recoil.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOnlySelectorOptions[T] extends js.Object {
  
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.native
  
  def get(opts: Get): js.Promise[T] | RecoilValue[T] | T = js.native
  
  var key: String = js.native
}
object ReadOnlySelectorOptions {
  
  @scala.inline
  def apply[T](get: Get => js.Promise[T] | RecoilValue[T] | T, key: String): ReadOnlySelectorOptions[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOnlySelectorOptions[T]]
  }
  
  @scala.inline
  implicit class ReadOnlySelectorOptionsOps[Self <: ReadOnlySelectorOptions[_], T] (val x: Self with ReadOnlySelectorOptions[T]) extends AnyVal {
    
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
    def setGet(value: Get => js.Promise[T] | RecoilValue[T] | T): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslyAllowMutability(value: Boolean): Self = this.set("dangerouslyAllowMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslyAllowMutability: Self = this.set("dangerouslyAllowMutability", js.undefined)
  }
}
