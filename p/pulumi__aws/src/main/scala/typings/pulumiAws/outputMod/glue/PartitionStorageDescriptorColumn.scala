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
  
  @scala.inline
  def apply(name: String): PartitionStorageDescriptorColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionStorageDescriptorColumn]
  }
  
  @scala.inline
  implicit class PartitionStorageDescriptorColumnMutableBuilder[Self <: PartitionStorageDescriptorColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
