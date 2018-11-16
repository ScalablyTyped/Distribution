package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalPackage extends Package {
  /**
       * Installs the update by saving it to the location on disk where the runtime expects to find the latest version of the app.
       *
       * @param installMode Indicates when you would like the update changes to take affect for the end-user.
       * @param minimumBackgroundDuration For resume-based installs, this specifies the number of seconds the app needs to be in the background before forcing a restart. Defaults to 0 if unspecified.
       */
  def install(installMode: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode): stdLib.Promise[scala.Unit] = js.native
  /**
       * Installs the update by saving it to the location on disk where the runtime expects to find the latest version of the app.
       *
       * @param installMode Indicates when you would like the update changes to take affect for the end-user.
       * @param minimumBackgroundDuration For resume-based installs, this specifies the number of seconds the app needs to be in the background before forcing a restart. Defaults to 0 if unspecified.
       */
  def install(
    installMode: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.InstallMode,
    minimumBackgroundDuration: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
}

