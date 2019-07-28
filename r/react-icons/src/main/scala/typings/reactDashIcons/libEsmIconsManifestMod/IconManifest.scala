package typings.reactDashIcons.libEsmIconsManifestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconManifest extends js.Object {
  var id: String
  var license: String
  var licenseUrl: String
  var name: String
  var projectUrl: String
}

object IconManifest {
  @scala.inline
  def apply(id: String, license: String, licenseUrl: String, name: String, projectUrl: String): IconManifest = {
    val __obj = js.Dynamic.literal(id = id, license = license, licenseUrl = licenseUrl, name = name, projectUrl = projectUrl)
  
    __obj.asInstanceOf[IconManifest]
  }
}

