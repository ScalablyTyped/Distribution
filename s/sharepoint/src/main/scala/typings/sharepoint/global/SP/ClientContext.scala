package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientContext")
@js.native
open class ClientContext ()
  extends StObject
     with typings.sharepoint.SP.ClientContext {
  def this(serverRelativeUrlOrFullUrl: String) = this()
  
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
object ClientContext {
  
  @JSGlobal("SP.ClientContext")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getCurrent(): typings.sharepoint.SP.ClientContext = ^.asInstanceOf[js.Dynamic].applyDynamic("get_current")().asInstanceOf[typings.sharepoint.SP.ClientContext]
}
