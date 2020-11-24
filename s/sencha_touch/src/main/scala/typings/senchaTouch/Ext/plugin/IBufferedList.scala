package typings.senchaTouch.Ext.plugin

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBufferedList extends IBase {
  
  /** [Method] Returns the value of list
    * @returns Object
    */
  var getList: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of list
    * @param list Object The new value.
    */
  var setList: js.UndefOr[js.Function1[/* list */ js.UndefOr[js.Any], Unit]] = js.native
}
object IBufferedList {
  
  @scala.inline
  def apply(): IBufferedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBufferedList]
  }
  
  @scala.inline
  implicit class IBufferedListOps[Self <: IBufferedList] (val x: Self) extends AnyVal {
    
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
    def setGetList(value: () => _): Self = this.set("getList", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetList: Self = this.set("getList", js.undefined)
    
    @scala.inline
    def setSetList(value: /* list */ js.UndefOr[js.Any] => Unit): Self = this.set("setList", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetList: Self = this.set("setList", js.undefined)
  }
}
