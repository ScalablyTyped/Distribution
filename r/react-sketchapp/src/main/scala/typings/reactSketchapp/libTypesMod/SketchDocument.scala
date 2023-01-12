package typings.reactSketchapp.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchDocument extends StObject {
  
  def documentData(): SketchDocumentData
  
  def showMessage(message: String): Unit
}
object SketchDocument {
  
  inline def apply(documentData: () => SketchDocumentData, showMessage: String => Unit): SketchDocument = {
    val __obj = js.Dynamic.literal(documentData = js.Any.fromFunction0(documentData), showMessage = js.Any.fromFunction1(showMessage))
    __obj.asInstanceOf[SketchDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchDocument] (val x: Self) extends AnyVal {
    
    inline def setDocumentData(value: () => SketchDocumentData): Self = StObject.set(x, "documentData", js.Any.fromFunction0(value))
    
    inline def setShowMessage(value: String => Unit): Self = StObject.set(x, "showMessage", js.Any.fromFunction1(value))
  }
}
