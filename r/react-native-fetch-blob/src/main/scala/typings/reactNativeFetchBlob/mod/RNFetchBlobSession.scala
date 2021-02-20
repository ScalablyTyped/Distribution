package typings.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-fetch-blob", "RNFetchBlobSession")
@js.native
class RNFetchBlobSession protected () extends StObject {
  def this(name: String, list: js.Array[String]) = this()
  
  def add(path: String): RNFetchBlobSession = js.native
  
  def dispose(): js.Promise[Unit] = js.native
  
  def list(): js.Array[String] = js.native
  
  var name: String = js.native
  
  def remove(path: String): RNFetchBlobSession = js.native
}
/* static members */
object RNFetchBlobSession {
  
  @JSImport("react-native-fetch-blob", "RNFetchBlobSession.getSession")
  @js.native
  def getSession(name: String): js.Any = js.native
  
  @JSImport("react-native-fetch-blob", "RNFetchBlobSession.removeSession")
  @js.native
  def removeSession(name: String): Unit = js.native
  
  @JSImport("react-native-fetch-blob", "RNFetchBlobSession.setSession")
  @js.native
  def setSession(name: String): Unit = js.native
}
