package typings.pulumiAws.aliasMod

import typings.pulumiAws.inputMod.gamelift.AliasRoutingStrategy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasArgs extends js.Object {
  /**
    * Description of the alias.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the alias.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the fleet and/or routing type to use for the alias.
    */
  val routingStrategy: Input[AliasRoutingStrategy] = js.native
}

object AliasArgs {
  @scala.inline
  def apply(
    routingStrategy: Input[AliasRoutingStrategy],
    description: Input[String] = null,
    name: Input[String] = null
  ): AliasArgs = {
    val __obj = js.Dynamic.literal(routingStrategy = routingStrategy.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasArgs]
  }
}

