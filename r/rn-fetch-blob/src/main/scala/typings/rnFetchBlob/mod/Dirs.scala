package typings.rnFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dirs extends js.Object {
  var CacheDir: String = js.native
  var DCIMDir: String = js.native
  var DocumentDir: String = js.native
  var DownloadDir: String = js.native
  var MainBundleDir: String = js.native
  var MovieDir: String = js.native
  var MusicDir: String = js.native
  var PictureDir: String = js.native
  var SDCardDir: String = js.native
}

object Dirs {
  @scala.inline
  def apply(
    CacheDir: String,
    DCIMDir: String,
    DocumentDir: String,
    DownloadDir: String,
    MainBundleDir: String,
    MovieDir: String,
    MusicDir: String,
    PictureDir: String,
    SDCardDir: String
  ): Dirs = {
    val __obj = js.Dynamic.literal(CacheDir = CacheDir.asInstanceOf[js.Any], DCIMDir = DCIMDir.asInstanceOf[js.Any], DocumentDir = DocumentDir.asInstanceOf[js.Any], DownloadDir = DownloadDir.asInstanceOf[js.Any], MainBundleDir = MainBundleDir.asInstanceOf[js.Any], MovieDir = MovieDir.asInstanceOf[js.Any], MusicDir = MusicDir.asInstanceOf[js.Any], PictureDir = PictureDir.asInstanceOf[js.Any], SDCardDir = SDCardDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dirs]
  }
  @scala.inline
  implicit class DirsOps[Self <: Dirs] (val x: Self) extends AnyVal {
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
    def setCacheDir(value: String): Self = this.set("CacheDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setDCIMDir(value: String): Self = this.set("DCIMDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentDir(value: String): Self = this.set("DocumentDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadDir(value: String): Self = this.set("DownloadDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setMainBundleDir(value: String): Self = this.set("MainBundleDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovieDir(value: String): Self = this.set("MovieDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setMusicDir(value: String): Self = this.set("MusicDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setPictureDir(value: String): Self = this.set("PictureDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setSDCardDir(value: String): Self = this.set("SDCardDir", value.asInstanceOf[js.Any])
  }
  
}

