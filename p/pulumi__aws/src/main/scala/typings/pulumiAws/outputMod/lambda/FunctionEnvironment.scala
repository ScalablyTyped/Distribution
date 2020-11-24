package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionEnvironment extends js.Object {
  
  /**
    * A map that defines environment variables for the Lambda function.
    */
  var variables: js.UndefOr[StringDictionary[String]] = js.native
}
object FunctionEnvironment {
  
  @scala.inline
  def apply(): FunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionEnvironment]
  }
  
  @scala.inline
  implicit class FunctionEnvironmentOps[Self <: FunctionEnvironment] (val x: Self) extends AnyVal {
    
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
    def setVariables(value: StringDictionary[String]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
