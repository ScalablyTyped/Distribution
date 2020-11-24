package typings.resolvePackagePath.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delete extends js.Object {
  
  var _store: StringDictionary[String] = js.native
  
  def delete(key: String): Unit = js.native
  
  def get(key: String): String = js.native
  
  def has(key: String): Boolean = js.native
  
  def set(key: String, value: js.Any): js.Any = js.native
  
  val size: Double = js.native
}
object Delete {
  
  @scala.inline
  def apply(
    _store: StringDictionary[String],
    delete: String => Unit,
    get: String => String,
    has: String => Boolean,
    set: (String, js.Any) => js.Any,
    size: Double
  ): Delete = {
    val __obj = js.Dynamic.literal(_store = _store.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
    
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
    def set_store(value: StringDictionary[String]): Self = this.set("_store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => String): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => js.Any): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
