package typings.semanticUiSticky.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'pushing'> */
@js.native
trait PickImplpushing extends js.Object {
  
  var pushing: Boolean = js.native
}
object PickImplpushing {
  
  @scala.inline
  def apply(pushing: Boolean): PickImplpushing = {
    val __obj = js.Dynamic.literal(pushing = pushing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpushing]
  }
  
  @scala.inline
  implicit class PickImplpushingOps[Self <: PickImplpushing] (val x: Self) extends AnyVal {
    
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
    def setPushing(value: Boolean): Self = this.set("pushing", value.asInstanceOf[js.Any])
  }
}
