package typings.atPulumiAws.lightsailStaticIpMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticIpArgs extends js.Object {
  /**
    * The name for the allocated static IP
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object StaticIpArgs {
  @scala.inline
  def apply(name: Input[String] = null): StaticIpArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticIpArgs]
  }
}

