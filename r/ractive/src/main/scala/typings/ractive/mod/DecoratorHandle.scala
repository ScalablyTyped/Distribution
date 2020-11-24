package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecoratorHandle extends js.Object {
  
  /**
  	 * Called when any downstream template from the element will be updated.
  	 */
  var invalidate: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
  	 * Called when the decorator is being removed from its element.
  	 */
  def teardown(): Unit = js.native
  
  /**
  	 * Called when any arguments passed to the decorator update. If no update function is supplied, then the decorator will be torn down and recreated when the decorator arguments update.j
  	 */
  var update: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
}
object DecoratorHandle {
  
  @scala.inline
  def apply(teardown: () => Unit): DecoratorHandle = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[DecoratorHandle]
  }
  
  @scala.inline
  implicit class DecoratorHandleOps[Self <: DecoratorHandle] (val x: Self) extends AnyVal {
    
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
    def setTeardown(value: () => Unit): Self = this.set("teardown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvalidate(value: () => Unit): Self = this.set("invalidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInvalidate: Self = this.set("invalidate", js.undefined)
    
    @scala.inline
    def setUpdate(value: /* repeated */ js.Any => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
