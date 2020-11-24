package typings.reactNativeFirebaseApp.mod.Utils_

import typings.reactNativeFirebaseApp.mod.ReactNativeFirebase.FirebaseModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-firebase/app", "Utils.Module")
@js.native
class Module () extends FirebaseModule {
  
  /**
    * Returns PlayServicesAvailability properties
    *
    * #### Example
    *
    * ```js
    * const PlayServicesAvailability = await firebase.utils().getPlayServicesStatus();
    * ```
    *
    * @android Android only - iOS always returns { isAvailable: true, status: 0 }
    */
  def getPlayServicesStatus(): js.Promise[PlayServicesAvailability] = js.native
  
  /**
    * Returns true if this app is running inside a Firebase Test Lab environment.
    *
    * #### Example
    *
    * ```js
    * const isRunningInTestLab = await firebase.utils().isRunningInTestLab;
    * ```
    * @android Android only - iOS returns false
    */
  var isRunningInTestLab: Boolean = js.native
  
  /**
    * Attempts to make Google Play services available on this device
    *
    * #### Example
    *
    * ```js
    * await firebase.utils().makePlayServicesAvailable();
    * ```
    *
    * @android Android only - iOS returns undefined
    */
  def makePlayServicesAvailable(): js.Promise[Unit] = js.native
  
  /**
    * Returns PlayServicesAvailability properties
    *
    * #### Example
    *
    * ```js
    * const PlayServicesAvailability = await firebase.utils().playServicesAvailability;
    * ```
    *
    * @android Android only - iOS always returns { isAvailable: true, status: 0 }
    */
  var playServicesAvailability: PlayServicesAvailability = js.native
  
  /**
    * A prompt appears on the device to ask the user to update play services
    *
    * #### Example
    *
    * ```js
    * await firebase.utils().promptForPlayServices();
    * ```
    *
    * @android Android only - iOS returns undefined
    */
  def promptForPlayServices(): js.Promise[Unit] = js.native
  
  /**
    * Resolves an error by starting any intents requiring user interaction.
    *
    * #### Example
    *
    * ```js
    * await firebase.utils().resolutionForPlayServices();
    * ```
    *
    * @android Android only - iOS returns undefined
    */
  def resolutionForPlayServices(): js.Promise[Unit] = js.native
}
