package typings.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataChanges extends StObject {
  
  var includeMetadataChanges: Boolean = js.native
}
object MetadataChanges {
  
  @scala.inline
  def apply(includeMetadataChanges: Boolean): MetadataChanges = {
    val __obj = js.Dynamic.literal(includeMetadataChanges = includeMetadataChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataChanges]
  }
  
  @scala.inline
  implicit class MetadataChangesMutableBuilder[Self <: MetadataChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeMetadataChanges(value: Boolean): Self = StObject.set(x, "includeMetadataChanges", value.asInstanceOf[js.Any])
  }
}
