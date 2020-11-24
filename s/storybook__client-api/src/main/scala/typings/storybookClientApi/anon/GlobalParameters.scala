package typings.storybookClientApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Pick
import typings.storybookAddons.typesMod.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalParameters extends js.Object {
  
  var globalParameters: Pick[Parameters, String] = js.native
  
  var kindParameters: StringDictionary[Pick[Parameters, String]] = js.native
  
  var v: Double = js.native
}
object GlobalParameters {
  
  @scala.inline
  def apply(
    globalParameters: Pick[Parameters, String],
    kindParameters: StringDictionary[Pick[Parameters, String]],
    v: Double
  ): GlobalParameters = {
    val __obj = js.Dynamic.literal(globalParameters = globalParameters.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalParameters]
  }
  
  @scala.inline
  implicit class GlobalParametersOps[Self <: GlobalParameters] (val x: Self) extends AnyVal {
    
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
    def setGlobalParameters(value: Pick[Parameters, String]): Self = this.set("globalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindParameters(value: StringDictionary[Pick[Parameters, String]]): Self = this.set("kindParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
