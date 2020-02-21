package typings.pulumiAws.aliasMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.gamelift.AliasRoutingStrategy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasState extends js.Object {
  /**
    * Alias ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
  val routingStrategy: js.UndefOr[Input[AliasRoutingStrategy]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AliasState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    routingStrategy: Input[AliasRoutingStrategy] = null,
    tags: Input[StringDictionary[_]] = null
  ): AliasState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (routingStrategy != null) __obj.updateDynamic("routingStrategy")(routingStrategy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasState]
  }
}

