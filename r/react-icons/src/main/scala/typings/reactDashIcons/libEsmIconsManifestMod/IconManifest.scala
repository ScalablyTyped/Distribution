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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], licenseUrl = licenseUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectUrl = projectUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IconManifest]
  }
}

