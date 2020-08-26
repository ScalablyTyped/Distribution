package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "RNFirebase.iid")
@js.native
object iid extends js.Object {
  @js.native
  trait InstanceId extends js.Object {
    def delete(): js.Promise[Unit] = js.native
    def deleteToken(): js.Promise[Unit] = js.native
    def deleteToken(authorizedEntity: js.UndefOr[scala.Nothing], scope: String): js.Promise[Unit] = js.native
    def deleteToken(authorizedEntity: String): js.Promise[Unit] = js.native
    def deleteToken(authorizedEntity: String, scope: String): js.Promise[Unit] = js.native
    def get(): js.Promise[String] = js.native
    def getToken(): js.Promise[String] = js.native
    def getToken(authorizedEntity: js.UndefOr[scala.Nothing], scope: String): js.Promise[String] = js.native
    def getToken(authorizedEntity: String): js.Promise[String] = js.native
    def getToken(authorizedEntity: String, scope: String): js.Promise[String] = js.native
  }
  
}

