package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fetch-blob", "RNFetchBlobSession")
@js.native
class RNFetchBlobSession protected () extends js.Object {
  def this(name: String, list: js.Array[String]) = this()
  var name: String = js.native
  def add(path: String): RNFetchBlobSession = js.native
  def dispose(): js.Promise[Unit] = js.native
  def list(): js.Array[String] = js.native
  def remove(path: String): RNFetchBlobSession = js.native
}

/* static members */
@JSImport("react-native-fetch-blob", "RNFetchBlobSession")
@js.native
object RNFetchBlobSession extends js.Object {
  def getSession(name: String): js.Any = js.native
  def removeSession(name: String): Unit = js.native
  def setSession(name: String): Unit = js.native
}

