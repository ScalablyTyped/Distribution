package typings.senchaTouch.Ext.layout.wrapper

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBoxDock extends IBase {
  
  /** [Method] Returns the value of bodyElement
    * @returns Object
    */
  var getBodyElement: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of container
    * @returns Object
    */
  var getContainer: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of element
    * @returns Object
    */
  var getElement: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of innerWrapper
    * @returns Object
    */
  var getInnerWrapper: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of sizeState
    * @returns Boolean
    */
  var getSizeState: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Sets the value of bodyElement
    * @param bodyElement Object The new value.
    */
  var setBodyElement: js.UndefOr[js.Function1[/* bodyElement */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of container
    * @param container Object The new value.
    */
  var setContainer: js.UndefOr[js.Function1[/* container */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of element
    * @param element Object The new value.
    */
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of innerWrapper
    * @param innerWrapper Object The new value.
    */
  var setInnerWrapper: js.UndefOr[js.Function1[/* innerWrapper */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of sizeState
    * @param sizeState Boolean The new value.
    */
  var setSizeState: js.UndefOr[js.Function1[/* sizeState */ js.UndefOr[Boolean], Unit]] = js.native
}
object IBoxDock {
  
  @scala.inline
  def apply(): IBoxDock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoxDock]
  }
  
  @scala.inline
  implicit class IBoxDockOps[Self <: IBoxDock] (val x: Self) extends AnyVal {
    
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
    def setGetBodyElement(value: () => _): Self = this.set("getBodyElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBodyElement: Self = this.set("getBodyElement", js.undefined)
    
    @scala.inline
    def setGetContainer(value: () => _): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setGetDirection(value: () => String): Self = this.set("getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirection: Self = this.set("getDirection", js.undefined)
    
    @scala.inline
    def setGetElement(value: () => _): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetElement: Self = this.set("getElement", js.undefined)
    
    @scala.inline
    def setGetInnerWrapper(value: () => _): Self = this.set("getInnerWrapper", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInnerWrapper: Self = this.set("getInnerWrapper", js.undefined)
    
    @scala.inline
    def setGetSizeState(value: () => Boolean): Self = this.set("getSizeState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSizeState: Self = this.set("getSizeState", js.undefined)
    
    @scala.inline
    def setSetBodyElement(value: /* bodyElement */ js.UndefOr[js.Any] => Unit): Self = this.set("setBodyElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBodyElement: Self = this.set("setBodyElement", js.undefined)
    
    @scala.inline
    def setSetContainer(value: /* container */ js.UndefOr[js.Any] => Unit): Self = this.set("setContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetContainer: Self = this.set("setContainer", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    
    @scala.inline
    def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = this.set("setElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetElement: Self = this.set("setElement", js.undefined)
    
    @scala.inline
    def setSetInnerWrapper(value: /* innerWrapper */ js.UndefOr[js.Any] => Unit): Self = this.set("setInnerWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInnerWrapper: Self = this.set("setInnerWrapper", js.undefined)
    
    @scala.inline
    def setSetSizeState(value: /* sizeState */ js.UndefOr[Boolean] => Unit): Self = this.set("setSizeState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSizeState: Self = this.set("setSizeState", js.undefined)
  }
}
