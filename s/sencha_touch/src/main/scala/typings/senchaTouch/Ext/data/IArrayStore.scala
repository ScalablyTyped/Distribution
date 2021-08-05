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
  var loadData_IArrayStore: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}
object IArrayStore {
  
  inline def apply(): IArrayStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayStore]
  }
  
  extension [Self <: IArrayStore](x: Self) {
    
    inline def setLoadData(value: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction2(value))
    
    inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
  }
}
