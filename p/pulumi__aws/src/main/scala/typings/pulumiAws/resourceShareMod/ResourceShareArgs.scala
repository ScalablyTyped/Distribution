package typings.pulumiAws.resourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShareArgs extends js.Object {
  /**
    * Indicates whether principals outside your organization can be associated with a resource share.
    */
  val allowExternalPrincipals: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the resource share.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource share.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ResourceShareArgs {
  @scala.inline
  def apply(
    allowExternalPrincipals: Input[Boolean] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ResourceShareArgs = {
    val __obj = js.Dynamic.literal()
    if (allowExternalPrincipals != null) __obj.updateDynamic("allowExternalPrincipals")(allowExternalPrincipals.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceShareArgs]
  }
}

