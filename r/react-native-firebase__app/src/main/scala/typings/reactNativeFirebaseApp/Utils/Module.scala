package typings.reactNativeFirebaseApp.Utils

import typings.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseApp
import typings.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends FirebaseModule {
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

object Module {
  @scala.inline
  def apply(
    app: FirebaseApp,
    emitter: js.Any,
    getPlayServicesStatus: () => js.Promise[PlayServicesAvailability],
    isRunningInTestLab: Boolean,
    makePlayServicesAvailable: () => js.Promise[Unit],
    native: js.Any,
    playServicesAvailability: PlayServicesAvailability,
    promptForPlayServices: () => js.Promise[Unit],
    resolutionForPlayServices: () => js.Promise[Unit]
  ): Module = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getPlayServicesStatus = js.Any.fromFunction0(getPlayServicesStatus), isRunningInTestLab = isRunningInTestLab.asInstanceOf[js.Any], makePlayServicesAvailable = js.Any.fromFunction0(makePlayServicesAvailable), native = native.asInstanceOf[js.Any], playServicesAvailability = playServicesAvailability.asInstanceOf[js.Any], promptForPlayServices = js.Any.fromFunction0(promptForPlayServices), resolutionForPlayServices = js.Any.fromFunction0(resolutionForPlayServices))
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPlayServicesStatus(value: () => js.Promise[PlayServicesAvailability]): Self = this.set("getPlayServicesStatus", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRunningInTestLab(value: Boolean): Self = this.set("isRunningInTestLab", value.asInstanceOf[js.Any])
    @scala.inline
    def setMakePlayServicesAvailable(value: () => js.Promise[Unit]): Self = this.set("makePlayServicesAvailable", js.Any.fromFunction0(value))
    @scala.inline
    def setPlayServicesAvailability(value: PlayServicesAvailability): Self = this.set("playServicesAvailability", value.asInstanceOf[js.Any])
    @scala.inline
    def setPromptForPlayServices(value: () => js.Promise[Unit]): Self = this.set("promptForPlayServices", js.Any.fromFunction0(value))
    @scala.inline
    def setResolutionForPlayServices(value: () => js.Promise[Unit]): Self = this.set("resolutionForPlayServices", js.Any.fromFunction0(value))
  }
  
}

