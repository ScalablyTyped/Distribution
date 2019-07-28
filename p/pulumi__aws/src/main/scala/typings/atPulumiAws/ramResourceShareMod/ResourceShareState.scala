package typings.atPulumiAws.ramResourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceShareState extends js.Object {
  /**
    * Indicates whether principals outside your organization can be associated with a resource share.
    */
  val allowExternalPrincipals: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the resource share.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource share.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ResourceShareState {
  @scala.inline
  def apply(
    allowExternalPrincipals: Input[Boolean] = null,
    arn: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ResourceShareState = {
    val __obj = js.Dynamic.literal()
    if (allowExternalPrincipals != null) __obj.updateDynamic("allowExternalPrincipals")(allowExternalPrincipals.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceShareState]
  }
}

