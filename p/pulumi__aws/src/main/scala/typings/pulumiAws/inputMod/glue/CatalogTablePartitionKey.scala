package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogTablePartitionKey extends StObject {
  
  /**
    * Free-form text comment.
    */
  var comment: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Name of the SerDe.
    */
  var name: Input[String]
  
  /**
    * The datatype of data in the Column.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object CatalogTablePartitionKey {
  
  inline def apply(name: Input[String]): CatalogTablePartitionKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTablePartitionKey]
  }
  
  extension [Self <: CatalogTablePartitionKey](x: Self) {
    
    inline def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
