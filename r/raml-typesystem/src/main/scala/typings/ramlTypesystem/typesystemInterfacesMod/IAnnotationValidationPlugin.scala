package typings.ramlTypesystem.typesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotationValidationPlugin extends StObject {
  
  /**
    * String ID of the plugin
    */
  def id(): String
  
  /**
    * validate annotated RAML element
    */
  def process(entry: IAnnotatedElement): js.Array[PluginValidationIssue]
}
object IAnnotationValidationPlugin {
  
  inline def apply(id: () => String, process: IAnnotatedElement => js.Array[PluginValidationIssue]): IAnnotationValidationPlugin = {
    val __obj = js.Dynamic.literal(id = js.Any.fromFunction0(id), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[IAnnotationValidationPlugin]
  }
  
  extension [Self <: IAnnotationValidationPlugin](x: Self) {
    
    inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    inline def setProcess(value: IAnnotatedElement => js.Array[PluginValidationIssue]): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
  }
}
