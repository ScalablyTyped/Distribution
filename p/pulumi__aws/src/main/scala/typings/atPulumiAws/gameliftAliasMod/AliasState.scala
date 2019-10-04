package typings.atPulumiAws.gameliftAliasMod

import typings.atPulumiAws.typesInputMod.gameliftNs.AliasRoutingStrategy
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasState extends js.Object {
  /**
    * Alias ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
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
  val routingStrategy: js.UndefOr[Input[AliasRoutingStrategy]] = js.undefined
}

object AliasState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    routingStrategy: Input[AliasRoutingStrategy] = null
  ): AliasState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (routingStrategy != null) __obj.updateDynamic("routingStrategy")(routingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasState]
  }
}

