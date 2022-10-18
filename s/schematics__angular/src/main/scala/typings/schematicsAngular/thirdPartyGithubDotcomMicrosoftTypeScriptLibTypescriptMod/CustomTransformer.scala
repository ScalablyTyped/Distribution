package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTransformer extends StObject {
  
  def transformBundle(node: Bundle): Bundle
  
  def transformSourceFile(node: SourceFile): SourceFile
}
object CustomTransformer {
  
  inline def apply(transformBundle: Bundle => Bundle, transformSourceFile: SourceFile => SourceFile): CustomTransformer = {
    val __obj = js.Dynamic.literal(transformBundle = js.Any.fromFunction1(transformBundle), transformSourceFile = js.Any.fromFunction1(transformSourceFile))
    __obj.asInstanceOf[CustomTransformer]
  }
  
  extension [Self <: CustomTransformer](x: Self) {
    
    inline def setTransformBundle(value: Bundle => Bundle): Self = StObject.set(x, "transformBundle", js.Any.fromFunction1(value))
    
    inline def setTransformSourceFile(value: SourceFile => SourceFile): Self = StObject.set(x, "transformSourceFile", js.Any.fromFunction1(value))
  }
}
