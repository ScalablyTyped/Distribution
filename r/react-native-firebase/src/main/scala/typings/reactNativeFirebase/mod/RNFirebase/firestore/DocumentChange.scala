package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.reactNativeFirebaseStrings.added
import typings.reactNativeFirebase.reactNativeFirebaseStrings.modified
import typings.reactNativeFirebase.reactNativeFirebaseStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentChange extends StObject {
  
  val doc: DocumentSnapshot
  
  val newIndex: Double
  
  val oldIndex: Double
  
  val `type`: added | modified | removed
}
object DocumentChange {
  
  inline def apply(doc: DocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: added | modified | removed): DocumentChange = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange]
  }
  
  extension [Self <: DocumentChange](x: Self) {
    
    inline def setDoc(value: DocumentSnapshot): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: added | modified | removed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
