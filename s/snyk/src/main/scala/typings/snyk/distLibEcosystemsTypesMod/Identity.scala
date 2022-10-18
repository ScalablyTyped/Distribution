package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity extends StObject {
  
  var args: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var targetFile: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object Identity {
  
  inline def apply(`type`: String): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  extension [Self <: Identity](x: Self) {
    
    inline def setArgs(value: StringDictionary[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
    
    inline def setTargetFileUndefined: Self = StObject.set(x, "targetFile", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
