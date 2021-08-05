package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  val imageEditor: js.UndefOr[Boolean] = js.undefined
  
  val preview: js.UndefOr[Boolean] = js.undefined
  
  val stockImages: js.UndefOr[Boolean] = js.undefined
  
  val textEditor: js.UndefOr[TextEditor] = js.undefined
  
  val undoRedo: js.UndefOr[Boolean] = js.undefined
}
object Features {
  
  inline def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setImageEditor(value: Boolean): Self = StObject.set(x, "imageEditor", value.asInstanceOf[js.Any])
    
    inline def setImageEditorUndefined: Self = StObject.set(x, "imageEditor", js.undefined)
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setStockImages(value: Boolean): Self = StObject.set(x, "stockImages", value.asInstanceOf[js.Any])
    
    inline def setStockImagesUndefined: Self = StObject.set(x, "stockImages", js.undefined)
    
    inline def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
    
    inline def setTextEditorUndefined: Self = StObject.set(x, "textEditor", js.undefined)
    
    inline def setUndoRedo(value: Boolean): Self = StObject.set(x, "undoRedo", value.asInstanceOf[js.Any])
    
    inline def setUndoRedoUndefined: Self = StObject.set(x, "undoRedo", js.undefined)
  }
}
