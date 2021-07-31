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
  var getGroupFn: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of sortProperty
    * @returns String
    */
  var getSortProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (Function) */
  var groupFn: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Sets the value of groupFn
    * @param groupFn Function The new value.
    */
  var setGroupFn: js.UndefOr[js.Function1[/* groupFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of sortProperty
    * @param sortProperty String The new value.
    */
  var setSortProperty: js.UndefOr[js.Function1[/* sortProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var sortProperty: js.UndefOr[String] = js.undefined
}
object IGrouper {
  
  @scala.inline
  def apply(): IGrouper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrouper]
  }
  
  @scala.inline
  implicit class IGrouperMutableBuilder[Self <: IGrouper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGroupFn(value: () => js.Any): Self = StObject.set(x, "getGroupFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupFnUndefined: Self = StObject.set(x, "getGroupFn", js.undefined)
    
    @scala.inline
    def setGetSortProperty(value: () => String): Self = StObject.set(x, "getSortProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortPropertyUndefined: Self = StObject.set(x, "getSortProperty", js.undefined)
    
    @scala.inline
    def setGroupFn(value: js.Any): Self = StObject.set(x, "groupFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupFnUndefined: Self = StObject.set(x, "groupFn", js.undefined)
    
    @scala.inline
    def setSetGroupFn(value: /* groupFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setGroupFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGroupFnUndefined: Self = StObject.set(x, "setGroupFn", js.undefined)
    
    @scala.inline
    def setSetSortProperty(value: /* sortProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSortProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSortPropertyUndefined: Self = StObject.set(x, "setSortProperty", js.undefined)
    
    @scala.inline
    def setSortProperty(value: String): Self = StObject.set(x, "sortProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortPropertyUndefined: Self = StObject.set(x, "sortProperty", js.undefined)
  }
}
