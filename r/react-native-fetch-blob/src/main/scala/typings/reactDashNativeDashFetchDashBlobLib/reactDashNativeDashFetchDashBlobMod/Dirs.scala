package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dirs extends js.Object {
  var CacheDir: java.lang.String
  var DCIMDir: java.lang.String
  var DocumentDir: java.lang.String
  var DownloadDir: java.lang.String
  var MainBundleDir: java.lang.String
  var MovieDir: java.lang.String
  var MusicDir: java.lang.String
  var PictureDir: java.lang.String
  var SDCardDir: java.lang.String
}

object Dirs {
  @scala.inline
  def apply(
    CacheDir: java.lang.String,
    DCIMDir: java.lang.String,
    DocumentDir: java.lang.String,
    DownloadDir: java.lang.String,
    MainBundleDir: java.lang.String,
    MovieDir: java.lang.String,
    MusicDir: java.lang.String,
    PictureDir: java.lang.String,
    SDCardDir: java.lang.String
  ): Dirs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CacheDir")(CacheDir)
    __obj.updateDynamic("DCIMDir")(DCIMDir)
    __obj.updateDynamic("DocumentDir")(DocumentDir)
    __obj.updateDynamic("DownloadDir")(DownloadDir)
    __obj.updateDynamic("MainBundleDir")(MainBundleDir)
    __obj.updateDynamic("MovieDir")(MovieDir)
    __obj.updateDynamic("MusicDir")(MusicDir)
    __obj.updateDynamic("PictureDir")(PictureDir)
    __obj.updateDynamic("SDCardDir")(SDCardDir)
    __obj.asInstanceOf[Dirs]
  }
}

