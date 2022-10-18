package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEffectiveTypeRootsHost extends StObject {
  
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.undefined
  
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}
object GetEffectiveTypeRootsHost {
  
  inline def apply(): GetEffectiveTypeRootsHost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectiveTypeRootsHost]
  }
  
  extension [Self <: GetEffectiveTypeRootsHost](x: Self) {
    
    inline def setDirectoryExists(value: /* directoryName */ java.lang.String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    inline def setDirectoryExistsUndefined: Self = StObject.set(x, "directoryExists", js.undefined)
    
    inline def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    inline def setGetCurrentDirectoryUndefined: Self = StObject.set(x, "getCurrentDirectory", js.undefined)
  }
}
