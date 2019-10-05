package typings.atPulumiAws.typesInputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionEnvironment extends js.Object {
  /**
    * A map that defines environment variables for the Lambda function.
    */
  var variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object FunctionEnvironment {
  @scala.inline
  def apply(variables: Input[StringDictionary[Input[String]]] = null): FunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionEnvironment]
  }
}

