package typings.snykCliInterface.pluginMod

import typings.snykCliInterface.anon.AllSubProjectNames
import typings.snykCliInterface.commonMod.SupportedPackageManagers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMetadata extends js.Object {
  var dockerImageId: js.UndefOr[js.Any] = js.undefined
  var imageLayers: js.UndefOr[js.Any] = js.undefined
  var meta: js.UndefOr[AllSubProjectNames] = js.undefined
  var name: String
  var packageFormatVersion: js.UndefOr[String] = js.undefined
  var packageManager: js.UndefOr[SupportedPackageManagers] = js.undefined
  var runtime: js.UndefOr[String] = js.undefined
  var targetFile: js.UndefOr[String] = js.undefined
}

object PluginMetadata {
  @scala.inline
  def apply(
    name: String,
    dockerImageId: js.Any = null,
    imageLayers: js.Any = null,
    meta: AllSubProjectNames = null,
    packageFormatVersion: String = null,
    packageManager: SupportedPackageManagers = null,
    runtime: String = null,
    targetFile: String = null
  ): PluginMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (dockerImageId != null) __obj.updateDynamic("dockerImageId")(dockerImageId.asInstanceOf[js.Any])
    if (imageLayers != null) __obj.updateDynamic("imageLayers")(imageLayers.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (packageFormatVersion != null) __obj.updateDynamic("packageFormatVersion")(packageFormatVersion.asInstanceOf[js.Any])
    if (packageManager != null) __obj.updateDynamic("packageManager")(packageManager.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (targetFile != null) __obj.updateDynamic("targetFile")(targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMetadata]
  }
}

