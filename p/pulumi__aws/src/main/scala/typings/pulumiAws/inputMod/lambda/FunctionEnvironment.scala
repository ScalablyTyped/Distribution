package typings.pulumiAws.inputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionEnvironment extends js.Object {
  /**
    * A map that defines environment variables for the Lambda function.
    */
  var variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object FunctionEnvironment {
  @scala.inline
  def apply(variables: Input[StringDictionary[Input[String]]] = null): FunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionEnvironment]
  }
}

