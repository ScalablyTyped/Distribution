package typings.rcVirtualList.interfaceMod

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedConfig[T] extends js.Object {
  
  def getKey(item: T): Key = js.native
}
object SharedConfig {
  
  @scala.inline
  def apply[T](getKey: T => Key): SharedConfig[T] = {
    val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction1(getKey))
    __obj.asInstanceOf[SharedConfig[T]]
  }
  
  @scala.inline
  implicit class SharedConfigOps[Self <: SharedConfig[_], T] (val x: Self with SharedConfig[T]) extends AnyVal {
    
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
    def setGetKey(value: T => Key): Self = this.set("getKey", js.Any.fromFunction1(value))
  }
}
