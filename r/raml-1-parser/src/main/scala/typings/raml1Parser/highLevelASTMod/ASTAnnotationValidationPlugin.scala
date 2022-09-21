package typings.raml1Parser.highLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASTAnnotationValidationPlugin extends StObject {
  
  /**
    * String ID of the plugin
    */
  def id(): String
  
  /**
    * validate annotated RAML element
    */
  def process(
    entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify rTypes.tsInterfaces.IAnnotatedElement */ Any
  ): js.Array[PluginValidationIssue]
}
object ASTAnnotationValidationPlugin {
  
  inline def apply(
    id: () => String,
    process: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify rTypes.tsInterfaces.IAnnotatedElement */ Any => js.Array[PluginValidationIssue]
  ): ASTAnnotationValidationPlugin = {
    val __obj = js.Dynamic.literal(id = js.Any.fromFunction0(id), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[ASTAnnotationValidationPlugin]
  }
  
  extension [Self <: ASTAnnotationValidationPlugin](x: Self) {
    
    inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    inline def setProcess(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify rTypes.tsInterfaces.IAnnotatedElement */ Any => js.Array[PluginValidationIssue]
    ): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
  }
}
