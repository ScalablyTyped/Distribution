package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GobyOptions extends SyncOptions {
  /**
    * Specifies when you would like to synchronize updates with the Goby server.
    * Defaults to goby.CheckFrequency.ON_APP_START.
    */
  var checkFrequency: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.CheckFrequency
}

object GobyOptions {
  @scala.inline
  def apply(
    checkFrequency: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.CheckFrequency,
    deploymentKey: java.lang.String = null,
    installMode: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode = null,
    mandatoryInstallMode: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode = null,
    minimumBackgroundDuration: scala.Int | scala.Double = null,
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

