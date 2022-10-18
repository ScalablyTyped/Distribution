package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Parameters
import typings.storybookApi.distTs3Dot9LibStoriesMod.StoriesRaw
import typings.storybookApi.storybookApiInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var globalParameters: Parameters[js.Function1[/* args */ Any, Any]]
  
  var globals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
  
  var kindParameters: StringDictionary[Parameters[js.Function1[/* args */ Any, Any]]]
  
  var stories: StoriesRaw
  
  var v: `2`
}
object Error {
  
  inline def apply(
    globalParameters: Parameters[js.Function1[/* args */ Any, Any]],
    globals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any,
    kindParameters: StringDictionary[Parameters[js.Function1[/* args */ Any, Any]]],
    stories: StoriesRaw
  ): Error = {
    val __obj = js.Dynamic.literal(globalParameters = globalParameters.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any], v = 2)
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGlobalParameters(value: Parameters[js.Function1[/* args */ Any, Any]]): Self = StObject.set(x, "globalParameters", value.asInstanceOf[js.Any])
    
    inline def setGlobals(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setKindParameters(value: StringDictionary[Parameters[js.Function1[/* args */ Any, Any]]]): Self = StObject.set(x, "kindParameters", value.asInstanceOf[js.Any])
    
    inline def setStories(value: StoriesRaw): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setV(value: `2`): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
