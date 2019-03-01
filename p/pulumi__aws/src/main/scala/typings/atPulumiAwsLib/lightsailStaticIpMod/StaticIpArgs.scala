package typings
package atPulumiAwsLib.lightsailStaticIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticIpArgs extends js.Object {
  /**
    * The name for the allocated static IP
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object StaticIpArgs {
  @scala.inline
  def apply(name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): StaticIpArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticIpArgs]
  }
}

