package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmbiguousRoleResolution extends js.Object {
  var ambiguousRoleResolution: js.UndefOr[java.lang.String] = js.undefined
  var identityProvider: java.lang.String
  var mappingRules: js.UndefOr[js.Array[Anon_Claim]] = js.undefined
  var `type`: java.lang.String
}

object Anon_AmbiguousRoleResolution {
  @scala.inline
  def apply(
    identityProvider: java.lang.String,
    `type`: java.lang.String,
    ambiguousRoleResolution: java.lang.String = null,
    mappingRules: js.Array[Anon_Claim] = null
  ): Anon_AmbiguousRoleResolution = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("identityProvider")(identityProvider)
    if (ambiguousRoleResolution != null) __obj.updateDynamic("ambiguousRoleResolution")(ambiguousRoleResolution)
    if (mappingRules != null) __obj.updateDynamic("mappingRules")(mappingRules)
    __obj.asInstanceOf[Anon_AmbiguousRoleResolution]
  }
}

