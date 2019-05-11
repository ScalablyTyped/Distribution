package typings
package reactDashIconsLib.libEsmIconsManifestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconManifest extends js.Object {
  var id: java.lang.String
  var license: java.lang.String
  var licenseUrl: java.lang.String
  var name: java.lang.String
  var projectUrl: java.lang.String
}

object IconManifest {
  @scala.inline
  def apply(
    id: java.lang.String,
    license: java.lang.String,
    licenseUrl: java.lang.String,
    name: java.lang.String,
    projectUrl: java.lang.String
  ): IconManifest = {
    val __obj = js.Dynamic.literal(id = id, license = license, licenseUrl = licenseUrl, name = name, projectUrl = projectUrl)
  
    __obj.asInstanceOf[IconManifest]
  }
}

