package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.mod.Args
import typings.storybookApi.mod.Parameters
import typings.storybookApi.storiesMod.StoriesRaw
import typings.storybookApi.storybookApiNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
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
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGlobalParameters(value: Parameters): Self = this.set("globalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: Args): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindParameters(value: StringDictionary[Parameters]): Self = this.set("kindParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories(value: StoriesRaw): Self = this.set("stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: `2`): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: typings.std.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
