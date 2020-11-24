package typings.senchaTouch.Ext.event

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDispatcher extends IBase {
  
  /** [Method] Returns the value of publishers
    * @returns Object
    */
  var getPublishers: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of publishers
    * @param publishers Object The new value.
    */
  var setPublishers: js.UndefOr[js.Function1[/* publishers */ js.UndefOr[js.Any], Unit]] = js.native
}
object IDispatcher {
  
  @scala.inline
  def apply(): IDispatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDispatcher]
  }
  
  @scala.inline
  implicit class IDispatcherOps[Self <: IDispatcher] (val x: Self) extends AnyVal {
    
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
    def setGetPublishers(value: () => _): Self = this.set("getPublishers", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPublishers: Self = this.set("getPublishers", js.undefined)
    
    @scala.inline
    def setSetPublishers(value: /* publishers */ js.UndefOr[js.Any] => Unit): Self = this.set("setPublishers", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPublishers: Self = this.set("setPublishers", js.undefined)
  }
}
