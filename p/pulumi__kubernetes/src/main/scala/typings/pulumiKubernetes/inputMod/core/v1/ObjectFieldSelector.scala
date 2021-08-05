package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectFieldSelector selects an APIVersioned field of an object.
  */
trait ObjectFieldSelector extends StObject {
  
  /**
    * Version of the schema the FieldPath is written in terms of, defaults to "v1".
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Path of the field to select in the specified API version.
    */
  var fieldPath: Input[String]
}
object ObjectFieldSelector {
  
  inline def apply(fieldPath: Input[String]): ObjectFieldSelector = {
    val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldSelector]
  }
  
  extension [Self <: ObjectFieldSelector](x: Self) {
    
    inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setFieldPath(value: Input[String]): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
  }
}
