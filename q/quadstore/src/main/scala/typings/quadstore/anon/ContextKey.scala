package typings.quadstore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextKey extends js.Object {
  
  var contextKey: js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam CK */ js.Any] = js.native
}
object ContextKey {
  
  @scala.inline
  def apply(): ContextKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextKey]
  }
  
  @scala.inline
  implicit class ContextKeyOps[Self <: ContextKey] (val x: Self) extends AnyVal {
    
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
    def setContextKey(value: /* import warning: RewrittenClass.unapply cls was tparam CK */ js.Any): Self = this.set("contextKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextKey: Self = this.set("contextKey", js.undefined)
  }
}
