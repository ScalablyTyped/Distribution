package typings.pulumiAws.documentsMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicePrincipal extends Principal {
  var Service: Input[js.Array[Input[String]] | String] = js.native
}

object ServicePrincipal {
  @scala.inline
  def apply(Service: Input[js.Array[Input[String]] | String]): ServicePrincipal = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePrincipal]
  }
}

