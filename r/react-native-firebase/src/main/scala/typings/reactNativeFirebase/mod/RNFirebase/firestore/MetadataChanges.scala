package typings.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataChanges extends StObject {
  
  var includeMetadataChanges: Boolean
}
object MetadataChanges {
  
  inline def apply(includeMetadataChanges: Boolean): MetadataChanges = {
    val __obj = js.Dynamic.literal(includeMetadataChanges = includeMetadataChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataChanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataChanges] (val x: Self) extends AnyVal {
    
    inline def setIncludeMetadataChanges(value: Boolean): Self = StObject.set(x, "includeMetadataChanges", value.asInstanceOf[js.Any])
  }
}
