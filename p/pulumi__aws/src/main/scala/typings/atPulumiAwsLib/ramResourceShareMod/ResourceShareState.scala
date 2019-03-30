package typings
package atPulumiAwsLib.ramResourceShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceShareState extends js.Object {
  /**
    * Indicates whether principals outside your organization can be associated with a resource share.
    */
  val allowExternalPrincipals: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the resource share.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource share.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object ResourceShareState {
  @scala.inline
  def apply(
    allowExternalPrincipals: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ResourceShareState = {
    val __obj = js.Dynamic.literal()
    if (allowExternalPrincipals != null) __obj.updateDynamic("allowExternalPrincipals")(allowExternalPrincipals.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceShareState]
  }
}

