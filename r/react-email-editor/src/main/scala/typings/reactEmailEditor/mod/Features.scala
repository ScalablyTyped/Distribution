package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Features extends StObject {
  
  val imageEditor: js.UndefOr[Boolean] = js.native
  
  val preview: js.UndefOr[Boolean] = js.native
  
  val stockImages: js.UndefOr[Boolean] = js.native
  
  val textEditor: js.UndefOr[TextEditor] = js.native
  
  val undoRedo: js.UndefOr[Boolean] = js.native
}
object Features {
  
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit class FeaturesMutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageEditor(value: Boolean): Self = StObject.set(x, "imageEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageEditorUndefined: Self = StObject.set(x, "imageEditor", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setStockImages(value: Boolean): Self = StObject.set(x, "stockImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStockImagesUndefined: Self = StObject.set(x, "stockImages", js.undefined)
    
    @scala.inline
    def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEditorUndefined: Self = StObject.set(x, "textEditor", js.undefined)
    
    @scala.inline
    def setUndoRedo(value: Boolean): Self = StObject.set(x, "undoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoRedoUndefined: Self = StObject.set(x, "undoRedo", js.undefined)
  }
}
