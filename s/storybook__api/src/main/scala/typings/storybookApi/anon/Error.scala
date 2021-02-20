package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.mod.Args
import typings.storybookApi.mod.Parameters
import typings.storybookApi.storiesMod.StoriesRaw
import typings.storybookApi.storybookApiNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  var error: js.UndefOr[typings.std.Error] = js.native
  
  var globalParameters: Parameters = js.native
  
  var globals: Args = js.native
  
  var kindParameters: StringDictionary[Parameters] = js.native
  
  var stories: StoriesRaw = js.native
  
  var v: `2` = js.native
}
object Error {
  
  @scala.inline
  def apply(
    globalParameters: Parameters,
    globals: Args,
    kindParameters: StringDictionary[Parameters],
    stories: StoriesRaw,
    v: `2`
  ): Error = {
    val __obj = js.Dynamic.literal(globalParameters = globalParameters.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setGlobalParameters(value: Parameters): Self = StObject.set(x, "globalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindParameters(value: StringDictionary[Parameters]): Self = StObject.set(x, "kindParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories(value: StoriesRaw): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: `2`): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
