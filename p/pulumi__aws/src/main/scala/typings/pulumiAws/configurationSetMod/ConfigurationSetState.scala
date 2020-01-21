package typings.pulumiAws.configurationSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSetState extends js.Object {
  /**
    * The name of the configuration set
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ConfigurationSetState {
  @scala.inline
  def apply(name: Input[String] = null): ConfigurationSetState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationSetState]
  }
}

