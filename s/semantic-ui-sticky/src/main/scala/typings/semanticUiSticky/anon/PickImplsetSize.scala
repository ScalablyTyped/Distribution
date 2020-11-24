package typings.semanticUiSticky.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'setSize'> */
@js.native
trait PickImplsetSize extends js.Object {
  
  var setSize: Boolean = js.native
}
object PickImplsetSize {
  
  @scala.inline
  def apply(setSize: Boolean): PickImplsetSize = {
    val __obj = js.Dynamic.literal(setSize = setSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsetSize]
  }
  
  @scala.inline
  implicit class PickImplsetSizeOps[Self <: PickImplsetSize] (val x: Self) extends AnyVal {
    
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
    def setSetSize(value: Boolean): Self = this.set("setSize", value.asInstanceOf[js.Any])
  }
}
