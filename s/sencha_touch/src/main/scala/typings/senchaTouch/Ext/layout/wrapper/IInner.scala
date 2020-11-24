package typings.senchaTouch.Ext.layout.wrapper

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInner extends IBase {
  
  /** [Method] Returns the value of container
    * @returns Object
    */
  var getContainer: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of sizeState
    * @returns Object
    */
  var getSizeState: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of container
    * @param container Object The new value.
    */
  var setContainer: js.UndefOr[js.Function1[/* container */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of sizeState
    * @param sizeState Object The new value.
    */
  var setSizeState: js.UndefOr[js.Function1[/* sizeState */ js.UndefOr[js.Any], Unit]] = js.native
}
object IInner {
  
  @scala.inline
  def apply(): IInner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInner]
  }
  
  @scala.inline
  implicit class IInnerOps[Self <: IInner] (val x: Self) extends AnyVal {
    
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
    def setGetContainer(value: () => _): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setGetSizeState(value: () => _): Self = this.set("getSizeState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSizeState: Self = this.set("getSizeState", js.undefined)
    
    @scala.inline
    def setSetContainer(value: /* container */ js.UndefOr[js.Any] => Unit): Self = this.set("setContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetContainer: Self = this.set("setContainer", js.undefined)
    
    @scala.inline
    def setSetSizeState(value: /* sizeState */ js.UndefOr[js.Any] => Unit): Self = this.set("setSizeState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSizeState: Self = this.set("setSizeState", js.undefined)
  }
}
