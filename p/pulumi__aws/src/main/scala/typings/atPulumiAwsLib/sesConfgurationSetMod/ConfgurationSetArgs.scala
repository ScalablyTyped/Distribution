package typings
package atPulumiAwsLib.sesConfgurationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfgurationSetArgs extends js.Object {
  /**
    * The name of the configuration set
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ConfgurationSetArgs {
  @scala.inline
  def apply(name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): ConfgurationSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfgurationSetArgs]
  }
}

