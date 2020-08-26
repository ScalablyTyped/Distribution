package typings.pulumiAws.delegationSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegationSetArgs extends js.Object {
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single delegation set amongst others)
    */
  val referenceName: js.UndefOr[Input[String]] = js.native
}

object DelegationSetArgs {
  @scala.inline
  def apply(): DelegationSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegationSetArgs]
  }
  @scala.inline
  implicit class DelegationSetArgsOps[Self <: DelegationSetArgs] (val x: Self) extends AnyVal {
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
    def setReferenceName(value: Input[String]): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceName: Self = this.set("referenceName", js.undefined)
  }
  
}

