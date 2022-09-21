package typings.reactSignatureCanvas

import typings.react.mod.CanvasHTMLAttributes
import typings.react.mod.Component
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-signature-canvas", JSImport.Default)
  @js.native
  open class default () extends ReactSignatureCanvas
  
  @js.native
  trait ReactSignatureCanvas
    extends Component[ReactSignatureCanvasProps, js.Object, Any] {
    
    var clear: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['clear'] */ js.Any = js.native
    
    var fromData: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['fromData'] */ js.Any = js.native
    
    var fromDataURL: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['fromDataURL'] */ js.Any = js.native
    
    def getCanvas(): HTMLCanvasElement = js.native
    
    def getSignaturePad(): Any = js.native
    
    def getTrimmedCanvas(): HTMLCanvasElement = js.native
    
    var isEmpty: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['isEmpty'] */ js.Any = js.native
    
    var off: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['off'] */ js.Any = js.native
    
    var on: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['on'] */ js.Any = js.native
    
    var toData: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['toData'] */ js.Any = js.native
    
    var toDataURL: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad * / any['toDataURL'] */ js.Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignaturePad.SignaturePadOptions * / any */ trait ReactSignatureCanvasProps extends StObject {
    
    var canvasProps: js.UndefOr[CanvasHTMLAttributes[HTMLCanvasElement]] = js.undefined
    
    var clearOnResize: js.UndefOr[Boolean] = js.undefined
  }
  object ReactSignatureCanvasProps {
    
    inline def apply(): ReactSignatureCanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactSignatureCanvasProps]
    }
    
    extension [Self <: ReactSignatureCanvasProps](x: Self) {
      
      inline def setCanvasProps(value: CanvasHTMLAttributes[HTMLCanvasElement]): Self = StObject.set(x, "canvasProps", value.asInstanceOf[js.Any])
      
      inline def setCanvasPropsUndefined: Self = StObject.set(x, "canvasProps", js.undefined)
      
      inline def setClearOnResize(value: Boolean): Self = StObject.set(x, "clearOnResize", value.asInstanceOf[js.Any])
      
      inline def setClearOnResizeUndefined: Self = StObject.set(x, "clearOnResize", js.undefined)
    }
  }
}
