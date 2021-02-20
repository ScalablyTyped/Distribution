package typings.reactNativeDocViewer

import typings.reactNativeDocViewer.anon.Base64
import typings.reactNativeDocViewer.anon.Cache
import typings.reactNativeDocViewer.anon.FileName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-doc-viewer", "openDoc")
  @js.native
  def openDoc(files: js.Array[Cache], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  
  @JSImport("react-native-doc-viewer", "openDocBinaryinUrl")
  @js.native
  def openDocBinaryinUrl(files: js.Array[FileName], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  
  @JSImport("react-native-doc-viewer", "openDocb64")
  @js.native
  def openDocb64(files: js.Array[Base64], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  
  @JSImport("react-native-doc-viewer", "playMovie")
  @js.native
  def playMovie(path: String, callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
}
