package typings.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.firestore.Path")
@js.native
class Path protected () extends StObject {
  def this(pathComponents: js.Array[String]) = this()
  
  def child(relativePath: String): Path = js.native
  
  val id: String | Null = js.native
  
  val isCollection: Boolean = js.native
  
  val isDocument: Boolean = js.native
  
  def parent(): Path | Null = js.native
  
  val relativeName: String = js.native
}
object Path {
  
  /* static member */
  @JSImport("react-native-firebase", "RNFirebase.firestore.Path.fromName")
  @js.native
  def fromName(name: String): Path = js.native
}
