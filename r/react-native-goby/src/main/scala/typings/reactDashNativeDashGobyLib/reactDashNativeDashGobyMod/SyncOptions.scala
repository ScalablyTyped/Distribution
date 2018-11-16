package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SyncOptions extends js.Object {
  /**
       * Specifies the deployment key you want to query for an update against. By default, this value is derived from the Info.plist
       * file (iOS) and MainActivity.java file (Android), but this option allows you to override it from the script-side if you need to
       * dynamically use a different deployment for a specific call to sync.
       */
  var deploymentKey: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Specifies when you would like to install optional updates (i.e. those that aren't marked as mandatory).
       * Defaults to goby.InstallMode.ON_NEXT_RESTART.
       */
  var installMode: js.UndefOr[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode] = js.undefined
  /**
       * Specifies when you would like to install updates which are marked as mandatory.
       * Defaults to goby.InstallMode.IMMEDIATE.
       */
  var mandatoryInstallMode: js.UndefOr[reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode] = js.undefined
  /**
       * Specifies the minimum number of seconds that the app needs to have been in the background before restarting the app. This property
       * only applies to updates which are installed using `InstallMode.ON_NEXT_RESUME`, and can be useful for getting your update in front
       * of end users sooner, without being too obtrusive. Defaults to `0`, which has the effect of applying the update immediately after a
       * resume, regardless how long it was in the background.
       */
  var minimumBackgroundDuration: js.UndefOr[scala.Double] = js.undefined
  /**
       * An "options" object used to determine whether a confirmation dialog should be displayed to the end user when an update is available,
       * and if so, what strings to use. Defaults to null, which has the effect of disabling the dialog completely. Setting this to any truthy
       * value will enable the dialog with the default strings, and passing an object to this parameter allows enabling the dialog as well as
       * overriding one or more of the default strings.
       */
  var updateDialog: js.UndefOr[UpdateDialog] = js.undefined
}

