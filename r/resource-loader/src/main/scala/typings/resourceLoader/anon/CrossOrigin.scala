package typings.resourceLoader.anon

import typings.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typings.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typings.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossOrigin extends js.Object {
  var crossOrigin: js.UndefOr[String | Boolean] = js.native
  var loadType: js.UndefOr[LOAD_TYPE] = js.native
  var metadata: js.UndefOr[IMetadata] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.native
}

object CrossOrigin {
  @scala.inline
  def apply(): CrossOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossOrigin]
  }
  @scala.inline
  implicit class CrossOriginOps[Self <: CrossOrigin] (val x: Self) extends AnyVal {
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
    def setCrossOrigin(value: String | Boolean): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setLoadType(value: LOAD_TYPE): Self = this.set("loadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadType: Self = this.set("loadType", js.undefined)
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setXhrType(value: XHR_RESPONSE_TYPE): Self = this.set("xhrType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrType: Self = this.set("xhrType", js.undefined)
  }
  
}

