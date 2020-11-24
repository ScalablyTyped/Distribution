package typings.storybookClientApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.Parameters
import typings.storybookClientApi.typesMod.ErrorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
  var error: ErrorLike = js.native
  
  var globalParameters: Parameters = js.native
  
  var globals: Args = js.native
  
  var kindParameters: StringDictionary[Parameters] = js.native
  
  var v: Double = js.native
}
object Error {
  
  @scala.inline
  def apply(
    error: ErrorLike,
    globalParameters: Parameters,
    globals: Args,
    kindParameters: StringDictionary[Parameters],
    v: Double
  ): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], globalParameters = globalParameters.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
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
    def setError(value: ErrorLike): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalParameters(value: Parameters): Self = this.set("globalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: Args): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindParameters(value: StringDictionary[Parameters]): Self = this.set("kindParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
