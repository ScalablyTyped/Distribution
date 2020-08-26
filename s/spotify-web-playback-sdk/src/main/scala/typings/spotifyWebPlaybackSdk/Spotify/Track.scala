package typings.spotifyWebPlaybackSdk.Spotify

import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ad
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.audio
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.episode
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.track
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Track extends js.Object {
  var album: Album = js.native
  var artists: js.Array[Artist] = js.native
  var id: String | Null = js.native
  var is_playable: Boolean = js.native
  var media_type: audio | video = js.native
  var name: String = js.native
  var `type`: track | episode | ad = js.native
  var uri: String = js.native
}

object Track {
  @scala.inline
  def apply(
    album: Album,
    artists: js.Array[Artist],
    is_playable: Boolean,
    media_type: audio | video,
    name: String,
    `type`: track | episode | ad,
    uri: String
  ): Track = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  @scala.inline
  implicit class TrackOps[Self <: Track] (val x: Self) extends AnyVal {
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
    def setAlbum(value: Album): Self = this.set("album", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtistsVarargs(value: Artist*): Self = this.set("artists", js.Array(value :_*))
    @scala.inline
    def setArtists(value: js.Array[Artist]): Self = this.set("artists", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_playable(value: Boolean): Self = this.set("is_playable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia_type(value: audio | video): Self = this.set("media_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: track | episode | ad): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
  }
  
}

