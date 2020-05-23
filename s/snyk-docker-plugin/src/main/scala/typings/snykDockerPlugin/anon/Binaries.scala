package typings.snykDockerPlugin.anon

import typings.snykDockerPlugin.analyzerTypesMod.AnalyzedPackage
import typings.snykDockerPlugin.analyzerTypesMod.Binary
import typings.snykDockerPlugin.analyzerTypesMod.OSRelease
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binaries extends js.Object {
  var binaries: js.UndefOr[js.Array[AnalyzedPackage | Binary]] = js.undefined
  var depInfosList: js.Array[AnalyzedPackage | Binary]
  var imageId: String
  var imageLayers: js.Array[String]
  var targetOS: OSRelease
  var `type`: js.Any
}

object Binaries {
  @scala.inline
  def apply(
    depInfosList: js.Array[AnalyzedPackage | Binary],
    imageId: String,
    imageLayers: js.Array[String],
    targetOS: OSRelease,
    `type`: js.Any,
    binaries: js.Array[AnalyzedPackage | Binary] = null
  ): Binaries = {
    val __obj = js.Dynamic.literal(depInfosList = depInfosList.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], imageLayers = imageLayers.asInstanceOf[js.Any], targetOS = targetOS.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (binaries != null) __obj.updateDynamic("binaries")(binaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binaries]
  }
}

