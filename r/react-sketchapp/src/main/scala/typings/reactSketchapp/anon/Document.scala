package typings.reactSketchapp.anon

import typings.reactSketchapp.libModuleTypesMod.SketchDocument
import typings.reactSketchapp.libModuleTypesMod.SketchDocumentData
import typings.reactSketchapp.libModuleTypesMod.WrappedSketchDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  var clearExistingStyles: js.UndefOr[Boolean] = js.undefined
  
  var document: js.UndefOr[SketchDocument | SketchDocumentData | WrappedSketchDocument] = js.undefined
}
object Document {
  
  inline def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    inline def setClearExistingStyles(value: Boolean): Self = StObject.set(x, "clearExistingStyles", value.asInstanceOf[js.Any])
    
    inline def setClearExistingStylesUndefined: Self = StObject.set(x, "clearExistingStyles", js.undefined)
    
    inline def setDocument(value: SketchDocument | SketchDocumentData | WrappedSketchDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
