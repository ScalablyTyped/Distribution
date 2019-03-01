package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmbiguousRoleResolutionIdentityProvider extends js.Object {
  var ambiguousRoleResolution: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var identityProvider: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var mappingRules: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ClaimMatchType]]]
  ] = js.undefined
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AmbiguousRoleResolutionIdentityProvider {
  @scala.inline
  def apply(
    identityProvider: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ambiguousRoleResolution: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    mappingRules: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ClaimMatchType]]] = null
  ): Anon_AmbiguousRoleResolutionIdentityProvider = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("identityProvider")(identityProvider.asInstanceOf[js.Any])
    if (ambiguousRoleResolution != null) __obj.updateDynamic("ambiguousRoleResolution")(ambiguousRoleResolution.asInstanceOf[js.Any])
    if (mappingRules != null) __obj.updateDynamic("mappingRules")(mappingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AmbiguousRoleResolutionIdentityProvider]
  }
}

