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
}

