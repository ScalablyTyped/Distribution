package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointRegion extends js.Object {
  var endpoint: Input[String]
  var region: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EndpointRegion {
  @scala.inline
  def apply(endpoint: Input[String], region: Input[String] = null): Anon_EndpointRegion = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointRegion]
  }
}

