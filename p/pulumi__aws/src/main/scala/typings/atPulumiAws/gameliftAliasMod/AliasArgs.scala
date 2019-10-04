package typings.atPulumiAws.gameliftAliasMod

import typings.atPulumiAws.typesInputMod.gameliftNs.AliasRoutingStrategy
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasArgs extends js.Object {
  /**
    * Description of the alias.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the alias.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the fleet and/or routing type to use for the alias.
    */
  val routingStrategy: Input[AliasRoutingStrategy]
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

