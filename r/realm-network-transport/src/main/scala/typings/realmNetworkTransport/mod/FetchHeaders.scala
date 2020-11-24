package typings.realmNetworkTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchHeaders extends js.Object {
  
  def append(name: String, value: String): Unit = js.native
  
  def delete(name: String): Unit = js.native
  
  def forEach(callback: js.Function2[/* value */ String, /* name */ String, Unit]): Unit = js.native
  
  def get(name: String): String | Null = js.native
  
  def has(name: String): Boolean = js.native
  
  def set(name: String, value: String): Unit = js.native
}
object FetchHeaders {
  
  @scala.inline
  def apply(
    append: (String, String) => Unit,
    delete: String => Unit,
    forEach: js.Function2[/* value */ String, /* name */ String, Unit] => Unit,
    get: String => String | Null,
    has: String => Boolean,
    set: (String, String) => Unit
  ): FetchHeaders = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), delete = js.Any.fromFunction1(delete), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[FetchHeaders]
  }
  
  @scala.inline
  implicit class FetchHeadersOps[Self <: FetchHeaders] (val x: Self) extends AnyVal {
    
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
    def setAppend(value: (String, String) => Unit): Self = this.set("append", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(value: js.Function2[/* value */ String, /* name */ String, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => String | Null): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, String) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
