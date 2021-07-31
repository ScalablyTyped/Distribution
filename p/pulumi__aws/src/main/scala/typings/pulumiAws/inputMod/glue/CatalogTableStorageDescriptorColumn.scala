package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogTableStorageDescriptorColumn extends StObject {
  
  /**
    * Free-form text comment.
    */
  var comment: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Name of the SerDe.
    */
  var name: Input[String]
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * The datatype of data in the Column.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object CatalogTableStorageDescriptorColumn {
  
  @scala.inline
  def apply(name: Input[String]): CatalogTableStorageDescriptorColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptorColumn]
  }
  
  @scala.inline
  implicit class CatalogTableStorageDescriptorColumnMutableBuilder[Self <: CatalogTableStorageDescriptorColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
