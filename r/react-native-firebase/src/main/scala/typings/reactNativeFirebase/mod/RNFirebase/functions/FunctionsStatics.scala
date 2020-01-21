package typings.reactNativeFirebase.mod.RNFirebase.functions

import typings.reactNativeFirebase.mod.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * firebase.functions.X
  */
@js.native
trait FunctionsStatics extends js.Object {
  /**
    * Uppercased + underscored variables of @FunctionsErrorCode
    */
  var HttpsErrorCode: typings.reactNativeFirebase.mod.RNFirebase.functions.HttpsErrorCode = js.native
  /**
    * constructor overload:
    * See https://github.com/invertase/react-native-firebase-docs/blob/master/docs/functions/reference/functions.md
    */
  def apply(): Functions = js.native
  def apply(appOrRegion: String): Functions = js.native
  def apply(appOrRegion: String, region: String): Functions = js.native
  def apply(appOrRegion: App): Functions = js.native
  def apply(appOrRegion: App, region: String): Functions = js.native
}

