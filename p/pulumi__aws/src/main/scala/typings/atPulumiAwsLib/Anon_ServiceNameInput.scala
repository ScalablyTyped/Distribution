package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ServiceNameInput extends js.Object {
  var serviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ServiceNameInput {
  @scala.inline
  def apply(serviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_ServiceNameInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ServiceNameInput]
  }
}

