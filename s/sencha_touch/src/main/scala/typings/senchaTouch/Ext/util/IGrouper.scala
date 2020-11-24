package typings.senchaTouch.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGrouper extends ISorter {
  
  /** [Method] Returns the value of groupFn
    * @returns Function
    */
  var getGroupFn: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of sortProperty
    * @returns String
    */
  var getSortProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Function) */
  var groupFn: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of groupFn
    * @param groupFn Function The new value.
    */
  var setGroupFn: js.UndefOr[js.Function1[/* groupFn */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of sortProperty
    * @param sortProperty String The new value.
    */
  var setSortProperty: js.UndefOr[js.Function1[/* sortProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var sortProperty: js.UndefOr[String] = js.native
}
object IGrouper {
  
  @scala.inline
  def apply(): IGrouper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrouper]
  }
  
  @scala.inline
  implicit class IGrouperOps[Self <: IGrouper] (val x: Self) extends AnyVal {
    
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
    def setGetGroupFn(value: () => _): Self = this.set("getGroupFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGroupFn: Self = this.set("getGroupFn", js.undefined)
    
    @scala.inline
    def setGetSortProperty(value: () => String): Self = this.set("getSortProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSortProperty: Self = this.set("getSortProperty", js.undefined)
    
    @scala.inline
    def setGroupFn(value: js.Any): Self = this.set("groupFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupFn: Self = this.set("groupFn", js.undefined)
    
    @scala.inline
    def setSetGroupFn(value: /* groupFn */ js.UndefOr[js.Any] => Unit): Self = this.set("setGroupFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGroupFn: Self = this.set("setGroupFn", js.undefined)
    
    @scala.inline
    def setSetSortProperty(value: /* sortProperty */ js.UndefOr[String] => Unit): Self = this.set("setSortProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSortProperty: Self = this.set("setSortProperty", js.undefined)
    
    @scala.inline
    def setSortProperty(value: String): Self = this.set("sortProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortProperty: Self = this.set("sortProperty", js.undefined)
  }
}
