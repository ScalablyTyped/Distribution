package typings.reactNativeGoby.mod

import typings.reactNativeGoby.mod.Goby.InstallMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalPackage
  extends StObject
     with Package {
  
  /**
    * Installs the update by saving it to the location on disk where the runtime expects to find the latest version of the app.
    *
    * @param installMode Indicates when you would like the update changes to take affect for the end-user.
    * @param minimumBackgroundDuration For resume-based installs, this specifies the number of seconds the app needs to be in the background before forcing a restart. Defaults to 0 if unspecified.
    */
  def install(installMode: InstallMode): js.Promise[Unit] = js.native
  def install(installMode: InstallMode, minimumBackgroundDuration: Double): js.Promise[Unit] = js.native
}
