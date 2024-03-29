package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogTableStorageDescriptorColumn extends StObject {
  
  /**
    * Free-form text comment.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the SerDe.
    */
  var name: String
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The datatype of data in the Column.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object CatalogTableStorageDescriptorColumn {
  
  inline def apply(name: String): CatalogTableStorageDescriptorColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptorColumn]
  }
  
  extension [Self <: CatalogTableStorageDescriptorColumn](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
