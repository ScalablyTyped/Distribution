package typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod

import typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.GobyNs.CheckFrequency
import typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.GobyNs.InstallMode
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
    minimumBackgroundDuration: Int | Double = null,
    updateDialog: UpdateDialog = null
  ): GobyOptions = {
    val __obj = js.Dynamic.literal(checkFrequency = checkFrequency)
    if (deploymentKey != null) __obj.updateDynamic("deploymentKey")(deploymentKey)
    if (installMode != null) __obj.updateDynamic("installMode")(installMode)
    if (mandatoryInstallMode != null) __obj.updateDynamic("mandatoryInstallMode")(mandatoryInstallMode)
    if (minimumBackgroundDuration != null) __obj.updateDynamic("minimumBackgroundDuration")(minimumBackgroundDuration.asInstanceOf[js.Any])
    if (updateDialog != null) __obj.updateDynamic("updateDialog")(updateDialog)
    __obj.asInstanceOf[GobyOptions]
  }
}

