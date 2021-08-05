package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'metadata'> */
trait PickImplmetadata extends StObject {
  
  var metadata: MetadataSettings
}
object PickImplmetadata {
  
  inline def apply(metadata: MetadataSettings): PickImplmetadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmetadata]
  }
  
  extension [Self <: PickImplmetadata](x: Self) {
    
    inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
