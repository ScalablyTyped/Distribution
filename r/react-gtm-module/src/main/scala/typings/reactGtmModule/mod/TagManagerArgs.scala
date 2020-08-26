package typings.reactGtmModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagManagerArgs extends DataLayerArgs {
  /**
    * Used to set environments.
    */
  var auth: js.UndefOr[String] = js.native
  /**
    * Additional events such as 'gtm.start': new Date().getTime(),event:'gtm.js'.
    */
  var events: js.UndefOr[js.Object] = js.native
  /**
    * GTM id, must be something like GTM-000000.
    */
  var gtmId: String = js.native
  /**
    * Used to set environments, something like env-00.
    */
  var preview: js.UndefOr[String] = js.native
}

object TagManagerArgs {
  @scala.inline
  def apply(gtmId: String): TagManagerArgs = {
    val __obj = js.Dynamic.literal(gtmId = gtmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagManagerArgs]
  }
  @scala.inline
  implicit class TagManagerArgsOps[Self <: TagManagerArgs] (val x: Self) extends AnyVal {
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
    def setGtmId(value: String): Self = this.set("gtmId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setEvents(value: js.Object): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
  }
  
}

