package typings.senchaTouch.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IArrayStore
  extends StObject
     with IStore {
  
  /** [Method] Loads an array of data straight into the Store
    * @param data Object
    * @param append Object
    */
  @JSName("loadData")
  var loadData_IArrayStore: js.UndefOr[js.Function2[/* data */ js.UndefOr[Any], /* append */ js.UndefOr[Any], Unit]] = js.undefined
}
object IArrayStore {
  
  inline def apply(): IArrayStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IArrayStore] (val x: Self) extends AnyVal {
    
    inline def setLoadData(value: (/* data */ js.UndefOr[Any], /* append */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction2(value))
    
    inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
  }
}
