package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordSourceProxy extends js.Object {
  
  def create(dataID: DataID, typeName: String): RecordProxy[js.Object] = js.native
  
  def delete(dataID: DataID): Unit = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  def get[T](dataID: DataID): js.UndefOr[RecordProxy[T] | Null] = js.native
  
  def getRoot(): RecordProxy[js.Object] = js.native
}
object RecordSourceProxy {
  
  @scala.inline
  def apply(
    create: (DataID, String) => RecordProxy[js.Object],
    delete: DataID => Unit,
    get: DataID => js.UndefOr[RecordProxy[js.Any] | Null],
    getRoot: () => RecordProxy[js.Object]
  ): RecordSourceProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
    __obj.asInstanceOf[RecordSourceProxy]
  }
  
  @scala.inline
  implicit class RecordSourceProxyOps[Self <: RecordSourceProxy] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: (DataID, String) => RecordProxy[js.Object]): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelete(value: DataID => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: DataID => js.UndefOr[RecordProxy[js.Any] | Null]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRoot(value: () => RecordProxy[js.Object]): Self = this.set("getRoot", js.Any.fromFunction0(value))
  }
}
