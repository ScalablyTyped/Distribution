package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentParameter extends StObject {
  
  var defaultValue: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The description of the document.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the document.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object DocumentParameter {
  
  @scala.inline
  def apply(): DocumentParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentParameter]
  }
  
  @scala.inline
  implicit class DocumentParameterMutableBuilder[Self <: DocumentParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Input[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
