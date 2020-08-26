package typings.pulumiAws.getRegionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionArgs extends js.Object {
  /**
    * The EC2 endpoint of the region to select.
    */
  val endpoint: js.UndefOr[String] = js.native
  /**
    * The full name of the region to select.
    */
  val name: js.UndefOr[String] = js.native
}

object GetRegionArgs {
  @scala.inline
  def apply(): GetRegionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegionArgs]
  }
  @scala.inline
  implicit class GetRegionArgsOps[Self <: GetRegionArgs] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

