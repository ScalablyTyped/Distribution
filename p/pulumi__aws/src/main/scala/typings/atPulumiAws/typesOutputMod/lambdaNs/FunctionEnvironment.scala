package typings.atPulumiAws.typesOutputMod.lambdaNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionEnvironment extends js.Object {
  /**
    * A map that defines environment variables for the Lambda function.
    */
  var variables: js.UndefOr[StringDictionary[String]] = js.undefined
}

object FunctionEnvironment {
  @scala.inline
  def apply(variables: StringDictionary[String] = null): FunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[FunctionEnvironment]
  }
}

