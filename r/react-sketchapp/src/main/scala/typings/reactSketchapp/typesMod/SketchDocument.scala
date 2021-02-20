package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchDocument extends StObject {
  
  def documentData(): SketchDocumentData = js.native
  
  def showMessage(message: String): Unit = js.native
}
object SketchDocument {
  
  @scala.inline
  def apply(documentData: () => SketchDocumentData, showMessage: String => Unit): SketchDocument = {
    val __obj = js.Dynamic.literal(documentData = js.Any.fromFunction0(documentData), showMessage = js.Any.fromFunction1(showMessage))
    __obj.asInstanceOf[SketchDocument]
  }
  
  @scala.inline
  implicit class SketchDocumentMutableBuilder[Self <: SketchDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentData(value: () => SketchDocumentData): Self = StObject.set(x, "documentData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowMessage(value: String => Unit): Self = StObject.set(x, "showMessage", js.Any.fromFunction1(value))
  }
}
