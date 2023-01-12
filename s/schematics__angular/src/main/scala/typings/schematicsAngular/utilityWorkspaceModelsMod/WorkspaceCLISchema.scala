package typings.schematicsAngular.utilityWorkspaceModelsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceCLISchema extends StObject {
  
  var defaultCollection: js.UndefOr[String] = js.undefined
  
  var schematicCollections: js.UndefOr[js.Array[String]] = js.undefined
  
  var warnings: js.UndefOr[Record[String, Boolean]] = js.undefined
}
object WorkspaceCLISchema {
  
  inline def apply(): WorkspaceCLISchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceCLISchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceCLISchema] (val x: Self) extends AnyVal {
    
    inline def setDefaultCollection(value: String): Self = StObject.set(x, "defaultCollection", value.asInstanceOf[js.Any])
    
    inline def setDefaultCollectionUndefined: Self = StObject.set(x, "defaultCollection", js.undefined)
    
    inline def setSchematicCollections(value: js.Array[String]): Self = StObject.set(x, "schematicCollections", value.asInstanceOf[js.Any])
    
    inline def setSchematicCollectionsUndefined: Self = StObject.set(x, "schematicCollections", js.undefined)
    
    inline def setSchematicCollectionsVarargs(value: String*): Self = StObject.set(x, "schematicCollections", js.Array(value*))
    
    inline def setWarnings(value: Record[String, Boolean]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
