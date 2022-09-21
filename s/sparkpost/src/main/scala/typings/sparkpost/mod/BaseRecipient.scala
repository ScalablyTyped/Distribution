package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseRecipient extends StObject {
  
  /** Key/value pairs associated with a recipient. */
  var metadata: js.UndefOr[Any] = js.undefined
  
  /** SparkPost Enterprise API only. Email to use for envelope FROM. */
  var return_path: js.UndefOr[String] = js.undefined
  
  /** Key/value pairs associated with a recipient that are provided to the substitution engine. */
  var substitution_data: js.UndefOr[Any] = js.undefined
  
  /** Array of text labels associated with a recipient. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object BaseRecipient {
  
  inline def apply(): BaseRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRecipient]
  }
  
  extension [Self <: BaseRecipient](x: Self) {
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setReturn_path(value: String): Self = StObject.set(x, "return_path", value.asInstanceOf[js.Any])
    
    inline def setReturn_pathUndefined: Self = StObject.set(x, "return_path", js.undefined)
    
    inline def setSubstitution_data(value: Any): Self = StObject.set(x, "substitution_data", value.asInstanceOf[js.Any])
    
    inline def setSubstitution_dataUndefined: Self = StObject.set(x, "substitution_data", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
