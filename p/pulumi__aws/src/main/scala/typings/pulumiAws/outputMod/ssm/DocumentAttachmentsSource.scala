package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAttachmentsSource extends StObject {
  
  /**
    * The key describing the location of an attachment to a document. Valid key types include: `SourceUrl` and `S3FileUrl`
    */
  var key: String
  
  /**
    * The name of the document attachment file
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The value describing the location of an attachment to a document
    */
  var values: js.Array[String]
}
object DocumentAttachmentsSource {
  
  inline def apply(key: String, values: js.Array[String]): DocumentAttachmentsSource = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttachmentsSource]
  }
  
  extension [Self <: DocumentAttachmentsSource](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
