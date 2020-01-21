package typings.reactNativeFirebaseApp

import typings.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApp[M] extends js.Object {
  /**
    * This React Native Firebase module version.
    */
  val SDK_VERSION: String = js.native
  def apply(): M = js.native
  def apply(app: FirebaseApp): M = js.native
}

