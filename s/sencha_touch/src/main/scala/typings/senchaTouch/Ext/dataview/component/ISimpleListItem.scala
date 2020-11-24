package typings.senchaTouch.Ext.dataview.component

import typings.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimpleListItem extends IComponent {
  
  /** [Method] Returns the value of disclosure
    * @returns Object
    */
  var getDisclosure: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of header
    * @returns Object
    */
  var getHeader: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of disclosure
    * @param disclosure Object The new value.
    */
  var setDisclosure: js.UndefOr[js.Function1[/* disclosure */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of header
    * @param header Object The new value.
    */
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
}
object ISimpleListItem {
  
  @scala.inline
  def apply(): ISimpleListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimpleListItem]
  }
  
  @scala.inline
  implicit class ISimpleListItemOps[Self <: ISimpleListItem] (val x: Self) extends AnyVal {
    
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
    def setGetDisclosure(value: () => _): Self = this.set("getDisclosure", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisclosure: Self = this.set("getDisclosure", js.undefined)
    
    @scala.inline
    def setGetHeader(value: () => _): Self = this.set("getHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHeader: Self = this.set("getHeader", js.undefined)
    
    @scala.inline
    def setSetDisclosure(value: /* disclosure */ js.UndefOr[js.Any] => Unit): Self = this.set("setDisclosure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisclosure: Self = this.set("setDisclosure", js.undefined)
    
    @scala.inline
    def setSetHeader(value: /* header */ js.UndefOr[js.Any] => Unit): Self = this.set("setHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeader: Self = this.set("setHeader", js.undefined)
  }
}
