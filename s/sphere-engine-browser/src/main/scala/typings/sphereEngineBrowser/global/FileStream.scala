package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides stream-like access to the raw byte content of a file.
  */
@JSGlobal("FileStream")
@js.native
open class FileStream protected ()
  extends StObject
     with typings.sphereEngineBrowser.FileStream {
  def this(fileName: String, fileOp: typings.sphereEngineBrowser.FileOp) = this()
}
object FileStream {
  
  @JSGlobal("FileStream")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Opens a file asynchronously and returns a promise for a `FileStream` that
    * provides access to the contents of the file.
    * @param filename refers to the SphereFS path to the file
    * @param fileOp specifies the file operation requested.
    */
  /* static member */
  inline def fromFile(fileName: String, fileOp: typings.sphereEngineBrowser.FileOp): js.Promise[typings.sphereEngineBrowser.FileStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fileName.asInstanceOf[js.Any], fileOp.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.sphereEngineBrowser.FileStream]]
}
