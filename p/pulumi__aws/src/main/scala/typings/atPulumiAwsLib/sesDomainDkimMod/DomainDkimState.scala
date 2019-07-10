package typings
package atPulumiAwsLib.sesDomainDkimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDkimState extends js.Object {
  val dkimTokens: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DomainDkimState {
  @scala.inline
  def apply(
    dkimTokens: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    domain: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DomainDkimState = {
    val __obj = js.Dynamic.literal()
    if (dkimTokens != null) __obj.updateDynamic("dkimTokens")(dkimTokens.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDkimState]
  }
}

