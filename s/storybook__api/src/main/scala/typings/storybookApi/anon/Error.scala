package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.mod.Args
import typings.storybookApi.mod.Parameters
import typings.storybookApi.storiesMod.StoriesRaw
import typings.storybookApi.storybookApiNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: js.UndefOr[typings.std.Error] = js.undefined
  
  var globalParameters: Parameters
  
  var globals: Args
  
  var kindParameters: StringDictionary[Parameters]
  
  var stories: StoriesRaw
  
  var v: `2`
}
object Error {
  
  inline def apply(
    globalParameters: Parameters,
    globals: Args,
    kindParameters: StringDictionary[Parameters],
    stories: StoriesRaw
  ): Error = {
    val __obj = js.Dynamic.literal(globalParameters = globalParameters.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any], v = 2)
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGlobalParameters(value: Parameters): Self = StObject.set(x, "globalParameters", value.asInstanceOf[js.Any])
    
    inline def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setKindParameters(value: StringDictionary[Parameters]): Self = StObject.set(x, "kindParameters", value.asInstanceOf[js.Any])
    
    inline def setStories(value: StoriesRaw): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setV(value: `2`): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
