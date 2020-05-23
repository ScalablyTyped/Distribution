package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientContext")
@js.native
class ClientContext ()
  extends typings.sharepoint.SP.ClientContext {
  def this(serverRelativeUrlOrFullUrl: String) = this()
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("SP.ClientContext")
@js.native
object ClientContext extends js.Object {
  def get_current(): typings.sharepoint.SP.ClientContext = js.native
}

