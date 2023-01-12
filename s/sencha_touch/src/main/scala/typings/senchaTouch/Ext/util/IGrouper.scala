package typings.senchaTouch.Ext.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGrouper
  extends StObject
     with ISorter {
  
  /** [Method] Returns the value of groupFn
    * @returns Function
    */
  var getGroupFn: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of sortProperty
    * @returns String
    */
  var getSortProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (Function) */
  var groupFn: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the value of groupFn
    * @param groupFn Function The new value.
    */
  var setGroupFn: js.UndefOr[js.Function1[/* groupFn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of sortProperty
    * @param sortProperty String The new value.
    */
  var setSortProperty: js.UndefOr[js.Function1[/* sortProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var sortProperty: js.UndefOr[String] = js.undefined
}
object IGrouper {
  
  inline def apply(): IGrouper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrouper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGrouper] (val x: Self) extends AnyVal {
    
    inline def setGetGroupFn(value: () => Any): Self = StObject.set(x, "getGroupFn", js.Any.fromFunction0(value))
    
    inline def setGetGroupFnUndefined: Self = StObject.set(x, "getGroupFn", js.undefined)
    
    inline def setGetSortProperty(value: () => String): Self = StObject.set(x, "getSortProperty", js.Any.fromFunction0(value))
    
    inline def setGetSortPropertyUndefined: Self = StObject.set(x, "getSortProperty", js.undefined)
    
    inline def setGroupFn(value: Any): Self = StObject.set(x, "groupFn", value.asInstanceOf[js.Any])
    
    inline def setGroupFnUndefined: Self = StObject.set(x, "groupFn", js.undefined)
    
    inline def setSetGroupFn(value: /* groupFn */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setGroupFn", js.Any.fromFunction1(value))
    
    inline def setSetGroupFnUndefined: Self = StObject.set(x, "setGroupFn", js.undefined)
    
    inline def setSetSortProperty(value: /* sortProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSortProperty", js.Any.fromFunction1(value))
    
    inline def setSetSortPropertyUndefined: Self = StObject.set(x, "setSortProperty", js.undefined)
    
    inline def setSortProperty(value: String): Self = StObject.set(x, "sortProperty", value.asInstanceOf[js.Any])
    
    inline def setSortPropertyUndefined: Self = StObject.set(x, "sortProperty", js.undefined)
  }
}
