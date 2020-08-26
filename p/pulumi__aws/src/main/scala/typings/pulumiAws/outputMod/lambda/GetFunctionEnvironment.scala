package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionEnvironment extends js.Object {
  var variables: StringDictionary[String] = js.native
}

object GetFunctionEnvironment {
  @scala.inline
  def apply(variables: StringDictionary[String]): GetFunctionEnvironment = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionEnvironment]
  }
  @scala.inline
  implicit class GetFunctionEnvironmentOps[Self <: GetFunctionEnvironment] (val x: Self) extends AnyVal {
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
  }
  
}

