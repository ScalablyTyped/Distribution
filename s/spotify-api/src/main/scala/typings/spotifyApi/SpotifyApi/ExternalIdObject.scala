package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * External Id object
  * [](https://developer.spotify.com/web-api/object-model/)
  *
  * Note that there might be other types available, it couldn't be found in the docs.
  */
@js.native
trait ExternalIdObject extends js.Object {
  
  var ean: js.UndefOr[String] = js.native
  
  var isrc: js.UndefOr[String] = js.native
  
  var upc: js.UndefOr[String] = js.native
}
object ExternalIdObject {
  
  @scala.inline
  def apply(): ExternalIdObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalIdObject]
  }
  
  @scala.inline
  implicit class ExternalIdObjectOps[Self <: ExternalIdObject] (val x: Self) extends AnyVal {
    
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
    def setEan(value: String): Self = this.set("ean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEan: Self = this.set("ean", js.undefined)
    
    @scala.inline
    def setIsrc(value: String): Self = this.set("isrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsrc: Self = this.set("isrc", js.undefined)
    
    @scala.inline
    def setUpc(value: String): Self = this.set("upc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpc: Self = this.set("upc", js.undefined)
  }
}
