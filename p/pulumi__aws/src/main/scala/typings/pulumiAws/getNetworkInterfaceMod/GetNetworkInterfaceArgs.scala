package typings.pulumiAws.getNetworkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetNetworkInterfaceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkInterfaceArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
    */
  val filters: js.UndefOr[js.Array[GetNetworkInterfaceFilter]] = js.native
  /**
    * The identifier for the network interface.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the network interface.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetNetworkInterfaceArgs {
  @scala.inline
  def apply(): GetNetworkInterfaceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkInterfaceArgs]
  }
  @scala.inline
  implicit class GetNetworkInterfaceArgsOps[Self <: GetNetworkInterfaceArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetNetworkInterfaceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetNetworkInterfaceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

