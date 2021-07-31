package typings.reactNativeFirebase.anon

import typings.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFieldPath extends StObject {
  
  /* static member */
  def documentId(): FieldPath
}
object TypeofFieldPath {
  
  @scala.inline
  def apply(documentId: () => FieldPath): TypeofFieldPath = {
    val __obj = js.Dynamic.literal(documentId = js.Any.fromFunction0(documentId))
    __obj.asInstanceOf[TypeofFieldPath]
  }
  
  @scala.inline
  implicit class TypeofFieldPathMutableBuilder[Self <: TypeofFieldPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentId(value: () => FieldPath): Self = StObject.set(x, "documentId", js.Any.fromFunction0(value))
  }
}
