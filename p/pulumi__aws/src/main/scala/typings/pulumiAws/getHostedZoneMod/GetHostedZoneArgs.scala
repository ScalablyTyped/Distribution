package typings.pulumiAws.getHostedZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneArgs extends js.Object {
  /**
    * The region you'd like the zone for. By default, fetches the current region.
    */
  val region: js.UndefOr[String] = js.native
}

object GetHostedZoneArgs {
  @scala.inline
  def apply(): GetHostedZoneArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostedZoneArgs]
  }
  @scala.inline
  implicit class GetHostedZoneArgsOps[Self <: GetHostedZoneArgs] (val x: Self) extends AnyVal {
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
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

