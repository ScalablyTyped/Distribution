package typings.semanticUiSticky.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplContainer extends js.Object {
  
  var container: js.UndefOr[String] = js.native
  
  var elementSize: js.UndefOr[String] = js.native
  
  var invalidContext: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplContainer {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplContainer]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplContainerOps[Self <: PartialPickImplkeyofImplContainer] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setElementSize(value: String): Self = this.set("elementSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementSize: Self = this.set("elementSize", js.undefined)
    
    @scala.inline
    def setInvalidContext(value: String): Self = this.set("invalidContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidContext: Self = this.set("invalidContext", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
