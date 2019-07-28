package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyVariablesInput extends js.Object {
  var variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object Anon_KeyVariablesInput {
  @scala.inline
  def apply(variables: Input[StringDictionary[Input[String]]] = null): Anon_KeyVariablesInput = {
    val __obj = js.Dynamic.literal()
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyVariablesInput]
  }
}

