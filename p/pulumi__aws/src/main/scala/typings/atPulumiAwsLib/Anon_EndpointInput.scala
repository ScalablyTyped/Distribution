package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointInput extends js.Object {
  var endpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_EndpointInput {
  @scala.inline
  def apply(endpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_EndpointInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointInput]
  }
}

