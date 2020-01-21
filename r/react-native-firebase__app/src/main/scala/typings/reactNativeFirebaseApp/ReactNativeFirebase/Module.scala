package typings.reactNativeFirebaseApp.ReactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  /**
    * The current React Native Firebase version.
    */
  val SDK_VERSION: String = js.native
  /**
    * A (read-only) array of all the initialized Apps.
    */
  var apps: js.Array[FirebaseApp] = js.native
  /**
    * Retrieve an instance of a FirebaseApp.
    *
    * @example
    * ```js
    * const app = firebase.app('foo');
    * ```
    *
    * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
    */
  def app(): FirebaseApp = js.native
  def app(name: String): FirebaseApp = js.native
  /**
    * Create (and initialize) a FirebaseApp.
    *
    * @param options Options to configure the services used in the App.
    * @param config The optional config for your firebase app
    */
  def initializeApp(options: FirebaseAppOptions): FirebaseApp = js.native
  def initializeApp(options: FirebaseAppOptions, config: FirebaseAppConfig): FirebaseApp = js.native
  def initializeApp(options: FirebaseAppOptions, name: String): FirebaseApp = js.native
}

