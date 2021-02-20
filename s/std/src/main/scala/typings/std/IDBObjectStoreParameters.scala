package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBObjectStoreParameters extends StObject {
  
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
  implicit class IDBObjectStoreParametersMutableBuilder[Self <: IDBObjectStoreParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIncrement(value: scala.Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    @scala.inline
    def setKeyPath(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPathNull: Self = StObject.set(x, "keyPath", null)
    
    @scala.inline
    def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
    
    @scala.inline
    def setKeyPathVarargs(value: java.lang.String*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
  }
}
