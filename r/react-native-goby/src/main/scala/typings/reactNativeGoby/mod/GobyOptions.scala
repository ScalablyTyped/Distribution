package typings.reactNativeGoby.mod

import typings.reactNativeGoby.mod.Goby.CheckFrequency
import typings.reactNativeGoby.mod.Goby.InstallMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GobyOptions extends SyncOptions {
  /**
    * Specifies when you would like to synchronize updates with the Goby server.
    * Defaults to goby.CheckFrequency.ON_APP_START.
    */
  var checkFrequency: CheckFrequency
}

object GobyOptions {
  @scala.inline
  def apply(
    checkFrequency: CheckFrequency,
    deploymentKey: String = null,
    installMode: InstallMode = null,
    mandatoryInstallMode: InstallMode = null,
    minimumBackgroundDuration: js.UndefOr[Double] = js.undefined,
    updateDialog: UpdateDialog = null
  ): GobyOptions = {
    val __obj = js.Dynamic.literal(checkFrequency = checkFrequency.asInstanceOf[js.Any])
    if (deploymentKey != null) __obj.updateDynamic("deploymentKey")(deploymentKey.asInstanceOf[js.Any])
    if (installMode != null) __obj.updateDynamic("installMode")(installMode.asInstanceOf[js.Any])
    if (mandatoryInstallMode != null) __obj.updateDynamic("mandatoryInstallMode")(mandatoryInstallMode.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumBackgroundDuration)) __obj.updateDynamic("minimumBackgroundDuration")(minimumBackgroundDuration.get.asInstanceOf[js.Any])
    if (updateDialog != null) __obj.updateDynamic("updateDialog")(updateDialog.asInstanceOf[js.Any])
    __obj.asInstanceOf[GobyOptions]
  }
}

