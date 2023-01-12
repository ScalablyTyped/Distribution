package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.schematicsAngularStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombinedCodeFixScope extends StObject {
  
  var fileName: java.lang.String
  
  var `type`: file
}
object CombinedCodeFixScope {
  
  inline def apply(fileName: java.lang.String): CombinedCodeFixScope = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("file")
    __obj.asInstanceOf[CombinedCodeFixScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CombinedCodeFixScope] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
