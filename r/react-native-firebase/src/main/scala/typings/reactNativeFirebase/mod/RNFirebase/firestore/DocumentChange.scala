package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.reactNativeFirebaseStrings.added
import typings.reactNativeFirebase.reactNativeFirebaseStrings.modified
import typings.reactNativeFirebase.reactNativeFirebaseStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentChange extends StObject {
  
  val doc: DocumentSnapshot = js.native
  
  val newIndex: Double = js.native
  
  val oldIndex: Double = js.native
  
  val `type`: added | modified | removed = js.native
}
object DocumentChange {
  
  @scala.inline
  def apply(doc: DocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: added | modified | removed): DocumentChange = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange]
  }
  
  @scala.inline
  implicit class DocumentChangeMutableBuilder[Self <: DocumentChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc(value: DocumentSnapshot): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: added | modified | removed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
