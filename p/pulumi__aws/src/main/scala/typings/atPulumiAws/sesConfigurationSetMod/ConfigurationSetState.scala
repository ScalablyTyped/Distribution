package typings.atPulumiAws.sesConfigurationSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationSetState extends js.Object {
  /**
    * The name of the configuration set
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object ConfigurationSetState {
  @scala.inline
  def apply(name: Input[String] = null): ConfigurationSetState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationSetState]
  }
}

