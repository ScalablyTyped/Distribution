package typings.serverless.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outputs extends js.Object {
  
  var Outputs: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var Resources: StringDictionary[js.Any] = js.native
}
object Outputs {
  
  @scala.inline
  def apply(Resources: StringDictionary[js.Any]): Outputs = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outputs]
  }
  
  @scala.inline
  implicit class OutputsOps[Self <: Outputs] (val x: Self) extends AnyVal {
    
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
    def setResources(value: StringDictionary[js.Any]): Self = this.set("Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: StringDictionary[js.Any]): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
  }
}
