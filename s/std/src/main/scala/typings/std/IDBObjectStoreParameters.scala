package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBObjectStoreParameters extends js.Object {
  
  var autoIncrement: js.UndefOr[scala.Boolean] = js.native
  
  var keyPath: js.UndefOr[java.lang.String | js.Array[java.lang.String] | Null] = js.native
}
object IDBObjectStoreParameters {
  
  @scala.inline
  def apply(): IDBObjectStoreParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBObjectStoreParameters]
  }
  
  @scala.inline
  implicit class IDBObjectStoreParametersOps[Self <: IDBObjectStoreParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoIncrement(value: scala.Boolean): Self = this.set("autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIncrement: Self = this.set("autoIncrement", js.undefined)
    
    @scala.inline
    def setKeyPathVarargs(value: java.lang.String*): Self = this.set("keyPath", js.Array(value :_*))
    
    @scala.inline
    def setKeyPath(value: java.lang.String | js.Array[java.lang.String]): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPath: Self = this.set("keyPath", js.undefined)
    
    @scala.inline
    def setKeyPathNull: Self = this.set("keyPath", null)
  }
}
