package typings.pulumiAws.delegationSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegationSetState extends js.Object {
  /**
    * A list of authoritative name servers for the hosted zone
    * (effectively a list of NS records).
    */
  val nameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single delegation set amongst others)
    */
  val referenceName: js.UndefOr[Input[String]] = js.native
}

object DelegationSetState {
  @scala.inline
  def apply(): DelegationSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegationSetState]
  }
  @scala.inline
  implicit class DelegationSetStateOps[Self <: DelegationSetState] (val x: Self) extends AnyVal {
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
    def setNameServersVarargs(value: Input[String]*): Self = this.set("nameServers", js.Array(value :_*))
    @scala.inline
    def setNameServers(value: Input[js.Array[Input[String]]]): Self = this.set("nameServers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameServers: Self = this.set("nameServers", js.undefined)
    @scala.inline
    def setReferenceName(value: Input[String]): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceName: Self = this.set("referenceName", js.undefined)
  }
  
}

