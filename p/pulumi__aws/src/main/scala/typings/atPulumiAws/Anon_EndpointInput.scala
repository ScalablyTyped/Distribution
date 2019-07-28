package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointInput extends js.Object {
  var endpoint: Input[String]
}

object Anon_EndpointInput {
  @scala.inline
  def apply(endpoint: Input[String]): Anon_EndpointInput = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EndpointInput]
  }
}

