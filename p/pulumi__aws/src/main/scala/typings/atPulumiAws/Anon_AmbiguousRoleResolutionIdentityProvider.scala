package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmbiguousRoleResolutionIdentityProvider extends js.Object {
  var ambiguousRoleResolution: js.UndefOr[Input[String]] = js.undefined
  var identityProvider: Input[String]
  var mappingRules: js.UndefOr[Input[js.Array[Input[Anon_ClaimMatchType]]]] = js.undefined
  var `type`: Input[String]
}

object Anon_AmbiguousRoleResolutionIdentityProvider {
  @scala.inline
  def apply(
    identityProvider: Input[String],
    `type`: Input[String],
    ambiguousRoleResolution: Input[String] = null,
    mappingRules: Input[js.Array[Input[Anon_ClaimMatchType]]] = null
  ): Anon_AmbiguousRoleResolutionIdentityProvider = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ambiguousRoleResolution != null) __obj.updateDynamic("ambiguousRoleResolution")(ambiguousRoleResolution.asInstanceOf[js.Any])
    if (mappingRules != null) __obj.updateDynamic("mappingRules")(mappingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AmbiguousRoleResolutionIdentityProvider]
  }
}

