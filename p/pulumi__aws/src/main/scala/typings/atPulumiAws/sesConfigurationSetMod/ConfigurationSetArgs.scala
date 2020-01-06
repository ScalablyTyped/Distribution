package typings.atPulumiAws.sesConfigurationSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSetArgs extends js.Object {
  /**
    * The name of the configuration set
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ConfigurationSetArgs {
  @scala.inline
  def apply(name: Input[String] = null): ConfigurationSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationSetArgs]
  }
}

