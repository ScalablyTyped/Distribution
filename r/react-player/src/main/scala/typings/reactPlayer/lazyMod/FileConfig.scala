package typings.reactPlayer.lazyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConfig extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.native
  var dashVersion: js.UndefOr[String] = js.native
  var forceAudio: js.UndefOr[Boolean] = js.native
  var forceDASH: js.UndefOr[Boolean] = js.native
  var forceHLS: js.UndefOr[Boolean] = js.native
  var forceVideo: js.UndefOr[Boolean] = js.native
  var hlsOptions: js.UndefOr[js.Object] = js.native
  var hlsVersion: js.UndefOr[String] = js.native
  var tracks: js.UndefOr[js.Array[TrackProps]] = js.native
}

object FileConfig {
  @scala.inline
  def apply(): FileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileConfig]
  }
  @scala.inline
  implicit class FileConfigOps[Self <: FileConfig] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Object): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setDashVersion(value: String): Self = this.set("dashVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashVersion: Self = this.set("dashVersion", js.undefined)
    @scala.inline
    def setForceAudio(value: Boolean): Self = this.set("forceAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceAudio: Self = this.set("forceAudio", js.undefined)
    @scala.inline
    def setForceDASH(value: Boolean): Self = this.set("forceDASH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDASH: Self = this.set("forceDASH", js.undefined)
    @scala.inline
    def setForceHLS(value: Boolean): Self = this.set("forceHLS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHLS: Self = this.set("forceHLS", js.undefined)
    @scala.inline
    def setForceVideo(value: Boolean): Self = this.set("forceVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceVideo: Self = this.set("forceVideo", js.undefined)
    @scala.inline
    def setHlsOptions(value: js.Object): Self = this.set("hlsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHlsOptions: Self = this.set("hlsOptions", js.undefined)
    @scala.inline
    def setHlsVersion(value: String): Self = this.set("hlsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHlsVersion: Self = this.set("hlsVersion", js.undefined)
    @scala.inline
    def setTracksVarargs(value: TrackProps*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[TrackProps]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
  
}

