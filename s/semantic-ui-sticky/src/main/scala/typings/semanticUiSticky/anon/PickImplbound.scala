package typings.semanticUiSticky.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'bound'> */
@js.native
trait PickImplbound extends js.Object {
  
  var bound: String = js.native
}
object PickImplbound {
  
  @scala.inline
  def apply(bound: String): PickImplbound = {
    val __obj = js.Dynamic.literal(bound = bound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbound]
  }
  
  @scala.inline
  implicit class PickImplboundOps[Self <: PickImplbound] (val x: Self) extends AnyVal {
    
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
    def setBound(value: String): Self = this.set("bound", value.asInstanceOf[js.Any])
  }
}
