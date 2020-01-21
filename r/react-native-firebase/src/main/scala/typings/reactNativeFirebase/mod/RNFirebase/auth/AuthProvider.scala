package typings.reactNativeFirebase.mod.RNFirebase.auth

import typings.reactNativeFirebase.mod.AuthCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthProvider extends js.Object {
  var PROVIDER_ID: String = js.native
  def credential(): AuthCredential = js.native
  def credential(token: String): AuthCredential = js.native
  def credential(token: String, secret: String): AuthCredential = js.native
  def credential(token: Null, secret: String): AuthCredential = js.native
}

