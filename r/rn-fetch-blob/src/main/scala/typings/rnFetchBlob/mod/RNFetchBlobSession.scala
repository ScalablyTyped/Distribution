package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rn-fetch-blob", "RNFetchBlobSession")
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
  
  @JSImport("rn-fetch-blob", "RNFetchBlobSession")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSession(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def removeSession(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSession")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setSession(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSession")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
