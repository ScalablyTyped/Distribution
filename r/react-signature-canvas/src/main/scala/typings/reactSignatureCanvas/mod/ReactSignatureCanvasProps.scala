package typings.reactSignatureCanvas.mod

import typings.react.mod.CanvasHTMLAttributes
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad.SignaturePadOptions * / any */ @js.native
trait ReactSignatureCanvasProps extends js.Object {
  
  var canvasProps: js.UndefOr[CanvasHTMLAttributes[HTMLCanvasElement]] = js.native
  
  var clearOnResize: js.UndefOr[Boolean] = js.native
}
object ReactSignatureCanvasProps {
  
  @scala.inline
  def apply(): ReactSignatureCanvasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactSignatureCanvasProps]
  }
  
  @scala.inline
  implicit class ReactSignatureCanvasPropsOps[Self <: ReactSignatureCanvasProps] (val x: Self) extends AnyVal {
    
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
    def setCanvasProps(value: CanvasHTMLAttributes[HTMLCanvasElement]): Self = this.set("canvasProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasProps: Self = this.set("canvasProps", js.undefined)
    
    @scala.inline
    def setClearOnResize(value: Boolean): Self = this.set("clearOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnResize: Self = this.set("clearOnResize", js.undefined)
  }
}
