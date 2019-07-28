package typings.atPulumiAws.sesDomainDkimMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDkimState extends js.Object {
  val dkimTokens: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: js.UndefOr[Input[String]] = js.undefined
}

object DomainDkimState {
  @scala.inline
  def apply(dkimTokens: Input[js.Array[Input[String]]] = null, domain: Input[String] = null): DomainDkimState = {
    val __obj = js.Dynamic.literal()
    if (dkimTokens != null) __obj.updateDynamic("dkimTokens")(dkimTokens.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDkimState]
  }
}

