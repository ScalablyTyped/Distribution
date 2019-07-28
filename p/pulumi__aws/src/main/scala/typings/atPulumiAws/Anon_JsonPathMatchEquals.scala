package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JsonPathMatchEquals extends js.Object {
  var jsonPath: Input[String]
  var matchEquals: Input[String]
}

object Anon_JsonPathMatchEquals {
  @scala.inline
  def apply(jsonPath: Input[String], matchEquals: Input[String]): Anon_JsonPathMatchEquals = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_JsonPathMatchEquals]
  }
}

