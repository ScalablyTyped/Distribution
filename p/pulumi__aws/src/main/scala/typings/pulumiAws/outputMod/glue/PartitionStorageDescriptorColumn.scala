package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionStorageDescriptorColumn extends StObject {
  
  /**
    * Free-form text comment.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the SerDe.
    */
  var name: String
  
  /**
    * The datatype of data in the Column.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object PartitionStorageDescriptorColumn {
  
  inline def apply(name: String): PartitionStorageDescriptorColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionStorageDescriptorColumn]
  }
  
  extension [Self <: PartitionStorageDescriptorColumn](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
