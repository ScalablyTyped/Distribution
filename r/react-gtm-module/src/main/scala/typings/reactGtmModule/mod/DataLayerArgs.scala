package typings.reactGtmModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLayerArgs extends js.Object {
  /**
    * Object that contains all of the information that you want to pass to Google Tag Manager.
    */
  var dataLayer: js.UndefOr[js.Object] = js.native
  /**
    * Custom name for dataLayer object.
    */
  var dataLayerName: js.UndefOr[String] = js.native
}

object DataLayerArgs {
  @scala.inline
  def apply(): DataLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLayerArgs]
  }
  @scala.inline
  implicit class DataLayerArgsOps[Self <: DataLayerArgs] (val x: Self) extends AnyVal {
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
    def setDataLayer(value: js.Object): Self = this.set("dataLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLayer: Self = this.set("dataLayer", js.undefined)
    @scala.inline
    def setDataLayerName(value: String): Self = this.set("dataLayerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLayerName: Self = this.set("dataLayerName", js.undefined)
  }
  
}

