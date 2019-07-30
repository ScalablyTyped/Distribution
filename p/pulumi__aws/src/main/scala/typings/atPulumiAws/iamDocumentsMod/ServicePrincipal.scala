package typings.atPulumiAws.iamDocumentsMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicePrincipal extends Principal {
  var Service: Input[js.Array[Input[String]] | String]
}

object ServicePrincipal {
  @scala.inline
  def apply(Service: Input[js.Array[Input[String]] | String]): ServicePrincipal = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServicePrincipal]
  }
}

