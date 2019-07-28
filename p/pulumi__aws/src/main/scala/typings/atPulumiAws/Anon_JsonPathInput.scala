package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JsonPathInput extends js.Object {
  var jsonPath: Input[String]
}

object Anon_JsonPathInput {
  @scala.inline
  def apply(jsonPath: Input[String]): Anon_JsonPathInput = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_JsonPathInput]
  }
}

