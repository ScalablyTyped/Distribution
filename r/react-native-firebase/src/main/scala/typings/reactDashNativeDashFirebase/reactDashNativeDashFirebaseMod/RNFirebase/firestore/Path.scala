package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "RNFirebase.firestore.Path")
@js.native
class Path protected () extends js.Object {
  def this(pathComponents: js.Array[String]) = this()
  val id: String | Null = js.native
  val isCollection: Boolean = js.native
  val isDocument: Boolean = js.native
  val relativeName: String = js.native
  def child(relativePath: String): Path = js.native
  def parent(): Path | Null = js.native
}

/* static members */
@JSImport("react-native-firebase", "RNFirebase.firestore.Path")
@js.native
object Path extends js.Object {
  def fromName(name: String): Path = js.native
}

