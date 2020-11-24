package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactProviderType[T] extends js.Object {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double = js.native
  
  var _context: ReactContext[T] = js.native
}
object ReactProviderType {
  
  @scala.inline
  def apply[T](DollarDollartypeof: js.Symbol | Double, _context: ReactContext[T]): ReactProviderType[T] = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactProviderType[T]]
  }
  
  @scala.inline
  implicit class ReactProviderTypeOps[Self <: ReactProviderType[_], T] (val x: Self with ReactProviderType[T]) extends AnyVal {
    
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
    def setDollarDollartypeof(value: js.Symbol | Double): Self = this.set("$$typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_context(value: ReactContext[T]): Self = this.set("_context", value.asInstanceOf[js.Any])
  }
}
