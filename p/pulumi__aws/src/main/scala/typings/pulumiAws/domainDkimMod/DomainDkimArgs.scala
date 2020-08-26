package typings.pulumiAws.domainDkimMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDkimArgs extends js.Object {
  /**
    * Verified domain name to generate DKIM tokens for.
    */
  val domain: Input[String] = js.native
}

object DomainDkimArgs {
  @scala.inline
  def apply(domain: Input[String]): DomainDkimArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDkimArgs]
  }
  @scala.inline
  implicit class DomainDkimArgsOps[Self <: DomainDkimArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
  }
  
}

