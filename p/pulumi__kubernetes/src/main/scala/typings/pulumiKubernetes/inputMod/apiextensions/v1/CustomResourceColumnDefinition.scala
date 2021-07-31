package typings.pulumiKubernetes.inputMod.apiextensions.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceColumnDefinition specifies a column for server side printing.
  */
trait CustomResourceColumnDefinition extends StObject {
  
  /**
    * description is a human readable description of this column.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
    */
  var format: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
    */
  var jsonPath: Input[String]
  
  /**
    * name is a human readable name for the column.
    */
  var name: Input[String]
  
  /**
    * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
    */
  var priority: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
    */
  var `type`: Input[String]
}
object CustomResourceColumnDefinition {
  
  @scala.inline
  def apply(jsonPath: Input[String], name: Input[String], `type`: Input[String]): CustomResourceColumnDefinition = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceColumnDefinition]
  }
  
  @scala.inline
  implicit class CustomResourceColumnDefinitionMutableBuilder[Self <: CustomResourceColumnDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setJsonPath(value: Input[String]): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
