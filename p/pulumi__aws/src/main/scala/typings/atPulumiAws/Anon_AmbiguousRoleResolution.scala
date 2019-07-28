package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmbiguousRoleResolution extends js.Object {
  var ambiguousRoleResolution: js.UndefOr[String] = js.undefined
  var identityProvider: String
  var mappingRules: js.UndefOr[js.Array[Anon_Claim]] = js.undefined
  var `type`: String
}

object Anon_AmbiguousRoleResolution {
  @scala.inline
  def apply(
    identityProvider: String,
    `type`: String,
    ambiguousRoleResolution: String = null,
    mappingRules: js.Array[Anon_Claim] = null
  ): Anon_AmbiguousRoleResolution = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider)
    __obj.updateDynamic("type")(`type`)
    if (ambiguousRoleResolution != null) __obj.updateDynamic("ambiguousRoleResolution")(ambiguousRoleResolution)
    if (mappingRules != null) __obj.updateDynamic("mappingRules")(mappingRules)
    __obj.asInstanceOf[Anon_AmbiguousRoleResolution]
  }
}

